
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        MetodoOrdenamiento mO=new MetodoOrdenamiento();

        /*int[]arr = {5, 8, 9, 3, 0};
        //int[]arr = {};


        mO.sortBubbleAva(arr);
        mO.printArreglo(arr);
        */

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingrese el tamanio del arreglo");
        int tamanio =0;

       do { 

           System.out.println("Ingrese el tamanio que sea positivo");

           while (!scanner.hasNextInt()){

            System.out.println("Te pedi un numero valido");
            scanner.next();

           }

           tamanio=scanner.nextInt();

           if (tamanio<=0) {
               System.out.println("el tamanio debe ser entero positivo");
           }

       } while (tamanio<=0) ;

        int[] arreglo = new int [tamanio];

        scanner.close();
    }
}
