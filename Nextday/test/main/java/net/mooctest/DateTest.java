package main.java.net.mooctest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateTest {

    @Test
    public void testPrintDate() {
        Date date = new Date(4, 25, 1996);
        date.printDate();
    }

    @Test
    public void testIncrement() {
        Date date = new Date(4, 25, 1996);
        Date date1 = new Date(4, 26, 1996);
        assertFalse(date.equals(date1));
        date.increment();
        assertTrue(date.equals(date1));
        date.increment();
        date.increment();
        date.increment();
        date.increment();
        date.increment();
        assertEquals("5/1/1996", date.toString());
        Date date2 = new Date(12,31,2000);
        date2.increment();
    }

    @Test
    public void testGetDay() {
        Date date = new Date(4, 25, 1996);
        Year year = new Year(1996);
        Month month = new Month(4, year);
        Day day = new Day(25, month);
        assertEquals(day, date.getDay());
        day.increment();
        date.increment();
        assertEquals(day, date.getDay());
    }

    @Test
    public void testGetMonth() {
        Date date = new Date(4, 25, 1996);
        Year year = new Year(1996);
        Month month = new Month(4, year);
        assertEquals(month, date.getMonth());
        date.increment();
        assertEquals(month, date.getMonth());
    }

    @Test
    public void testGetYear() {
        Date date = new Date(4, 25, 1996);
        Year year = new Year(1996);
        assertEquals(year, date.getYear());
        date.increment();
        assertEquals(year, date.getYear());
    }

    @Test
    public void testToString() {
        Date date = new Date(4, 25, 1996);
        assertEquals("4/25/1996", date.toString());
    }

    @Test
    public void testEquals() {
        Date date = new Date(4, 25, 1996);
        Date date1 = new Date(4, 26, 1996);
        date.increment();
        assertTrue(date.equals(date1));
        assertFalse(date.equals(new Integer(1)));
    }

}
