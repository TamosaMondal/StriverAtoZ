import java.util.*;


public class Solution {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int n=A.size();
        // Step 1: Find the break point:
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(A.get(i) < A.get(i + 1)){
                index=i;
                break;
            }
        }
        if(index==-1){// If break point does not exist , reverse the array
            Collections.reverse(A);
            return A;
        }
        // Step 2: Find the next greater element and swap it
        
        for(int i=n-1;i>index;i--){
            if (A.get(i) > A.get(index)) {
                int tmp = A.get(i);
                A.set(i, A.get(index));
                A.set(index, tmp);
                break;
            }
        }
        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(index + 1, n);
        Collections.reverse(sublist);

        return A;
    }
}
