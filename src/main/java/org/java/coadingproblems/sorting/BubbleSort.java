package org.java.coadingproblems.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array={23,24,14,9,11,6,2,7,98};
        for (int i=0;i<array.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<array.length;j++){
                if (array[smallest]>array[j]){
                    smallest=j;
                }
            }
            int temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;
        }
        for(int a:array){
            System.out.println(a);
        }

    }
}
