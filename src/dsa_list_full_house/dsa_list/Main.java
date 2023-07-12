package dsa_list_full_house.dsa_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> danhSach = new ArrayList<>();

        System.out.println("Số lượng phần tử :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("danhsach[%d]= ", i);
//            System.out.println(sc.nextInt());
            danhSach.add(sc.nextInt());
        }

        System.out.println(danhSach);
//
//        System.out.println("Thêm phần tử vào vị trí index");
//        System.out.println("Index :");
//        int index = sc.nextInt();
//        System.out.println("Value :");
//        int value = sc.nextInt();
//        danhSach.add(index,value);
//        System.out.println(danhSach);
//        danhSach.add(sc.nextInt(),sc.nextInt());
//        danhSach.add(1);
//        danhSach.add(2);
//        danhSach.add(0);
//        danhSach.add(10);
//        danhSach.add(5);
//
//        System.out.println(danhSach);
//
//        danhSach.remove(3);
//        System.out.println(danhSach);
//
//        danhSach.add(1,100);
//        System.out.println(danhSach);
//
//        danhSach.remove(Integer.valueOf(0));
//        System.out.println(danhSach);
//
//        danhSach.remove(new Integer(5));
//        System.out.println(danhSach);

//        Integer[] arr = danhSach.toArray(new Integer[]{});
          Integer[] arr = danhSach.toArray(new Integer[0]);
        for (int a : arr) {
            System.out.println(a);
        }


        System.out.println(danhSach.contains(2));
        Collections.sort(danhSach);
    }
}
