package ss06_inheritance;

public class Person {
    private  int id;
    private String name;

    public Person() {
    }
    // constructor không kế thừa vì nếu mà constructor kế thừa sẽ đổi tên constructor của lớp con nên sẽ ko trùng tên class của lớp con

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void learn(String a){
        System.out.println("Học bài ");
    }
    public void showName(){
        System.out.println("Person");
    }


//    public final void smoking(){
//        System.out.println("Person");
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
