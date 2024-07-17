package Linkedlist;

import java.util.*;

public class implemention {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void InseratAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                // tail=temp;
            } else {

                tail.next = temp;
                // tail=temp;
            }
            tail = temp;

        }

        void InseratAtStart(int val) {
            Node temp = new Node(val);
            if (head == null) { // If the list is empty, set both head and tail to the new node.
                head = null;
                tail = null;
            } else { // If the list is not empty, insert the new node at the beginning.
                temp.next = head;
                head = temp;
            }

        }
        void InsertAtIndex(int idx, int val){
            Node t =  new Node(val);
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
           t.next=temp.next;
           temp.next=t;
        }
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteat(int idx){
            Node temp=head;
            for(int i =1;i<=idx-1;i++){
                temp=temp.next;

            }
            temp.next=temp.next.next;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        int size() {
            Node temp = head;
            int c = 0;
            while (temp != null) {
                c++;
                temp = temp.next;
            }

            return c;
        }

    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        
        ll.InseratAtEnd(3);//3
        ll.display();
        ll.InseratAtEnd(4);//3 ->4
        ll.display();
        ll.InseratAtEnd(5);//3 ->4->5
        ll.display();
        ll.InseratAtStart(2);//2->3 -> 4 -> 5
        ll.display();
        ll.InsertAtIndex(3,10);//2->3 -> 10-> 4-> 5
        ll.display();

       System.out.println( ll.getAt(2));
       ll.deleteat(3);
       ll.display();
         System.out.println(ll.size());
    }

}
