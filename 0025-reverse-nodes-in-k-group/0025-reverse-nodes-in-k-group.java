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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            al.add(temp.val);
            temp = temp.next;
        }

        int n = al.size();
        for(int i = 0; i < n; i = i+k){
            int start = i, end = i+k-1;
            while(end < n && start < end){
                int t = al.get(start);
                al.set(start, al.get(end));
                al.set(end, t);
                start++;
                end--;
            }
        }

        temp = head;
        int j = 0;
        while(temp != null){
            temp.val = al.get(j++);
            temp = temp.next;
        }

        return head;
    }
}