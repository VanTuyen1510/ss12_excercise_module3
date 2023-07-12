package excercise2_full_house;

import java.util.Scanner;

public class MinimalistFractions {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int gcd = 1;

        for (int i = 1;i <= a && i <= b; i++) {
            if(a % i == 0 && b % i== 0) {
                gcd = i;
                a = a / gcd;
                b = b / gcd;
            }
        }

        System.out.println("ƯCLN là :" + gcd + " phân số tối giản là " + a + "/" + b);

    }

}
