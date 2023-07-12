package ss13_sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
       int[] array = {12, 2, 8, 5, 1, 6, 4, 15};
       bubbleSort(array);
    }
    public static void bubbleSort(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1 & flag; i++) {
            flag = false; // mặc định không chạy nữa
            for (int j = array.length-1 ; j > i ; j--) {
                  if(array[j] < array[j - 1]){
                      int temp = array[j];
                      array[j] = array[j - 1];
                      array[j - 1] = temp;
                      flag = true;
                  }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
