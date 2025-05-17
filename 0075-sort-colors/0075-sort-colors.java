class Solution {
    public void swap(int[] nums, int a, int b){
        int temp =  nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortColors(int[] nums) {
        // int j = 0;
        // int i = 0;
        // int n = nums.length-1;
        // while(i <= n){
            
        //     if(nums[i] == 0){
        //         swap(nums,i,j);
        //         i++;
        //         j++;
        //     }
        //     else if(nums[i] == 2){
        //         swap(nums,i,n);
        //         n--;
        //     }
        //     else{

        //     i++;
        //     }
      //  }
      int one = 0;
      int zero = 0;
      int two= 0;
      for(int i : nums){
            if(i == 0)  zero++;
            else if(i==1) one++;
            else if(i == 2) two++;
      }
     
        int index =0;
      for( int i =0;i<zero;i++){
        nums[index++]=0;
      }
      for(int i = 0;i<one;i++){
        nums[index++]=1;
      }
      for( int i =0;i<two;i++){
        nums[index++]=2;
      }
    }
}