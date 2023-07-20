/*Sample Input 1:
4
5 7 3 2 
Sample Output 1:
7 3 2 5
Explanation Of Sample Input 1:
Moved the first element to the last and rest all the elements to the left.
*/
import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;
        return arr;

    }
}
