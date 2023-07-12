package excercise2_full_house;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "abccba";
        if(Palindrome(str)){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }

    }
    public static boolean Palindrome(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length()- i -1)){
                return false;
            }
        }
        return true;
    }
}
