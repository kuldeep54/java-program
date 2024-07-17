package array;

import java.util.Scanner;

public class secondlargest {
// finding max no 
static int findmax(int arr[]){
    int mx=Integer.MIN_VALUE; // takinf maximun no as - infinity
    for(int i=0;i<arr.length;i++){

if(arr[i]>mx){
    mx=arr[i];
}

}
return mx;  }

static int findsecondmax(int arr[]){
    int mx=findmax(arr);

     // Reset the array elements that are equal to the maximum value
    for(int i=0;i<arr.length;i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;
        }
    }
// Find the second maximum value using the modified array
int secondmax=findmax(arr);
 return secondmax;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter size of array ");
        int n=sc.nextInt();

        int arr []=new int[n];
        System.out.print ("enter "+ n +" elements: ");
       for(int i=0;i<arr.length;i++)
       {
         arr[i]=sc.nextInt();
      
      }

System.out.println("second maximun element "+ findsecondmax(arr));


}
}