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

        return new Equipo(nombreEquipo, pais, estadio, fundacion, escudo);
    }

    private String extraer(String json, String campo) {
        try {
            int inicio = json.indexOf(campo) + campo.length() + 3;
            int fin = json.indexOf("\"", inicio);
            return json.substring(inicio, fin);
        } catch (Exception e) {
            return "No disponible";
        }
    }
}