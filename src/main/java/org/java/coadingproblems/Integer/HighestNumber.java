package org.java.coadingproblems.Integer;

public class HighestNumber {
    public static void main(String[] args) {
        int[] array={2,3,2,1,33,44,2,2};
        int max=Integer.MIN_VALUE;
        for (int num:array){
            if (num>max){
                max=num;
            }

        }
        System.out.println(max);
    }
}
