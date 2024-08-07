package org.java.coadingproblems.trail_version;

public class DuplicateNumber {
    public static void main(String[] args) {
        int [] num1={1,2,2,1};

        int[] num2={2,2};

        int[] num3=new int[num2.length];
        int index=0;

        for (int i=0;i<num1.length-1;i++){
            for (int j=0;j<num2.length-1;j++){
                if (num1[i]==num2[j]){
                    if (num3[index]==num1[i]){
                        break;
                    }else {
                        num3[index] = num1[i];
                        index++;
                    }

                }
            }
        }

        for (int s:num3){
            System.out.println(s);
        }

    }
}

//out put should be duplicate element from the both the table
