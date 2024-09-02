package compitativeprogramming;

public class EvenIndexSumPrint {
    static int reverseArray(int[] array, int n) {
        int[] n_array = new int[array.length];
        int k = 0;
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {

            n_array[k] = array[i];
            if (k % 2 == 0) {
                sum = sum + n_array[k];
            }
            k++;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int n = 6;
//        int[] reverseArray=reverseArray(array,n);
//        for (int num:reverseArray){
//            System.out.println(num);
//        }
        System.out.println(reverseArray(array, n));

    }
}
/*The problem asks us to find the sum of elements at even positions after reversing a given array.

Problem statement:

• Input: An array A of length N

• Task: Reverse the array, then find the sum of elements located at even positions in the reversed array.

• Output: An integer representing the sum of the elements at the even indices of the reversed array.

Example:

Input: Array: [10, 20, 30, 40, 50, 60]

Output: 120

Explanation:

Array: [10, 20, 30, 40, 50, 60]

Reversed Array: [60, 50, 40, 30, 20, 10]

Elements at Even Positions: 60, 40, 20 Sum =60+40+20=120*/