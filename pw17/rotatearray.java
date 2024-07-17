import java.util.Scanner;
///rotate the array by 'k' steps
public class rotatearray {
 
static int [] rotateArray(int arr[],int k){
int n=arr.length;
k=k%n; int j=0;
int [] ans =new int[n];
for(int i=n-k;i<n;i++){
    ans[j++]=arr[i];
}
for(int  i=0; i< n-k;i++){
    ans[j++]=arr[i];
}
return  ans;
}
static void printArray(int arr []){
        
    for(int i=0;i<arr.length;i++){
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
   System.out.println("enter the k :- ");
   int k=sc.nextInt();
   System.out.println("original array");
   printArray(arr);

   int ans[]=rotateArray(arr,k);
   System.out.println(" array after rotation");
printArray(ans);
    }

}
