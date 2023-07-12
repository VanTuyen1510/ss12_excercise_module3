package ss17_binary_file_search;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
    public static void main(String[] args) {
        //Cách 1:
        // pattern là lớp tiện ích nên ko cần khởi tạo đối tượng
//        Pattern pattern = Pattern.compile("[0-9]{5}");
//        Matcher matcher = pattern.matcher("11111");
//        System.out.println(matcher.matches());

        //Cách 2:
        System.out.println("11111".matches("[a-z,A-Z]{2}_[1-9]"));
    }
}
