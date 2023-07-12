package full_house.ss15_full_house;

public class test {
    public static void main(String[] args) {
        Student student1 = new Student("A",1,"105");
        Student student2 = new Student("B",10,"100");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.equals(student2));

    }
}
