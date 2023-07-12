package ss09_dsa_list.excercise_array_list;


import java.util.LinkedList;
import java.util.List;

public class MyLinkedList  {
    public static void main(String[] args) {
        List myArray = new LinkedList();

        int a = 1;
        myArray.add(1);
        myArray.add(new Integer(4)); // Auto-boxing : int -> Integer, double -> Doubler , boolean -> Boolean
        myArray.add("abc");

        System.out.println("Độ dài của mảng " + myArray.size());

        myArray.set(2, "A12");

//        myArray.remove(1);
//        myArray.remove(new Integer(1));

//        System.out.println(myArray.size());
        System.out.println(myArray.get(2));
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i) + "\t");
        }

        int index = myArray.indexOf(9);
        System.out.println(index);

        System.out.println(myArray.contains(4)); // Contains trong ArrayList để tìm kiếm 1 phần tử có nằm trong mảng arrayList trả về true hoặc false
    }
}
