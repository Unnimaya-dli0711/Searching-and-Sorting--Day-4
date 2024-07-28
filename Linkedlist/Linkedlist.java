package Linkedlist;

public class Linkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete() {
        head = head.next;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linkedlist linkedlist=new Linkedlist();
        linkedlist.addNode(1);
        linkedlist.addNode(2);
        linkedlist.addNode(3);
        linkedlist.addNode(4);
        linkedlist.addNode(5);
        linkedlist.addNode(6);
        linkedlist.delete();
        linkedlist.delete();
        linkedlist.addNode(7);
        linkedlist.addNode(8);
        linkedlist.display();
    }
}