import java.util.LinkedList;
public class RmnthnodeEnd{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void deleteNthnodefromEnd(int n){
        // size calculation
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        //edge case if n is 0
        if(n==size){
            head = head.next;
            return;
        }
        //else case
        int i=1;
        int iTofind = size-n;
        Node prev=head;
        while(i<iTofind){
            prev = prev.next;
            i++;
        }
        //linking the nth node prev next to nth node next
        prev.next = prev.next.next;
    }
    public static void main(String [] args){
        LinkedList l1=new LinkedList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        tail = head.next;
        printList();
        deleteNthnodefromEnd(1);
        printList();
    }
    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    

}
