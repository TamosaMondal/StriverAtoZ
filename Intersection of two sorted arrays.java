/*Problem Statement: Find the intersection of two sorted arrays. OR in other words, Given 2 sorted arrays, find all the elements which occur in both the arrays.
*/
import java.util.*;
class intersection{
public static ArrayList<Integer> intersectionOfArrays(int[] A, int[] B){
   ArrayList<Integer> ans=new ArrayList<>();
  int i = 0, j = 0; 
  while (i < A.length && j < B.length) {
    if (A[i] < B[j]) { 
      i++;
    } else if (B[j] < A[i]) {
      j++;
    } else {
      ans.add(A[i]);
      i++;
      j++;
    }
  }
  return ans;
}    
}
