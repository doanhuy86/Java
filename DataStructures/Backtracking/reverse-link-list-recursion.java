/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode head = A;
        while (head.next != null) {
            head = head.next;
        }
        recursive(A);
        return head;
    }
    public void recursive(ListNode A) {
        if (A.next == null) {
            return ;
        }
        recursive(A.next);
        ListNode B = A.next;
        B.next = A;
        A.next = null;
    }
}