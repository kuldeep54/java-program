 public Fraction
{

    public class Fraction { 
     public static int  gcd(int num,int den){
         int min=Math.min(num, den);
       for(int i=min;i>=1;i--){
     if(num%i==0&& den%i==0)
     return min; 
      }
    
       public static class  fraction { 
        int num;
        int den;
        fraction(int num,int den)        {
        this.num=num;
     this.den=den;

     }
           public void simplify()
            {
              int hcf=gcd(num, den);
               num/=hcf;
              den/=hcf;}
       
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(3, 7);
         System.out.println(f1.num+"/"+f1.den);
         f1.simplify();
          System.out.println(f1.num+"/"+f1.den);
         
       
         
    }
    
}