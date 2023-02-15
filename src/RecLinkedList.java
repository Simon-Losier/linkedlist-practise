/**
 * Recursive implementation of a Linkedlist
 *
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
    int getLength() {
        if (next == null) {
            return 1;
        }
        return next.getLength()+1;
    }
    boolean add(String data) {
        if (next == null) {
            next = new RecLinkedList(data);
            return true;
        }
        next.add(data);
        return true;
    }

    /**
     * Will get the element at an index position.
     * @param i index
     * @return String of the data in the linkedList
     */
    String getElementData(int i) {
        return "";
    }
}
