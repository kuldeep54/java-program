package array;

public class reversearray {

    //reverse an array consting of intezer values
// 1 2 3 4 5----> 5 4 3 2 1
    // static   int [] reverseArray(int arr[]){
    //     int n=arr.length;
    //     int ans[]=new int[n];
    //     // int j=0; 
    //     // traverse original array in reverse direction
    //     // for(int i=n-1;i>=0;i--)
    //     // { 
    //     //     ans[j++]=arr[i];

    //     // }
    //     //
       
           
    //     // return ans;


    //      /// using while loop 
    //      int i=n-1; int j=0;
    //      while(i>=0){
    //         ans[j++]=arr[i--];
    //      }
    //      return ans;
    // }
 
 

    // / reversing array by swap method
    static void swapinarray(int arr[],int i, int j){
     int temp =arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
    }
    static void reverseArray(int arr[]){
        int i=0; int j= arr.length-1;
          while(i<j){
            swapinarray( arr ,i,j);
            i++;
            j--;
          }
    }
    static void printArray(int arr []){
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
 public static void main(String[] args) {
    int arr []={1,2,3,4,5};
    
    //reverse an array consting of intezer values
    // int ans[]=reverseArray(arr);
    //        printArray(ans);




// reversing array by swap method
    reverseArray(arr);
printArray(arr);

;
 }   
}
