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
        StringBuilder ans = new StringBuilder();

        ListNode temp = head;

        while(temp != null){
            ans.append(temp.val);
            temp = temp.next;
        }

        int num = 0, n = ans.length();
        for(int i = 0; i < n; i++){
            int digit = Character.getNumericValue(ans.charAt(i));
            num += digit * Math.pow(2, n-i-1);
        }

        return num;
    }
}