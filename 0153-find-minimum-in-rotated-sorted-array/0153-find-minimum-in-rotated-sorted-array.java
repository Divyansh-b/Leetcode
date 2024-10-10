class Solution {
    public int findMin(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low <=high)
        {
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[high])
            {
                 min1=Math.min(min1,nums[low]);
                 break;
            }
            if(nums[low]<=nums[mid])
            {
                min1=Math.min(min1,nums[low]);
                low=mid+1;
            }
            else
            {
                min1=Math.min(min1,nums[mid]);
                high=mid-1;
            }
        }
        return min1;
    }
}