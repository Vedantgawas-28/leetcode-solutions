
//--------------------------
// HASHMAP APPOROACH 
//--------------------------

class Solution { 
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){ //logic to check if complement exists in map
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return  new int[] {map.get(complement),i}; //return indices of complement and current element
            }
            map.put(nums[i],i); //store element and its index in map
    }
    return new int[] {};
    }
}//time complexity O(n)
//space complexity O(n)
//hashmap used to store the elements and their indices while iterating through the array only once.