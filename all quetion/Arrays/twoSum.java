class Solution {  //brute-force method complexity O(n2) not best approach 
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    return new int[] {i,j};
                    
                }
            }
        }
        return new int[] {};    
    }
}  