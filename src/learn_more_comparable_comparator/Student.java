package learn_more_comparable_comparator;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double grade;

    public Student() {
    }

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    @Override
    public int compareTo(Student o) {
        if(this.name.compareTo(o.name) > 0){
            return 1;
        }else if(this.name.compareTo(o.name) == 0){
//            if(this.grade > o.grade){
//                return 1;
//            }else if(this.grade == o.grade){
//                return 0;
//            }else {
//                return -1;
//            }
            return (int) (this.grade - o.grade);
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
