package excercise4_full_house;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng a");
        int lenghtA = sc.nextInt();
        int[] a = new int[lenghtA];
        System.out.println("Nhập phần tử mảng a");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhập phần tử của mảng a " + i);
            a[i] = sc.nextInt();

        }

        System.out.println(findGCD(a));

    }
        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        public static int findGCD(int[] num) {
            int result = num[0];
            for (int i = 1; i < num.length; i++) {
                result = gcd(result, num[i]);
            }

            return result;
        }



}
