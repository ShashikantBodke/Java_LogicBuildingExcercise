package Excercises;

public class Node {
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int data;
    Node next;

    public Node(int data) {
        super();
        this.data = data;
    }

}
