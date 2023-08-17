/*You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.*/

//                                    <----VARIENT 1(OPTIMIZED):--->
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
        }
        return ans;
    }
}

//                                          <----VARIENT 2(CODE STUDIO):--->
public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n=a.length/2;
        int []pos=new int[n];
        int [] neg=new int[n];
        int i=0;
        int j=0;
        for(int k=0;k<a.length;k++){
            if(a[k]>=0)
            pos[i++]=a[k];
            else
            neg[j++]=a[k];
        }
        for(int k=0;k<n;k++){
            a[2*k]=pos[k];
            a[2*k+1]=neg[k];
        }
        return a;
    }
}

