/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/hash-function
@Language: Java
@Datetime: 17-01-06 21:48
*/

class Solution {
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        if(key == null || key.length == 0) return 0;
        long hashcode = 0;
        for(int i = 0; i < key.length; i++)
        {
            hashcode = ((hashcode*33)+key[i])%HASH_SIZE;
        }
        return (int)hashcode;
    }
};