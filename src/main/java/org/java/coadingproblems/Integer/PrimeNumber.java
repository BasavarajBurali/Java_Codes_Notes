package org.java.coadingproblems.Integer;

public class PrimeNumber {
    public static void main(String[] args) {

        int number=32;
        boolean isPrime=true;
        for (int i=2;i<number;i++){
            if (number%i==0){

                isPrime=false;

            }
        }
        if (isPrime){
            System.out.println(number+"is a prime number");
        }else {
            System.out.println(number+"is not aprime number");
        }
    }
}
