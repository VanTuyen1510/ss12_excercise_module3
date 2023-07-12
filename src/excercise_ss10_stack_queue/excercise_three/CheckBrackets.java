package excercise_ss10_stack_queue.excercise_three;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter :");
        String str = sc.nextLine();
        if (bracketPair(str)) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }

    public static boolean bracketPair(String str) {
        Stack<Character> bStack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                Character left = bStack.pop();
                if (bStack.equals(left)) {
                    return false;
                }
            }
        }
        if (bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
