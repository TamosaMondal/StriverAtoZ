/*
Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
*/
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n = a.length;
        int len = 0;
        for (int i = 0; i < n; i++){
            long sum = 0;
            for (int j = i; j < n; j++){
                sum+= a[j];
                if (sum==k)
                    len=Math.max(len, j - i + 1);
            }
        }
        return len;
    }
}
//Time Complexity: O(N2)
//Space Complexity: O(1)
