package on_tap_oop_full_house.excercise7;

public class Test {
    public static void main(String[] args) {
        Fraction a = new Fraction(3,4);
        Fraction b = new Fraction(4,5);

        // hàm add không thay đổi fraction hiện tại chỉ tạo fraction mới
        Fraction c = a.add(b);
        Fraction d = new Fraction(5,0);
        System.out.println(c);


    }
}
