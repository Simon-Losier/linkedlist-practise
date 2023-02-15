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
}