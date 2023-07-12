package repository;

import bean.Student;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentRepository implements IStudentRepository{
//    static Map<Integer,Student> studentMap;
//        static {
//            studentMap = new TreeMap<>();
//            studentMap.put(432,new Student(432,"Nguyễn Văn A","2000-10-27",1,4.0));
//            studentMap.put(984,new Student(984,"Lê Thị B","2000-07-28",0,7.0));
//            studentMap.put(322,new Student(322,"Nguyễn Thị D","2000-10-21",0,9.0));
//            studentMap.put(233,new Student(233,"Nguyễn Văn C","2000-04-09",1,6.0));
//        }

    //Thực thi câu truy vấn ở Java đến DB :Statement,PreparedStatement

    // triển khai câu lệnh truy vấn và lấy kết quả truy vấn :


    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        try {
//            Statement statement =  BaseRepository.connection.createStatement();
            Statement statement = BaseRepository.getConnection().createStatement();
            // Đối tượng connection bị null vì chưa được khởi tạo
            ResultSet resultSet = statement.executeQuery(
                    "select id ,`name`, date_of_birthday\n" +
                    "from student");


            // executeQuery thực hiện câu truy vấn
            // copy câu truy vấn bỏ vào phần java
            // statement để thực thi , vào ResultSet để hứng kết quả
            // Đi từng dòng để lấy kết quả,muốn đọc từng record phải next nhiều lần
            // Mỗi lần next là mỗi lần học viên mới thì mình sẽ tạo ra đối tượng học viên

            Student student = null;

            while (resultSet.next()){
               student = new Student();
               student.setId(resultSet.getInt("id"));
               // Dùng get int theo ColumnLabel
                student.setName(resultSet.getString("name"));
                student.setDateOfBirth(resultSet.getString("date_of_birthday"));
                // Mỗi học viên như vậy để đẩy vào danh sách gửi danh sách về cho service
                studentList.add(student);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public void save(Student student) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("insert into student (`name`,date_of_birthday)\n" +
                    "values (?,?);");
            statement.setString(1,student.getName());
            statement.setString(2,student.getDateOfBirth());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
