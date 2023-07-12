package excercise2_full_house;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str = sc.nextLine();
        System.out.println(Title(str));
    }

    public static String Title(String str) {
        String n = str.substring(0, 1).toUpperCase() + str.substring(1);
        String result = "";
        for (String item : n.split(" ")) {
            result += Character.toUpperCase(item.charAt(0)) + item.substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }
}
