class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;         
        int[] answer= new int[n]; 
        int pos_index= 0; 
        int neg_index=1;
        
        for(int i=0;i<n;i++){ //if no is positive place it at even index else at odd index 
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
}//time complexity O(n)
//space complexity O(n)
