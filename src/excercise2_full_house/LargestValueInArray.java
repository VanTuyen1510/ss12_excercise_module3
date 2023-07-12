package excercise2_full_house;

import java.util.Arrays;
import java.util.Scanner;

public class LargestValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  System.out.println("Nhập độ dài của mảng a");
        int lenghtA = sc.nextInt();
        int[] a = new int[lenghtA];
        System.out.println("Nhập phần tử mảng a");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhập phần tử của mảng a " + i);
            a[i] = sc.nextInt();

        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        System.out.println("Nhập độ dài của mảng b");
        int lenghtB = sc.nextInt();
        int[] b = new int[lenghtB];
        System.out.println("Nhập phần tử mảng b");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Nhập phần tử của mảng b " + i);
            b[i] = sc.nextInt();

        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));


        System.out.println("Nhập độ dài của mảng c");
        int lenghtC = sc.nextInt();
        int[] c = new int[lenghtC];
        System.out.println("Nhập phần tử mảng c");
        for (int i = 0; i < c.length; i++) {
            System.out.println("Nhập phần tử của mảng c " + i);
            c[i] = sc.nextInt();

        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        int[] newArr = new int[3];


        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i] == newArr[0]){
                newArr[i] = a[a.length-1] ;
            }
            if(newArr[i] == newArr[1]){
                newArr[i] = b[b.length-1];
            }
            if(newArr[i] == newArr[2]) {
            newArr[i] =  c[c.length-1];
            }
        }
        Arrays.sort(newArr);
        System.out.println("Mảng mới là " + Arrays.toString(newArr));
    }
}
