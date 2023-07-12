package ss10_stack_queue;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

//        System.out.println("Đã xóa :" + myStack.pop());
//        System.out.println( "Đã lấy ra xem :" + myStack.peek());

//        while (!myStack.isEmpty()){
//            System.out.println("Đã xóa :" + myStack.pop());
//        }

//        for (kieuDuLieu bienDaiDien : tenMang) {
//            // Khối lệnh được lặp lại
//        }

//        for (Integer myStack1: myStack) {
//            System.out.println(myStack1);
//        }

        for (int i = 0; i < myStack.size(); i++) {
//            System.out.println(myStack.get(i));
            System.out.println(myStack.pop());
        }
    }
}
