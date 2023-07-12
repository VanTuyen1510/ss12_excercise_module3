package ss11_map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("B", 2);
        myMap.put("A", 3);
        myMap.put("C", 5); // key trùng sẽ bị ghi đè
        myMap.put("C", 4); // cập nhập
        myMap.replace("C",6); // cập nhập
        myMap.put(null,5);

        for (String key: myMap.keySet()) {
            System.out.println(key + " - " + myMap.get(key));
        }

//        for (Map.Entry<String,Integer> entry: myMap.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//
//        Student student1 = new Student(1,"Nguyen Van A");
//        Student student2 = new Student(2,"Nguyen Van B");
//        Student student3 = new Student(3,"Nguyen Van C");
//        Student student4 = new Student(4,"Nguyen Van D");
//
//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());
//        System.out.println(student3.hashCode());
//        System.out.println(student4.hashCode());
//
//        Map<Student,String> myMap = new HashMap<>();
//        myMap.put(student1,"a09");
//        myMap.put(student2,"a08");
//        myMap.put(student3,"a05");
//        myMap.put(student4,"a06");
//
//        for (Student key: myMap.keySet()) {
//            System.out.println(key);
//        }

    }


}
