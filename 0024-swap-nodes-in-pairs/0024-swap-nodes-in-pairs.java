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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            al.add(temp.val);
            temp = temp.next;
        }

        int size = al.size();
        temp = head;

        for(int i = 0; i < al.size()-1; i+=2){
            temp.val = al.get(i+1);
            temp = temp.next;
            temp.val = al.get(i);
            temp = temp.next;
        }

        return head;
    }
}