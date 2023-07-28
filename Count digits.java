/*Given an integer N, write a program to count the number of digits in N.
*/
static int count_digits(int n){
       int x = n; int count =0;
       while( x!=0 ) {
          x = x / 10;
          count++;
      }
       return count;
    } 
//                                 <-----Using logarithm----> 
static int count_digits(int n){
       int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
} 
