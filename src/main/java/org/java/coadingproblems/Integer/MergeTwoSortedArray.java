package org.java.coadingproblems.Integer;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a1={1,3,5,7,9};
        int[] a2={2,4,6,8,9};


        int i=0,j=0,k=0;
        int n1=a1.length;
        int n2=a2.length;
        int[ ] mergedArray=new int[n1+n2];
        while (i < n1 && j < n2) {
            if (a1[i]<a2[j]){
                mergedArray[k++]=a1[i++];
            }else {
                mergedArray[k++]=a2[j++];
            }


        }
        while (i<n1){
            mergedArray[k++]=a1[i++];
        }
        while (j<n2){
            mergedArray[k++]=a1[j++];
        }
        for (int s:mergedArray){
            System.out.println(s);
        }
    }


}
