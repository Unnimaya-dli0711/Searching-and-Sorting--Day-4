package Linkedlist;

public class CycleInList {
    static  Node1 head;

    static class Node1 {

        int data;
        Node1 next;

        Node1(int d)
        {
            data = d;
            next = null;
        }
    }

    static boolean checkCycle(Node1 head){
        Node1 fast=head;
        Node1 slow=head;
        while (slow!=null && fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                return true;
        }
        return false;
    }

    void printList( Node1 node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        CycleInList list = new CycleInList();

        list.head = new  Node1(1);
        list.head.next = new  Node1(2);

        list.head.next.next =   new Node1(3);
        Node1 cycle =head.next.next;
        System.out.println("hkg"+cycle.data);
        list.head.next.next.next = new  Node1(4);
        list.head.next.next.next.next=head;
 
        boolean result=checkCycle(head);
        System.out.println("Cycle present : " +result);
    }
}

