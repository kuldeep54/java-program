interface abc{
     final float  pi=3.14F;
 int calcutale(int x,int y);
}
//  class rectangle
// {
//    public float calculate(int x,int y){
//     return pi+x+y;
//    }
// }
 class abc //implements abc
{  
   public  float calculate(int x,int y){
    return x*y*pi;
   } 
}
class Demo{ 
    public static void main(String a[])
    {
       // rectangle ob=new rectangle();
        abc ob2=new abc();
        //System.out.println(ob.calculate(5,6));
        System.out.println(ob2.calculate(5,6));
    }

}
