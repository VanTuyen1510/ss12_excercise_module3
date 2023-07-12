package excercise2_full_house;

import java.util.Scanner;

public class CountNumberLetter {
    public static void main(String[] args) {
        int a = 4823;
        System.out.println("Tổng số là :" + countNumberLetter(a));
    }
    public static int countNumberLetter(int n) {
        int total = 0;
        while (n > 0){
            total += n % 10;
            n/= 10;
        }

        return total;
    }
}
