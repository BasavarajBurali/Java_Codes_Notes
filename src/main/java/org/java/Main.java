package org.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     int [] a={1,3,5,7,9,2,4,6,8,0};
     for (int i=0;i<a.length-1;i++){
         for (int j=0;j<a.length-1;j++){
             if (a[j]>a[j+1]){
                 int temp=a[j];
                 a[i]=a[j+1];
                 a[j+1]=temp;
             }
         }
     }

        System.out.println(Arrays.toString(a));
    }
}