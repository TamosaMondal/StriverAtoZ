/*Sample Input 1:
10
1 2 2 3 3 3 4 4 5 5 
Sample Output 1:
5
Explanation Of Sample Input 1:
The new array will be [1 2 3 4 5].
So our answer is 5.
*/
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		
		int i=0;
        for(int j=1;j<n;j++){
			if(!arr.get(j).equals(arr.get(i))){
				i++;
				arr.set(i,arr.get(j));
				
			}
        }
        return i+1;
		
	}
}
