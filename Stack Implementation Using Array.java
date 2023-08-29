public class Solution{
    static class Stack {
        int arr[];
        int top;
        Stack(int capacity) {
            // Write your code here.
            arr = new int[capacity];
            top=-1;
        }
        public void push(int num) {
            if(isFull()==1){
                return;
            }
            // Write your code here.
            top++;
            arr[top] = num;
        }
        public int pop() {
            // Write your code here.
             if(isEmpty()==1){
                return -1; 
            }
            int num= arr[top];
            top--;
            return num;
        }
        public int top() {
             if(isEmpty()==1){
                return -1; 
            }
            // Write your code here.
            return arr[top];
        }
        public int isEmpty() {
            // Write your code here.
            if(top==-1){
                return 1;
            }
            else{
                return 0;
            }

        }
        public int isFull() {
            // Write your code here.
            if(top>=arr.length-1){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
