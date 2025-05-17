class Solution {
    public void swap(int[] nums, int a, int b){
        int temp =  nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortColors(int[] nums) {
        int j = 0;
        int i = 0;
        int n = nums.length-1;
        while(i <= n){
            
            if(nums[i] == 0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i] == 2){
                swap(nums,i,n);
                n--;
            }
            else{

            i++;
            }
        }
    }
}