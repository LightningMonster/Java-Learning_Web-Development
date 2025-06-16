import java.util.Scanner;

public class areas {
	public static void main(String args[]) {
		
		area obj  = new area(); 
		
		obj.circle();
		obj.circumference();
		obj.rectangle();
		obj.rectangleP();

	}
}

class area{
	Scanner sc = new Scanner(System.in);
	
	public void circle() {
		System.out.print("Enter radius of circle:");
		int r = sc.nextInt();
		System.out.println("Area of circle: "+(3.14*r*r));
	}
	
	public void circumference() {
		System.out.print("Enter radius of circle:");
		int r = sc.nextInt();
		System.out.println("Circumference: "+(2*3.14*r));
	}
	
	public void rectangle() {
		System.out.println("For area of rectangle");
		System.out.print("Enter length:");
		int l = sc.nextInt();
		System.out.print("Enter breadth:");
		int b = sc.nextInt();
		System.out.println("Area of rectangle: "+(2*l*b));
	}
	
	public void rectangleP() {
		System.out.println("For peremeter of rectangle");
		System.out.print("Enter length:");
		int l = sc.nextInt();
		System.out.print("Enter breadth:");
		int b = sc.nextInt();
		System.out.println("Peremeter of rectangle: "+((2*l)+(2*b)));
	}
}