package excerciese7_full_house.excercise_two;

import java.util.Arrays;
import java.util.Scanner;

import static excerciese7_full_house.excercise_two.ArrayManager.array;

public class TestArrayManager {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayManager arrayManager = new ArrayManager();
        System.out.println("Nhập độ dài của mảng");
        int length = sc.nextInt();
        array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử của mảng:");
            array[i] = sc.nextInt();
        }
        System.out.println(arrayManager.getTotal());
        System.out.println(arrayManager.getMean());
        System.out.println("Số lớn nhất trong mảng là : " + arrayManager.getMax());
        System.out.println("Số nhỏ nhất trong mảng là : " + arrayManager.getMin() );
        System.out.println(arrayManager);
    }
}
