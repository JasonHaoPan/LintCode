/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/min-stack
@Language: Java
@Datetime: 17-01-06 23:18
*/

public class MinStack {
     private Stack<Integer> data;
     private Stack<Integer> min;
    
    public MinStack() {
        // do initialize if necessary
        data = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        data.push(number);
        if(min.isEmpty() || number<=min.peek())
        {
            min.push(number);
        }
        else
        {
            min.push(min.peek());
        }
    }

    public int pop() {
        // write your code here
        min.pop();
        return data.pop();
        
    }

    public int min() {
        // write your code here
        
        return min.peek();
    }
}
