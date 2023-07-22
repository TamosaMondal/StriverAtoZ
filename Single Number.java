/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
*/
class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
   }
   //Time Complexity-O(N)
   //Space Complexity-O(1)
