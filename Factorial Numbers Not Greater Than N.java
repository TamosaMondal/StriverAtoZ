/*You are given an integer 'n'.
Your task is to return a sorted array(in increasing order)containing all the factorial numbers which are less than or equal to "n".
The factorial number is a factorial of a positive integer,like 24 is a fatorial number,as it is a factorial of 4.
*/
import java.util.*;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        int num=1;
        long facAns=0;
        List<Long> ans=new ArrayList<>();
        while(facAns<n){
            facAns=factorial(num);
            if(facAns<=n){
                ans.add(facAns);
            }
            num+=1;
        } 
        return ans;
    }
    public static long factorial(long n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
}
