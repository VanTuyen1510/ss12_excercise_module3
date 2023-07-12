package ss10_stack_queue;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric {
    // Viết phương thức duyệt các phần tử của collection

//    public static void showElement(List arr){
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i) + "\t");
//        }
//        System.out.println();
//    }

    // Chỉ dùng các kiểu số

    public static void showElement(List<? extends Number> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> myArr1 = new ArrayList<>();
        myArr1.add(1);
        myArr1.add(2);
        myArr1.add(3);

        List<Double> myArr2 = new ArrayList<>();
        myArr2.add(1.1);
        myArr2.add(1.2);
        myArr2.add(1.3);

        List<String> myArr3 = new ArrayList<>();
        myArr3.add("a");
        myArr3.add("b");
        myArr3.add("c");

        showElement(myArr1);
        showElement(myArr2);
//        showElement(myArr3);
    }
}
