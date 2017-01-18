/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/merge-sorted-array
@Language: Java
@Datetime: 17-01-03 22:23
*/

class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if(B == null || B.length == 0) return ;
        if(A == null || A.length == 0) return ;
        int i = m - 1 ;
        int j = n - 1;
        int index = m + n - 1;
        while(i >= 0 && j >= 0)
        {
            if(A[i] == B[j])
            {
                A[index] = A[i];
                index--;
                i--;
                //j--;
            }
            else if(A[i] > B[j])
            {
                A[index] = A[i];
                index--;
                i--;
            }
            else
            {
                A[index] = B[j];
                index--;
                j--;
            }
        }
        while(j >= 0)
        {
            A[index] = B[j];
            index--;
            j--;
        }
    }
}