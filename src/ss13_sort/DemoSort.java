package ss13_sort;

import java.util.Arrays;

public class DemoSort {

    public static void main(String[] args) {
        int[] array = {12, 2, 8, 5, 1, 6, 4, 15};
//       int[] array1 = {1, 2, 4, 5, 6, 8, 12, 15};
        int[] array2 = {1, 2, 4, 3};
//        bubbleSort(array2);
//        selectionSort(array);
          insertionSort(array);
    }

    public static void bubbleSort(int[] array) {
        boolean flag = true;
//        int count = 0;
        for (int i = 0; i < array.length - 1 & flag; i++) {
            flag = false; // mặc định không chạy nữa
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = true;
                }
//             count++;
            }

        }
        System.out.println(Arrays.toString(array));
//        System.out.println("Số lần đếm là  : " + count);
    }

    public static void selectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) // ???
        {
            min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static void insertionSort(int[] array){
        int pos, x;
        for (int i = 0; i < array.length; i++) { // đoạn array[0] đã được sắp xếp
             x = array[i];// gán vào biến tạm nếu không khi dịch chuyển sẽ mất
            pos = i;
            while (0 < pos && x < array[pos - 1]){ // tìm giá trị thích hợp để chèn con đã được sắp xếp
                array[pos] = array[pos-1];
                pos--;
                System.out.println("inner" + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
    }
}
