 class rec {
    static int rec(int n)
    {
        if(n==0)
      { return 1;}
      return n*rec(n-1);
        //
    }
    public static void main(String[] args) {
       System.out.print( rec(5));
    }
}
