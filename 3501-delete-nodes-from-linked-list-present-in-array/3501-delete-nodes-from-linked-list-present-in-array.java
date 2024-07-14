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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for(Integer n: nums){
            hs.add(n);
        }
        while(hs.contains(head.val)){
            head = head.next;
        }

        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            if(hs.contains(current.val)){
                prev.next = current.next;
                current = prev.next;
                continue;
            } 
            prev = current;
            current = current.next;
                
        }

        return head;
    }
}