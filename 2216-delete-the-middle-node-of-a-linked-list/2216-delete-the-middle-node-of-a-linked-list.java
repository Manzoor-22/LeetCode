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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode mid = head, prevMid = head, last = head;

        while(last != null && last.next != null){
            last = last.next.next;
            prevMid = mid;
            mid = mid.next;
        }

        prevMid.next = mid.next;

        return head;
    }
}