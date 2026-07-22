class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[write] = nums[i];
                write++;
            }
        }

        // Fill the remaining positions with 0
        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
    }
}