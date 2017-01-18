/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/merge-intervals
@Language: Java
@Datetime: 17-01-13 23:07
*/

/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * @param intervals, a collection of intervals
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if(intervals == null || intervals.isEmpty()) return intervals;
        List<Interval> result = new ArrayList<Interval>();
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2)
            {
                return i1.start - i2.start;
            }
        });
        Interval last = intervals.get(0);
        for(int i = 1; i< intervals.size(); i++)
        {
            if(intervals.get(i).start <= last.end)
            {
                last.end = Math.max(intervals.get(i).end, last.end);
            }
            else
            {
                result.add(last);
                last = intervals.get(i);
            }
        }
        result.add(last);
        return result;
    }

}