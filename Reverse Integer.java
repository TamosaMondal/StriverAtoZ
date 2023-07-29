/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/
class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int lastDig=x%10;
            x=x/10;
            rev=(rev*10)+lastDig;
        }
       if(rev<Math.pow(-2,31)||rev>Math.pow(2,31)){
           return 0;
       }
        return (int)rev;
    }
}
