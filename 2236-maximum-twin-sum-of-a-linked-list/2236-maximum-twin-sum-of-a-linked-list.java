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
    public int pairSum(ListNode head) {
        ListNode firstHalf = head;
        ListNode secHalf = head, fast = head;

        //Finding middle -> Second Half
        while(fast != null && fast.next != null){
            secHalf = secHalf.next;
            fast = fast.next.next;
        }

        //Reversing the second half
        ListNode first = null, second = secHalf, third = secHalf;
        while(third != null){
            third = third.next;
            second.next = first;
            first = second;
            second = third;
        }
        secHalf = first;

        int maxSum = 0;
        while(secHalf != null){
            int currSum = firstHalf.val + secHalf.val;
            maxSum = Math.max(maxSum, currSum);
            firstHalf = firstHalf.next;
            secHalf = secHalf.next;
        }

        return maxSum;
    }
}