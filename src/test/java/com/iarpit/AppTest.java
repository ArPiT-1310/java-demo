package com.iarpit;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-1, App.add(2, -3));
    }
}
