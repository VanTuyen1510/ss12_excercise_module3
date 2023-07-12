package ss07_abstract_interface;

public class Student extends Person {
//    Person student = new Student(); Lớp abstract không thể tạo ra đối tượng

    @Override
    public void love() {
        System.out.println("Tình yêu học trò");
    }
    public void playGame(){
        System.out.println("Học sinh chơi game");
    }
}
