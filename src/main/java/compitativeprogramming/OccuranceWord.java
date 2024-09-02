package compitativeprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceWord {
    public static void main(String[] args) {
        String str = "there is tree tree has leaves leaves are green";
        String[] words = str.split(" ");

//        List<String> list = new ArrayList<>();
//        for (String s : words) {
//            list.add(s);
//
//        }
//
//        list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting())).Co


        Map<String,Integer> map=new HashMap<>();
        for (String word:words){
            if (map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else {
                map.put(word,1);
            }

        }
        for (Map.Entry<String,Integer> count: map.entrySet()) {
            if (count.getValue() > 1) {
                System.out.println(count.getKey() + " " + count.getValue());
            }
        }



    }
}
