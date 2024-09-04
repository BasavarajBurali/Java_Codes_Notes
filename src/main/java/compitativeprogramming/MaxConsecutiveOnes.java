package compitativeprogramming;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);//max count will only update if count>maxCount
            } else {
                count = 0;
            }
        }

        return maxCount;
    }


    public static void main(String[] args) {

        int[] array = {1,1,0,0,1,1,1};
        int ans=findMaxConsecutiveOnes(array);
        System.out.println("Max ConsecutiveOnes 1`s is :"+ans);

    }
}
