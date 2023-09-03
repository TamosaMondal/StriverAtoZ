import java.util.Stack;

public class Solution{
    static class Queue {
        // Define the data members(if any) here.
        Stack<Integer> input=new Stack<>();
        Stack<Integer> output=new Stack<>();

        Queue() {
            // Initialize your data structure here.
        }

        void enQueue(int val) {
            // Implement the enqueue() function.
            input.push(val);
        }

        int deQueue() {
            // Implement the dequeue() function.
            if(isEmpty()) return -1;
            if(output.empty()==false){
                return output.pop();
            }
            else{
                while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
                }
            }
            return output.pop();
        }

        int peek() {
            // Implement the peek() function here.
            if(isEmpty()) return -1;
            if(output.empty()==false){
                return output.peek();
            }
            else{
                while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
                }
                
            }
            return output.peek();
        }

        boolean isEmpty() {
            // Implement the isEmpty() function here.
            return input.empty() && output.empty();
        }
    }
}
