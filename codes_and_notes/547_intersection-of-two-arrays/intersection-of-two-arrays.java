/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/intersection-of-two-arrays
@Language: Java
@Datetime: 17-01-13 22:03
*/

public class Solution {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
        if(nums1 == null || nums1.length == 0) return nums1;
        if(nums2 == null || nums2.length == 0) return nums2;

        Set<Integer> set = new HashSet<>();
    
        for(int i : nums1)
        {
            set.add(i);
        }
    
        Set<Integer> temp = new HashSet<>();
        for(int i : nums2)
        {
            if(set.contains(i))
            {
                temp.add(i);
            }
        }
        
        int i = 0;
        int[] result = new int[temp.size()];
        for(int val : temp)
        {
            result[i] = val;
            i++;
        }
        return result;
    }
}