package ss16_io_text_file;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Student> studentList = FileUtil.readCSV();
        for (Student student : studentList) {
            System.out.println(student);
        }

        FileUtil.writeCSV(new Student(6,"Hưng",99));

    }
}
