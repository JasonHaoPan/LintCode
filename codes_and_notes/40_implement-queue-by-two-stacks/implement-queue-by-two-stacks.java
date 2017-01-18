/*
@Copyright:LintCode
@Author:   mr_p
@Problem:  http://www.lintcode.com/problem/implement-queue-by-two-stacks
@Language: Java
@Datetime: 17-01-07 03:33
*/

public class Queue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue() {
       // do initialization if necessary
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        if(stack2.isEmpty())
        {
            while(! stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        else
            return stack2.pop();
    }

    public int top() {
        // write your code here
        if(stack2.isEmpty())
        {
            while(! stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
            return stack2.peek();
        }
        else
            return stack2.peek();
    }
    
}