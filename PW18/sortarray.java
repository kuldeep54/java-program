package PW18;
//Sort an Array consisting of only O  and 1 .
// eg : 1 0 1  0 1 0 1 0 1 0
/// 00000111111 
import java.util.Scanner;

public class sortarray
 {
   
  static void printarray(int arr[])
  { int n=arr.length;
      for(int i=0;i<n;i++){
          System.out.print(arr[i] + " ");
  
      }
      System.out.println();
  }
static void swap(int arr[],int i,int j){
  int temp=arr[i];
  arr[i]=arr[j];
  arr[j]=temp;
}

// in single traverse
static void sortzeroandone(int arr[]){
  int n=arr.length;
  int left=0;
   int right =n-1;
   while(left<right){
    if(arr[left]==1 && arr[right]==0  )
    {
      swap(arr, left, right);
      left++;
      right--;
    }
    if(arr[left]==0){
      left++;
     }
     if(arr[right]==1){
      right--;
     }
  
   }
   
  
}

// in two traverse
// static void sortzeroandone(int arr[]){
//   int n=arr.length;
//   int zeroes=0;
//   // count no of zeroes 
//   for(int i=0;i<n;i++){
//     if(arr[i]==0){
//       zeroes++;
//     }
//   }
//   // o to zeroes -1 :0  , zeroes to n-1:1
//   for(int i=0;i<n;i++){
//     if(i<zeroes){
//       arr[i]=0;
//     }
//     else{
//       arr[i]=1;
//     }
//   }
// }
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

sortzeroandone(arr);
System.out.print("sorted array");
printarray(arr);


}
 }
