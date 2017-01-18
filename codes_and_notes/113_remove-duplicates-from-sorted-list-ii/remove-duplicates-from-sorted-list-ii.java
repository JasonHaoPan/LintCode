/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/remove-duplicates-from-sorted-list-ii
@Language: Java
@Datetime: 17-01-12 16:09
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
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(head.next != null && head.next.next != null)
        {
            if(head.next.val == head.next.next.val)
            {
                int value = head.next.val;
                while(head.next != null && head.next.val == value)
                {
                    head.next = head.next.next;
                }
            }
            else
            {
                head = head.next;
            }
        }
        return dummy.next;
    }
}
