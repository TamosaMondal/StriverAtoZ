/*OPTIMAL SOLUTION(SQRT(N)):---->
*/

public class Solution {
	public static String isPrime(int n) {
		//Your code goes here
		if(n==1) return "NO";
		int count=0;
		for (int i =1; i*i<=n;i++) {
      		if (n% i == 0) {
        		count++;
				if((n%i!=i)) count++;
      		}
    	}
    	if(count==2) return "YES";
		else return "NO";
	}
}
