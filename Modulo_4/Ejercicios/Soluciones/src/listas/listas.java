import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listas {
    public static List<Integer> filtrarPares(List<Integer> lista) {
        List<Integer> res = lista.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
        return res;
    
    }
    
    // 2. Convertir a mayúsculas
public static List<String> aMayusculas(List<String> lista){
    List<String> res = lista.stream().map(c->c.toUpperCase()).collect(Collectors.toList());
    return res;
}

 // 3. Obtener el promedio
    public static double promedio1(List<Integer> lista) {
        double res = 0.;
        int sumador = 0;
        for (int i = 0; i< lista.size(); i++){
            sumador += lista.get(i);
        }
        res = sumador/lista.size();

        return res;

    }
    public static double promedio(List<Integer> lista){

        return lista.stream().mapToInt(Integer::intValue).average().orElse(0.);
    } 

    // 4. Contar elementos mayores a un valor
    public static long contarMayoresA(List<Integer> lista, int n) {
        return lista.stream().filter(x -> x > n).count();
    }

 public static String concatenar(List<String> lista) {
        return lista.stream().collect(Collectors.joining(","));
    }

public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    List<String> cadenas = Arrays.asList("hola", "java", "stream", "ejemplo");
    System.out.println(promedio(numeros));
    System.out.println(promedio1(numeros));
}




}