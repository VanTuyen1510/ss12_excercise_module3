package ss11_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedList {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Nguyen Van A");
        Student student2 = new Student(2,"Nguyen Van A");
        Student student3 = new Student(3,"Nguyen Van C");
        Student student4 = new Student(4,"Nguyen Van D");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());

        Map<Student,String> myMap = new LinkedHashMap<>();
        myMap.put(student1,"a09");
        myMap.put(student3,"a05");
        myMap.put(student4,"a06");
        myMap.put(student2,"a08");

        for (Student key : myMap.keySet()) {
            System.out.println(key);
        }
    }
}
