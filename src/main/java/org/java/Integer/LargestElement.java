package org.java.Integer;
//Problem Statement: Given an array, we have to find the largest element in the array.
public class LargestElement {
    public static void main(String[] args) {
        int[] n={2,7,3,11,15,2,32,334,22,33};
        int max= n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max= n[i];
            }
        }
        System.out.println(max);
    }
}
