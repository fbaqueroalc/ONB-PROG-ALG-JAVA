import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void ejercicioInventario(Scanner sc){

    Map<String,Integer> inventario = new HashMap<>();


    String respuesta;
    String nombrePro;
    Integer cantidad;
    
    do {  
    System.out.println("¿Desea terminar el día? (S/N)");
    respuesta = sc.nextLine().toUpperCase();
    
    if (respuesta.equals("S")){
        System.out.println(inventario);
    } else {
        System.out.println("Elija una operación (A/R)");
        respuesta = sc.nextLine().toUpperCase();
        if (respuesta.equals("A")) {

            System.out.println("Nombre del nuevo producto: ");
            nombrePro = sc.nextLine();

            System.out.println("Cantidad del nuevo producto: ");
            cantidad = sc.nextInt();
            sc.nextLine();

            inventario.put(nombrePro, cantidad);

        } else {

            System.out.println("Nombre del producto al que retirar: ");
            nombrePro = sc.nextLine();

            System.out.println("Cantidad a retirar del producto: ");
            cantidad = sc.nextInt();
            sc.nextLine();

            if (inventario.get(nombrePro) >= cantidad){

               int nuevaCant = inventario.get(nombrePro) - cantidad;
               inventario.replace(nombrePro, nuevaCant);

            } else {
                System.out.println("Error, no hay cantidad suficiente para eliminar.");
            }
        }
    } 
    } while (!respuesta.equals("S"));

    System.out.println("Inventario final: " + inventario);
    System.out.println("Fin del día.");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejercicioInventario(sc);
    }
}
