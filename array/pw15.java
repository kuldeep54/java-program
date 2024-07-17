package array;

import java .util.*;
public class pw15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // taking input in array
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr []=new int[n];
        System.out.println("enter "+ n+"elements");
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}  
 
for(int i=0;i<n;i++){
    System.out.print(  arr[i]+ " ");
    
}  


// trying to copt arr to arr_2
int arr_2 []=arr;
System.out.println("array2 ");
for(int i=0;i<n;i++){
    System.out.print(arr_2[i]+ " ");
    
}  

    }
}
