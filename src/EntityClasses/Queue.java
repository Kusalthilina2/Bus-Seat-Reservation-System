package EntityClasses;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Adds an element to the end of the queue
    public void enqueue(T element) {
        list.addLast(element);
    }

    // Removes and returns the element from the front of the queue
    public T dequeue() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Returns the element at the front of the queue without removing it
    public T peek() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.getFirst();
    }

    // Returns true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the number of elements in the queue
    public int size() {
        return list.size();
    }
}
