/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/fibonacci
@Language: Java
@Datetime: 17-01-09 02:42
*/

class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
       if(n == 1) return 0;
       if(n == 2) return 1;
       int a = 0;
       int b = 1;
       int fibo = 0;
       while(--n > 0)
       {
           fibo = a+b;
           b = a;
           a = fibo;
       }
       return fibo;
    }
}

