/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/sort-integers
@Language: Java
@Datetime: 16-12-20 23:39
*/

public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        // Write your code here
        for(int i = 0;i<A.length;i++)
            for(int j = i;j<A.length;j++)
                if(A[i]>A[j])
                {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
    }
}