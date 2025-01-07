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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1 = reverse(l1);
        // l2 = reverse(l2);

        int carry = 0;
        ListNode ans = new ListNode(-1);

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            ListNode newNode;
            if(sum > 9){
                newNode = new ListNode(sum % 10);
                carry = 1;
            }
            else{
                newNode = new ListNode(sum);
                carry = 0;
            }
            newNode.next = ans;
            ans = newNode;

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + carry;
            ListNode newNode;
            if(sum > 9){
                newNode = new ListNode(sum % 10);
                carry = 1;
            }
            else{
                newNode = new ListNode(sum);
                carry = 0;
            }
            newNode.next = ans;
            ans = newNode;

            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.val + carry;
            ListNode newNode;
            if(sum > 9){
                newNode = new ListNode(sum % 10);
                carry = 1;
            }
            else{
                newNode = new ListNode(sum);
                carry = 0;
            }
            newNode.next = ans;
            ans = newNode;

            l2 = l2.next;
        }

        if(carry == 1){
            ListNode newNode = new ListNode(1);
            newNode.next = ans;
            ans = newNode;
        }

        ans = reverse(ans);

        return ans.next;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null, curr = head, next = head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}