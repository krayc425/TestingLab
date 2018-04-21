package net.mooctest;

import main.java.net.mooctest.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DayTest {

    @Test
    public void testIncrement() {
        Year year = new Year(1995);
        Month month = new Month(4, year);
        Day day = new Day(30, month);
        assertTrue(!day.increment());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDay() {
        Year year = new Year(1995);
        Month month = new Month(4, year);
        Day day = new Day(30, month);
        day.setDay(31, month);
    }

    @Test
    public void testGetDay() {
        Year year = new Year(1995);
        Month month = new Month(4, year);
        Day day = new Day(29, month);
        day.increment();
        assertEquals(30, day.getDay());
    }

    @Test
    public void testIsValid() {
        Year year = new Year(1995);
        Month month = new Month(4, year);
        Day day = new Day(29, month);
        assertTrue(day.isValid());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid2() {
        Year year = new Year(1995);
        Month month = new Month(4, year);
        Day day = new Day(31, month);
        assertTrue(!day.isValid());
    }

    @Test
    public void testEquals() {
        Year year = new Year(1995);
        Month month = new Month(4, year);
        Day day = new Day(29, month);
        day.increment();

        Year year2 = new Year(1995);
        Month month2 = new Month(4, year2);
        Day day2 = new Day(30, month2);

        assertEquals(day, day2);
    }

}
