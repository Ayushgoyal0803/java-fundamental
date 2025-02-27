import java.util.Scanner;

class PowerCalculation{
	public static long power(int base,int exp){
		if(exp<2){
			return base;
		}
		
		long pow = base * power(base , exp -1); 	
		
		return pow;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter base number : ");
		int base = scn.nextInt();
		System.out.print("Enter exponent number : ");
		int exp = scn.nextInt();
		
		long ans = power(base,exp);
		
		System.out.println("Base raised to power : " + ans);
		
	}

}