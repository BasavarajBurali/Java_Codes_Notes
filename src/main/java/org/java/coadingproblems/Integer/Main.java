package org.java.coadingproblems.Integer;

class Solution {
    static long sumOfDivisors(int N) {
        long totalSum = 0;

        for (int i = 1; i <= N; i++) {
            totalSum =totalSum+ sumOfDivisorsForNumber(i);
        }

        return totalSum;
    }

    // Helper method to calculate the sum of divisors of a given number
    static int sumOfDivisorsForNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum =sum+ i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int N = 4;
        System.out.println(sumOfDivisors(N)); // Output: 15
    }
}
