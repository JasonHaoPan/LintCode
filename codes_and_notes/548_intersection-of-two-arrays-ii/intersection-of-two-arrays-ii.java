/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/intersection-of-two-arrays-ii
@Language: Java
@Datetime: 17-01-13 22:21
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
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums1)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i) + 1);
            }
            else
            {
                map.put(i,1);
            }
        }
        int temp[] = new int[nums1.length];
        int index = 0;
        for(int i : nums2)
        {
            if(map.containsKey(i) && map.get(i) > 0)
            {
                temp[index++] = i;
                map.put(i,map.get(i) - 1);
            }
        }
        int result[] = new int[index];
        for(int i = 0; i < index; i++)
        {
            result[i] = temp[i];
        }
        return result;
    }
}