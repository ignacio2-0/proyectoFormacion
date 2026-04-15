import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EquipoService service = new EquipoService();

        System.out.println("=== Futbo lInfo ===");
        System.out.print("Introduce el nombre del equipo: ");

        String nombre = sc.nextLine();

        Equipo equipo = service.buscarEquipo(nombre);

        if (equipo != null) {
            System.out.println("\n--- Información del equipo ---");
            System.out.println(equipo.describir());
        }

        sc.close();
    }
}
