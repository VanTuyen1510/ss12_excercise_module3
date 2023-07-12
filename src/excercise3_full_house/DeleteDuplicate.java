package excercise3_full_house;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DeleteDuplicate {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        deleteDuplicate( list);
        System.out.println(list);
    }
    static void deleteDuplicate(List<Integer> list){
        // 3,2,1,2,4,3
        Set<Integer> set = new HashSet<>();
        int index = 0;
        while (index < list.size()){
           if(set.add(list.get(index))){
               index++;
           }else {
               list.remove(index);
           }
        }
    }
}
