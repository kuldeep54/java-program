package PW18;
 //Given an array of integers 'a', move all the even integers at the
// beginning of the array followed by all the odd integers. The
// relative order of odd or even integers does not matter. Return
// any array that satisfies the condition.
//  eg : 1 2 3 4 5 6 >>> 2 4 6 1 3 5 
import java.util.Scanner;
public class SortEvenAndOdd {
static void swap(int arr[],int i,int j){
    int t=arr[i];
    arr[i]=arr[j];
    arr[j]=t;
}
static void sortevemandodd(int arr[])
{int n=arr.length;
   int left=0; int right=n-1;
   while(left<right){
    if(arr[left]%2==1 && arr[right]%2==0)
    {
        swap( arr,left,right);
        
            left++;
            right--;
        
    }

    if(arr[left]%2==0){
        left++;
    }
    if(arr[right]%2==1){
        right--;
    }
   }


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

sortevemandodd(arr);
System.out.print("sorted array");
printarray(arr);
}
}