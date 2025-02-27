import java.util.Scanner;

class PerimeterOfRectangle{
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter length of rectangle : ");
		int len = scn.nextInt();
		System.out.print("Enter width of rectangle : ");
		int wid = scn.nextInt();
		
		int peri = 2 * (len + wid);
		
		System.out.println("Perimeter of rectangle : " + peri);
		
	}

}