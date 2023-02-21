/**
 * 
 */
package Q2;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * @author user
 *
 */
public class ArrayListStack<T> {
    private ArrayList<T> data;

    public ArrayListStack() {
        data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    public void push(T item) {
        data.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.remove(data.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.get(data.size() - 1);
    }
}