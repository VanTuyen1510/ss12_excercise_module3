package dsa_list_full_house.dsa_list;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.println("Số lượng phần tử :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("danhsach[%d]= ", i);
//            System.out.println(sc.nextInt());
           if (!set.add(sc.nextInt())){
               System.err.println("Phần tử đã có trong set !");
           }
        }

        System.out.println(set.size());
        System.out.println(set);
    }
}
