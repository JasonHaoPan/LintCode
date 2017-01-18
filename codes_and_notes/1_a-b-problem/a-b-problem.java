/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/a-b-problem
@Language: Java
@Datetime: 17-01-16 00:38
*/

class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        while(b != 0)
        {
            int _a = a ^ b;
            int _b = (a & b) << 1;
            a = _a;
            b = _b;
        }
        return a;
    }
};