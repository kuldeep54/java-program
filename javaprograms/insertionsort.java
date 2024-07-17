public class insertionsort
 {
static void insertsort(int ar[])
{  int n=ar.length;
    int i,j;
    for( i =1;i<n;i++){
     j=i;
    while( j> 0 && ar[j]<ar[j-1] ){
        int t=ar[j];
        ar[j]=ar[j-1];
        ar[j-1]=t;
        j--;
    }
}}
 public static void main(String a[]){
    int ar []={3,54,45,83,78};
    insertsort(ar);
    for(int  i:ar)
    { System.out.print(i+ " ");}
 }}