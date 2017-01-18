/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/compare-strings
@Language: Java
@Datetime: 17-01-10 01:12
*/

public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if(A.equals(B)) return true;
        if(A.equals("")) return false;
        if(B.equals("")) return true;
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i = 0; i < A.length(); i++)
        {
            count1[A.charAt(i)-'A']++;
        }
        for(int i = 0; i < B.length(); i++)
        {
            count2[B.charAt(i)-'A']++;
            if(count1[A.charAt(i)-'A'] < count2[B.charAt(i)-'A'])
                return false;
        }
        return true;
        
    }
}