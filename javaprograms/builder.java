import java.util.*;
public class builder 
{
    public static void main(String[] args) {
        //StringBuilder str=new  StringBuilder("hello");
       // str.append("world");
        //System.out.println(str);

        //changing hello to mello
        // str.setCharAt(0,'n');
        // System.out.println(str);
      
    //      str.insert(2,'y');
    //     System.out.println(str);
    //    str.deleteCharAt( 3);
    //    System.out.println(str);

// reverse()  and delete(i,j)
 StringBuilder rev =new  StringBuilder("Kuldeep malviya");
 rev.reverse();
  System.out.println(rev);
rev.delete(1, 8);
System.out.println(rev);
    }
} 