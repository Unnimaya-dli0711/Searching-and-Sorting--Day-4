package Linkedlist;

import java.util.ArrayList;

public class MiddleNode {
    static  Node2 head;
    static class Node2 {
        int data;
        Node2 next;

        Node2(int new_data) {
            this.data = new_data;
            this.next = null;
        }
    }

    static int getMiddle(Node2 head) {

        ArrayList<Integer> listvalues = new ArrayList<>();
        while (head != null) {
            listvalues.add(head.data);
            head = head.next;
        }

        int middleindex = listvalues.size() / 2;
        return listvalues.get(middleindex);
    }

    public static void main(String[] args) {
        MiddleNode list = new MiddleNode();

        list.head = new Node2(1);
        list.head.next = new Node2(2);
        list.head.next.next =   new   Node2(3);
        list.head.next.next.next = new   Node2(4);
        list.head.next.next.next.next= new   Node2(5);
        System.out.println("Middle element is : "+getMiddle(head));
    }
}
