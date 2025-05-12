class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                break;
            }
        }

        if (i == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        int j;
        for (j = nums.length - 1; j >= i; j--) {
            if (nums[j] > nums[i - 1]) {
                break;
            }
        }

        swap(nums, i - 1, j);
        reverse(nums, i, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        for (; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
}
