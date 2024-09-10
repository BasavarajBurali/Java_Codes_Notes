package org.java.coadingproblems.Integer;

public class CompareTwoArray {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 3, 2, 4, 5};
        boolean isFound = true;

        for (int i = 0; i < a1.length; i++) {
            boolean elementFound = false;
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    elementFound = true;
                    break;
                }
            }
            if (!elementFound) {
                isFound = false;
                break;
            }
        }

        if (isFound) {
            System.out.println("All elements are present");
        } else {
            System.out.println("Not all elements are present");
        }
    }
}
