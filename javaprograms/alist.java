import java .util.*;
public class alist {
    public static void main(String[] args) {
        // wrapper class 
        // Integer i= Integer.valueOf(4);
        //  System.out.println(i);

        ArrayList <Integer> l1 = new ArrayList<>();
        //  ArrayList <Boolean> l2 = new ArrayList<>();
        //   ArrayList <Float> l3 = new ArrayList<>();

        // add new element 
        l1.add(5);
         l1.add(6);
          l1.add(7);
           l1.add(8);

           // get an element at index i
        //    System.out.println(l1.get(1));

           //print with for loop
               System.out.println(l1 );
           for(int i=0;i<l1.size();i++)
           { System.out.println(l1.get(i));
           }



           
    
    }

    
}
 