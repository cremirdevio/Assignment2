/**

This class provides an example usage of the Deque class to implement a deque with a string array of predetermined values.
It adds all elements of the array to the deque, removes the last item and then prints all the remaining items in the deque in reverse order.
@author user


Test cases:
When adding elements to the deque using addFirst() and addLast(), the size of the deque should increase by 1 each time.
When removing elements from the deque using removeFirst() and removeLast(), the size of the deque should decrease by 1 each time.
When peeking at the first or last element of the deque using peekFirst() or peekLast(), the element returned should match the expected value.
When attempting to remove an element from an empty deque, a NoSuchElementException should be thrown.
To run the test cases, create a new Deque object and call the necessary methods with expected input and assert the output using JUnit or any other testing framework.
*/
package Q1;

import java.util.Iterator;

/**
 * This class demonstrates how to use the Deque class to implement a stack.
 */
public class DequeImplementation {
	/**
     * An array of strings to be added to the Deque.
     */
	static String[] dequeStr = {"eclipse", "implmentation", "search", "user design", "deque"};

    /**
     * The main method of the class. It creates a Deque, adds the elements of
     * the dequeStr array to it, removes the last element, and prints the
     * remaining elements in the deque in reverse order.
     * 
     * @param args the command line arguments (not used)
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> myQueue = new Deque<String>();
		
		for (int i = 0; i < dequeStr.length; i++) {
			myQueue.addFirst(dequeStr[i]);
		}
		
		// Remove item from the queue
		myQueue.removeLast();
		
		// Print all elements in the list
		while (myQueue.size() > 0) {
			System.out.println(myQueue.peekLast());
			myQueue.removeLast();
		}
	}

}
