package main.java.net.mooctest;


import org.junit.Test;

import static org.junit.Assert.*;

public class BPlusTreeTest {


    @Test
    public void test00() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1298);
        bPlusTree0.insert(1298, "c@bnv+(ioN[^x");
        bPlusTree0.getSize();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test01() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1);
        bPlusTree0.insert(1, "g:[X");
        bPlusTree0.insert(22, "");
        // Undeclared exception!
        try {
            bPlusTree0.search(3971);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test02() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1, 0);
        // Undeclared exception!
        try {
            bPlusTree0.search((-1922));
            fail("Expecting exception: ArithmeticException");

        } catch (ArithmeticException e) {
            //
            // / by zero
            //
            
        }
    }

    @Test
    public void test03() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1, 1);
        bPlusTree0.insert(0, "I}PFYGN]<FUSTK");
        // Undeclared exception!
        try {
            bPlusTree0.insert(0, "I}PFYGN]<FUSTK");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test04() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1);
        bPlusTree0.insert((-1744), "ahY!5;");
        bPlusTree0.insert(1, "BscJ.W?x");
        // Undeclared exception!
        try {
            bPlusTree0.insert(595, "main.java.net.mooctest.InternalNode");
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test05() throws Throwable {
        BPlusTree<InternalNode<Object>> bPlusTree0 = new BPlusTree<InternalNode<Object>>(1);
        // Undeclared exception!
        try {
            bPlusTree0.inOrder();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test06() throws Throwable {
        BPlusTree<String> bPlusTree0 = null;
        try {
            bPlusTree0 = new BPlusTree<String>(945, (-3107));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // nbits < 0: -90103
            //
            
        }
    }

    @Test
    public void test07() throws Throwable {
        BPlusTree<Object> bPlusTree0 = null;
        try {
            bPlusTree0 = new BPlusTree<Object>((-1), Integer.MAX_VALUE);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -2
            //
            
        }
    }

    @Test
    public void test08() throws Throwable {
        BPlusTree<LeafNode<Node<Object>>> bPlusTree0 = null;
        try {
            bPlusTree0 = new BPlusTree<LeafNode<Node<Object>>>(0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -1
            //
            
        }
    }

    @Test
    public void test09() throws Throwable {
        BPlusTree<LeafNode<Integer>> bPlusTree0 = new BPlusTree<LeafNode<Integer>>(1);
        bPlusTree0.toString();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test10() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1298);
        bPlusTree0.insert(1298, "c@bnv+(ioN[^x");
        String string0 = bPlusTree0.inOrder();
        assertEquals("1298", string0);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test11() throws Throwable {
        BPlusTree<Object> bPlusTree0 = new BPlusTree<Object>(4198);
        bPlusTree0.insert((-1), "1298");
        int int0 = bPlusTree0.order((-1));
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
        assertEquals(1, int0);
    }

    @Test
    public void test12() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1298);
        int int0 = bPlusTree0.order(1298);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
        assertEquals((-1), int0);
    }

    @Test
    public void test13() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1);
        bPlusTree0.insert(1, "Su");
        String string0 = bPlusTree0.reverseInOrder();
        assertEquals("1,", string0);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test14() throws Throwable {
        BPlusTree<Object> bPlusTree0 = new BPlusTree<Object>(4198);
        bPlusTree0.reverseInOrder();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test15() throws Throwable {
        BPlusTree<Object> bPlusTree0 = new BPlusTree<Object>(1337, 0);
        // Undeclared exception!
        try {
            bPlusTree0.insert(1, (Object) null);
            fail("Expecting exception: ArithmeticException");

        } catch (ArithmeticException e) {
            //
            // / by zero
            //
            
        }
    }

    @Test
    public void test16() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1298);
        BPlusTree<Object> bPlusTree1 = new BPlusTree<Object>(4198);
        bPlusTree1.insert((-1), "1298");
        bPlusTree1.insert(2, bPlusTree0);
        bPlusTree1.insert(357, "");
        assertEquals(3, bPlusTree1.getMinGap());
    }

    @Test
    public void test17() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1282);
        bPlusTree0.insert(1282, "~K;cW#Pl");
        bPlusTree0.insert(1282, "~K;cW#Pl");
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test18() throws Throwable {
        BPlusTree<Integer> bPlusTree0 = new BPlusTree<Integer>(1565, 897);
        bPlusTree0.search(1595);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test19() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1);
        bPlusTree0.insert(0, "");
        String string0 = bPlusTree0.search(0);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
        assertNotNull(string0);
    }

    @Test
    public void test20() throws Throwable {
        BPlusTree<Integer> bPlusTree0 = new BPlusTree<Integer>(1282, 1282);
        bPlusTree0.getSize();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test21() throws Throwable {
        BPlusTree<Object> bPlusTree0 = new BPlusTree<Object>(1282, 1282);
        bPlusTree0.insert(0, "1282");
        bPlusTree0.toString();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test
    public void test22() throws Throwable {
        BPlusTree<Object> bPlusTree0 = new BPlusTree<Object>(1406);
        int int0 = bPlusTree0.getMinGap();
        assertEquals(Integer.MAX_VALUE, int0);
    }

}
