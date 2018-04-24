package main.java.net.mooctest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MonthTest {

    @Test(expected = IllegalArgumentException.class)
    public void testSetMonth() {
        Year year = new Year(1995);
        Month month = new Month(12, year);
        month.setMonth(13, year);
    }

    @Test
    public void testSetMonth2() {
        Year year = new Year(1995);
        Month month = new Month(12, year);
        month.setMonth(3, year);
        assertEquals(month.getMonth(), 3);
    }

    @Test
    public void testIncrement() {
        Year year = new Year(1995);
        Month month = new Month(12, year);
        assertFalse(month.increment());
        month.setMonth(3, year);
        assertTrue(month.increment());
    }

    @Test
    public void testGetMonthSize() {
        Year year = new Year(1980);
        Month month = new Month(2, year);
        assertEquals(29, month.getMonthSize());
        month.increment();
        assertEquals(31, month.getMonthSize());

        Year year2 = new Year(1981);
        month.setMonth(2, year2);
        assertEquals(month.getMonthSize(), 28);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid() {
        Year year = new Year(1999);
        Month month = new Month(13, year);
        assertFalse(month.isValid());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid2() {
        Year year = new Year(0);
        Month month = new Month(3, year);
        assertFalse(month.isValid());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValid3() {
        Year year = null;
        Month month = new Month(3, year);
        assertFalse(month.isValid());
    }

    @Test
    public void testIsValid4() {
        Year year = new Year(1999);
        Month month = new Month(12, year);
        assertTrue(month.isValid());
    }

    @Test
    public void testEquals() {
        Year year = new Year(1999);
        Month month = new Month(3, year);

        Year year1 = new Year(1999);
        Month month1 = new Month(2, year1);

        assertTrue(!month.equals(month1));

        month1.increment();

        assertTrue(month.equals(month1));
    }

}
