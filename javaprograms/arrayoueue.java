/// queue using array 
public class arrayoueue {
     public  static class queueA{ 
        int r =-1;
       int  f=-1;
       int ar[]=new int [5];
       int size=0;
       void add(int val){
        if(r==ar.length-1){
            System.out.println("queue is full");
            return ;
        }
        if(f==-1){ 
            f=r=0;
        ar[0]=val; }

        else {
        ar[++r]=val;
    }
        size++;
        
       }
       public int remove(){
        if(size== 0){
            System.out.println("oueue is empty");
            return -1;
        }
        
        
        size--;
        return ar[f++];
      
       }
        public int  peek(){
        if(size==0){
            System.out.println("oueue is empty");
            return -1;
        }
        
        return ar[f] ;
       }

        void display(){
          if(size==0){
       System.out.println("empty");
           } else 
         for(int i=f;i<=r;i++)
    {
        System.out.print(ar[i]+" ");
    }
System.out.println();
   }

    }
    public static void main(String[] args) {
        queueA q=  new queueA ();
       
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.display();
q.remove();
q.display();
System.out.println(q.peek());

    }
}
