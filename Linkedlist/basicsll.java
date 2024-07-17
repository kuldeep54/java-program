package Linkedlist;

public class basicsll {
    // ###//### printing linked list using recursive function
    static void displayrecusivily(node head) {
        if (head == null)
            return;
        System.out.print(head.data);
        displayrecusivily(head.next);
    }

    // ### printing linked list using function
    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static int length(node head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }

    public static class node {

        public static void display(node head) {
            node temp = head;

        }

        int data; // value
        node next;// addresss of next node

        // constructor
        node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        node a = new node(5);
        // System.out.println(x1.next);
        node b = new node(3);
        node c = new node(9);
        node d = new node(8);
        node e = new node(16);
        // 5 3 9 8 16

        // connecting nodes with each other 5->3 ->9-> 8 ->16
        a.next = b; // 5->3 9 8 16
        b.next = c;// 5->3 ->9 8 16
        c.next = d;// 5->3 ->9 ->8 16
        d.next = e;// 5->3 ->9-> 8 ->16
        display(a);
        System.out.println();
        displayrecusivily(a);
        System.out.println();
        System.out.println(length(a));
        // System.out.println();
        // display(a);

        // System.out.println(a.next.data);//getting value of b using a
        // System.out.println(b.next.data);
        // System.out.println(c.next.data);
        // System.out.println(d.next.data);

        // //System.out.println(a);
        // System.out.println(a.next); address of b in node of a
        // // System.out.println(b);
        // System.out.println(c.next);
        // System.out.println(b.next);
        // //
        // System.out.println(d.next);
        // System.out.println(e.next);

        // ### Displaying linked list
        // System.out.println(a.data);// value of a
        // System.out.println(a.next.data);// value of b using a
        // System.out.println(a.next.next.data);// value of c using a
        // System.out.println(a.next.next.next.data);// value of d using a
        // System.out.println(a.next.next.next.next.data);// value of e using a

        // #### Displaying linked list using for loop
        // node temp=a;
        // for(int i=1;i<=5;i++){
        // System.out.print(temp.data+" ");
        // temp=temp.next;
        // }
        // // printing the list using while loop
        // node temp=a;
        // while(temp!=null){
        // System.out.print(temp.data+" ");
        // temp=temp.next;
        // }

    }
}
