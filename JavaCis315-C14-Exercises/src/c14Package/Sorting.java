/**
 *   file: Sorting.java
 */
package c14Package;

import java.util.Vector;

/**
 * Replace these comments with your name
 * 
 * Modify this comment header!
 * 
 * author:  Arthur Manning - dbq.edu
 * 
 * Description: 
 * 
 * 	DESCRIBE THIS CLASS AND THE METHOD IN THIS CLASS
 *
 */
public class Sorting {

	// the classic bubble sort just for fun
	public static void bubbleSort(int[] list ) {
		// check pairs of elements, swapping position until no more swaps are 
		// needed
		
		boolean bSwapped = true;
		
		while( bSwapped ) {
			bSwapped = false; 
			
			// check pairs of items in the entire list
			for( int i=0; i<list.length-1; i++ )
				if( list[i+1] < list[i]) {
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					bSwapped = true;  // keep sorting!
				}				
		}
	}
	
	// selection sort close to the one described in the Malik book
	// this version sorts the full list, and takes only the list as the parameter
	public static void selectionSort(int[] list) {
		
		// sort the integer array given using a Selection sort
		int smallestIndex;
		
		
		// outer loop:
		//    look through every element in the list up the next-to-last item

		for (int index = 0; index < list.length - 1; index++) {
			// find the index (location) of the smallest item in the list

			smallestIndex = index; // before looping through all elements, first item is smallest

			for (int minIndex = index + 1; minIndex < list.length; minIndex++)
				if (list[minIndex] < list[smallestIndex]) // is i'th element smaller?
					smallestIndex = minIndex; // save the location of smaller elements

			// once the inner for loop is complete, smallestIndex is the location of the
			// first
			// smallest element in the list (if values can repeat)
			if (index != smallestIndex) {
				// swap the values if index is not the smallest
				int temp = list[index];
				list[index] = list[smallestIndex];
				list[smallestIndex] = temp;
			}

		}
	} // end selectionSort
	
	
	
	public static void insertionSort( int[] list ) {
		
		// see chapter 14 for the necessary code to perform an insertion sort
		// include comments
	}
	
	
	// Chapter 14 Programming Exercise 1  part 1
	// explain the binarySearch algorithm as described on page 918
	// YOU ALSO NEED TO TEST THIS METHOD
	public static int binarySearch(int[] list, int listLength, int searchItem) {
		
		// type in the code for the binary search found on page 918
		// write the code
		
		 int first = 0; 
		 int last = listLength - 1; 
		 int mid; 
		 boolean found = false; 
		 
		 while (first <= last && !found) { 
			 mid = (first + last) / 2; // middle location in the list
			 if (list[mid] == searchItem) 
				 found = true; // we are done if we've found the value
			 else 
				 if (list[mid] > searchItem) 
					 last = mid - 1; // next iteration will search lower half
				 else 
					 first = mid + 1; // next iteration will be last half
		 }
		 
		 // shortcut for if(found) return first; else return -1;
		 return found ? first : -1;
	}
	
	
	// Chapter 14 Programming Exercise 2
	public static void remove( int[] intArray, int aLength, int removeItem ) {
		// find and remove the first occurrence of removeItem in intArray
		
		// display a console error where appropriate
	}
	
	
	// Chapter 14 Programming Exercise 3
	public static void removeAt( int[] intArray, int aLength, int index )  {
		// remove item at location index, reducing the length of the array by 1
		
		// display an error message where needed
	}
	
	
	// Chapter 14 Programming Exercise 4
	public static void removeAll( int[] intArray, int aLength, int removeItem ) {
		
		// delete all occurrences of removeItem from intArray
	}
	
	
	// Chapter 14 Programming Exercise 9
	public static void insertionSortVector() {
		
		// add the appropriate Vector type variable to be sorted
		
		// Vectors are similar to ArrayLists
		
	}
	
}
