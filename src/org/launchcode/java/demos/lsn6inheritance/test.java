package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
