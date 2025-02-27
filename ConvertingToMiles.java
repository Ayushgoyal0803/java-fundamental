import java.util.Scanner;

class ConvertingToMiles {
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter distance in kilometers : ");
		double kilometers = scn.nextDouble();
		
		
		Double miles = kilometers * 0.621371;
		
		System.out.println("Distance in miles : " + miles);
		
	}

}