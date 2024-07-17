
public class misproblems {

// //reverse an array consting of intezer values
// // 1 2 3 4 5----> 5 4 3 2 1
// static int  [] reverseArray (int arr[]){
//      int n=arr.length;
//      int ans[]=new int [n];
// int j=0;
// // traverse original array in reverse direction
// for(int i=n-1;i>=0;i--){
//     arr[j++]=arr[i];
// }
// return ans;

// }

  // swap using sum and difreence
static void swapwithouttemp(int a,int b){
    System.out.println("original values");
        System.out.println(" a "+  a);
        System.out.println(" b "+ b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap values");
        System.out.println( " a "+ a); 
        System.out.println(" b "+ b);
}

    //swap using temporary variable
    //a=9, b=3
    static void swap(int a,int b){
        System.out.println("original values");
        System.out.println(" a "+  a);
        System.out.println(" b "+ b);
        int temp=a;// temp =9
        a=b; //a=3
        b=temp;//b=9 
        System.out.println("after swap values");
        System.out.println( " a "+ a);
        System.out.println(" b "+ b);
    }
    static void printArray(int arr []){
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
         int a=9;;
         int b=3;
        int arr []={1,2,3,4,5};
// int ans[]=reverseArray(arr);
        printArray(ans);
        swap(a, b);
        swapwithouttemp(a, b);
    }
}
