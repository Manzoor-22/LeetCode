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
    public int getDecimalValue(ListNode head) {
        int n = 0;

        ListNode temp = head;

        while(temp != null){
            n++;
            temp = temp.next;
        }

        int ans = 0;
        temp = head;
        n--;
        
        while(temp != null){
            ans += temp.val * Math.pow(2, n--);
            temp = temp.next;
        }

        return ans;
    }
}