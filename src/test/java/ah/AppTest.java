package ah;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void checkIfLeap(){
        assertEquals (true, App.isLeap(2000));
    }
}
