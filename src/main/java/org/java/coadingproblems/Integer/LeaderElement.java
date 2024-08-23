package org.java.coadingproblems.Integer;

public class LeaderElement {
    public static void main(String[] args) {
        int[] array={10,22,12,3,0,6};
        int[] new_array=new int[array.length];
        int k=0;
        for (int i=0;i<array.length;i++){
            boolean leader=true;
            for (int j=i+1;j<array.length;j++){
                if (array[i]<array[j]){
                    leader=false;
                    break;
                }
            }
            if (leader){
                new_array[k++]=array[i];
            }
        }
        for (int a:new_array){
            System.out.println(a);
        }
    }
}
