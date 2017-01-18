/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/classical-binary-search
@Language: Java
@Datetime: 17-01-14 22:05
*/

public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public int findPosition(int[] nums, int target) {
        // Write your code here
        if(nums == null || nums.length == 0) return -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start +(end - start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
        
    }
}