import java.nio.file.ProviderMismatchException;

public class bubblesort {
  static   void bubble(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                  if(a[j]>a[j+1])
                  {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                  }
            }
        } }
        public static void main(String arg[]){
            int arr[]={3,5,3,7,9,32,5,4};
            bubble(arr);
            for(int i:arr)
            System.out.print(i +" ");
        }

    }

