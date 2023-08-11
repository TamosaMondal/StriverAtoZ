

import java.util.*;
public class Solution {
	
	public static void quickSort(int[] arr,int low, int high) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(low<high){
			 int pivot=partition(arr,low,high);
			 quickSort(arr,low,pivot-1);
			 quickSort(arr,pivot+1,high);
		 }
	}
	public static int partition(int[] arr,int low,int high){
		int i=low;
		int j=high;
		int pivot=arr[low];
		while(i<j){
			while(arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while(arr[j] > pivot && j >= low + 1) {
                j--;
            }
			if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
	
}
