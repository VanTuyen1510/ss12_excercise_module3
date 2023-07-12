package excercise_ss10_stack_queue.excercise_two;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter : "); // Trong java phân biệt chữ hoa và chữ thường
        String str = sc.nextLine();

        checkPalindrome(str);
    }
    public static boolean checkPalindrome(String str){
        String[] myArr = str.split(" ");
        Stack<String> myStack = new Stack<>();
        Queue<String> myQueue = new LinkedList<>();

        for (int i = 0; i < myArr.length; i++) {
            myStack.add(myArr[i]);
            myQueue.offer(myArr[i]);
        }

        Boolean check = true;
        while (!myStack.isEmpty() && !myQueue.isEmpty()){
            if(!myStack.pop().equals(myQueue.remove())){
                check = false;
                break;
            }
        }
        if(!check) // ???
            {
            System.out.println("This is not Palindrome");
        }else {
            System.out.println("This is Palindrome");
        }
        return check;
    }
}
