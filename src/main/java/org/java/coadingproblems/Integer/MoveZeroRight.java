package org.java.coadingproblems.Integer;

import java.util.Arrays;

public class MoveZeroRight {
    public static void main(String[] args) {
        int[] a={0,1,0,2,3,0,4};
        int [] b=new int[a.length];
        int k=0;
        for (int i=0;i<a.length;i++){
            if (a[i]!=0){
                b[k]=a[i];
                k++;
            }
        }
        while (k<a.length){
            a[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(b));
    }
}
