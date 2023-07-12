package on_tap_oop_full_house.excercise1;

public class Test {
    public static void main(String[] args) {
        Student str1 = new Student("1","A",1);
        Student str2 = new Student("1","B",2);
        String str = "1";
        System.out.println(str1);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str));
    }
}
