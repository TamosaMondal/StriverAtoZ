public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        long rev=0;
        int dup=n;
        while(n!=0){
            int lastDig=n%10;
            n=n/10;
            rev=(rev*10)+lastDig;
        }
        if(dup==rev) return true;
        else return false;
    }
}
