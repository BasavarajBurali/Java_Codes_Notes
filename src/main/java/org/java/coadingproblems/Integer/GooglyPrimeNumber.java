package org.java.coadingproblems.Integer;
//42==>4+2=6 prime/not
public class GooglyPrimeNumber {

    static int digitSum(int num){
        int sum=0;
        while (num>0){
            sum=sum+num%10;
            num=num/10;

        }

        return sum;
    }
    public static void main(String[] args) {
        int num=42;
        int sum=digitSum(num);
        boolean primeNumber=false;

        for (int i=2;i<sum;i++){
            if (sum%i==0){
                primeNumber=true;
                System.out.println(num+" is not a prime number");
                break;

            }

        }
        if (!primeNumber){
            System.out.println(num+" is a prime number");

        }

    }
}
