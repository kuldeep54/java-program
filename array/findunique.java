package array;

import java.util.Scanner;

// find unique no in a give array 
// 1 2 3 5 2 1 3
// unique is 4 
public class findunique {

static int findunique(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;

            }
        }
    }


    int ans=0;
    for(int i=0;i<n;i++){
        if(arr[i]!=-1){
            ans=arr[i];
        }
    }
    return ans;
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
  
                     

System.out.println( "unique element "+ findunique(arr));

 }
}
