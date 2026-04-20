import java.util.ArrayList;

// package 23ArrayList;

public class ArrayList1 {

  public static void swap(ArrayList<Integer> a, int index1, int index2){
    int temp = a.get(index1);
    a.set(index1, a.get(index2));
    a.set(index2, temp);
  }
  public static void main(String[] args) {
    
  ArrayList<Integer> a = new ArrayList<>();

    //add 
  a.add(10); // O(1)
  a.add(20);
  a.add(30);
  a.add(40);
  a.add(50);

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

  }

  // //swap
  // int id1 = 1, id2 = 3;
  // System.out.println(a);
  // swap(a,index1,index2);
  // System.out.println(a);



}
