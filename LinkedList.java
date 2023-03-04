public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }


    }
    public static void PrintLL(Node headnode){
        Node temp=headnode;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }

    public  Node insertAtLast(Node head,int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head=newnode;
        return head;
    }
}
