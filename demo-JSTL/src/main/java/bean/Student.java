package bean;

public class Student {
    public Integer id; // bắt chước trong database đối tượng có kiểu null,nguyên thủy ko có kiểu null
    public String name;
    public String dateOfBirthday;
    public Integer gender;
    public Double grade;

    public Student() {
    }

    public Student(Integer id, String name, String dateOfBirthday, Integer gender, Double grade) {
        this.id = id;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.gender = gender;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }


}
