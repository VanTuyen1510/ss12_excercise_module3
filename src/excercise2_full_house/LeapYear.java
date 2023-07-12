package excercise2_full_house;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        int x = sc.nextInt();
        System.out.println("Nhập số b");
        int y = sc.nextInt();


        int n ;
        for (n = x; n <= y; n++) {
            if(n % 4 == 0){
                if(n % 100 == 0){

                }else {
                    System.out.println("Những năm nhuận là " + n);;
                }
            }
        }
    }

}
