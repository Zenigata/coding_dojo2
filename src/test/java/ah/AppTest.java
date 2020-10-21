package ah;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void checkIfLeap() {
        assertEquals(true, App.isLeap(2000));
        assertEquals(false, App.isLeap(2001));
        assertEquals(true, App.isLeap(1600));
        assertEquals(false, App.isLeap(1800));
        assertEquals(true, App.isLeap(1720));
        assertEquals(false, App.isLeap(1725));
        assertEquals(true, App.isLeap(2008));
        assertEquals(false, App.isLeap(1700));
        assertEquals(false, App.isLeap(2100));
    }
}