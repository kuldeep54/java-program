
public class palindrom {
    public static void main(String[] args) {
        String text = "aba";
        int i = 0;
        int j = text.length() - 1;
        boolean flag = true;// palindrome
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag == true) {
            System.out.println("palindrom");
        } else {
            System.out.println(" not palindrom");
        }

    }
}