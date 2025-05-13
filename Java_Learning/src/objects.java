import java.util.*;

public class objects {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		calculator obj  = new calculator(); 
		
		System.out.print("Enter first number:");
		int a = sc.nextInt();
		
		System.out.print("Enter second number:");
		int b = sc.nextInt();
		
		obj.cal(a,b);
		
		sc.close();
		
	}
	
	
}

class calculator{
	public void cal(int a, int b) {
		
		System.out.println();
		System.out.println("Addition = "+(a+b));
		System.out.println("Subtraction = "+(a-b));
		System.out.println("Multiplication = "+(a*b));
		System.out.println("Division = "+(a/b));
		System.out.println("Modulo = "+(a%b));
	}
}