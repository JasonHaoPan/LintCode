/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/reverse-linked-list
@Language: Java
@Datetime: 16-12-31 22:47
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
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null||head.next == null) return head;
        ListNode pre = null;
        ListNode cru = head;
        
        while(cru != null)
        {
            ListNode temp = cru.next;
            cru.next = pre;
            pre = cru;
            cru = temp;
        }
        return pre;
    }
}
