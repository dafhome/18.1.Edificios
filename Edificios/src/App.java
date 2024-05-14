import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        ArrayList<Edificios> inmobiliaria = new ArrayList<>();

        inmobiliaria.add(new Casa(320, 380000, "Sant Just", "casa", false));
        inmobiliaria.add(new Casa(250, 1250000, "Sant Gervasi", "casa", true));
        inmobiliaria.add(new Piso(79, 560000, "Barcelona", "piso", 5, true));
        inmobiliaria.add(new Piso(129, 750000, "Barcelona", "piso", 2, true));
        inmobiliaria.add(new Trastero(25, 39000, "St.Coloma", "trastero", true));
        inmobiliaria.add(new Trastero(15, 9000, "Badalona", "trastero", false));

        boolean validar = false;
        int opcion = 0;

        while (!validar) {
            System.out.println();
            System.out.println("Bienvenido a la inmobiliaria");
        System.out.println("¿En que puedo ayudarte?");
        System.out.println("------------------------------");
        System.out.println("1.Añadir un inmueble");
        System.out.println("2.Ver ubicaciones");
        System.out.println("3.Ver todos los inmuebles");
        System.out.println("0.Salir");
        System.out.print("Opcion: ");

        while (!scan.hasNextInt()) {

            System.out.print("Introduce un valor numerico entre las opciones: ");
            scan.nextLine();

        }
        opcion = scan.nextInt();
        while (opcion < 0 || opcion > 3) {
            System.out.print("Introduce un valor numerico entre las opciones: ");
            opcion = scan.nextInt();
            scan.nextLine();
        }

        switch (opcion) {
            case 1:
                Metodos.crearInmueble(inmobiliaria, scan);
                break;

            case 2:
                Metodos.verUbicaciones(inmobiliaria);
                break;
            case 3:
                Metodos.verInmuebles(inmobiliaria);
                break;
            case 0:
                validar = true;
                System.out.println("Hasta otra!");
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
        }
        

    }
}
