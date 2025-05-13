
public class loops {
	public static void main(String args[]){
		for(int counter=0; counter<5; counter++)
		{
			System.out.println("For Loop counter="+counter);
		}
		
		int counter = 0;

		while(counter<5) {
			System.out.println("While Loop counter="+counter);
			counter++;
		}
		
		counter = 0;
		
		do {
			System.out.println("Do While Loop counter="+counter);
			counter++;
		}while(counter<5);
		
		
		counter = 2;
		
		switch(counter) {
		
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
		}
	}
		
}
