package main.java.net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class IntegerBloomFilterTest {


    @Test
    public void test00() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(0.0, (-418));
        integerBloomFilter0.getExpectedFalsePositiveProbability();
        integerBloomFilter0.clear();
        integerBloomFilter0.getCurrentFalsePositiveProbability();
        integerBloomFilter0.clear();
    }

//    @Test
//    public void test01() throws Throwable {
//        Random.setNextRandom(1);
//        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(1, 1, 1);
//        integerBloomFilter0.add(1183);
//        integerBloomFilter0.getExpectedFalsePositiveProbability();
//        integerBloomFilter0.add(1175);
//        integerBloomFilter0.add(1369);
//        integerBloomFilter0.add((-709));
//        integerBloomFilter0.clear();
//        integerBloomFilter0.add((-447));
//        integerBloomFilter0.clear();
//        Random.setNextRandom((-1));
//        integerBloomFilter0.getExpectedFalsePositiveProbability();
//        integerBloomFilter0.contains(1210);
//        Random.setNextRandom(1205);
//        Random.setNextRandom((-953));
//        integerBloomFilter0.getExpectedFalsePositiveProbability();
//        integerBloomFilter0.clear();
//        integerBloomFilter0.contains((-709));
//        integerBloomFilter0.clear();
//        integerBloomFilter0.contains((-1));
//        integerBloomFilter0.contains(1205);
//        integerBloomFilter0.getFilterSize();
//        integerBloomFilter0.getExpectedFalsePositiveProbability();
//        integerBloomFilter0.getCurrentFalsePositiveProbability();
//        integerBloomFilter0.getCurrentFalsePositiveProbability();
//        integerBloomFilter0.getFilterSize();
//    }

    @Test
    public void test02() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter((-1092), (-1092), 1);
        integerBloomFilter0.clear();
        integerBloomFilter0.getFalsePositiveProbability((-1092));
        integerBloomFilter0.getCurrentFalsePositiveProbability();
    }

    @Test
    public void test03() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(0, 0, (-4893));
        integerBloomFilter0.getTotalHashFunctions();
        // Undeclared exception!
        try {
            integerBloomFilter0.add(962);
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test04() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(3447, 3447, 3447);
        integerBloomFilter0.clear();
        integerBloomFilter0.contains(0);
        integerBloomFilter0.contains(0);
        integerBloomFilter0.getCurrentFalsePositiveProbability();
    }

    @Test
    public void test05() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(1717, 1717, 1717);
        assertNotNull(integerBloomFilter0);
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.add(1717);
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.add(1717);
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        double double0 = integerBloomFilter0.getExpectedFalsePositiveProbability();
        assertEquals(0.0, double0, 0.01);
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.add((-606));
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.add(0);
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        double double1 = integerBloomFilter0.getCurrentFalsePositiveProbability();
        assertEquals(0.0, double1, 0.01);
        assertEquals(double1, double0, 0.01);
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        boolean boolean0 = integerBloomFilter0.contains((-17));
        assertTrue(boolean0);
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(2948089, integerBloomFilter0.getFilterSize());
        assertEquals(1717, integerBloomFilter0.getBitsPerElement());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1717, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
    }

    @Test
    public void test06() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(0.0, (-2586));
        assertNotNull(integerBloomFilter0);
        assertEquals(Integer.MAX_VALUE, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(2586, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(Integer.MAX_VALUE, integerBloomFilter0.getBitsPerElement());

        int int0 = integerBloomFilter0.getBitsPerElement();
        assertEquals(Integer.MAX_VALUE, int0);
        assertEquals(Integer.MAX_VALUE, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(2586, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(Integer.MAX_VALUE, integerBloomFilter0.getBitsPerElement());
    }

    @Test
    public void test07() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter((-217), (-217), 1675);
        assertNotNull(integerBloomFilter0);
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add((-217));
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(1675);
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(0);
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        int int0 = 0;
        integerBloomFilter0.add(0);
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        double double0 = integerBloomFilter0.getFalsePositiveProbability(1675);
        assertEquals(1.0, double0, 0.01);
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(0);
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals((-217), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NEGATIVE_INFINITY, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1675, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(47089, integerBloomFilter0.getFilterSize());

        // Undeclared exception!
        integerBloomFilter0.contains(1645);
    }

    @Test
    public void test08() throws Throwable {
        int int0 = 4587;
        int int1 = 256;
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(4587, 256, 4587);
        assertNotNull(integerBloomFilter0);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(4587, integerBloomFilter0.getBitsPerElement());
        assertEquals(4587, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1174272, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(256);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(4587, integerBloomFilter0.getBitsPerElement());
        assertEquals(4587, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1174272, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(256);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(4587, integerBloomFilter0.getBitsPerElement());
        assertEquals(4587, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1174272, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(4587, integerBloomFilter0.getBitsPerElement());
        assertEquals(4587, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1174272, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(4587, integerBloomFilter0.getBitsPerElement());
        assertEquals(4587, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1174272, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(4587, integerBloomFilter0.getBitsPerElement());
        assertEquals(4587, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1174272, integerBloomFilter0.getFilterSize());

        // Undeclared exception!
        integerBloomFilter0.add(256);
    }

    @Test
    public void test09() throws Throwable {
        int int0 = 0;
        int int1 = 2346;
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(0, 0, 2346);
        assertNotNull(integerBloomFilter0);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2346, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);

        double double0 = integerBloomFilter0.getExpectedFalsePositiveProbability();
        assertEquals(Double.NaN, double0, 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2346, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2346, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);

        // Undeclared exception!
        try {
            integerBloomFilter0.add(0);
            fail("Expecting exception: ArithmeticException");

        } catch (ArithmeticException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test10() throws Throwable {
        int int0 = (-1929);
        IntegerBloomFilter integerBloomFilter0 = null;
        try {
            integerBloomFilter0 = new IntegerBloomFilter(0.0, (-1929));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // nbits < 0: -2147481719
            //
            
        }
    }

    @Test
    public void test11() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(2530.083702073764, 0);
        assertNotNull(integerBloomFilter0);
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-11), integerBloomFilter0.getTotalHashFunctions());

        integerBloomFilter0.clear();
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-11), integerBloomFilter0.getTotalHashFunctions());

        int int0 = integerBloomFilter0.getTotalHashFunctions();
        assertEquals((-11), int0);
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-11), integerBloomFilter0.getTotalHashFunctions());

        int int1 = integerBloomFilter0.getBitsPerElement();
        assertEquals((-16), int1);
        assertFalse(int1 == int0);
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-11), integerBloomFilter0.getTotalHashFunctions());

        integerBloomFilter0.clear();
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-11), integerBloomFilter0.getTotalHashFunctions());

        double double0 = integerBloomFilter0.getExpectedFalsePositiveProbability();
        assertEquals(Double.NaN, double0, 0.01);
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-11), integerBloomFilter0.getTotalHashFunctions());

        integerBloomFilter0.clear();
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-11), integerBloomFilter0.getTotalHashFunctions());

        integerBloomFilter0.clear();
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-11), integerBloomFilter0.getTotalHashFunctions());
    }

    @Test
    public void test12() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(1.0, 0);
        assertNotNull(integerBloomFilter0);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        int int0 = integerBloomFilter0.getFilterSize();
        assertEquals(0, int0);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.add(0);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        double double0 = integerBloomFilter0.getFalsePositiveProbability(1.0);
        assertEquals(1.0, double0, 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        double double1 = integerBloomFilter0.getFalsePositiveProbability(0);
        assertEquals(1.0, double1, 0.01);
        assertEquals(double1, double0, 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        double double2 = integerBloomFilter0.getFalsePositiveProbability(1.0);
        assertEquals(1.0, double2, 0.01);
        assertEquals(double2, double1, 0.01);
        assertEquals(double2, double0, 0.01);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        int int1 = integerBloomFilter0.getTotalHashFunctions();
        assertEquals(0, int1);
        assertTrue(int1 == int0);
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
    }

    @Test
    public void test13() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(0, 0, 0);
        assertNotNull(integerBloomFilter0);
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getFilterSize());

        boolean boolean0 = integerBloomFilter0.contains(701);
        assertTrue(boolean0);
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getFilterSize());

        double double0 = integerBloomFilter0.getExpectedFalsePositiveProbability();
        assertEquals(1.0, double0, 0.01);
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getFilterSize());

        int int0 = integerBloomFilter0.getBitsPerElement();
        assertEquals(0, int0);
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getFilterSize());

        int int1 = integerBloomFilter0.getFilterSize();
        assertEquals(0, int1);
        assertTrue(int1 == int0);
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getFilterSize());

        double double1 = integerBloomFilter0.getFalsePositiveProbability(0.0);
        assertEquals(1.0, double1, 0.01);
        assertEquals(double1, double0, 0.01);
        assertEquals(0, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0, integerBloomFilter0.getBitsPerElement());
        assertEquals(0, integerBloomFilter0.getFilterSize());
    }

    @Test
    public void test14() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter((-383), (-1215), (-2136));
        assertNotNull(integerBloomFilter0);
        assertEquals(465345, integerBloomFilter0.getFilterSize());
        assertEquals((-383), integerBloomFilter0.getBitsPerElement());
        assertEquals((-2136), integerBloomFilter0.getTotalHashFunctions());
        assertEquals(Double.POSITIVE_INFINITY, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(3286.4078329039107, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(465345, integerBloomFilter0.getFilterSize());
        assertEquals((-383), integerBloomFilter0.getBitsPerElement());
        assertEquals((-2136), integerBloomFilter0.getTotalHashFunctions());
        assertEquals(Double.POSITIVE_INFINITY, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(3286.4078329039107, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        double double0 = integerBloomFilter0.getCurrentFalsePositiveProbability();
        assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
        assertEquals(465345, integerBloomFilter0.getFilterSize());
        assertEquals((-383), integerBloomFilter0.getBitsPerElement());
        assertEquals((-2136), integerBloomFilter0.getTotalHashFunctions());
        assertEquals(Double.POSITIVE_INFINITY, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(3286.4078329039107, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        integerBloomFilter0.clear();
        assertEquals(465345, integerBloomFilter0.getFilterSize());
        assertEquals((-383), integerBloomFilter0.getBitsPerElement());
        assertEquals((-2136), integerBloomFilter0.getTotalHashFunctions());
        assertEquals(Double.POSITIVE_INFINITY, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(3286.4078329039107, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        int int0 = integerBloomFilter0.getFilterSize();
        assertEquals(465345, int0);
        assertEquals(465345, integerBloomFilter0.getFilterSize());
        assertEquals((-383), integerBloomFilter0.getBitsPerElement());
        assertEquals((-2136), integerBloomFilter0.getTotalHashFunctions());
        assertEquals(Double.POSITIVE_INFINITY, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(3286.4078329039107, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);

        // Undeclared exception!
        try {
            integerBloomFilter0.contains(465345);
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test15() throws Throwable {
        int int0 = (-1);
        int int1 = 270;
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter((-1), 0, 270);
        assertNotNull(integerBloomFilter0);
        assertEquals(270, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0, integerBloomFilter0.getFilterSize());
        assertEquals(Double.NaN, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(Double.NaN, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals((-1), integerBloomFilter0.getBitsPerElement());

        // Undeclared exception!
        try {
            integerBloomFilter0.contains(270);
            fail("Expecting exception: ArithmeticException");

        } catch (ArithmeticException e) {
            //
            // / by zero
            //
            
        }
    }

    @Test
    public void test16() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(2580, 2580, 2580);
        assertNotNull(integerBloomFilter0);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(6656400, integerBloomFilter0.getFilterSize());
        assertEquals(2580, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2580, integerBloomFilter0.getBitsPerElement());

        int int0 = integerBloomFilter0.getTotalHashFunctions();
        assertEquals(2580, int0);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(6656400, integerBloomFilter0.getFilterSize());
        assertEquals(2580, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2580, integerBloomFilter0.getBitsPerElement());

        integerBloomFilter0.add(2580);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(6656400, integerBloomFilter0.getFilterSize());
        assertEquals(2580, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2580, integerBloomFilter0.getBitsPerElement());

        integerBloomFilter0.clear();
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(6656400, integerBloomFilter0.getFilterSize());
        assertEquals(2580, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2580, integerBloomFilter0.getBitsPerElement());

        integerBloomFilter0.add(2580);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(6656400, integerBloomFilter0.getFilterSize());
        assertEquals(2580, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2580, integerBloomFilter0.getBitsPerElement());

        double double0 = integerBloomFilter0.getFalsePositiveProbability(1991.484038);
        assertEquals(0.0, double0, 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(6656400, integerBloomFilter0.getFilterSize());
        assertEquals(2580, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2580, integerBloomFilter0.getBitsPerElement());

        double double1 = integerBloomFilter0.getCurrentFalsePositiveProbability();
        assertEquals(0.0, double1, 0.01);
        assertEquals(double1, double0, 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(6656400, integerBloomFilter0.getFilterSize());
        assertEquals(2580, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2580, integerBloomFilter0.getBitsPerElement());

        boolean boolean0 = integerBloomFilter0.contains(3687);
        assertTrue(boolean0);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(6656400, integerBloomFilter0.getFilterSize());
        assertEquals(2580, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(2580, integerBloomFilter0.getBitsPerElement());
    }

    @Test
    public void test17() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(1, 1, 1221);
        assertNotNull(integerBloomFilter0);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        double double0 = integerBloomFilter0.getExpectedFalsePositiveProbability();
        assertEquals(1.0, double0, 0.01);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        double double1 = integerBloomFilter0.getFalsePositiveProbability(0.0);
        assertEquals(0.0, double1, 0.01);
        assertNotEquals(double1, double0, 0.01);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.clear();
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        double double2 = integerBloomFilter0.getFalsePositiveProbability(0.0);
        assertEquals(0.0, double2, 0.01);
        assertNotEquals(double2, double0, 0.01);
        assertEquals(double2, double1, 0.01);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(1);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        int int0 = integerBloomFilter0.getFilterSize();
        assertEquals(1, int0);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        double double3 = integerBloomFilter0.getFalsePositiveProbability(0.0);
        assertEquals(0.0, double3, 0.01);
        assertEquals(double3, double1, 0.01);
        assertNotEquals(double3, double0, 0.01);
        assertEquals(double3, double2, 0.01);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(1);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(1);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        double double4 = integerBloomFilter0.getCurrentFalsePositiveProbability();
        assertEquals(1.0, double4, 0.01);
        assertNotEquals(double4, double2, 0.01);
        assertNotEquals(double4, double1, 0.01);
        assertEquals(double4, double0, 0.01);
        assertNotEquals(double4, double3, 0.01);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());

        integerBloomFilter0.add(1221);
        assertEquals(1221, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(1, integerBloomFilter0.getBitsPerElement());
        assertEquals(1, integerBloomFilter0.getFilterSize());
    }

    @Test
    public void test18() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(29.85205, (-1724));
        assertNotNull(integerBloomFilter0);
        assertEquals((-7), integerBloomFilter0.getBitsPerElement());
        assertEquals((-4), integerBloomFilter0.getTotalHashFunctions());
        assertEquals(Double.POSITIVE_INFINITY, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(27.85592942534111, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(12068, integerBloomFilter0.getFilterSize());

        double double0 = integerBloomFilter0.getFalsePositiveProbability(29.85205);
        assertEquals(1.0228293000931415E8, double0, 0.01);
        assertEquals((-7), integerBloomFilter0.getBitsPerElement());
        assertEquals((-4), integerBloomFilter0.getTotalHashFunctions());
        assertEquals(Double.POSITIVE_INFINITY, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(27.85592942534111, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(12068, integerBloomFilter0.getFilterSize());
    }

    @Test
    public void test19() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(148, 1, 148);
        assertNotNull(integerBloomFilter0);
        assertEquals(148, integerBloomFilter0.getFilterSize());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(148, integerBloomFilter0.getBitsPerElement());
        assertEquals(3.2990391932989776E-30, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(148, integerBloomFilter0.getTotalHashFunctions());

        boolean boolean0 = integerBloomFilter0.contains((-2833));
        assertFalse(boolean0);
        assertEquals(148, integerBloomFilter0.getFilterSize());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(148, integerBloomFilter0.getBitsPerElement());
        assertEquals(3.2990391932989776E-30, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(148, integerBloomFilter0.getTotalHashFunctions());
    }

    @Test
    public void test20() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(2110, 2110, 2110);
        assertNotNull(integerBloomFilter0);
        assertEquals(2110, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(4452100, integerBloomFilter0.getFilterSize());
        assertEquals(2110, integerBloomFilter0.getBitsPerElement());

        double double0 = integerBloomFilter0.getExpectedFalsePositiveProbability();
        assertEquals(0.0, double0, 0.01);
        assertEquals(2110, integerBloomFilter0.getTotalHashFunctions());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(4452100, integerBloomFilter0.getFilterSize());
        assertEquals(2110, integerBloomFilter0.getBitsPerElement());
    }

    @Test
    public void test21() throws Throwable {
        int int0 = (-1);
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(3485, 3485, (-1));
        integerBloomFilter0.getCurrentFalsePositiveProbability();
        integerBloomFilter0.clear();
        // Undeclared exception!
        try {
            integerBloomFilter0.add(3485);
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test22() throws Throwable {
        int int0 = (-175);
        IntegerBloomFilter integerBloomFilter0 = null;
        try {
            integerBloomFilter0 = new IntegerBloomFilter((-175), 457, (-1938));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // nbits < 0: -79975
            //
            
        }
    }

    @Test
    public void test23() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(701, 701, 701);
        integerBloomFilter0.add(701);
        assertEquals(491401, integerBloomFilter0.getFilterSize());
        assertEquals(0.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(701, integerBloomFilter0.getBitsPerElement());
        assertEquals(2.294777990854061E-140, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
    }

    @Test
    public void test24() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(808, 808, 1);
        integerBloomFilter0.clear();
        integerBloomFilter0.clear();
        integerBloomFilter0.clear();
        integerBloomFilter0.clear();
        integerBloomFilter0.add((-1));
        integerBloomFilter0.contains((-4598));
        integerBloomFilter0.add(1);
        integerBloomFilter0.clear();
        integerBloomFilter0.add(1);
        integerBloomFilter0.clear();
        integerBloomFilter0.contains((-2799));
        integerBloomFilter0.add((-345));
        integerBloomFilter0.contains((-4598));
        integerBloomFilter0.add((-345));
        integerBloomFilter0.getCurrentFalsePositiveProbability();
        integerBloomFilter0.contains((-4598));
        double double0 = integerBloomFilter0.getCurrentFalsePositiveProbability();
        assertEquals(3.0634204620794137E-6, double0, 0.01);
    }

    @Test
    public void test25() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(1.0, (-423));
        integerBloomFilter0.add(3933);
        integerBloomFilter0.add(3933);
        integerBloomFilter0.add(3933);
        integerBloomFilter0.clear();
        integerBloomFilter0.clear();
        int int0 = integerBloomFilter0.getBitsPerElement();
        int int1 = integerBloomFilter0.getFilterSize();
        assertTrue(int1 == int0);

        integerBloomFilter0.getFalsePositiveProbability(1.0);
        integerBloomFilter0.clear();
        integerBloomFilter0.getTotalHashFunctions();
        integerBloomFilter0.getCurrentFalsePositiveProbability();
        integerBloomFilter0.clear();
        integerBloomFilter0.add(3933);
        integerBloomFilter0.getCurrentFalsePositiveProbability();
        integerBloomFilter0.getExpectedFalsePositiveProbability();
        integerBloomFilter0.contains(0);
        int int2 = integerBloomFilter0.getTotalHashFunctions();
        assertEquals(0, int2);

        double double0 = integerBloomFilter0.getFalsePositiveProbability(0.0);
        assertEquals(1.0, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(1.0, double0, 0.01);
    }
}
