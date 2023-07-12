package ss13_excercise_sort.excercise_two;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 2, 8, 5, 1, 6, 4, 15};
        insertionSort(array);

    }
    public static void insertionSort(int[] arr){
        int pos,x;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (0 < pos && x < arr[pos-1]){
                arr[i] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
            System.out.println(arr);
        }

    }
}
