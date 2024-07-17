import java.util.*;

public class substringpalindromiccount {

    public static void main(String[] args) {
        // checking palindrome or not
        // String str="abcdcba";

        // StringBuilder gtr=new StringBuilder(str);
        // gtr.reverse();
        // String s= gtr+ "";
        // int c=0;
        // if(str.equals(s)){

        // System.out.println("palindrom");}
        // else
        // { System.out.println("not palindrom");}

        /// other method for palindrom
        String str = "abcdcba";
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;// palindrome
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j++;
        }
        if (flag == true)
            System.out.println("palindrom");
        else
            System.out.println(" not palindrom");

    }

}
