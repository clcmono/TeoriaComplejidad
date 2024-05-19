import java.util.Arrays;

public class MetodosOrdenamiento {

    public int[] sortByBubbleMejorado(int[] arregloO) {
        int[] arreglo = Arrays.copyOf(arregloO, arregloO.length);
        int tamano = arreglo.length;
        boolean cambio = true; 
        while (cambio) {
            cambio = false; 
            for (int i = 0; i < tamano - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temporal;
                    cambio = true; 
                }
            }
        }
        // System.out.println("Insertior " + java.util.Arrays.toString(arreglo));
        return arreglo;
    }
    
    public int[] insertionSort(int[] arregloO) {
        int[] arreglo = Arrays.copyOf(arregloO, arregloO.length);
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
        // System.out.println("Insertior " + java.util.Arrays.toString(arreglo));
        return arreglo;
    }

    public int[] selectionSort(int[] arregloO) {
        int[] arreglo = Arrays.copyOf(arregloO, arregloO.length);
        for (int i = 0; i < arreglo.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            int menor = arreglo[minimo];
            arreglo[minimo] = arreglo[i];
            arreglo[i] = menor;
        }
        return arreglo;
    }
}

    


