/**
 * 
 */
package Q1;

import java.util.Iterator;

/**
 * @author user
 *
 */
public class DequeImplementation {
	static String[] dequeStr = {"eclipse", "implmentation", "search", "user design", "deque"};

	/**
	 * @param args
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
