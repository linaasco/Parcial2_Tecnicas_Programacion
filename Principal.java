import java.util.Scanner;
import java.util.HashMap;

public class Principal {

    public static void main(String[] args) {
        HashMap<String, String> lugar = new HashMap<>();
        HashMap<String, String> tiempo = new HashMap<>();
        HashMap<String, String> momento = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Bienvenido a la aerolinea...");

        while (true ){
            System.out.println("1. Buscar vuelo");
            System.out.println("2. Verificar reserva");

            System.out.println("Ingrese el numero de la opcion");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el numero de vuelo ");
                    String numeroVuelo= sc.nextLine();
                    System.out.println("Ingrese el destino del lugar");
                    String destino= sc.nextLine();
                    System.out.println("Ingrese la fecha");
                    String fecha= sc.nextLine();
                    System.out.println("Ingrese la hora ");
                    String hora= sc.nextLine();
                    Vuelo vuelo;

                    break;

                case 2:

            }

    }




        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su numero de pasaporte");
        int numeroPasaporte= sc.nextInt();

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        System.out.println("Ingrese que preferencia alimenticia tiene");
        String preferenciasAlimenticias = sc.nextLine();

        Pasajero pasajero;






    }
}
