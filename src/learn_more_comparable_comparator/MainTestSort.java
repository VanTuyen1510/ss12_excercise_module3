package learn_more_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainTestSort {
    public static void main(String[] args) {
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(253, "Nguyen Van D", 5.0));
        studentList.add(new Student(324, "Nguyen Van A", 8.0));
        studentList.add(new Student(428, "Nguyen Van C", 9.0));
        studentList.add(new Student(111, "Nguyen Van A", 9.0));

        // Sự khác nhau giữa comparable và comparator :
        // Cùng 1 thời điểm comparable sắp xếp theo 1 hướng nào đó thôi
        // Cùng 1 thời điểm comparator có nhiều lựa chọn hơn vd: 1.Sắp xếp theo tên ,2.sắp xếp theo điểm

//        Collections.sort(studentList);
//        System.out.println(studentList);

        do {
            System.out.println("1.Sắp xếp học viên theo tên");
            System.out.println("2.Sắp xếp học viên theo điểm");
            System.out.println("0.Kết thúc");
            choose = sc.nextInt();

            if (choose == 1) {
                // bên phải truyền vào đối tượng của comparator
                Collections.sort(studentList, new StudentSortName());
            } else if (choose == 2) {
                Collections.sort(studentList, new StudentSortGrade());
            }
            System.out.println(studentList);
        }
        while (choose != 0) ;
    }
}
