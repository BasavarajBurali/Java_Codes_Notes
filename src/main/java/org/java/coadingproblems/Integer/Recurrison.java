package org.java.coadingproblems.Integer;

public class Recurrison {

    static  int factorial(int n){
        if (n<=1){
            return 1;
        }
        int result= n*factorial(n-1);
       return result;
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
