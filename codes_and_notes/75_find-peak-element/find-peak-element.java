/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/find-peak-element
@Language: Java
@Datetime: 16-12-23 22:31
*/

class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int start,mid,end;
        start = 0;
        end = A.length-1;
        mid = 0;
        if(A==null||A.length==0) return 0;
        while(start+1 < end)
        {
            mid = start + (end-start)/2;
            if(A[mid-1]<A[mid]&&A[mid+1]<A[mid])
                return mid;
            else if (A[mid-1]<A[mid]&&A[mid+1]>A[mid])
                start = mid;
            else if (A[mid-1]>A[mid]&&A[mid+1]<A[mid])
                end = mid;
            else
                start = mid;
        }
        return 0;
    }
}
