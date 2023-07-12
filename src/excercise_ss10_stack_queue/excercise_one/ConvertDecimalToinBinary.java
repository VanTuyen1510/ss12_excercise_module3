package excercise_ss10_stack_queue.excercise_one;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToinBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số :");
        int num = sc.nextInt();

        Stack<Integer> myStack = new Stack<>();
        while (num > 0){
           myStack.push( num % 2);
           num /= 2;
        }
        String str = "";
        while (!myStack.isEmpty()){
            str += myStack.pop();
        }
        System.out.println(str);


    }

}
