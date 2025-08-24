public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tortoisePtr = head, harePtr = head;

        while (harePtr != null && harePtr.next != null) {
            tortoisePtr = tortoisePtr.next;          // 1 step
            harePtr = harePtr.next.next;             // 2 steps
            if (tortoisePtr == harePtr) return true; // met -> cycle
        }
        return false; // hare reached null -> no cycle
    }
}
