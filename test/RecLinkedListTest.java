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

}