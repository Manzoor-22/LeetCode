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
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            al.add(temp.val);
            temp = temp.next;
        }

        int i = 0, j = al.size()-1;
        int maxSum = 0;

        while(i < j){
            int pairSum = al.get(i)+al.get(j);
            maxSum = Math.max(maxSum, pairSum);
            i++;
            j--;
        }

        return maxSum;
    }
}