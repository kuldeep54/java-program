public class factorial {
    static  int factorial(int n){
        if (n==0)
        return 1;
        int ans=factorial(n-1);
        int f=n*ans;
    return f ;
    }
public static void main(Strinhg args[]) 
{ //int n=5;
 System.out.print(factorial(5));

}   
}


