class Solution {
    public void sortColors(int[] nums) {
        // for(int i=0;i<nums.length;i++){
            
        //     for(int j=1;j<nums.length;j++){
                
        //         if(nums[i]>nums[j]){
        //             int temp = nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
        int zero = 0;
        int one = 0;
        int l = nums.length;

        for(int i=0;i<l;i++){
            if(nums[i]==0) zero++;
            else if(nums[i]==1) one++;
        }

        for(int i=0;i<l;i++){
            if(zero!=0){
                nums[i]=0;
                zero--;
            }
            else if(one!=0){
                nums[i]=1;
                one--;
            }
            else {
                nums[i]=2;
            }
        }
    }
}