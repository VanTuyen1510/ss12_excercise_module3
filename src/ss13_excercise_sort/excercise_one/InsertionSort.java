package ss13_excercise_sort.excercise_one;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {12, 2, 8, 5, 1, 6, 4, 15};
        insertionSort(array);
    }

    public static void insertionSort(int[] arr) {

        int pos, x;

        for (int i = 0; i < arr.length; i++) {

            /* Assign to temporary variable is x */

            x = arr[i];

            pos = i;

            /* Find the appropriate value to insert the sorted child */

            while (0 < pos && x < arr[pos - 1]) {

                /* Assign arr[pos-1] with arr[pos] */

                arr[pos] = arr[pos - 1];

                /* Reduce pos */
                pos--;
            }
            arr[pos] = x;

            /* Show the list after short*/

            System.out.println(Arrays.toString(arr));

        }
    }
}
