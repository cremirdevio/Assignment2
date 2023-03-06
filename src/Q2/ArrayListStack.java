/**
 * 
 */
package Q2;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * The ArrayListStack class is a simple implementation of a stack using an ArrayList.
 * It provides the basic functionality of a stack: push, pop, and peek.
 * 
 * @param <T> the type of the elements stored in this stack
 */
public class ArrayListStack<T> {
    
    /**
     * The underlying ArrayList used to store the elements of this stack.
     */
    private ArrayList<T> data;

    /**
     * Constructs an empty stack.
     */
    public ArrayListStack() {
        data = new ArrayList<>();
    }

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items; false otherwise.
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in this stack
     */
    public int size() {
        return data.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack
     */
    public void push(T item) {
        data.add(item);
    }

    /**
     * Removes the element at the top of this stack and returns that element.
     *
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.remove(data.size() - 1);
    }

    /**
     * Looks at the element at the top of this stack without removing it from the stack.
     *
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.get(data.size() - 1);
    }
}
