/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/remove-nth-node-from-end-of-list
@Language: Java
@Datetime: 16-12-31 23:20
*/

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        ListNode slow = head;
        ListNode fast = head;
        
        for(int i = 0; i <= n; i++)
            fast = fast.next;
        while (fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    
}
