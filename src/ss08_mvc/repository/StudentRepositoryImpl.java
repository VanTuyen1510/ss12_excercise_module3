package ss08_mvc.repository;


import ss08_mvc.model.Student;

public class StudentRepositoryImpl implements IStudentRepository{
    private static Student[] studentList;
    private static int size = 0 ;//gán bằng 0 vì đây là biến toàn cục

    static {
        studentList = new Student[10];
        studentList[0] = new Student(1,"Nguyễn Văn A");
        studentList[1] = new Student(2,"Nguyễn Văn B");
        studentList[2] = new Student(3,"Nguyễn Văn C");
        size = 3;
    }


    @Override
    public Student[] findAll() {
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = studentList[i];
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {

    }
}
