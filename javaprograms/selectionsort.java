public class selectionsort {
    static void selection(int ar[])
    { int n=ar.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[j]<ar[min_index])
                {
                    int t=ar[j];
                    ar[j]=ar[min_index];
                    ar[min_index]=t;
                }
            }
        }
        
    }

public static void main(String arg[])
{ int arr[]={1,5,6,7,9,3};
selection(arr);
for(int i:arr){
    System.out.println(i + " ");
}
} }