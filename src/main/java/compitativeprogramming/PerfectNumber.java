package compitativeprogramming;

import java.util.Scanner;

/*num=6 sum= 1,2,3
if sum of the divisible of num is equal to the entered number then its a perfect number

 */
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;

            }

        }
        if (num == sum) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
