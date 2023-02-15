/**
 * Recursive implementation of a Linkedlist
 * @author Simon Losier
 * @email Simon@Simlo.tech
 */

public class RecLinkedList {
    String data;
    RecLinkedList next;

    public RecLinkedList getNext() {
        return next;
    }

    public RecLinkedList(String data) {
        this.data = data;
    }

    /**
     * Will calculate the length
     * @return int: Length of the LinkedList
     */
    int getLength() {
        if (next == null) {
            return 1;
        }
        return next.getLength()+1;
    }

    /**
     * Appends the element at the end of the list
     * @param data
     * @return boolean: if it was successful
     */
    boolean add(String data) {
        if (next == null) {
            next = new RecLinkedList(data);
            return true;
        }
        next.add(data);
        return true;
    }

    void prepend(String data) {
        RecLinkedList newNode = new RecLinkedList(this.data);
        newNode.next = next;
        this.data = data;
        next = newNode;
    }

    /**
     * Add element anywhere in the list
     * @return if it was successfull
     */
    boolean add(int i, String data) {
        if (i == 0) {
            prepend(data);
            return true;
        }
        return false;
    }
    /**
     * Will get the element at an index position.
     * @param i index
     * @return String of the data in the linkedList
     */
    String getElementData(int i) {
        if (i == 0) {
            return data;
        }
        return next.getElementData(i-1);
    }


}
