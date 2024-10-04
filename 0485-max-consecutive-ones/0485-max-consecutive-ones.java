class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int count1=0;
        if(nums[0]==1)
        {
            count++;
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==1)
            {               
                count++;
            }
            if(nums[i]==0)
            {                
                if(count>count1){
                count1=count;}
                count=0;
            }
        }
        if (count > count1) {
            count1 = count;
        }
        return count1;
    }
}