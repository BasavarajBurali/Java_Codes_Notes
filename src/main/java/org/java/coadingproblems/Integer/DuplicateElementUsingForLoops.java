package org.java.coadingproblems.Integer;

public class DuplicateElementUsingForLoops {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2};
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    System.out.println("The duplicate element is :"+array[i]);
                    break;
                }
            }
        }
    }
}
