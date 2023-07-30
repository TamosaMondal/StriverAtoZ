/*Given a number, print all the divisors of the number. A divisor is a number that gives the remainder as zero when divided.
*/
for(int i = 1; i <= n; i++){
			if(n % i == 0){
				System.out.print(i + " ");
      }
}
/*For Sum all the divisors:--->
Sample Input:
3
Sample Output:
8
Explanation Of Sample Output 1:
We need to find sumOfDivisors(1) + sumOfDivisors(2) +sumOfDivisors(3).
sumOfDivisors(1) = 1
sumOfDivisors(2) = 2 + 1 = 3
sumOfDivisors(3) = 3 + 1 = 4
Therefore, the answer is sumOfDivisors(1) + sumOfDivisors(2) + sumOfDivisors(3) = 1 + 3 + 4 = 8.*/
public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(n/i)*i;
        }
        return sum;
    }
}
