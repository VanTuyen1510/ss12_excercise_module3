package ss11_excercise_map.excercsie_one;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 chuỗi");
        String str = sc.nextLine();
        show(str);
    }
    public static void show(String str){
        Map<Character,Integer> myMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char mWord = str.toLowerCase().charAt(i);
            if(myMap.containsKey(mWord)){
                myMap.put(mWord,myMap.get(mWord) + 1);
            }else {
                myMap.put(mWord,1);
            }
        }
        for (Character key:myMap.keySet()) {
            System.out.println(key + " - " + myMap.get(key));
        }
    }

}
