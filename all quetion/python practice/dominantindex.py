class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
     max_val= -1 
     sec_val= -1
     index=0

     for i,num in enumerate(nums):
        if num >max_val:
            sec_val=max_val
            max_val=nums[i]
            index=i
            
        elif num >sec_val:
            sec_val=nums[i]    

     if max_val>=2*sec_val:
        return index
     return -1    


