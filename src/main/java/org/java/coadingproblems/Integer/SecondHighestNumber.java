package org.java.coadingproblems.Integer;

public class SecondHighestNumber {
   static int SecondHighest(int[] array ){
       int highest=Integer.MIN_VALUE;
       int secondHighest=Integer.MIN_VALUE;

        for (int i=0;i<array.length;i++){
            if (array[i]>highest){
                secondHighest=highest;
                highest=array[i];
            } else if (array[i]>secondHighest&&array[i]<highest) {
                secondHighest=array[i];

            }
        }
        return secondHighest;

    }
    public static void main(String[] args) {
        int[] array={1,2,4,4,5,5,5};

     int result= SecondHighest(array);
        System.out.println(result);
    }
}
