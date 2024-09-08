package compitativeprogramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        //     unionList(arr1,arr2);
        int[] num=twoPointer(arr1,  arr2);
        for (int nu:num){
            System.out.println(nu);
        }

    }

    static int[] twoPointer(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        // Merge arrays and remove duplicates
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                if (k == 0 || tempArray[k - 1] != array1[i]) {
                    tempArray[k++] = array1[i];
                }
                i++;
            } else if (array1[i] > array2[j]) {
                if (k == 0 || tempArray[k - 1] != array2[j]) {
                    tempArray[k++] = array2[j];
                }
                j++;
            } else {
                // If both elements are equal, add one of them and increment both pointers
                if (k == 0 || tempArray[k - 1] != array1[i]) {
                    tempArray[k++] = array1[i];
                }
                i++;
                j++;
            }
        }

        // Process remaining elements in array1
        while (i < array1.length) {
            if (k == 0 || tempArray[k - 1] != array1[i]) {
                tempArray[k++] = array1[i];
            }
            i++;
        }

        // Process remaining elements in array2
        while (j < array2.length) {
            if (k == 0 || tempArray[k - 1] != array2[j]) {
                tempArray[k++] = array2[j];
            }
            j++;
        }

        // Create a new array of the exact size and copy the elements from tempArray
        return Arrays.copyOf(tempArray, k);
    }

    static Set<Integer> unionList(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            set.add(num);
        }

        for (int num : set) {
            System.out.println(num);
        }
        return set;
    }

}
