import java.util.*;

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
    steps = 0;
  for (int outer = 0; outer < list.size() - 1; outer++){
    for (int inner = 0; inner < list.size()-outer-1; inner++){
        steps += 3;//count one compare and 2 gets
        if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
           steps += 4;//count 2 gets and 2 sets
           Comparable temp = list.get(inner);
           list.set(inner,list.get(inner + 1));
           list.set(inner + 1,temp);
        }
    }
  }
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
    int min, temp;

  for (int outer = 0; outer < list.size() - 1; outer++){
    min = outer;
    steps +=3;
    for (int inner = outer + 1; inner < list.size(); inner++){
      if (list.get(inner).compareTo( list.get(min)) < 0){
        min = inner; // a new smallest item is found
        steps+=4;
      }
    }
    //swap list[outer] & list[min]
    Comparable temp1 = list.get(outer);
    list.set(outer, list.get(min));
    list.set(min, temp1);
  }
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
      steps = 0;
      for (int outer = 1; outer < list.size(); outer++){
    int position = outer;
    Comparable key = list.get(position);
    steps += 3;
    // Shift larger values to the right
    while (position > 0 && list.get(position - 1).compareTo(key)>0){
      list.set(position, list.get(position - 1));
      position--;
      steps+=4;
    }
    list.set(position, key);
  }
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }
  public static void mergeSort(ArrayList <Comparable> a, int first, int last){
    if(first < last){
        int mid = first + (last - first) /2;
        System.out.println("mergeSorting " + a.subList(first, last + 1));
        mergeSort(a, first, mid);
        System.out.println("mergeSorting " + a.subList(first, mid + 1));
        mergeSort(a, mid + 1, last);
        System.out.println("merging " + a.subList(first, mid + 1) + 
            " and " + a.subList(mid + 1, last + 1));
        merge(a, first, mid, last);
    }
    System.out.println();
    System.out.println("base case");
    System.out.println();
}
    public static void merge(ArrayList <Comparable> a, int first, int mid, int last){
    ArrayList <Comparable> b = new ArrayList();
    for(int k = first; k <= last; k++){
        b.add(a.get(k));
    }

    System.out.println("b now contains " + b);
    int middle =b.size() /2;
    for(int i = first; i <= last; i++){
        //System.out.println("mid: " + b.size() /2);
        //System.out.println("b: " + b);
        //System.out.println("a: " + a);
        //System.out.println("i: " + i);
        if(middle == b.size()){
            a.set(i, b.remove(0));
            middle--;
        }else if(middle == 0){
            a.set(0, b.remove(0));
        }else if(b.get(0).compareTo(b.get(middle)) < 0){
            System.out.println("moving " + b.get(0) + " from b[0] to a[" + 
                i + "] because " + b.get(0) + " is less than " + b.get(middle));
            a.set(i, b.remove(0));
            middle--;
            System.out.println("b now contains " + b);
        }else{
            System.out.println("moving " + b.get(middle) + " from b[" + 
                b.size() /2 + "] to a[" + i + "] because " + b.get(0) + 
                    " is greater than " + b.get(middle));
            a.set(i, b.remove(middle));
            //middle--;
            System.out.println("b now contains " + b);
        }
    }

    System.out.println();
    System.out.println("Merge");
    System.out.println(a);
    System.out.println();
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


