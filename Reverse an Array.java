/*Given an array 'arr' of size 'n'.
Return an array with all the elements placed in reversed.
*/
public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        return reverse(0,n-1,nums);
    }
    public static int[] reverse(int l,int r,int []arr){
        if(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            return reverse(l+1,r-1,arr);
        }
        return arr;
    }
}
