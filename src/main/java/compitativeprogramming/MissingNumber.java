package compitativeprogramming;

public class MissingNumber {
    static  int missingNumber(int[] array,int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            // Check if the current number is in the array
            for (int num : array) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            // If the number is not found, it is the missing number
            if (!found) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={1,2,4,5,6,7};
               int n=array.length+1;
        System.out.println(missingNumber(array,n));

//        int expectedSum=(n*(n+1))/2;
//        int sum=0;
//        for (int num:array){
//           sum=sum+num;
//        }
//        int missingNumber=expectedSum-sum;
//        System.out.println(missingNumber);



    }
}
