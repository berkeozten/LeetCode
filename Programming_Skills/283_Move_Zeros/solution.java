class Solution {
    public void moveZeroes(int[] nums) {
        // Swapping using temp costs too much memory so went with another method
        // Using two pointers from start. J will traverse the array and put all
        // non-zero values to where i is at the time. After swap finishes, remaining
        // values between i and nums.lengts should be set to zero
        int i = 0; // First 0 index
        int j = 0;
        while (j < nums.length){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while (i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}