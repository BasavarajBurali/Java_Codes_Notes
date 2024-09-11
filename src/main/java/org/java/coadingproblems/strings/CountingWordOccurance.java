package org.java.coadingproblems.strings;

import java.util.HashMap;
import java.util.Map;

public class CountingWordOccurance {
    public static void main(String[] args) {
        String s = "error maam error how are you";
        String[] s1 = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : s1) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word)+1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
