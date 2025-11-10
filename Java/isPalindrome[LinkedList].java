class Solution {
    ListNode curr;
    public boolean isPalindrome(ListNode head) {
        curr = head;
        return solve(head);
    }

    public boolean solve(ListNode head) {
        if (head == null)
            return true;
        boolean answer = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return answer;
    }
}