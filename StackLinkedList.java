package DataStructure.StackAndQueue;

import java.util.Scanner;

public class StackLinkedList {
    Scanner scanner = new Scanner(System.in);

    Node head;

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        if (head == null)
            System.out.println("No elements to display");
        else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    //@Purpose : Ability to create Linked List by appending 30 and 70 to 56 Node
    //with data 56 is First Created
    //Param :Next Append 30 to 56 Finally Append 70 to 30 LinkedList Sequence:
    // 56->30->70

    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else if (head.next == null)
            head.next = newNode;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addMiddle(Object data, Object data1) {
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.data != data1) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null)
            System.out.println("No elements present to delete");
        else
            head = head.next;
    }

    public void deleteLast() {
        if (head == null)
            System.out.println("No elements present to delete");
        else if (head.next == null)
            head = null;
        else {
            Node temp = head;// creating temp object assigning head to it
            while (temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
    }

    public void searchElement(Object data) {
        byte flag = 0;
        if (head == null)
            System.out.println("No elements present to search");
        else {
            Node temp = head;
            while (temp != null) {
                if (data.equals(temp.data)) {
                    flag = 1;
                    System.out.println(data + " is present in linked list");
                    break;
                }
                temp = temp.next;
            }
            if (flag == 0)
                System.out.println(data + " is absent in linked list");
        }
    }

    public void deleteElement(Object data) {
        if (head == null)
            System.out.println("Linked list is empty so cant delete");
        else if (head.data == data) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.data != data) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    //Purpose : Calculating size of Linked list

    public int getSize() {
        int count = 0;
        if (head == null)
            return count;
        else {
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            System.out.println("Size is " + count);
            return count;
        }
    }
}


