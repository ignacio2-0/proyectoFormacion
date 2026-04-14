public class Equipo {

    private String nombre;
    private String pais;
    private String estadio;
    private String fundacion;
    private String escudoUrl;

    public Equipo(String nombre, String pais, String estadio, String fundacion, String escudoUrl) {
        this.nombre = nombre;
        this.pais = pais;
        this.estadio = estadio;
        this.fundacion = fundacion;
        this.escudoUrl = escudoUrl;
    }

    public String describir() {
        return "Equipo: " + nombre +
               "\nPaís: " + pais +
               "\nEstadio: " + estadio +
               "\nFundado en: " + fundacion +
               "\nEscudo: " + escudoUrl;
    }
}
