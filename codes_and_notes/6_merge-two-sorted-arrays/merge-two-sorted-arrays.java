/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/merge-two-sorted-arrays
@Language: Java
@Datetime: 17-01-06 02:26
*/

class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // Write your code here
        if(A.length == 0 || A == null) return B;
        if(B.length == 0 || B == null) return A;
        int[] list = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < A.length && j < B.length)
        {
            if(A[i] == B[j])
            {
                list[index++] = A[i++];
            }
            else if(A[i] < B[j])
            {
                list[index++] = A[i++];
            }
            else
            {
                list[index++] = B[j++];
            }
        }
        while(i < A.length)
        {
            list[index++] = A[i++];
        }
        while(j < B.length)
        {
            list[index++] = B[j++];
        }
        return list;
    }
}