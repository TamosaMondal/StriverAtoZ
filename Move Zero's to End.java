/*Sample Input 1:
4
0 0 0 1 
Sample Output 1:
1 0 0 0 
Explanation Of Sample Input 1:
Output: [1, 0, 0, 0]

Moved all the 0’s to the end of an array, and the rest of the elements retained the order at the start.
*/
public class Solution {
        public static int[] moveZeros(int n, int []arr) {
        // Write your code here.
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
}
//Time Complexity: O(N)
//Space Complexity: O(1) 
