import org.example.Exception.InvalidIndexException;
import org.example.Exception.NullItemException;
import org.example.Exception.StorageIsFullException;
import org.example.StringListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringListImplTest {

    @Test
    void add_validItem_success() {
        StringListImpl stringList = new StringListImpl();
        String item = "Test";
        assertEquals(item, stringList.add(item));
    }

    @Test
    void add_nullItem_throwNullItemException() {
        StringListImpl stringList = new StringListImpl();
        assertThrows(NullItemException.class, () -> stringList.add(null));
    }

    @Test
    void add_fullStorage_throwStorageIsFullException() {
        StringListImpl stringList = new StringListImpl(1);
        stringList.add("Test");
        assertThrows(StorageIsFullException.class, () -> stringList.add("Test2"));
    }


    @Test
    void add_invalidIndex_throwInvalidIndexException() {
        StringListImpl stringList = new StringListImpl();
        assertThrows(InvalidIndexException.class, () -> stringList.add(1, "Test"));
    }

    @Test
    public void testAdd() {
        StringListImpl list = new StringListImpl();

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        assertEquals(3, list.size());
    }

    @Test
    public void testContains() {
        StringListImpl list = new StringListImpl();

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        assertTrue(list.contains("banana"));
        assertFalse(list.contains("grape"));
    }

    @Test
    public void testIndexOf() {
        StringListImpl list = new StringListImpl();

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        assertEquals(1, list.indexOf("banana"));
        assertEquals(-1, list.indexOf("grape"));
    }

}
