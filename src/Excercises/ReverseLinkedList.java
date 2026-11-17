package Excercises;

public class ReverseLinkedList {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        traversedLinkedList(head);
        traversedLinkedList(reversedLinkedList(head));
    }

    public static void traversedLinkedList(Node head) {
       // System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static Node reversedLinkedList(Node head) {
        System.out.print("Reversed Linked List: ");
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


//        System.out.println("Original Linked List:");
//        printList(head);
//
//        Node reversedHead = reverseLinkedList(head);
//
//        System.out.println("Reversed Linked List:");
//        printList(reversedHead);

}
