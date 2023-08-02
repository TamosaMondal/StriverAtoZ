/*Print your Name N times using recursion
*/
import java.util.List;
import java.util.Scanner;
public class Solution {
    public static void printNtimes(int n){
        // Write your code here.
        if(n==0) return;
        System.out.print("Coding Ninjas"+" ");
        printNtimes(n-1);
    }
}
