package ss17_binary_file;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 5686255611691705191L;
    private int id;

    private static String name;

    private transient double point;

    public Student() {
    }

    public Student(int id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
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

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", point=" + point +
                '}';
    }
    public void abc(){
        System.out.println("Hello");
    }
}
