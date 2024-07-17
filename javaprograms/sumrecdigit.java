public class sumrecdigit {
    static int sumdig(int n)
    {
        if((n>=0)&&(n<=9))
        {return n;
    }
    return sumdig(n/10)+sumdig(n%10);
    

}
public static void main(String[] args) {
    System.out.print(sumdig(1));
}
}