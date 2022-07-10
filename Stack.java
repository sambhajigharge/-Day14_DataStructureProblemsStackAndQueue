package DataStructure.StackAndQueue;

public class Stack {
    StackLinkedList linkedList = new StackLinkedList();

    public void push(Object data) {
        linkedList.addFirst(data);
    }

    public void pop() {
        while (linkedList.head != null)
            linkedList.deleteFirst();
    }

    public void displayStack() {
        linkedList.display();
    }
    
}