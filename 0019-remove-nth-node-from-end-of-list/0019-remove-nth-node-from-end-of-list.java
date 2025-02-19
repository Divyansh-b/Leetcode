/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 // Brute Force

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        ListNode temp2 = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        if (c == n) {
            ListNode newNode = head.next;
            return newNode;
        }
        int res = c - n;
        while (temp2 != null) {
            res--;
            if (res == 0)
                break;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;

        return head;
    }
}