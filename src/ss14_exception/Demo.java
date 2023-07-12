package ss14_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static int div() throws StudentAgeException{
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        try {
            System.out.println("Nhập a");
            a = scanner.nextInt();
            System.out.println("Nhập b");
            b = scanner.nextInt();
//            System.out.println(a/b);
//            System.out.println("OK");

            if(a < 18){
//                System.exit(0); sử dụng này sẽ không có finally
                throw new StudentAgeException();
            }

            return a / b; // tìm khối finally trước rồi quay lại return sau

        }
        catch (InputMismatchException e){
//            System.out.println("Vui long nhap so");
//        }catch (ArithmeticException e){
////            e.printStackTrace(); // In ra kết quả của phương thức toString cùng với stack trace đến System.err
//            System.out.println("Lỗi chia cho 0" + e.getMessage());
//        } catch (Exception e) {
////            e.printStackTrace();
//            System.out.println("Có lỗi gì đó");
        } finally {
            System.out.println("Kết thúc chương trình");
        }
        return 10;
    }

    public static void main(String[] args) throws StudentAgeException {
        System.out.println(div());
    }
}
