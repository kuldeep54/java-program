import java.util.Scanner;

public class transpostmatrix { 
   
static void trans(int ar[][],int r,int c)
{ int a[][];
 for(int i=0;i<c;i++){
   
        for(int j=0;j<r;j++) 
        {   a [i][j]=ar[j][i];
        } 
}}
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int ar[][]=new int [r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++)
        { ar[i][j]=sc.nextInt();}
    } 
    int m[][]=trans (ar,r,c);
    System.out.println(m);
}