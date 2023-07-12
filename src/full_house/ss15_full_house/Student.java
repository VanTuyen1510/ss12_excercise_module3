package full_house.ss15_full_house;

public class Student {
    public String name;
    public int age;
    public String id;

    public Student() {
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public boolean equals(Student other){
        if(this.id.equals(other.id)){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Student[id=" + this.id + " name=" + this.name + " age=" + this.age + "]";
    }

}
