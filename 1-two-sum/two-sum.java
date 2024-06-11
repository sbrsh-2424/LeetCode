class Solution {

    public int[] twoSum(int[] nums, int target) {
         int len = nums.length;
         int i =0, j = 0;

         outer:
         for(;i<len;i++){
            inner:
            for(j= i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    break outer;
                }
            }
         }

         

         return new int[] {i,j};
    }
}