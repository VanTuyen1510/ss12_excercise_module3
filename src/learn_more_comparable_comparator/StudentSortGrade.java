package learn_more_comparable_comparator;

import java.util.Comparator;

public class StudentSortGrade implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        return (int) (o1.getGrade() - o2.getGrade());// Double - double = int ,trả về >0,<0,=0

        if(o1.getName().compareTo(o2.getName()) >0){
            return 1;
        }else if(o1.getName().compareTo(o2.getName()) == 0){
            return 0;
        }else {
            return -1;
        }
    }
}
