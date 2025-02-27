import java.util.Scanner;

class AverageOfThreeNumbers{
	
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first number : ");
		float a = scn.nextFloat();
		System.out.print("Enter second number : ");
		float b = scn.nextFloat();
		System.out.print("Enter third number : ");
		float c = scn.nextFloat();
		
		float ans = (a + b + c) /3;
		
		System.out.println("Average Of Three Numbers : " + ans);
		
	}

}