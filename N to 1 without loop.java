/*You are given an integer 'n'.
Your task is to return an array containing integers from n to 1(in decresing order) without using loops.
*/
public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int [] arr=new int[x];
        return recursion(x,arr,0);
    }
    public static int [] recursion(int x,int []arr,int i){
        if(x==0) return arr;
        arr[i]=x;
        return recursion(x-1, arr, i+1);
    }
}
