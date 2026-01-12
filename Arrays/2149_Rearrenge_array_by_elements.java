class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] answer= new int[n];
        int pos_index= 0;
        int neg_index=1;
        
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                answer[pos_index]=nums[i];
                pos_index+=2;
            }else{
                    answer[neg_index]=nums[i];
                    neg_index+=2;
                }
        }
        return answer;
        
    }
}