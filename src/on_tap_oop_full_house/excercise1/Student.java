package on_tap_oop_full_house.excercise1;

public class Student {
    public String id;
    public String name;
    public int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object other){
        // instanceof là so sánh other có phải là đối tượng của Student hay không còn == và != là so sánh 2 biến với nhau
        if(!(other instanceof Student)){
            return false;
        }

        // other thuộc Object và other không có thuộc tính id , name , age
        Student stu = (Student) other;

        return this.id.equals(stu.id);
    }

    @Override
    public String toString(){
        return "Student[id = " + id + ", name = " + name + ", age = " + age + "]";
    }
}
