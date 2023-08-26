import java.util.*;
public class Solution {
    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
        int n=MATRIX.length;
        int m=MATRIX[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        List<Integer> res = new ArrayList<Integer>();
        while (top <= bottom && left <= right) {
        // Traverse Right
            for (int i=left; i<=right; i++) {
                res.add(MATRIX[top][i]);
            }
            top++; 
        // Traverse Down
            for (int i=top; i<= bottom; i++) {
                res.add(MATRIX[i][right]);
            }
            right--;
        if (top <=bottom) {
        // Traverse Left
            for (int i=right; i>=left;i--) {
                res.add(MATRIX[bottom][i]);
            }
        }
            bottom--;
        if (left <= right) {
        // Travese Up
            for (int i=bottom; i>=top; i--) {
                res.add(MATRIX[i][left]);
            }
        }
            left++;
        }
            
        int[] ans = new int[res.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = res.get(i);

        }
        return ans;

    }
}
