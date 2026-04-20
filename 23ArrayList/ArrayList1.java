import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// package 23ArrayList;

public class ArrayList1 {

  
  public static void main(String[] args) {
    
  ArrayList<Integer> a = new ArrayList<>();

    //add 
  a.add(2); // O(1)
  a.add(5);
  a.add(9);
  a.add(3);
  a.add(6);

  System.out.println(a);

  //add element in specific index
  // a.add(2, 25); // O(n)
  // System.out.println(a);

  //get 
  // System.out.println(a.get(1));

  //remove
  // System.out.println(a.remove(2));

  // System.out.println(a);

    // contains
  // System.out.println(a.contains(20));
  // System.out.println(a.contains(21));

  //size 
  // System.out.println(a.size());

  // for(int i =0;i <a.size();i++){ // iterating the size 
  //   System.out.print(a.get(i)+" ");
  // }
  // System.out.println();

  // //reverse
  // for(int i= a.size()-1; i>=0;i--){
  //   System.out.print(a.get(i)+" ");
  // }
  // System.out.println();

  //reverse
  for(int i = a.size()-1;i>=0;i--){
    System.out.print(a.get(i)+" ");
  } System.out.println();

  //find max() // O(n)
  int max = Integer.MIN_VALUE;
  for(int i=0;i<a.size();i++){
    // if(max< a.get(i))
    //   max = a.get(i);
    // or
    max = Math.max(max, a.get(i));

  }
  System.out.println("Maximum element: "+max);

  //swap
  int idx1 =0, idx2 = 2;
  swap(a, idx1,idx2);
  System.out.println("swapping: "+a);

  //Sorting arraylist

  Collections.sort(a);
  System.out.println("Ascending Sorted order: "+a); //ascending order

  Collections.sort(a, Collections.reverseOrder()); //descending order
  System.out.println("Descending Sorted order: "+a);

  }

  public static void swap(ArrayList<Integer> a, int idx1, int idx2){
    int temp = a.get(idx1);
    a.set(idx1, a.get(idx2));
    a.set(idx2, temp);
  }

 
}
