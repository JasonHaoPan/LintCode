/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/rehashing
@Language: Java
@Datetime: 17-01-06 22:45
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
     * @param hashTable: A list of The first node of linked list
     * @return: A list of The first node of linked list which have twice size
     */    
    public ListNode[] rehashing(ListNode[] hashTable) {
        // write your code here
        if(hashTable == null || hashTable.length == 0) return hashTable;
        
        ListNode[] newhashTable = new ListNode[hashTable.length*2];
        for(int i = 0; i < hashTable.length; i++)
        {
            ListNode node = hashTable[i];
            while(node != null)
            {
                ListNode temp = node.next;
                node.next = null; 
                put(newhashTable , node);
                node = temp;
            }
        }
        return newhashTable;
        
    }
    private void put(ListNode[] NewHashTable, ListNode node)
    {
        int pos = node.val % NewHashTable.length;
        while(pos < 0)
        {
            pos += NewHashTable.length;
        }
        if(NewHashTable[pos] == null)
        {
            NewHashTable[pos] = node;
        }
        else
        {
            ListNode head = NewHashTable[pos];
            while(head.next != null)
            {
                head = head.next;
            }
            head.next = node;
        }
    }
};
