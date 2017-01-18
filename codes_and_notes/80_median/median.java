/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/median
@Language: Java
@Datetime: 17-01-16 00:49
*/

public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        return nums[(nums.length-1)/2];
    }
}
