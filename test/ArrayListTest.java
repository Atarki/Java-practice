import Collections.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayListTest {

    private ArrayList list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
    }

    @Test
    public void testAdd() throws Exception {
        list.add(15, 0);
        int result = (int) list.get(0);
        assertEquals(15, result);
    }

    @Test
    public void testSize() throws Exception {
        Assert.assertEquals(15, list.size());
    }

    @Test
    public void testAdd1() throws Exception {
        list.add(88);
        assertEquals(88, list.get(list.size() - 1));

    }

    @Test
    public void testAdd2() throws Exception {
        list.add(77, 14);
        assertEquals(77, list.get(14));
    }

    @Test
    public void testRemove() throws Exception {
        list.remove(0);
        assertEquals(14, list.size());
    }

    @Test
    public void testRemove1() throws Exception {
        list.add("155", 3);
        list.remove("155");
        assertEquals(15, list.size());
    }

    @Test
    public void testGet() throws Exception {
        list.add("155", 3);
        assertEquals("155", list.get(3));
    }

    @Test
    public void testSet() throws Exception {
        list.set("777", 10);
        assertEquals("777", list.get(10));
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIndexOf() throws Exception {
        assertEquals(12, list.indexOf(12));

    }

    @Test
    public void testLastIndexOf() throws Exception {
        list.add(77);
        assertEquals(15, list.lastIndexOf(77));

    }

    @Test
    public void testClear() throws Exception {
        list.clear();
        assertEquals(0, list.size());

    }

    @Test
    public void testContains() throws Exception {
        assertTrue(list.contains(1));
    }
}