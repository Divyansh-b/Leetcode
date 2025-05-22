class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        int small = Integer.MIN_VALUE;
        int count = 0;
        Arrays.sort(nums);
        if(nums.length == 0) return 0;
        // int a = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] - 1 == small){
                count++;
                small = nums[i];
            }
            else if(nums[i] != small){
                count = 1;
                small = nums[i];
            }
            max = Math.max(max,count);
        }
        return max;
    }
}