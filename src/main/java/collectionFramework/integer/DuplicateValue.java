package collectionFramework.integer;

import java.util.ArrayList;
import java.util.List;

public class DuplicateValue {
    public static void main(String[] args) {
        int[] a={1,2,3,2,1};
        List<Integer> list=new ArrayList<>();
        for (Integer num:a){
            if (!list.contains(num)){
                list.add(num);
            }
        }
        for (Integer numbers:list){System.out.println(numbers);}

    }

}
