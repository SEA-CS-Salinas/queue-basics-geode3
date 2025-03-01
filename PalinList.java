//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Giovani Zuniga

/**
 * The PalinList class determines whether a given list of space-separated words
 * or numbers is a palindrome. It uses a queue and a stack to compare elements
 * from both ends of the list.
 */
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Arrays;

public class PalinList {
    private Queue<String> queue;
    private Stack<String> stack;

    /**
     * Default constructor that initializes the list to an empty string
     */
    public PalinList() {
        setList("");
    }

    /**
     * Constructor that initializes the list with a given string
     * @param list The space separated string that gets checked if is palindrome
     */
    public PalinList(String list) {
        setList(list);
    }

    /**
     * Sets the queue and stack with elements from the given list
     * @param list The space separated string whose elements will be added to the queue and stack
     */
    public void setList(String list) {
        queue = new LinkedList<>();
        stack = new Stack<>();
       
        String[] elements = list.split(" ");
        for (String element : elements) {
            queue.add(element);
            stack.push(element);
        }
    }

    /**
     * Checks whether the stored list is a palindrome
     * @return true if the list is a palindrome, false otherwise
     */
    public boolean isPalin() {
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a string representation of the queue
     * @return A string representation of the stored elements in the queue
     */
    public String toString() {
        return queue.toString();
    }
}
