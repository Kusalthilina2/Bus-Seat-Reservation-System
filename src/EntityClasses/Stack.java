package EntityClasses;

import java.util.LinkedList;
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Adds an element to the top of the stack
    public void push(T element) {
        list.addFirst(element);
    }

    // Removes and returns the element from the top of the stack
    public T pop() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.removeFirst();
    }

    // Returns the element at the top of the stack without removing it
    public T peek() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getFirst();
    }

    // Returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the number of elements in the stack
    public int size() {
        return list.size();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
