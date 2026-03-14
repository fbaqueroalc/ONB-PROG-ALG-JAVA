package arrays;

public class EjArrays {


    public static int sumaDeElementos(int [] arra){
        int suma = 0;
        for (int i = 0;i < arra.length; i++){
            suma += i;
        } 
        return suma;
    }

    public static boolean buscarElementos(String [] lis, String ob){
        Boolean encontrado = false;
        for (int i = 0;i < lis.length; i++){
            if (lis[i].equals(ob)){
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static int[] invertirArray(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0;i < res.length;i++){
            res[i] = arr[arr.length - 1 - i];

        }
        return res;
    }

    public static int maximo(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > res){
                res = arr[i];

            }

        }
        return res;
    }

    public static int contarPares (int[] arr){
        int contador = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i] % 2 == 0){
                contador++;
            }
        }
        return contador;

    }



    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        String[] palabras = {"hola", "mundo", "java", "arrays"};

        System.out.println("Valor máximo: " + maximo(numeros));
        System.out.println("Cantidad de pares: " + contarPares(numeros));
    }
    
}
