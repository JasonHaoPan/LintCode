/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/valid-parentheses
@Language: Java
@Datetime: 17-01-10 22:01
*/

public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        if(s == null || s.length() == 0) return false;
        Stack<Character> stack = new Stack<>();
        char[] charA = s.toCharArray();
        for(int i = 0; i < charA.length; i++ )
        {
            if (charA[i] == '(' || charA[i] == '[' || charA[i] == '{' )
                stack.push(charA[i]);
            else if (!stack.isEmpty() && isValid(stack.peek(), charA[i]))
            {
                stack.pop();
            }
            else
                return false;
        }
        if (stack.isEmpty())
        {
            return true;
        }
        else
            return false;
    }
    
    private boolean isValid(char c1, char c2)
    {
        return (c1 == '(' && c2 == ')') || 
                (c1 == '[' && c2 == ']') ||
                (c1 == '{' && c2 == '}');
    }
}