package org.java.coadingproblems.Integer;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int count=0;
        int candiaate=0;
        for (int i=0;i<nums.length;i++){
            if (count==0){
                candiaate=nums[i];
            }else if (nums[i]==candiaate){
                count++;
            }else {
                count--;
            }
        }

        count=0;
        for (int i=0;i<nums.length;i++){
            if (candiaate==nums[i]){
                count++;
            }
        }

        System.out.println(candiaate+" "+count);

    }
}
