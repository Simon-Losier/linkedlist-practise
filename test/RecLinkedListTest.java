import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecLinkedListTest {
    @Test
    void add() {
        RecLinkedList list = new RecLinkedList("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        assertEquals(5,list.getLength(), "List should be length of 5 :("); // Test with length
        // Test with getElement
    }
    @Test
    void getElementData() {
        RecLinkedList list = new RecLinkedList("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        boolean test = "0".equals(list.getElementData(0));
        assertTrue(test, "Does not return the correct element");
        test ="3".equals(list.getElementData(3));
        assertTrue(test, "Does not return the correct element");
        test ="4".equals(list.getElementData(4));
        assertTrue(test, "Does not return the correct element");
    }
    @Test
    void prepend() {
        RecLinkedList list = new RecLinkedList("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.prepend("0");
        boolean test = "0".equals(list.getElementData(0));
    }
    @Test
    void add_atIndex() {
        RecLinkedList list = new RecLinkedList("0");
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add(2, "2");
        list.add(0, "10");
        assertEquals("2", list.getElementData(3), "Did not return correct element");
        assertEquals("10", list.getElementData(0), "Did not return correct element");
    }
    @Test
    void remove_atIndex() {
        RecLinkedList list = new RecLinkedList("0");
        list.add("1");
        list.add("remove");
        list.add("2");
        list.add("3");
        list.remove(2);
        assertEquals("2", list.getElementData(2), "Did not remove :(");
        list.remove(0);
        assertEquals("1", list.getElementData(0), "Did not remove first element :(");
    }
    @Test
    void remove_String() {
        RecLinkedList list = new RecLinkedList("0");
        list.add("1");
        list.add("remove");
        list.add("2");
        list.add("3");
        list.remove("remove");
        list.remove("0");
        assertEquals("1", list.getElementData(0), "Did not remove element");
        assertEquals("2", list.getElementData(1), "Did not remove element :(");
    }

}