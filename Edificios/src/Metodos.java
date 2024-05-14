import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    public static void verUbicaciones(ArrayList<Edificios> array) {
        for (Edificios inmueble : array) {
            System.out.println(inmueble.toString2());
        }
    }

    public static void verInmuebles(ArrayList<Edificios> array) {
        for (Edificios inmueble : array) {
            System.out.println(inmueble);
        }
    }

    public static void crearInmueble(ArrayList<Edificios> array, Scanner scan) {
        System.out.println();
        System.out.println("¿Que tipo de inmueble quieres crear?");
        System.out.println("1.Piso");
        System.out.println("2.Casa");
        System.out.println("3.Trastero");
        System.out.print("Opcion: ");

        int opcion = 0;
        while (!scan.hasNextInt()) {

            System.out.print("Introduce un valor numerico entre las opciones: ");
            scan.nextLine();

        }
        opcion = scan.nextInt();
        while (opcion < 1 || opcion > 3) {
            System.out.print("Introduce un valor numerico entre las opciones: ");
            opcion = scan.nextInt();
            scan.nextLine();
        }
        int index = array.size();
        System.out.println();
        if (opcion==1) {
            array.add(new Piso());
            array.get(index).setTipo("piso");
        }
        else if (opcion==2) {
            array.add(new Casa());
            array.get(index).setTipo("casa");
        }
        else{
            array.add(new Trastero());
            array.get(index).setTipo("trastero");
        }


        System.out.print("Metros: ");
        array.get(index).setSuperficie(validarInt(scan));
        System.out.print("Ubicacion: ");
        array.get(index).setUbicacion(scan.nextLine());
        System.out.print("Precio: ");
        array.get(index).setPrecio(validarDouble(scan));

        if (opcion==1) {
            System.out.print("Piso: ");
            Piso piso = (Piso) array.get(index);
            piso.setNumPlanta(validarInt(scan));
            System.out.print("Ascensor (si/no): ");
            piso.setAscensor(validar(scan));
        }

        if (opcion==2) {
            System.out.print("Adosada (si/no): ");
            Casa casa = (Casa) array.get(index);
            casa.setEsAdosada(validar(scan));
        }
        else if(opcion==3) {
            System.out.print("Seguridad (si/no): ");
            Trastero trastero = (Trastero) array.get(index);
            trastero.setSeguridad(validar(scan));
        }
    }


    public static double validarDouble (Scanner scan){
        boolean validar = false;
        double valor=0f;
        while (!validar) {

            if (scan.hasNextDouble()) {
                validar = true;
                valor = scan.nextDouble();
                scan.nextLine();
            } else {
                System.out.print("Introduce un valor con formato válido:");
                scan.next();
            }

        }
        return valor;
    }
    public static int validarInt (Scanner scan){
        boolean validar = false;
        int valor=0;
        while (!validar) {

            if (scan.hasNextInt()) {
                validar = true;
                valor = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.print("Introduce un valor con formato válido:");
                scan.next();
            }

        }
        return valor;
    }

    public static boolean validar (Scanner scan){
        boolean validar = false;
        String respuesta;
        boolean opcion = false;
        while (!validar) {
            respuesta = scan.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                validar=true;
                
                opcion =  true;
            }
            else if(respuesta.equalsIgnoreCase("no")){
                validar=true;
                
            }
            else{
                System.out.println("Respuesta incorrecta: ");
            }
        }
        return opcion;

    }
}
