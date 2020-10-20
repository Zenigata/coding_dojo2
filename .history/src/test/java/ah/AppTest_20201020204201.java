package ah;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }
    
    @Test
    public void checkIfLeap(){
        assertEquals (true, LeapYear.isLeap(2000));
    }
}
