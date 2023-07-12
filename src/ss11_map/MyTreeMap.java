package ss11_map;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Nguyen Van A");
        Student student2 = new Student(2,"Nguyen Van B");
        Student student3 = new Student(3,"Nguyen Van C");
        Student student4 = new Student(4,"Nguyen Van D");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());

        Map<Student,String> myMap = new TreeMap<>();
        myMap.put(student1,"a09");
        myMap.put(student2,"a08");
        myMap.put(student3,"a05");
        myMap.put(student4,"a06");

        for (Student key: myMap.keySet()) {
            System.out.println(key + " - " + myMap.get(key));
        }
    }
}
