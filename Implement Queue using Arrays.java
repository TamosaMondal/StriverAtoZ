public class Solution {
    class Queue {
        int front, rear;
        int []arr;
        int count;
        int n;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
            count=0;
            n=arr.length;
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            // Write your code here.
            if(count==n) return;
            arr[rear%n]=e;
            rear++;
            count++;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            // Write your code here.
            if(count==0) return -1;
            int frnt=arr[front%n];
            arr[front%n]=-1;
            front++;
            count--;
            return frnt;

        }
    }
}
