package PW18;

import java.util.Scanner;

// Given an integer array 'a' sorted in non-decreasing
// order, return an array of the squares of each number
// sorted in non-decreasing order.
// -10 -3  -2 -1 4 5 ==>>> 1 4 9 16 25 100
public class sortarray2 {
      static void swap(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;

      }

static void reverse(int arr[]){
  int i=0; int j=arr.length;
  while(i<j){
    swap(arr, i, j);
    i++;
    j--;
  }
  
}

public int [] sortsquare(int arr[]){
int n=arr.length;
  int left=0; int right=n-1;
  int ans[]=new int [n];
  int k=0;
  while (left<=right) {
    if(Math.abs(arr[left])<Math.abs(arr[right]))
    {
     ans[k++]=arr[left]*arr[left];
     left++;
    }
    else{
      ans[k++]=arr[right]*arr[right];
      right--;
    }
  }
  return ans;
}
static void printarray(int arr[])
{ int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");

    }
    System.out.println();
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
                      
System.out.print("original array");
printarray(arr);
int ans[]=sortsquare(arr); 

System.out.print("sorted array");
reverse(ans);
 printarray(ans);


}}
