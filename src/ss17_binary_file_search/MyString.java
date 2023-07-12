package ss17_binary_file_search;

public class MyString {
    public static void main(String[] args) {

        // Khai báo kiểu nguyên thủy : 2 đối tượng cùng trỏ tới 1 ô nhớ là String pool
//        String str1 = "abc";
//        String str2 = "abc";
//        System.out.println(str1 == str2);


        // str1 và str 2 cùng trỏ tới abc nhưng khi gán str1 và str2 thì sẽ tạo ra 1 biến mới trong String pool là abcdef
//        String str1 = "abc";
//        String str2 = str1;
//        str2 += "def";
//        System.out.println(str1); // abc
//        System.out.println(str2); // abcdef


        // Khai báo kiểu đối tượng : str1 tạo 1 địa chỉ ô nhớ , str2 tạo địa chỉ ô nhớ và thực hiện ghép chuỗi
//        String str1 = new String("abc");
//        String str2 = str1; // SideEffect
//        str2 += "def";
//        System.out.println(str1); // abc
//        System.out.println(str2); // abcdef


        //public String substring(int startIndex, int endIndex): Phương thức này trả về đối tượng chuỗi mới là chuỗi con của chuỗi đã cho tính startIndex đến endIndex đã nhập.
//        String str1 = "good morning";
//        str1 = str1.substring(1,5); // phải tạo 1 biến str1 để gán vì tạo đó sẽ tạo 1 cái mới ko sẽ là good morning
//        System.out.println(str1);//ood

//        Student student1 = new Student(1,"A",9.9);
//        Student student2 = student1;
//        student2.setId(3);
//        System.out.println(student1.getId()); ???
//        System.out.println(student2.getId());


        // StringBuilder ,StringBuffer tạo ra 1 ô nhớ làm việc trong ô nhớ , còn string thì tạo ra nhiều ô nhớ nên khi làm việc với vòng lặp thì làm việc với StringBuilder và SringBuffer
        StringBuilder str1 = new StringBuilder("abc");
        StringBuilder str2 = str1;
        str2.append("def");
        System.out.println(str1); // abcdef
        System.out.println(str2); // abcdef












    }
}
