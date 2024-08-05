package org.java.Integer;

public class MinAndMaxNumber {
    public static void main(String[] args) {
        int[] a={2,4,1,66,33,5,4,7,8};
        int min=a[0];
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if (min>a[i]){
                min=a[i];
            }else if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println("min "+min+" "+"max "+max );
        System.out.println("min "+min+" "+"max "+max );
    }
}
