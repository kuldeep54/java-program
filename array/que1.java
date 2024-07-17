package array;


import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class que1 {
// SMALLESDT AND LARGEST ELEMENT IN ARRAY
static int []  smallestandlargest(int arr[]){
    Arrays.sort(arr);
   int ans []={arr[0],arr[arr.length-1]};
   return ans;
}



// static void  smallestandlargest(int arr[]){
//     Arrays.sort(arr);
//     for(int i=0; i<arr.length;i++)
// {
//     System.out.println(arr[i]);
//        }
//      }



//check if the given array is sorted or not 
// i th  element <(i-1) th element  1 5 6 7 (sorted)
// static boolean isSorted (int arr[]){ 
//     boolean check=true;
//     for(int i=1;i<arr.length;i++){
//         if(arr[i]< arr[i-1]){
//             // not true 
//             check =false;
//         }
//     }
//     return  check ;

// }

// find last occurancere of element x in array
// static int lastoccurance(int arr[],int x){
//     int lastindex=-1;
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==x){
//             lastindex=i;
//         }
//     }
//     return lastindex ;
// }

//     // cout the no of coourance of a paricular element x 
//     static int countOccurance(int arr[],int x){
//         int count =0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x){
//                 count++;
//             }
//         }
//         return count ;
//     }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();

        int arr []=new int[n];
        System.out.println("enter "+ n +" elements: ");
       for(int i=0;i<arr.length;i++)
       {
         arr[i]=sc.nextInt();
                      }  

                    //   System.out.println("enter the x ");
                    //   int x=sc.nextInt();

    // System.out.println("count x "+  countOccurance(arr, x));
    // System.out.println("last occurance of  x "+  lastoccurance(arr, x));
  ///  System.out.println(" is sorted "+ isSorted(arr));
// smallestandlargest(arr);
 int [] ans =smallestandlargest(arr);
System.out.println("smallest"+ ans[0]);
System.out.println("greatest"+ ans[1]);
      }
   }
