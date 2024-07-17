import java .util.*;
public class stringbasic {
 public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
 // String  str =sc.next();
//  String  str =sc.nextLine();
// System.out.print(str);
  //  String str="kuldeep Malviya"; 
  //  System.out.println(str);

//*  charAt() */
  //  String str="hello world";
//   //System.out.println(str.length());
//  char ch=str.charAt(3);
// System.out.println(ch);
// System.out.println(str.charAt(9));

/* indexOf()  and compareTo()  */
//String str="raghav garg";
// int i=str.indexOf('a');
// System.out.println(i);
// System.out.println(str.indexOf('v'));

// String str="hello";
// String gtr="dello";
// System.out.println(str.compareTo(gtr));
// String str1="hello";
// String gtr1="zello";
// System.out.println(str1.compareTo(gtr1));

/*  contains() and startWith() */

// String str="physics wallah";
// System.out.println(str.contains("alla"));
// System.out.println(str.contains("tfueyfg"));
// System.out.println(str.startsWith("phy"));
// System.out.println(str.startsWith("PHY"));
// System.out.println(str.endsWith("ah"));


/* toLowerCase(), toUppeCase(), concat() */

// String str="KULDEEP";
// System.out.println(str.toLowerCase());
// String str1="malviya";
// System.out.println(str1.toUpperCase());
// System.out.println(str.concat(str1));


/* substring(i,j) and substring(i) */

 String str="Helloworld";
 System.out.println(str.substring(5));
 System.out.println(str.substring(3,7));



}
}
