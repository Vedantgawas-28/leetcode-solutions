class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];//swap
                nums[j]=temp;//
                j++;
            }
        }
    }//Time complexity: O(n)
    //Space complexity: O(1)