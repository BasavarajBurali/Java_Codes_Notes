package compitativeprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyElement {
    public static void main(String[] args) {
       //int[] array= Arrays.asList(1,3,2,2,2,3);
        List<Integer> list= Arrays.asList(1,1,2,2,2,3);
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer num:list){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }

        list.sort((a, b) -> {
            int freqCompare = map.get(a).compareTo(map.get(b));
            if (freqCompare == 0) {
                return a.compareTo(b); // If frequencies are equal, sort by the natural order
            } else {
                return freqCompare; // Sort by frequency
            }
        });

        // Print the sorted list
        for (Integer num : list) {
            System.out.print(num + ",");
        }

    }
}
