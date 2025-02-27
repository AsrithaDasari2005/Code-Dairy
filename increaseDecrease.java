import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head, tail;
    LinkedList() {
        this.head = null;
        this.tail = null;
    }
    void push(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }
}

public class Main {
    public static int userLogic(LinkedList linkedList) {
        // Implement your logic here
        if(linkedList.head == null || linkedList.head.next == null) return 1;
        Node curr=linkedList.head;
        boolean increasing=curr.data < curr.next.data;
        while(curr.next != null && curr.next.next!=null){
            if( increasing && curr.data>=curr.next.data  ||  
                !increasing && curr.data<=curr.next.data ){
                return 0;
            }
            increasing = !increasing;
            curr = curr.next;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            ll.push(sc.nextInt());
        }
        int result = userLogic(ll);
        System.out.println(result);
    }
}
