import java.util.Scanner;

public class Main {
	static boolean ArmstrongNumber(int n){
    int originalno = n;
    int count = 0;
    int temp = n;
    while (temp != 0){
        count++;
        temp = temp / 10;
    }
    int sum=0;
    while(n != 0){
        int digit = n % 10;
        sum += Math.pow(digit,count);
        n /= 10;
    }
    if(sum==originalno) return true;
	else return false;
}
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(ArmstrongNumber(n)) System.out.println("true");
		else System.out.println("false");
	}
}
