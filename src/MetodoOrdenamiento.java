public class MetodoOrdenamiento {
    public int [] sortBubbleAva(int[] arreglo){
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {

            intercambio= false;

            System.out.println();
            System.out.println("Pasada "+i);

            for (int j = 0; j < n-1-i; j++) {   //j < n-1-i (la i es para que ya no llegue hasta el ultimo numero)

               System.out.println("j="+j+" [j]="+arreglo[j]+"j+1="+j+1+" [j+1]="+arreglo[j+1]);

                if (arreglo[j]>arreglo[j+1]) {

                    System.out.println("Si hay cambio");
                    System.out.println();

                //Intercambio
                int aux = arreglo[i];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = aux;

                intercambio= true;
                //si no hubo ningun intercambio es pq ya esta ordenado
                //y no deberia intercambiar
                }
            }
            if (intercambio) {
                break;
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arr) {
        System.out.println();
    }

}
