/*There is an array 'A' of size 'N'.
A sequence is successive when the adjacent elements of the sequence have a difference of 1.
You must return the length of longest seccessive sepuence.
*/
import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int n=a.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int it:set){
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                int count=1;
                int x=it;
                while(set.contains(x + 1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
