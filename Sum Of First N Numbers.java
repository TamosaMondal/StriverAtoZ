/*Given a number ‘N’, find out the sum of the first N natural numbers.
*/
public class Solution {
    public static int sumFirstN(int n) {
        // Write Your Code Here
        /*if(n==0) return 0;
        return n+sumFirstN(n-1);*/
        return n*(n+1)/2;
    }
}
