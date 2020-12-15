package cn.dokky.OSTest;

public class Node {
    private PCB data;
    private Node next;

    public Node()
    {
        PCB data = new PCB();
        this.next = null;
    }
    public Node(PCB data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    public PCB getData() {
        return data;
    }

    public void setData(PCB data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
