package ss16_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String File_PATH = "D:\\HocLai_module2\\src\\ss16_io_text_file\\student.csv";
    // Đường dẫn : tuyệt đối và đường dẫn tương đối

    public static List<Student> readCSV() throws IOException {
        List<Student> studentList = new ArrayList<>();

        FileReader fileReader = new FileReader(File_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String temp[];
        Student student;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            double point = Double.parseDouble(temp[2]);

            student = new Student(id, name, point);
            studentList.add(student);
        }
        buff.close(); // ???
        return studentList;
    }

    public static void writeCSV(Student student) throws IOException {
        FileWriter fileWriter = new FileWriter(File_PATH, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.write(student.getId() + "," + student.getName() + "," + student.getPoint() + "\n");
        buff.close();
    }
}
