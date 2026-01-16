class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;   //` Pointer for the end of nums1's initial elements
        int k = m + n - 1;// Pointer for the end of nums1
        int j = n - 1; // Pointer for the end of nums2

        while (i >= 0 && j >= 0) {  // Merge in reverse order
            if (nums1[i] > nums2[j]) {  // Compare elements from the end
                nums1[k] = nums1[i]; // Place larger element at the end of nums1
                i--;
            } else {
                nums1[k] = nums2[j]; // Place larger element at the end of nums1
                j--;   
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];   // Copy remaining elements from nums2, if any
            j--;
            k--;
        }
    }
}//Time complexity: O(m+n)
//Space complexity: O(1)