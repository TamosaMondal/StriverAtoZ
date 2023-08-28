/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.
*/
            //BETTER APPROACH:--->
class Solution {
    public int subarraySum(int[] arr, int s) {
        int n = arr.length;
        int count = 0;
        for (int i = 0 ; i < n; i++) { 
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == s)
                    count++;
            }
        }
        return count;
    }
}
//          OPTIMAL APPROACH
int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int remove = prefixSum - s;// Calculate x-k:

            // Add the number of subarrays to be removed:
            count += map.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
