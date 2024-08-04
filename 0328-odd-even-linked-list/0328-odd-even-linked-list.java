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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) 
            return null;
            
        if(head.next == null)
            return head;

        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);

        helper(head,even,odd, 1);

        ListNode temp = odd;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = even.next;

        return odd.next;
    }

    public void helper(ListNode head, ListNode even, ListNode odd, int i){
        if(head == null){
            even.next = null;
            odd.next = null;
            return;
        }
        if(i % 2 == 0){
            even.next = head;
            even = even.next;
        } else{
            odd.next = head;
            odd = odd.next;
        }

        helper(head.next, even, odd, i+1);
    }
}