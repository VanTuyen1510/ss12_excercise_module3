package ss06_inheritance;

public class Student extends Person{
//    public Student() {
//
//        super(1,"lala");
//    }
//    public void showName(){
//        System.out.println(super.getName());
//    }
//
    public Student(int id, String name) {
        super(id, name);

    }



//    public void learn(){
//        learn("toán");
////        learn("toán ", "văn");
//        System.out.println(1);
//    }
//    public void learn(String b){
//        System.out.println(3);
//    }
//    public void learn(String a , String b){
//            System.out.println(2);
//    }
    public void showName(){
        System.out.println("Student");
    }

//    @Override // Phưowng thức này đang ghi đè lớp cha
//    public void smoking(){
//        System.out.println("Student");
//    }

    //    public Student(){
//        super(1,"lala");
//        System.out.println("Student");
//    }
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id + super.getId() +
//                ", name='" + name + super.getName() + '\'' +
//                '}';
//    }
}
