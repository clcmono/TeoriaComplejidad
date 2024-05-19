import java.util.Random;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        MetodosOrdenamiento ordenamiento = new MetodosOrdenamiento();
        
        // Generar un arreglo base con el tamaño máximo
        int maxSize = 30000;
        int[] baseArray = generateRandomArray(maxSize);

        
        
        int[] sizes = {10, 20, 100, 1000, 5000, 10000, 30000};
        for (int size : sizes) {
            int[] array = Arrays.copyOf(baseArray, size);
            System.out.println("Tamaño del arreglo: " + size);
          
            int[] bubbleArray = array.clone();
            long startTime = System.nanoTime();
            ordenamiento.sortByBubbleMejorado(bubbleArray);
            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000000.0;
            System.out.println("Método Burbuja Mejorado - Tiempo: " + duration + " segundos");

            int[] selectionArray = array.clone();
            startTime = System.nanoTime();
            ordenamiento.selectionSort(selectionArray);
            endTime = System.nanoTime();
 
            System.out.println("Método Selección - Tiempo: " + duration + " segundos");

            int[] insertionArray = array.clone();
            startTime = System.nanoTime();
            ordenamiento.insertionSort(insertionArray);
            endTime = System.nanoTime();
            System.out.println("Método Inserción - Tiempo: " + duration+ " segundos");
            System.out.println();
        }
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000);  
        }
        return array;
    }
}
