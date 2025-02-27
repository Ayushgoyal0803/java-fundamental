import java.util.Scanner;

class SimpleInterest{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter principal amount : ");
		int amt = scn.nextInt();
		System.out.print("Enter time period : ");
		int time = scn.nextInt();
		
		System.out.print("Enter Rate of Interest : ");
		int rate = scn.nextInt();
		
		int si = amt * time * rate / 100;
		
		System.out.println("Simple interest : " + si);
		
	}

}