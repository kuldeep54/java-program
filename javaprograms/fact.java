import java.util.Scanner;

public class fact {
 static   void facts (int n){
    if(n==1){ System.out.print(1);
    return ;}
    System.out.println(n);
     facts(n-1);
 }
 
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
   int n=sc.nextInt();
facts (n);
 }
}
