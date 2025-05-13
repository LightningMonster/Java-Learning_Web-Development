
public class pattern_printing {
	public static void main(String args[]) {
		int n=4,m=5;
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		//Border pattern
		System.out.print("\n");
		
		for(int i = 0; i<=n; i++)
		{
			for(int j = 0; j<=m; j++)
			{
				if(i==0 || i == n || j ==0 || j == m )
					System.out.print(j);
				else
					System.out.print(" ");
				
				
			}
			System.out.print("\n");
		}
		
		
		//Half pyramid
		System.out.print("\n");
		
		for(int i = 0; i<=n; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		//inverted Half pyramid
		System.out.print("\n");
				
		for(int i = n; i>=0; i--)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		System.out.print("\n");
		// pyramid
		for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
		
		System.out.print("\n");
		// inverted half pyramid (180 deg)
		for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
		
		
		//Half pyramid of numbers
				System.out.print("\n");
				
				for(int i = 1; i<=m; i++)
				{
					for(int j = 1; j<=i; j++)
					{
						System.out.print(j);
					}
					System.out.print("\n");
				}
	}
}
