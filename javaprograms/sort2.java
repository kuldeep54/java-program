public class sort2 { 
   static void selec(String  ar[]){
        int n=ar.length;
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if((ar[j]).compareTo(ar[min_index])<0)
                {       min_index=j;    
                
                }
            }
            
                 String t=ar[i];
                 ar[i]=ar[min_index];
                 ar[min_index]=t; 
                
                
                
        }
  }

public static void main(String[] args) {
    String arr[]={"apple","mango","kivi","pineapple"};
        selec(arr);
        for(String i:arr){
            System.out.println(i);
        }
        
    }}
        
   

