import java.util.Scanner;

class Sum{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first number : "); 
		int a = scn.nextInt();
		System.out.print("Enter second number : ");
		int b = scn.nextInt();
		int ans = a+b;
		
		System.out.println("Sum of two numbers : " + ans );
	}
}