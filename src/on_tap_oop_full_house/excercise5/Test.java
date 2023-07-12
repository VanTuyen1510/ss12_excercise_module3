package on_tap_oop_full_house.excercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dictionary.txt");
        System.out.println(file.exists()); // hàm exists là kiểm tra đường dẫn của file có tồn tại hay không

        Scanner sc = new Scanner(file);

        // hasNext kiểm tra đoạn String tiếp theo có tồn tại hay không 'abc' -> 'bcn' -> 'dcd'
        // hasNextLine kiểm tra dòng tiếp theo có tồn tại hay không
//        while (sc.hasNextLine()) // tránh trường hợp file không có báo lỗi nên dùng while
//        {
//            String str = sc.nextLine();
//            System.out.println(str);
//        }

        while (sc.hasNextInt()){
            String str = sc.next();
            System.out.println(str);
        }

        while (sc.hasNext()){
            String str = sc.next();
            System.out.println(str);
        }


        sc.close(); // mở file không close thì những dữ liệu trong file sẽ biến mất



    }
}
