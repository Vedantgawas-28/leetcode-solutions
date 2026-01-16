
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;//move slow by 1
            fast=fast.next.next;//move fast by 2
        }
        return slow;
    }
}//Time complexity: O(n)
//Space complexity: O(1)