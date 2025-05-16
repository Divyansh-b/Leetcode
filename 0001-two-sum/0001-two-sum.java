class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int value= 0;

        for(int i = 0; i < nums.length; i++){
            value = target - nums[i];
            if(map.containsKey(value)){
                return new int[] {map.get(value), i};
            }
            map.put(nums[i],i);

    }
    return new int[] {};
    }
}