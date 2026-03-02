import java.util.Scanner;

public class EjercicioIntroduccion {
 
 public static void ejercicioReservas(Scanner sc) {
        int mesasDisponibles = 5;
        String respuesta;

        while (true){
            System.out.println("¿Desea cerrar las reservas? (S/N)");
            respuesta = sc.nextLine().toUpperCase();
            if (respuesta.equals("S")){
                break;

            }
            System.out.println("Ingrese nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.println("Ingrese el número de personas");
            sc.nextLine();
            
            if (mesasDisponibles >0){
                mesasDisponibles--;
                System.out.println("Reserva confirmada para" + nombre + "- Mesas disponibles:" + mesasDisponibles);
            } else {
                System.out.println("Lo sentimos, no hay mesas disponibles.");
            }

        }


    }
 



 
 
 
 
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ejercicioReservas(sc);
        
    }
}