import java.util.Arrays;
public class array {

	public static void main(String[] args) {
		
		// Declaring an Array , Creating an Array (Instantiation)	
		int[] arr = new int[6];
		
		// Initializing an Array
		for(int i=1; i<=5; i++) {
			arr[i]=i;
		}
		
		// Looping Through an Array & printing
		System.out.println("Looping Through an Array & printing");
		for(int i=5; i>=1; i--) {
			System.out.println("Element"+i+"="+arr[i]);
		}
	
		// Finding Array Length
		System.out.println("\nArray's Length: "+arr.length);
		System.out.println();
		
		// Declaring a 2D Array
		
		int[][] ad = new int[7][7];
		
		// Initializing a 2D Array
		for(int a=0; a<7; a++){
			for(int b=0; b<7; b++){
				ad[a][b] = a+b;
			}
		}
		
		// Accessing Elements & Printing 2D Array
		System.out.println("Accessing Elements & Printing 2D Array");
		for(int a=0; a<7; a++){
			for(int b=0; b<7; b++){
				System.out.print(ad[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Jagged Arrays (Different Column Sizes)
		int[][] jagged = new int[3][];
		jagged[0] = new int[2]; // Row 0 has 2 columns
		jagged[1] = new int[3]; // Row 1 has 3 columns
		jagged[2] = new int[1]; // Row 2 has 1 column
		
		
		// Passing Arrays to Methods
		System.out.println("Passing Arrays to Methods");
		int[] number = {10, 20, 30, 40};
        printArray(number);
        System.out.println();
        
        // Returning an Array from a Method
        System.out.println("Returning an Array from a Method");
        int[] arr1 = createArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        
        // Array Utility Methods (Using Arrays Class)
        // Sorting an Array
        System.out.println("Array Utility Methods (Using Arrays Class)\r\n"+ "Sorting an Array");
        int[] numbers = {50, 20, 40, 10, 30};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        
        // Filling an Array
        System.out.println("Filling an Array");
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 7);
        System.out.println(Arrays.toString(arr2)); 
        System.out.println();

        // Copying an Array
        System.out.println("Copying an Array");
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copy)); 
        System.out.println();

        // Checking Array Equality
        System.out.println("Checking Array Equality");
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b)); 
        System.out.println();

	}
	
	// Passing Arrays to Methods
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
	    }
	}
	
	// Returning an Array from a Method
	public static int[] createArray() {
	    return new int[]{5, 10, 15, 20};
	}
}
