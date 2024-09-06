package compitativeprogramming;

import java.util.HashMap;
import java.util.Map;
/*Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
 map = {2: 2, 1: 2, 4: 1} this is how map stores the element
 */

public class NumberOnlyApperones {
    public static void main(String[] args) {
        int[] array = {2, 2, 1, 1, 4};
        System.out.println(firstMethod(array));
        System.out.println(findNumber(array));
        System.out.println(secondMethod(array));


    }

    static int firstMethod(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return array[i];
            }
        }
        return -1;

    }

    static int findNumber(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : array) {
            if (map.get(num) == 1) {
                System.out.println(num);
            }

            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (m.getValue() == 1) {
                    return m.getKey();
                }

            }


        }
        return -1;


    }

    static int secondMethod(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : array) {
            if (map.get(num) == 1) {
                return num;
            }

        }
        return -1;
    }
}
