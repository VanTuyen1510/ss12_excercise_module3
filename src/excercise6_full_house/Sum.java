package excercise6_full_house;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("test 1 : length str 1 = 5 & length str 2 = 5");
        System.out.println("str 1 : ");
        String str1 = sc.nextLine();
        System.out.println("str 2 : ");
        String str2 = sc.nextLine();
        System.out.println("test 1 : " + str1 + " + " +str2 + " = "+ sum(str1,str2));

        System.out.println("test 2 : length str 1 = 10 & length str 2 = 7");
        System.out.println("str 1 : ");
        String str3 = sc.nextLine();
        System.out.println("str 2 : ");
        String str4 = sc.nextLine();
        System.out.println("test 2 : " + str3 + " + " +str4 + " = "+ sum(str1,str2));
        sc.close();

    }

    public static String sum(String str1, String str2) {
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        return Integer.toString(sum);
    }
}
