package Excercises;

public class LinkedListRunner {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        travereseLinkedList(head);
    }

    public static void travereseLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData()+" ");
            current = current.next;
        }

    }
}
