import java.util.Scanner;

public class Ejercicio2 {

    public static void ejercicio2(Scanner sc) {
        int contadorPares = 0;
        String opcion;

        do {
        System.out.println("Quieres introducir números enteros? (S/N)");
        opcion = sc.nextLine().toUpperCase();
        
        if (opcion.equals("S")) {
            
            System.out.println("Introduce un número entero: ");
            int numero = Integer.parseInt(sc.nextLine());
            if (numero % 2 == 0) {
                contadorPares++;
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
        }

    }while (!opcion.equals("N"));

    System.out.println("El número total de pares es:" + contadorPares);
    System.out.println("Fin del programa");
    }




        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in); ejercicio2(sc);
            
        
        
    }
}
