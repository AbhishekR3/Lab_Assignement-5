//Abhishek Ramesh
//Linked Lists

import java.util.*;

public class linkedList{
	//Initialized the Linked List
	public static LinkedList<Integer> numberList;

	//Create a linked list of variable type integer
	public static LinkedList<Integer> LinkedList() {
		
		numberList = new LinkedList<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);

		return numberList;
	}

	//Add item to the end of the LinkedList
	public static void add(int item){
		numberList.add(item);
	}

	//Add item to position of Linked List
	public static void add(int item, int position){
		numberList.add(position, item);
	}

	//Return the element at the position in the Linked List
	public static int get(int position){
		if (position>=numberList.size() | position<0){
			return -1;
		}

		else{
			int value = numberList.get(position);
			return value;
		}

	}

	//Remove the element at the position in the Linked List
	public static LinkedList<Integer> remove(int position){		
		if (position>=numberList.size() | position<0){
			return numberList;
		}

		else{
			numberList.remove(position);
			return numberList;
		}

	}

	// Returns the entire reversed linked list from head to tail
	// Example: int head = 2. Reverse order of element in position 2 to final element.
	public static LinkedList<Integer> reverse(int head){
		LinkedList<Integer> reversedList = new LinkedList<Integer>();

		if (head>=numberList.size() | head<0){
			return reversedList;
		}

		else{
			for (int i=numberList.size()-1; i>=head; i--){
				reversedList.add(numberList.get(i));
			}

			return reversedList;
		}
	}

	public static void main (String[] args){
		// Main Function
		LinkedList();
		System.out.println("Original Linked List: " + numberList);

		add(6);
		System.out.println("Added 6 as the final element: " + numberList);
		add(6, 0);
		System.out.println("Added 6 as the first element: " + numberList);
		System.out.println("The position 2 element is: " + get(2));
		System.out.println("After removing the position 4 element: " + remove(4));
		System.out.println("Reversed order from position 1 to tail: " + reverse(1));
	}
}