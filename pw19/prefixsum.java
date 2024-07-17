package pw19;
// Given an integer array 'a', return the prefix sum/running sum in the same array without
// creating a new array.
//a[2 1 3 4 5] input 
//p[2 36 10 15] output
import java.util.Scanner;

public class prefixsum {
    static void printarray(int arr[])
{ int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");

    }
    System.out.println();
}// without new array
static int[] makeprefixsum(int arr[]){
    int n=arr.length;
    for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];

    }
return arr;}

// static int[] makeprefixsum(int arr[]){
//      int n=arr.length;
//      int pref[]=new int[n];
//      pref[0]=arr[0];
//      for(int i=1;i<n;i++){
//         pref[i]=pref[i-1]+arr[i];
//      }

//      return pref;

// }

     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print(" enter size of array ");
        int n=sc.nextInt();

        int arr []=new int[n];
        System.out.print ("enter "+ n +" elements: ");
       for(int i=0;i<n;i++)
       {
         arr[i]=sc.nextInt();
                      }   
        System.out.println("input array");
        printarray(arr);
        int pref[]=makeprefixsum(arr);
        System.out.print("prifix sum is:= ");
        printarray(pref);

        
}
}