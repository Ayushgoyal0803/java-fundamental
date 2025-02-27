import java.util.*;

class AreaOfCircle{
		
	static double pi = Math.PI;
	
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		float r = scn.nextFloat();
		double ans = pi * r*r;
		
		System.out.println("Area of circle : " + ans);	
	}
} 