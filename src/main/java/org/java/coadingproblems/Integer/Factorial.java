package org.java.coadingproblems.Integer;

public class Factorial {
    static int fact(int n){
        if (n<=1){
            return 1;
        }else {
            int fact_num= n*fact(n-1);
            return fact_num;
        }


    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
