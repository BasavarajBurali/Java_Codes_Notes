package org.java.coadingproblems.Integer;

import java.util.Arrays;

public class MergeTwoSortedArray {

    static int[] methodOne(int[] a1, int[] a2) {
        int i = 0, j = 0, k = 0;
        int n1 = a1.length;
        int n2 = a2.length;
        int[] mergedArray = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                mergedArray[k++] = a1[i++];
            } else {
                mergedArray[k++] = a2[j++];
            }


        }
        while (i < n1) {
            mergedArray[k++] = a1[i++];
        }
        while (j < n2) {
            mergedArray[k++] = a1[j++];
        }

        return mergedArray;

    }
    //-----------------------------------------------------------------------------------------------------------------
    static int[] methodTwo(int[] arr1, int[] arr2, int m, int n) {

        int arr3[] = new int[n + m];

        int i = 0, j = 0, k = 0;


        // Merging arrays
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (k == 0 || arr3[k - 1] != arr1[i]) { // Check for duplicates in arr1
                    arr3[k++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (k == 0 || arr3[k - 1] != arr2[j]) { // Check for duplicates in arr2
                    arr3[k++] = arr2[j];
                }
                j++;
            } else {
                if (k == 0 || arr3[k - 1] != arr1[i]) { // Ensure no duplicate is added from either array
                    arr3[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        // Copy remaining elements of arr1 (if any) while skipping duplicates
        while (i < n) {
            if (arr3[k - 1] != arr1[i]) {
                arr3[k++] = arr1[i];
            }
            i++;
        }

        // Copy remaining elements of arr2 (if any) while skipping duplicates
        while (j < m) {
            if (arr3[k - 1] != arr2[j]) {
                arr3[k++] = arr2[j];
            }
            j++;
        }


        return Arrays.copyOf(arr3, k);
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 9};
        int[] num1 = methodOne(a1, a2);

        int n = 5;
        int m = 5;
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 4, 5};

        int[] num2=methodTwo(arr1,arr2,m,n);
        for (int num:num2){
            System.out.println(num);

        }





    }


}
