/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/search-insert-position
@Language: Java
@Datetime: 16-12-23 22:07
*/

public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        int start,end,mid;
        start = 0;
        end =  A.length;
        if(A==null||A.length==0)return 0;
        while(start+1<end)
        {
            mid = (end-start)/2+start;
            if(target>A[mid])
            {
                start = mid+1;
            }
            else if(target<A[mid])
            {
                end = mid;
            }
            else
                return mid;
        }
        if(A[start]>=target)
            return start;
        else
            return end;
    }
}
