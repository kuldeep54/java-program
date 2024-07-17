public class k {
    static int kk(int p,int q)
    {
        if(q==0) return 1 ;
        return kk(q-1)*p ;
    }
    public static void main(String[] args) {
        System.out.println(kk(5,5));
    }
}
