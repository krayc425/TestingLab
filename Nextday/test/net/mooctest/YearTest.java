package net.mooctest;

import main.java.net.mooctest.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class YearTest {

    @Test
    public void testGetYear() {
        Year year = new Year(1999);
        assertEquals(1999, year.getYear());
    }

    @Test
    public void testIncrement() {
        Year year = new Year(1999);
        Year year1 = new Year(2000);
        year.increment();
        assertEquals(year, year1);

        Year year2 = new Year(-1);
        assertTrue(year2.increment());
        assertEquals(1, year2.getYear());
    }

    @Test
    public void testIsLeap() {
        Year year = new Year(1977);
        assertFalse(year.isLeap());
        Year year1 = new Year(1980);
        assertTrue(year1.isLeap());
        Year year2 = new Year(1900);
        assertFalse(year2.isLeap());
        Year year3 = new Year(2000);
        assertTrue(year3.isLeap());
    }

    @Test
    public void testEquals() {
        Year year = new Year(1999);
        Year year1 = new Year(2000);
        assertTrue(!year.equals(year1));
        year.increment();
        assertTrue(year.equals(year1));

        assertFalse(year.equals(new Integer(1)));
    }

}
