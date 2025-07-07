package com.library;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void testAppLoads() {
        App.main(null);  // just to see it runs without exception
        assertTrue(true); // dummy assertion
    }
}
