public class printallsubstring {
    public static void main(String[] args) {
        String str="hello";
        for(int i=0;i<=4;i++){
            for(int j=i+1;j<=5;j++)
            {
                System.out.println(str.substring(i,j));
            }
        }

    }
}
