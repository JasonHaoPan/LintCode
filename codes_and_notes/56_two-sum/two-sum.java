/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/two-sum
@Language: Java
@Datetime: 17-01-03 22:37
*/

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        if(numbers == null || numbers.length == 0) return new int[2];
        Map<Integer,Integer> cache = new HashMap<>();
        for(int i = 0; i< numbers.length; i++)
        {
            if(cache.containsKey(numbers[i]))
            {
                int index1 = cache.get(numbers[i])+1;
                int index2 = i + 1;
                return new int[]{index1,index2};
            }
            else
            {
                cache.put(target-numbers[i],i);
            }
        }
        return null;
        
    }
}