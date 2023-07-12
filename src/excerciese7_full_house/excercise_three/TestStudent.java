package excerciese7_full_house.excercise_three;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1,"Tuyên",8.5,9.0,10.0);
        Student student1 = new Student(2,"Minh",2.0,3.5,1.0);
        System.out.println(student1.isPassed());
        System.out.println("------------------");
        System.out.println(student.equals(student1));
    }
}
