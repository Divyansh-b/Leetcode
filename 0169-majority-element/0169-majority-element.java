class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums); // Time Complexity O(logN) Space Complexity O(1)
        return nums[nums.length/2];
//     }
    }
}
