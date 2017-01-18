/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/climbing-stairs
@Language: Java
@Datetime: 17-01-09 02:36
*/

public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        int a = 1;
        int b = 1;
        int step = 0;
        if(n == 0 || n == 1) return 1;
        while(--n > 0)
        {
            step = a + b;
            b = a;
            a = step;
        }
        return step;
    }
}