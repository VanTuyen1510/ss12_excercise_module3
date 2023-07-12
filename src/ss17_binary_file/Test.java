package ss17_binary_file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student(1, "Nguyen Van A", 99);
        Student student2 = new Student(2, "Nguyen Van B", 11);
        Student student3 = new Student(3, "Nguyen Van C", 22);
//        ByteStream.writeObject(student1);
        System.out.println(student1);


        Student student = ByteStream.readObject(); //???
        System.out.println(student);
//        student.abc();

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        ByteStream.writeObjectList(studentList);

//        List<Student> result = ByteStream.readObjectList();
//        for (Student student : result) {
//            System.out.println(student);
//
//        }





    }
}
