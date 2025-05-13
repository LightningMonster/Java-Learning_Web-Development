import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		
		//  Creating an ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		
		// Adding Elements
		
		list.add(25);
		list.add(52);
		list.add(15);
		list.add(2);
		list.add(10);
		list.add(20);
		
		
		// Accessing Elements
		System.out.println("Element of position 0: "+list.get(0));
		System.out.println("Array Size: "+list.size());
		System.out.println();
		
		// Modifying Elements
		System.out.println("Modifying element:");
		list.set(0, 25);
		System.out.println("Element of position 0: "+list.get(0));
		System.out.println();
		
		// Removing Elements
		System.out.println("Removing element from position 0");
		list.remove(0);
		System.out.println("Array Size: "+list.size());
		System.out.println("Element of position 0: "+list.get(0));
		System.out.println();
		
		// Searching Elements
		System.out.println("Searching Elements:");
		if (list.contains(20)) {
		    System.out.println("20 is in the list");
		    // find the first index of an element
		    System.out.println("Position: "+list.indexOf(20));
		}
		System.out.println();
		if (list.contains(21)) {
		    System.out.println("21 is in the list");
		}else {
			System.out.println("21 is not in the list");
		}
		System.out.println();
		
		// Checking if Empty
		System.out.println("Checking if Empty:");
		if (list.isEmpty()) {
		    System.out.println("List is empty");
		}else {
			System.out.println("List is not empty");
		}
		System.out.println();
		if (list1.isEmpty()) {
		    System.out.println("List1 is empty");
		}else {
			System.out.println("List1 is not empty");
		}
		System.out.println();

		// Iterating Over ArrayList
		System.out.println("Iterating Over ArrayList:");
		// Sorting an ArrayList
		System.out.println("Before Sorting an ArrayList:");
		list.forEach(num -> System.out.println(num));
		System.out.println();
		System.out.println("After Sorting an ArrayList:");
		Collections.sort(list); // Sorts in ascending order
		list.forEach(num -> System.out.println(num));
		System.out.println();
		
		// Converting ArrayList to Array
		Integer[] array = list.toArray(new Integer[0]);
		System.out.println("Converting ArrayList to Array\nElements in array:");
		for(int ele : array) {
			System.out.println(ele);
		}
	}

}
