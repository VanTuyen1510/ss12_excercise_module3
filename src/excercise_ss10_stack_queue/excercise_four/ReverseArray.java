package excercise_ss10_stack_queue.excercise_four;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here :");
        String str = sc.nextLine();
        System.out.println(reverseStr(str));

        System.out.println("Nhập độ dài");
        int length = sc.nextInt();
        int[] myArr1 = new int[length];
        for (int i = 0; i < myArr1.length; i++) {
            System.out.println("Nhập phần tử " + i);
            myArr1[i] = sc.nextInt();
        }

        System.out.println("Mảng đã đảo ngược là :" + Arrays.toString(reverseArray(myArr1))); // ???
    }



    public static int[] reverseArray(int[] myArr){
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < myArr.length; i++) {
            myStack.push(myArr[i]);
        }
        for (int i = 0; i < myArr.length ; i++) {
            myArr[i] = myStack.pop();
        }
        return myArr;
    }

    public static String reverseStr(String mWord){
        Stack<String> wStack = new Stack();
        String outp = "";
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(String.valueOf(mWord.charAt(i)));
        }
        while (!wStack.isEmpty()){
           outp += wStack.pop();
        }
        return outp;
    }

}
