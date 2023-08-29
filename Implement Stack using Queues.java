/*Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
*/
class MyStack {
    Queue<Integer> q =new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//                                                        <-----CODE STUDIO VERSION----->
import java.util.LinkedList;
import java.util.Queue;

public class Solution{
    static class Stack {
        // Define the data members.
    Queue<Integer> q=new LinkedList<>();
        public Stack() {
            // Implement the Constructor.
        }

        public int getSize() {
            // Implement the getSize() function.
            return q.size();
        }

        public boolean isEmpty() {
            // Implement the isEmpty() function.
            return q.isEmpty();
        }

        public void push(int x) {
            // Implement the push(element) function.
            q.add(x);
            for(int i=0;i<q.size()-1;i++){
                q.add(q.remove());
            }
        }

        public int pop() {
            if(q.isEmpty()){
                return -1;
            }
            // Implement the pop() function.
            return q.remove();
        }

        public int top() {
            if(q.isEmpty()){
                return -1;
        }
            // Implement the top() function.
            return q.peek();
        }
    }
}








