/*Given a number X,  print its factorial.
To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.
Note: X  is always a positive number. 
*/
class Recursion {
    static int factorial(int n){
            if(n == 0){
                return 1;
            }
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
       int n = 3;
       System.out.println(factorial(n));
    }
}
