package DataStructure.StackAndQueue;

public class Queue {
    StackLinkedList linkedList = new StackLinkedList();

    public void enqueue(Object data) {
        linkedList.addLast(data);
        displayQueue();
    }

    public void deque() {
        linkedList.deleteFirst();
        displayQueue();
    }

    public void displayQueue() {
        linkedList.display();
    }
}
