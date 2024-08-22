package org.java.coadingproblems.Integer;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,3};
        int b[] =new int[a.length];
        int k=0;
        for (int i=0;i<a.length;i++){
            boolean found=false;
            for (int j=0;j<k;j++){ //2
                if (a[i]==a[j]){
                    found=true;
                    break;
                }
            }
            if (!found){
                b[k]=a[i];
                k++;
            }
        }
        for (int y:b){
            System.out.println(y);
        }
    }
}
