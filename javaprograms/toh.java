public class toh {
    static void TOWER( int n, String s,String h, String d  ){
           if(n==1){
            System.out.println("transfer disk"+ n+"from "+s+"to"+d);
            return ;
                }  
                  TOWER(n-1,s,d,h);
                System.out.println("transfer disk"+ n+"from "+s+"to"+d);
                    TOWER(n-1,h,s,d);
     }
    public static void main(String[] args) {
        int n =4;
        TOWER(n,"s","H","D");
        
    }}
    

