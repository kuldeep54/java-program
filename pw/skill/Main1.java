package pw.skill;

class Method { 
  Method(){
    System.out.println("constructor");
  }
    int add(int a,int b)
  { 
    int ans=a+b;
    return ans;
  }   
}
public class Main1{
    public static void main(String[] args) {
        Method ob=new Method();
       Scanner sc=new Scanner (System.in);
       int a=sc.nextInt();

       int b=sc.nextInt();
      // int a=5,b=6;
             int ans= ob.add( a, b);
             System.out.println(ans);
    }}