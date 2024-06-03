class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        return mergeSort(head);
    }
    public static ListNode findMid(ListNode head){
        ListNode fast = head.next, middle = head;

        while(fast != null && fast.next != null){
            middle = middle.next;
            fast = fast.next.next;
        }

        return middle;
    }

    public static ListNode mergeSort(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode middle = findMid(head);
        ListNode second = middle.next;
        middle.next = null;
        ListNode firstH = mergeSort(head);
        ListNode secondH = mergeSort(second);

        return merge(firstH, secondH);
    }

    public static ListNode merge(ListNode first, ListNode second) {
        ListNode temp = new ListNode(-1);
        ListNode tHead = temp;

        while(first != null && second != null) {
            if(first.val <= second.val){
                temp.next = first;
                temp = temp.next;
                first = first.next;
            } else {
                temp.next = second;
                temp = temp.next;
                second = second.next;
            }
        }

        if(first != null){
            temp.next = first;
        }

        if(second != null){
            temp.next = second;
        }

        return tHead.next;
    }
}