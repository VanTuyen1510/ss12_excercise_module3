package excerciese7_full_house.excercise_three;

public class Student {
    public int id;
    public String name;
    public double mathScore;
    public double physicsScore;
    public double chemistryScore;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, double mathScore, double physicsScore, double chemistryScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }
    public double getTotalScore(){
        double sum = 0;
        sum = mathScore + physicsScore + chemistryScore;
        double average = sum / 3;
        return average;
    }
    public boolean isPassed(){
        double sum ;
        sum = mathScore + physicsScore + chemistryScore;
        double average = sum / 3;
        if(average > 5.0){
            System.out.println("Đã đủ điều kiệu qua môn");
            return true;
        }
        System.out.println("Không đủ điều kiện qua môn");
        return false;
    }
    public boolean equals(Student other){
        if(String.valueOf(id).equals(String.valueOf(other.id))){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mathScore=" + mathScore +
                ", physicsScore=" + physicsScore +
                ", chemistryScore=" + chemistryScore +
                '}';
    }
}
