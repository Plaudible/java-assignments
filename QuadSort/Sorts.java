import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *  Description of the Class
 *
 * @author     Your Name Here
 * @created    Month Day, Year
 */
public class Sorts{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
  }
  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
  }
  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
    //replace these lines with your code
     System.out.println();
     System.out.println("Selection Sort");
     System.out.println();
  }
  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }
  public static int[] mergeSort(int[] a) {
	 if (a.length <= 1) {
	    return a;
	 }
	 else {
	    // Create an array to hold the left half of the whole array
	    // and copy the left half of whole into the new array.
	    int[] left = new int[a.length/2];
	    System.arraycopy(a, 0, left, 0, left.length);

	    // Create an array to hold the right half of the whole array
	    // and copy the right half of whole into the new array.
	    int[] right = new int[a.length-left.length];
	    System.arraycopy(a, left.length, right, 0, right.length);
	    
	    // Sort the left and right halves of the array.
	    left = mergeSort(left);
	    right = mergeSort(right);

	    // Merge the results back together.
	    merge(left, right, a);

	    return a;
	 }
    }
     private static void merge(int[] left, int[] right, int[] whole) {
	  int leftIndex = 0;
	  int rightIndex = 0;
	  int wholeIndex = 0;
	  while (leftIndex < left.length &&
	       rightIndex < right.length) {
	    if (left[leftIndex] < right[rightIndex]) {
		whole[wholeIndex] = left[leftIndex];
		leftIndex++;
	    }
	    else {
		whole[wholeIndex] = right[rightIndex];
		rightIndex++;
	    }
	    wholeIndex++;
	  }
	  int[] rest;
	  int restIndex;
	  if (leftIndex >= left.length) {
	     rest = right;
	     restIndex = rightIndex;
	  }
	  else {
	     rest = left;
	     restIndex = leftIndex;
	  }
	  for (int i=restIndex; i<rest.length; i++) {
	    whole[wholeIndex] = rest[i];
	     wholeIndex++;
	  }
  }
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return steps;
  }
  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
   /**
   *  Interchanges two elements in an ArrayList
   *
   * @param  list  reference to an array of integers
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  public void swap(ArrayList <Comparable> list, int a, int b){
    //replace these lines with your code
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}

