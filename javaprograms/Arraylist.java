import java .util.*;
public class Arraylist {
    public static void main(String[] args) {
        // wrapper class 
        // Integer i= Integer.valueOf(4);
        //  System.out.println(i);

        ArrayList <Integer> l1 = new ArrayList<>();
        //  ArrayList <Boolean> l2 = new ArrayList<>();
        //   ArrayList <Float> l3 = new ArrayList<>();


        //  COMMON METHODS 
        //  (1) add new element 
        l1.add(5); //5
         l1.add(6);// 5 6
          l1.add(7);// 5 6 7
           l1.add(8);//5 6 7 8
          // System.out.println(l1);



           //  (2) get an element at index i
        //    System.out.println(l1.get(1));



        //   (3)   //print with for loop
        //        System.out.println(l1 );
        //    for(int i=0;i<l1.size();i++)
        //    { System.out.println(l1.get(i));
        //    }



     //    (4)   adding elemint at index i  [5 100 6 7 8]
       l1.add(1 ,100);
       System.out.println(l1);

       // (5 )  modifing element at index i  [5 10 6 7 8]
       l1.set(1,10);
       System.out.println(l1);
           
   // (6) remove element at index i   [5  6 7 8]
    l1.remove(1);
    System.out.println(l1);
       

    // (7)  remove  an element e
    System.out.println(l1.remove(Integer.valueOf(  7))); // if we print this line then its return boolean 
    System.out.println(l1);

// (8) check if element exist 
boolean ans=l1.contains(Integer.valueOf(8));
  System.out.println(ans);

// if we dont specifiy class you can  put a anything inside l
ArrayList  l= new ArrayList  ();

 l.add("pkkuuhtd");
 l.add(3);
 l.add(6.78);

System.out.println(l);










    }

    
}
 