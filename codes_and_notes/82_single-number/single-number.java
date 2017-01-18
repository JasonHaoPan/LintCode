/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/single-number
@Language: Java
@Datetime: 17-01-04 20:17
*/

public class Solution {
    /**
      *@param A : an integer array
      *return : a integer 
      */
    public int singleNumber(int[] A) {
        // Write your code here
        if(A == null || A.length == 0) return 0;
        int num = A[0];
        for(int i = 1; i < A.length; i++)
        {
            num ^= A[i];
        }
        return num;
    }
}