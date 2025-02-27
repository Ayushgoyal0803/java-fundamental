import java.util.Scanner;

class ConvertingTemperature{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter temperature: ");
		float cel = scn.nextFloat();
		
		float far = cel * 9 / 5  + 32;
		
		System.out.print("converted temperature to fahrenheit : " + far);
	}
}