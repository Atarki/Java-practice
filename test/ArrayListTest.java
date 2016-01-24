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
        assertEquals(15,result);
    }

    @Test
    public void testToString() throws Exception {

    }

    @Test
    public void testSize() throws Exception {
        Assert.assertEquals(15,list.size());
    }

    @Test
    public void testAdd1() throws Exception {

    }

    @Test
    public void testAdd2() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testRemove1() throws Exception {

    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testSet() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIndexOf() throws Exception {
        assertEquals(12,list.indexOf(12));

    }

    @Test
    public void testLastIndexOf() throws Exception {
        list.add(77);
        assertEquals(15,list.lastIndexOf(77));

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