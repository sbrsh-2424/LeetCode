class Solution {
    public void sortColors(int[] nums) {
        int z = 0;
        int o = 0;
        int l = nums.length;

        for(int i=0;i<l;i++){
            if(nums[i]==0) z++;
            else if(nums[i]==1) o++;
        }

        for(int i=0;i<l;i++){
            if(z!=0){
                nums[i]=0;
                z--;
            }
            else if(o!=0){
                nums[i]=1;
                o--;
            }
            else {
                nums[i]=2;
            }
        }
    }
}