package org.java.coadingproblems.Integer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DuplicateElementFromArray {

    static List<Integer> duplicateElement(int[] array) {

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int number : array) {
            if (!set.contains(number)) {
                set.add(number);

            } else {
                list.add(number);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2};
        List<Integer> v = duplicateElement(array);
        System.out.println(v.toString());
    }
}
