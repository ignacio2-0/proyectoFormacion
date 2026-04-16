public class EquipoService {

    private ApiClient apiClient = new ApiClient();

    public Equipo buscarEquipo(String nombre) {

        String url = "https://www.thesportsdb.com/api/v1/json/123/searchteams.php?t=" + nombre;
        String json = apiClient.getJSON(url);

        if (json == null || json.contains("\"teams\":null")) {
            System.out.println("No se encontró el equipo.");
            return null;
        }

        String nombreEquipo = extraer(json, "strTeam");
        String pais = extraer(json, "strCountry");
        String estadio = extraer(json, "strStadium");
        String fundacion = extraer(json, "intFormedYear");
        String escudo = extraer(json, "strTeamBadge");
        String liga = extraer(json, "strLeague");
        String descripcion = extraer(json, "strDescriptionEN");
        String capacidad = extraer(json, "intStadiumCapacity");
        String estadioImg = extraer(json, "strStadiumThumb");
        String facebook = extraer(json, "strFacebook");
        String twitter = extraer(json, "strTwitter");
        String instagram = extraer(json, "strInstagram");

        return new Equipo(
                nombreEquipo, pais, estadio, fundacion, escudo,
                liga, descripcion, capacidad, estadioImg,
                facebook, twitter, instagram
        );
    }

    private String extraer(String json, String campo) {
        try {
            int inicio = json.indexOf(campo);
            if (inicio == -1) return "No disponible";

            inicio = inicio + campo.length() + 3;
            int fin = json.indexOf("\"", inicio);

            StringBuilder sb = new StringBuilder();
            for (int i = inicio; i < fin; i++) {
                sb.append(json.charAt(i));
            }

            return sb.toString();

        } catch (Exception e) {
            return "No disponible";
        }
    }
}
