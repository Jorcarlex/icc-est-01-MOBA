
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        Scanner scanner = new Scanner(System.in);
        int tamanio = 0;

        /*
         * int[]arr = {5, 8, 9, 3, 0};
         * //int[]arr = {};
         * 
         * 
         * mO.sortBubbleAva(arr);
         * mO.printArreglo(arr);
         */

        // System.out.println("Ingrese el tamanio del arreglo");

        do {

            System.out.println();
            System.out.print("Ingrese el tamanio que sea positivo: ");

            while (!scanner.hasNextInt()) {

                System.out.println("Te pedi un numero valido");
                scanner.next();
            }

            tamanio = scanner.nextInt();

            if (tamanio <= 0) {
                System.out.println("El tamanio debe ser entero positivo");
            }

        } while (tamanio <= 0);

        int[] arreglo = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Te pedí un número válido");
                scanner.next();
            }
            arreglo[i] = scanner.nextInt();
        }

        // Ordenar el arreglo
        mO.sortBubbleAva(arreglo);
        // Imprimir el arreglo ordenado
        mO.printArreglo(arreglo);

        scanner.close();
    }
}
