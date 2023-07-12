package test_week5_full_house;

public class DuplicatedCharacter {
    public static void main(String[] args) {
        String str1 = "abc deb";
        String str2 = "uib ueb";
        duplicatedCharacter(str1,str2);
    }
    public static void duplicatedCharacter(String str1 , String str2){
//        str1 = “abc deb”
//        str2 = “uib ueb”

        int[] a1 = new int[255]; // a1['b'] = 1

        for (int i = 0; i < str1.length(); i++) {
            a1[str1.charAt(i)]++; // Đây là biến đếm
        }
//        for (int i = 0; i < str1.length(); i++) {
//            System.out.println("a1['" + str1.charAt(i) + "'] = " + a1[str1.charAt(i)]);
//        }

        for (int i = 0; i < str2.length(); i++) {
            if(a1[str2.charAt(i)] > 0){
                System.out.println("Trùng : " + str2.charAt(i));
                a1[str2.charAt(i)]--; // Để cho chương trình hiểu rằng a1['b'] = 1 ko còn kí tự nữa,chỉ so sánh 1 kí tự thôi
            }
        }

    }
}
