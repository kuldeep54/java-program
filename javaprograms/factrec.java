public class factrec {
    static  int factorial(int n){
        if (n==1)
        return 1;
        int ans=fact(n-1);
        int f=n*ans;
    return f ;
    }}
public static void main() 
{ //int n=5;
 System.out.println(factorial(5));

}   


