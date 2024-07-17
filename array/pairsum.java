package array;

import java.util.Scanner;

// find the total no of pairs in the array whose sum is equal to the given value 
// 4 6 3 5 8 2 
//target =7  ans=2 (4,3) (5,3)
public class pairsum {
  static int pairsum(int arr[],int target ){
    int ans =0;
    int n=arr.length;
    for(int i=0;i<n;i++) // for first no 
    {    for(int j=i+1;j<n;j++){  // second no 
         if(arr[i]+arr[j]==target){
       ans ++;
                 }
    } }
    return ans ;
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

System.out.print  ("  enter the target sum ");
int target=sc.nextInt();
System.out.println(pairsum(arr,  target));


    }
}
