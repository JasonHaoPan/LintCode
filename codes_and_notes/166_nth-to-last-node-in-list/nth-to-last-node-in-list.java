/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/nth-to-last-node-in-list
@Language: Java
@Datetime: 17-01-06 00:53
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
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        int count = 0;
        while(head.next != null)
        {
            head = head.next;
            count ++;
        }
        for(int i = 0; i < count-n; i++)
        {
            dummy.next = dummy.next.next;
        }
        return dummy.next;
    }
}
