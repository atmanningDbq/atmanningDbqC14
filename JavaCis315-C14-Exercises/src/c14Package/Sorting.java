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
 * author:  YOUR NAME
 * 
 * Description: 
 * 
 * 	DESCRIBE THIS CLASS AND THE METHOD IN THIS CLASS
 *
 */
public class Sorting {

	public static void selectionSort(int[] list) {
		// sort the integer array given using a Selection sort
		
		
		// find the index (location) of the smallest item in the list
		int indexSmallest = 0; // before looping through all elements, first item is smallest
		for( int i=1; i<list.length; i++ ) 
			if( list[i] < list[indexSmallest])  // is i'th element smaller?
				indexSmallest = i;  // save the location of smaller elements
		
		// once the for loop is complete, indexSmallest is the location of the first
		// smallest element in the list (if values can repeat)
		
	}
	
	
	
	public static void insertionSort( int[] list ) {
		
		// see chapter 14 for the necessary code to perform an insertion sort
		// include comments
	}
	
	
	// Chapter 14 Programming Exercise 1  part 1
	// explain the binarySearch algorithm as described on page 918
	public static int binarySearch(int[] list, int listLength, int searchItem) {
		
		// type in the code for the binary search found on page 918
		// write the code
		
		return 0;  // replace this with the correct return statement
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
