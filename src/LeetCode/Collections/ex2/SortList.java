package LeetCode.Collections.ex2;

import LeetCode.Collections.ListNode;

public class SortList {

    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        System.out.println(head);
        Solution solution = new Solution();
        System.out.println(solution.sortList(head));
    }
}
class Solution {
    public ListNode sortList(ListNode head) {
            if (head.val < head.next.val) {
                head.next = sortList(head.next);
            } else {
                ListNode link1 = head.next;
                ListNode link2 = head.next.next;
                ListNode next2 = head;
                head = head.next;
                head.next = sortList(next2);
            }
        return head;
    }
}

