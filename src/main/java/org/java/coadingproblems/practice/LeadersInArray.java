package org.java.coadingproblems.practice;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 0};
        findLeaders(arr);
    }

    public static void findLeaders(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<>();

        // The rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Print the leaders in reverse order (from left to right)
        System.out.print("Leaders: ");
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }
}
