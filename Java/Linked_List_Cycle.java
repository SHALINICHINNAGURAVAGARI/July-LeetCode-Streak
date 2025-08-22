/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tortoisePtr = head;
        ListNode harePtr = head;

        while (tortoisePtr != null && harePtr != null && tortoisePtr.next != null) {
            tortoisePtr = tortoisePtr.next;
            harePtr = harePtr.next;

            if (tortoisePtr == harePtr) {
                return true;
            }
        }
        return false;
    }
}