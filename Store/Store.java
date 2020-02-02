import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
class Store {
 
        private ArrayList<Item> myStore = new ArrayList<Item> ();
       
        public Store(String fName){
                loadFile(fName);
        }
       
        private void loadFile(String inFileName){
                         File file = new File("file50.txt");
                            String output = "";
                                try{
                                        Scanner input = new Scanner (file);    
                                        while(input.hasNextInt()){
                                                String line = input.nextLine();
                                                Item item = new Item(input.nextInt(), input.nextInt());
                                                myStore.add(item);
                                        }
                                       
                                }
                                catch (Exception e){
                                        System.out.println(e.getMessage());
                                        System.exit(0);
                                }
        }
 
        public void displayStore(){
                System.out.printf("%10s", "Line #");
                System.out.printf("\t" + "Id");
                System.out.printf("\t" + "Inv\n");
                for (int i = 0; i < myStore.size(); i++) {
                        System.out.print("\n\t" + (i+1));
                        System.out.printf("%10s", myStore.get(i));
                        if ((i+1) % 10 == 0 && i > 5) {
                                System.out.println();
                        }
                }
                System.out.println();
        }
 
        public void sort(){
                mergeSort(myStore, 0, myStore.size()-1);
        }
       
        private void merge(ArrayList<Item>  a, int first, int mid, int last){
                int i = first;
        int j = mid;
        ArrayList <Item> temp = new ArrayList <Item> ();
        while (i < mid && j < last) {
                if (a.get(i).compareTo(a.get(j)) <= 0) {
                        temp.add(a.get(i));
                        i++;
                }
                else {
                        temp.add(a.get(j));
                        j++;
                }
        }
        if (i == mid) {
                while (j < last) {
                        temp.add(a.get(j));
                        j++;
                }
        }
        else {
                while (i < mid) {
                        temp.add(a.get(i));
                        i++;
                }
        }
        a.addAll(first, temp);
        a.subList(last, last + (last-first)).clear();
        }
       
 
        public void mergeSort(ArrayList<Item>  a, int first, int last){
                 if (last - first == 0) {
         }
         else if (last - first == 1){
            if (a.get(first).compareTo(a.get(last)) >= 0) {
                Item temp = a.get(first);
                a.set(first, a.get(last));
                a.set(last, temp);
            }
         }
         else {
                 int midpoint = (first + last) / 2;
                 mergeSort(a, first, midpoint);
                 mergeSort(a, midpoint, last);
                 merge(a, first, midpoint, last);
         }
        }
        //iterative
        private int bsearch(Item idToSearch){
                   int bottom = 0;
                   int top = myStore.size() - 1;
                   while (top >= bottom) {
                           int mid = (top + bottom) / 2;
                           if (myStore.get(mid).getId() == idToSearch.getId()) {
                                   return mid;
                           }
                           else if (myStore.get(mid).getId() > idToSearch.getId()) {
                                   top = mid - 1;
                           }
                           else {
                                   bottom = mid + 1;
                           }
                   }
                   return -1;
        }
        //recursive
        private int bsearch(Item idToSearch, int first, int last){             
                if (last < first)
                        return -1;
                else
                {
                        int mid = (first + last) / 2;
                        if (idToSearch.compareTo(myStore.get(mid)) < 0) {
                                return bsearch(idToSearch, first, mid - 1);
                        }
                        else if (idToSearch.compareTo(myStore.get(mid)) > 0)
                                return bsearch(idToSearch, mid + 1, last);
                        else
                                return mid;
                }
        }
        public void testSearch(){
                   int idToFind;
                   int invReturn;
                   int index;
                   Scanner in = new Scanner(System.in);
 
                   System.out.println("Testing search algorithm\n");
                   do{
                      System.out.println();
                      System.out.print("Enter Id value to search for (-1 to quit) ---> ");
                      idToFind = in.nextInt();
                      index = bsearch(new Item(idToFind, 0));
                      //recursive version call
                      //index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1);
                      System.out.print("Id # " + idToFind);
                      if (index == -1){
                         System.out.println(" No such part in stock");
                      }
                      else{
                         System.out.println(" Inventory = " + myStore.get(index).getInv());
                      }
                   } while (idToFind >= 0);
                }
}