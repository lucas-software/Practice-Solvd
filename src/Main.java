public class Main {
    public static void main(String[] args) {
        int[] array = {15,3,4,7,6};
        //Rearranging the array to SelectionSort algorithm
        selectionSort(array);
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static void selectionSort(int[] aux) {
        int size = aux.length;

        for (int i = 0; i < size - 1; i++) {
            // Finds the smallest unordered element in the array
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (aux[j] < aux[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element found with the first unordered element
            int temp = aux[minIndex];
            aux[minIndex] = aux[i];
            aux[i] = temp;
        }
    }
}