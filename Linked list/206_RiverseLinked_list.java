/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        ListNode curr= head;gi
    while(curr !=null){
        ListNode next= curr.next;//store next node
        curr.next=prev;//reverse the link list 
        prev=curr;//move prev to curr
        curr=next;//move curr to next
    }
    return prev;
    }
}
//Time complexity: O(n)
//Space complexity: O(1)
