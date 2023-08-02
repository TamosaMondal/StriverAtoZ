/*You are given an integer 'n'.
Your task is to return an array containing integers from 1 to "N'(in increasing order) without using loops.
*/
public class Solution {
    static int[] arr; 
    public static int[] printNos(int x) {
        // Write Your Code Here
        int ans[]=new int[x];
        recursion(ans,x);
        return ans;
    }
    public static void recursion(int ans[],int x){
        if(x==1){
            ans[x-1]=1;
            return;
        }
        recursion(ans,x-1);
        ans[x-1]=x;
        return;
    }
}
