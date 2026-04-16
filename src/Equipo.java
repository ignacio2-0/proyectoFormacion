public class Equipo {

    private String nombre;
    private String pais;
    private String estadio;
    private String fundacion;
    private String escudoUrl;

    private String liga;
    private String descripcion;
    private String capacidadEstadio;
    private String estadioImagen;
    private String facebook;
    private String twitter;
    private String instagram;

    public Equipo(String nombre, String pais, String estadio, String fundacion, String escudoUrl, String liga, String descripcion, String capacidadEstadio, String estadioImagen,
                  String facebook, String twitter, String instagram) {

        this.nombre = nombre;
        this.pais = pais;
        this.estadio = estadio;
        this.fundacion = fundacion;
        this.escudoUrl = escudoUrl;

        this.liga = liga;
        this.descripcion = descripcion;
        this.capacidadEstadio = capacidadEstadio;
        this.estadioImagen = estadioImagen;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
    }

    public String describir() {
        return  "Equipo: " + nombre +
                "\nPaís: " + pais +
                "\nLiga: " + liga +
                "\nEstadio: " + estadio +
                "\nCapacidad: " + capacidadEstadio +
                "\nFundado en: " + fundacion +
                "\nDescripción: " + descripcion +
                "\nEscudo: " + escudoUrl +
                "\nImagen del estadio: " + estadioImagen +
                "\nFacebook: " + facebook +
                "\nTwitter: " + twitter +
                "\nInstagram: " + instagram;
    }
}
