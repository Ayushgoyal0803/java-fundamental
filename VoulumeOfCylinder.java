import java.util.*;

class VoulumeOfCylinder{
	
	static double pi = Math.PI;	
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter radius of Cylinder : ");
		Double r = scn.nextDouble();
		System.out.print("Enter height of Cylinder : ");
		Double h = scn.nextDouble();
		
		double vol = pi * r * r * h; 
		
		System.out.println("Voulume of Cylinder : " + vol);
		
	}
}