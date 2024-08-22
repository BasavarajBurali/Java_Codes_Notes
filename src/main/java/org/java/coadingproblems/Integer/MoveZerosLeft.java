package org.java.coadingproblems.Integer;

public class MoveZerosLeft {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 3, 0, 4};
        int[] b = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                b[k] = a[i];
                k++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[k] = a[i];
                k++;
            }

        }
        for (int l:b){
            System.out.println(l);
        }
    }
}
