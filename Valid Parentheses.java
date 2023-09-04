import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.empty()) return false;
                char c=st.pop();
                if(ch==')' && c=='(' || ch=='}' && c=='{' || ch==']' && c=='['){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}
