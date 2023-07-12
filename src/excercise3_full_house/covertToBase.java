package excercise3_full_house;

public class covertToBase {
    public static void main(String[] args) {

//        System.out.println(15 % 8);
//        System.out.println(15 / 8);

        int n = 123;
        int b  = 8;
        // if(n % b >= 10)
        // Nếu số dư :
        // = 10 -> 'A'
        // = 11 -> 'B'
        // = 12 -> 'C'
        // = 13 -> 'D'
        // = 14 -> 'E'
        // = 15 -> 'F'

        String answer = "";
        while (n > 0){
            int du = n % b;
            if(du >= 10){
                answer = (char)(du - 10 + 'A') + answer;
            }else {
                answer = (n % b) + answer; // vd : 123 % 8 = 15 dư 3 -> 15 % 8 = 1 dư 7 -> 1 % 8 = 1 dư 1
            }

            n /= b; // Để lấy con số nhỏ hơn vd: 123 / 8 = 15 -> 15 / 8 = 1 -> 1 / 8 = 1
        }
        System.out.println(answer);
        // n : số của hệ số 10 (thập phân)
        // b : hệ 8 (bát phân) => b = 8
        // n % b
        // n / b
    }
}
