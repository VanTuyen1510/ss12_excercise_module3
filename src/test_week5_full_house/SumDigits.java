package test_week5_full_house;

public class SumDigits {
    public static void main(String[] args) {
        String number = "123456789";
        System.out.println(sumDigits(number));

//
//        char a = '1' - '0'; // => Mã ASCII 49 - 48 = 1
//        int num = a;
//        System.out.println(num);

    }
    public static int sumDigits(String number){
        int total = 0;
        for (int i = 0; i < number.length(); i++) {
            char a = number.charAt(i);
//            int num = Integer.parseInt(a + ""); // a = '1' + "" => a ="1" , parseInt nhận vào 1 tham số String;
            int num = a - '0'; // a = '0' => '0' - '0' = 0
            total += num;
        }
        return total;

    }
}
