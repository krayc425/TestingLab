package main.java.net.mooctest;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LeafNodeTest {


    @Test
    public void test00() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(3380);
        leafNode0.t = (-113);
        // Undeclared exception!
        try {
            leafNode0.insert((-113), (String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -114
            //
            
        }
    }

    @Test
    public void test01() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1780);
        Object object0 = new Object();
        leafNode0.insert(8, object0);
        leafNode0.insert(8, object0);
        assertEquals(1, leafNode0.getNodeSize());
    }

    @Test
    public void test02() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        Object object0 = new Object();
        InsertionResult<Object> insertionResult0 = leafNode0.insert(2379, object0);
        leafNode0.insert(1768, insertionResult0);
        leafNode0.insert((-4133), insertionResult0);
        assertEquals(3, leafNode0.getNodeSize());
    }

    @Test
    public void test03() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(3380);
        InsertionResult<String> insertionResult0 = leafNode0.insert(3380, (String) null);
        assertEquals(Integer.MAX_VALUE, insertionResult0.getMinGap());

        InsertionResult<String> insertionResult1 = leafNode0.insert(0, "*^%?D:h$g!K!");
        assertEquals(3380, insertionResult1.getMinGap());

        InsertionResult<String> insertionResult2 = leafNode0.insert(2, "*^%?D:h$g!K!");
        assertEquals(2, insertionResult2.getMinGap());
    }

    @Test
    public void test04() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(3380);
        String string0 = leafNode0.getValue((-259));
        assertNull(string0);
    }

    @Test
    public void test05() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(3379);
        InsertionResult<String> insertionResult0 = leafNode0.insert((-1), (String) null);
        assertEquals(Integer.MAX_VALUE, insertionResult0.getMinGap());

        int int0 = leafNode0.order((-1));
        assertEquals(0, int0);
    }

    @Test
    public void test06() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(3379);
        leafNode0.insert((-1), (String) null);
        leafNode0.insert(3379, "");
        int int0 = leafNode0.order(3379);
        assertEquals(2, leafNode0.getNodeSize());
        assertEquals(1, int0);
    }

    @Test
    public void test07() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1865);
        LeafNode<Object> leafNode1 = new LeafNode<Object>(28, leafNode0);
        Object object0 = new Object();
        leafNode0.insert(28, object0);
        leafNode1.insert(1865, (Object) null);
        leafNode0.insert(1865, ",");
        assertEquals(2, leafNode0.getNodeSize());
    }

    @Test
    public void test08() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1865);
        LeafNode<Object> leafNode1 = new LeafNode<Object>(28, leafNode0);
        LeafNode<Object> leafNode2 = leafNode1.getPrev();
        assertSame(leafNode2, leafNode0);
    }

    @Test
    public void test09() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        LeafNode<Integer> leafNode1 = new LeafNode<Integer>(1768);
        List<Integer> list0 = leafNode0.keys;
        LeafNode<Integer> leafNode2 = new LeafNode<Integer>(1453, leafNode1, list0, list0);
        InsertionResult<Integer> insertionResult0 = leafNode1.insert(3626, (Integer) null);
        assertEquals(Integer.MAX_VALUE, insertionResult0.getMinGap());

        LeafNode<Integer> leafNode3 = leafNode2.getPrev();
        assertEquals(1, leafNode3.getNodeSize());
    }

    @Test
    public void test10() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(3380);
        LeafNode<String> leafNode1 = new LeafNode<String>(3380, leafNode0);
        LeafNode<String> leafNode2 = leafNode0.getNext();
        assertFalse(leafNode2.equals((Object) leafNode0));
    }

    @Test
    public void test11() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        List<Integer> list0 = leafNode0.keys;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        LeafNode<Object> leafNode1 = new LeafNode<Object>(1768, leafNode0, list0, linkedList0);
        List<Integer> list1 = leafNode1.keys;
        leafNode0.keys = list1;
        Object object0 = new Object();
        InsertionResult<Object> insertionResult0 = leafNode0.insert(0, object0);
        assertEquals(Integer.MAX_VALUE, insertionResult0.getMinGap());

        int int0 = leafNode0.calculateGap(0);
        assertEquals(0, int0);
    }

    @Test
    public void test12() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        int int0 = leafNode0.calculateGap(0);
        assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test
    public void test13() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        leafNode0.keys = null;
        // Undeclared exception!
        try {
            leafNode0.toString();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test14() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        leafNode0.keys = (List<Integer>) linkedList0;
        // Undeclared exception!
        try {
            leafNode0.toString();
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: -1, Size: 0
            //
            
        }
    }

    @Test
    public void test15() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(2935);
        leafNode0.keys = null;
        // Undeclared exception!
        try {
            leafNode0.reverseToString();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test16() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(353);
        leafNode0.keys = null;
        // Undeclared exception!
        try {
            leafNode0.order(353);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test17() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(2);
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        leafNode0.keys = (List<Integer>) linkedList0;
        linkedList0.add((Integer) null);
        // Undeclared exception!
        try {
            leafNode0.insert((-1), "5C:YRN)Zk");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test18() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(918);
        leafNode0.t = 0;
        Integer integer0 = new Integer((-1862));
        // Undeclared exception!
        try {
            leafNode0.insert((-632), integer0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -1
            //
            
        }
    }

    @Test
    public void test19() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(2920);
        leafNode0.keys = null;
        // Undeclared exception!
        try {
            leafNode0.getValue(2920);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test20() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(2);
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer(2);
        linkedList0.add(integer0);
        leafNode0.keys = (List<Integer>) linkedList0;
        leafNode0.insert((-1), "5C:YRN)Zk");
        LeafNode<String> leafNode1 = leafNode0.getNext();
        // Undeclared exception!
        try {
            leafNode1.getValue(2);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            
        }
    }

    @Test
    public void test21() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(2920);
        leafNode0.keys = null;
        // Undeclared exception!
        try {
            leafNode0.calculateGap(2920);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test22() throws Throwable {
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(2991);
        // Undeclared exception!
        try {
            leafNode0.calculateGap(2991);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 2990, Size: 0
            //
            
        }
    }

    @Test
    public void test23() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        // Undeclared exception!
        try {
            leafNode0.calculateGap(Integer.MAX_VALUE);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test24() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2);
        List<Integer> list0 = leafNode0.keys;
        LeafNode<Object> leafNode1 = null;
        try {
            leafNode1 = new LeafNode<Object>(2, leafNode0, list0, (List<Object>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test25() throws Throwable {
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(1953);
        LeafNode<Integer> leafNode1 = null;
        try {
            leafNode1 = new LeafNode<Integer>(0, leafNode0, (List<Integer>) null, (List<Integer>) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -1
            //
            
        }
    }

    @Test
    public void test26() throws Throwable {
        LeafNode<Object> leafNode0 = null;
        try {
            leafNode0 = new LeafNode<Object>(1678, (LeafNode<Object>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test27() throws Throwable {
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(1768);
        LeafNode<Integer> leafNode1 = null;
        try {
            leafNode1 = new LeafNode<Integer>((-2768), leafNode0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -2769
            //
            
        }
    }

    @Test
    public void test28() throws Throwable {
        LeafNode<Integer> leafNode0 = null;
        try {
            leafNode0 = new LeafNode<Integer>((-756));
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -757
            //
            
        }
    }

    @Test
    public void test29() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(3380);
        int int0 = leafNode0.order(1184);
        assertEquals((-1), int0);
    }

    @Test
    public void test30() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        Object object0 = new Object();
        leafNode0.insert(0, object0);
        leafNode0.insert(1768, (Object) null);
        leafNode0.toString();
        assertEquals(2, leafNode0.getNodeSize());
    }

    @Test
    public void test31() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        // Undeclared exception!
        try {
            leafNode0.toString();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test32() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        Object object0 = new Object();
        InsertionResult<Object> insertionResult0 = leafNode0.insert(2475, object0);
        assertEquals(Integer.MAX_VALUE, insertionResult0.getMinGap());

        String string0 = leafNode0.reverseToString();
        assertEquals("2475,", string0);
    }

    @Test
    public void test33() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        String string0 = leafNode0.reverseToString();
        assertEquals("", string0);
    }

    @Test
    public void test34() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1388);
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        LinkedList<Object> linkedList1 = new LinkedList<Object>();
        Integer integer0 = new Integer(1388);
        linkedList0.offerFirst(integer0);
        LeafNode<Object> leafNode1 = new LeafNode<Object>(1388, leafNode0, linkedList0, linkedList1);
        // Undeclared exception!
        try {
            leafNode1.insert(630, integer0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test35() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(28);
        LeafNode<Object> leafNode1 = new LeafNode<Object>(28, leafNode0);
        Object object0 = new Object();
        leafNode0.insert(28, object0);
        // Undeclared exception!
        try {
            leafNode0.insert(1870, "");
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            
        }
    }

    @Test
    public void test36() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1768);
        leafNode0.t = 2;
        Object object0 = new Object();
        leafNode0.insert((-2768), object0);
        leafNode0.insert(0, object0);
        assertEquals(1, leafNode0.getNodeSize());
    }

    @Test
    public void test37() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        Object object0 = new Object();
        InsertionResult<Object> insertionResult0 = leafNode0.insert(2475, object0);
        leafNode0.insert(1, insertionResult0);
        leafNode0.reverseToString();
        assertEquals(2, leafNode0.getNodeSize());
    }

    @Test
    public void test38() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2);
        List<Integer> list0 = leafNode0.keys;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        LeafNode<Object> leafNode1 = new LeafNode<Object>(2, leafNode0, list0, linkedList0);
        LeafNode<Object> leafNode2 = new LeafNode<Object>(2, leafNode0);
        assertEquals(0, leafNode2.getNodeSize());
    }

    @Test
    public void test39() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2);
        LeafNode<Object> leafNode1 = leafNode0.getPrev();
        assertNull(leafNode1);
    }

    @Test
    public void test40() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(2);
        leafNode0.insert(2, "");
        leafNode0.insert(0, "");
        LeafNode<String> leafNode1 = leafNode0.getNext();
        leafNode1.getValue(2);
        assertEquals(1, leafNode0.getNodeSize());
    }

    @Test
    public void test41() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(2);
        LeafNode<String> leafNode1 = leafNode0.getNext();
        assertNull(leafNode1);
    }
}
