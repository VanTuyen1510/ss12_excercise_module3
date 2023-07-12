package Furuma_resort.models;

public class Employee extends Person{
    private String code; // mã nhân viên
    private String level; // trình độ
    private String location; // vị trí
    private int salary; // lương

    public Employee() {
    }

    public Employee(String code, String level, String location, int salary) {
        this.code = code;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String name, String date, String gender, int id, String phone, String email) {
        super(name, date, gender, id, phone, email);
    }

    public Employee(String name, String date, String gender, int id, String phone, String email, String code, String level, String location, int salary) {
        super(name, date, gender, id, phone, email);
        this.code = code;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code='" + code + '\'' + super.toString() +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
