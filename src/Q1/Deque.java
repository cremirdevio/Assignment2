package Q1;

import java.util.NoSuchElementException;

/**
 * Represents a double-ended queue (deque), which allows elements to be added and removed from both ends of the queue.
 * The deque is implemented using a doubly-linked list data structure.
 *
 * @param <T> the type of elements in the deque.
 */
public class Deque<T> {
	private int size;
    private Node<T> head;
    private Node<T> tail;

    /**
     * Represents a node in the doubly-linked list that implements the deque.
     *
     * @param <T> the type of the data stored in the node.
     */
    private static class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

	 /**
         * Constructs a new node with the specified data and links to the previous and next nodes in the list.
         *
         * @param data the data stored in the node.
         * @param prev the previous node in the list.
         * @param next the next node in the list.
         */
        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    /**
     * Constructs a new empty deque.
     */
    public Deque() {
        size = 0;
        head = null;
        tail = null;
    }

    /**
     * Checks whether the deque is empty.
     *
     * @return true if the deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
 
    /**
     * Returns the number of elements in the deque.
     *
     * @return the size of the deque.
     */
    public int size() {
        return size;
    }

    /**
     * Adds an element to the front of the deque.
     *
     * @param item the element to add.
     */
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item, null, head);
        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        size++;
    }

    /**
     * Adds an element to the end of the deque.
     *
     * @param item the element to add.
     */
    public void addLast(T item) {
        Node<T> newNode = new Node<>(item, tail, null);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

	
    /**
     * Removes and returns the first element of the deque.
     *
     * @return the first element of the deque.
     * @throws NoSuchElementException if the deque is empty.
     */
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T item = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return item;
    }

    /**
     * Removes and returns the last element of the deque.
     *
     * @return the last element of the deque.
     * @throws NoSuchElementException if the deque is empty.
     */
    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T item = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return item;
    }

    /**
     * Returns the first element of the deque.
     *
     * @return the first element of the deque.
     * @throws NoSuchElementException if the deque is empty.
     */
    public T peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

     /**
     * Returns the last element of the deque.
     *
     * @return the last element of the deque.
     * @throws NoSuchElementException if the deque is empty.
     */
    public T peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return tail.data;
    }

}
