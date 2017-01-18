/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/remove-duplicates-from-sorted-list
@Language: Java
@Datetime: 16-12-31 22:00
*/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        if(head == null) return null;
        ListNode ln = new ListNode(0);
        ln.next = head;
        while(head!=null && head.next!=null)
        {
            if(head.val==head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return ln.next;
        
    }  
}