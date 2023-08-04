/*

class Recursion {
    static boolean palindrome(int i, String s){
            if(i>=s.length()/2) return true;
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            return palindrome(i+1,s);
    }
    public static void main(String[] args) {
       String s = "madam";
       System.out.println(palindrome(0,s));
    }
}*/
                                  //CODE STUDIO SOLUTION:----->
public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return palindrome(0,str.length()-1,str);
    }
    public static boolean palindrome(int i,int j,String str){
        if(i>=j) return true;
        if(str.charAt(i)==str.charAt(j)){
            return palindrome(i+1, j-1, str);
        }
        return false;
    }
}

