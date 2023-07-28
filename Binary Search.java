/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
*/
//                                              <----Iterative Implementation---->
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
//                                              <----Recursive Implementation---->
public class Solution {
    public static int search(int []nums, int target) {
        //Your code goes here
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high){
             return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target){
             return mid;
        }
        else if (target > nums[mid]){
            return binarySearch(nums, mid + 1, high, target);
        }
        return binarySearch(nums, low, mid - 1, target);
    }
}
