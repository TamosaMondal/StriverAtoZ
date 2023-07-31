/*Find the gcd of two numbers.
*/
public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        /*int gcd=1;
        for(int i=1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        return gcd;*/

                    //<-----OPTIMAL SOLUTION---->
        if(m==0){
            return n;
        }
        return calcGCD(m, n%m);
    }
}
