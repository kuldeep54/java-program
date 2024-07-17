public class stringrev { 

    static void rec(String s,int idx){
        if(idx==0){
            System.out.println(s.charAt(idx));
            return ;
        }

        System.out.println(s.charAt(idx));
        rec(s,idx-1);

    } 
    public static void main(String[] args) {
        String s ="asdfghj";
       rec(s,s.length()-1);
    }
}
