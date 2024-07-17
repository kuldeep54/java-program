
/// circular  queue linklist
public class circularqueuelinkedlist {
          public static  class Node{
         int data;
         Node next;
         Node( int data){
             this.data=data;
         }
     } 
    public static class  queuell{
         Node head=null;
         Node tail=null;
         int size=0;
         void push(int val){
             Node temp = new Node(val);
             if(size==0){
                 head=tail=temp;
 
         }
         else{
             tail.next=temp;
             tail=temp;
 
         }
         
            tail.next=head;
            
         
         size++;
     }
     public  int remove(){
         if(size==0){
             System.out.println("queue empty");
             return -1;
         }
         int x=head.data;
         head=head.next;
         tail.next=head;
         size--;
         return x;
     }
 
     public int peek (){
         if(size==0){
             System.out.println("queue empty");
             return -1;
         }
         return head.data;
     }
 
         public void display(){
         if(size==0){
             System.out.println("queue empty");
             return ;
         }
         Node temp=head;
         do{
         
            System.out.print(temp.data+" ");
             temp=temp.next;
         } while(temp!=head);
           
         System.out.println();
        }
    }

     public static void main(String[] args) {
         queuell q =new queuell();
      q.push(1);
      q.push(2);
      q.push(3);
      q.push(4);
       q.display();
        System.out.println(q.peek());
         q.remove();
         q.display();
     }
 }
