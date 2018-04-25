package main.java.net.mooctest;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class InternalNodeTest {


    @Test
    public void test00() throws Throwable {
        Integer integer0 = new Integer(1850);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult1);
        Object object0 = new Object();
        internalNode1.insert(1850, insertionResult0);
        internalNode1.insert(195, "On");
        InsertionResult<Object> insertionResult2 = internalNode1.insert(503, object0);
        assertEquals(2, leafNode0.getNodeSize());
        assertEquals(1850, (int) insertionResult2.getSplitRootKey());
    }

    @Test
    public void test01() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        Integer integer0 = new Integer(1);
        LeafNode<InternalNode<Integer>> leafNode0 = new LeafNode<InternalNode<Integer>>(1);
        InsertionResult<InternalNode<Integer>> insertionResult0 = new InsertionResult<InternalNode<Integer>>(integer0, leafNode0, leafNode0);
        InternalNode<InternalNode<Integer>> internalNode1 = new InternalNode<InternalNode<Integer>>(1, insertionResult0);
        internalNode1.t = (-463);
        // Undeclared exception!
        try {
            internalNode1.insert(1, internalNode0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -464
            //
            
        }
    }

    @Test
    public void test02() throws Throwable {
        Integer integer0 = new Integer(1850);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult1);
        Object object0 = new Object();
        internalNode1.insert(1, object0);
        internalNode1.t = 1850;
        internalNode1.insert((-4281), integer0);
        internalNode1.insert(1850, insertionResult0);
        int int0 = internalNode1.order(195);
        assertEquals(2, internalNode1.getNodeSize());
        assertEquals(1, int0);
    }

    @Test
    public void test03() throws Throwable {
        Integer integer0 = new Integer(1850);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        Integer integer1 = new Integer(1);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer1, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult1);
        Object object0 = new Object();
        internalNode1.insert((int) integer1, object0);
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        leafNode0.keys = (List<Integer>) linkedList0;
        internalNode1.t = 1850;
        internalNode1.insert(1850, insertionResult0);
        int int0 = internalNode1.order(1850);
        assertEquals(1, internalNode1.getNodeSize());
        assertEquals(0, int0);
    }

    @Test
    public void test04() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        Integer integer0 = new Integer(1830);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1830);
        leafNode0.insert(171, (Object) null);
        InsertionResult<Object> insertionResult0 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1830, insertionResult0);
        leafNode0.insert(1850, internalNode0);
        assertEquals(0, internalNode0.getNodeSize());

        int int0 = internalNode1.order(1850);
        assertEquals(1, int0);
    }

    @Test
    public void test05() throws Throwable {
        Integer integer0 = new Integer(1053);
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(613);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, leafNode0, leafNode0);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1053, insertionResult0);
        int int0 = internalNode0.order(613);
        assertEquals((-1), int0);
    }

    @Test
    public void test06() throws Throwable {
        Integer integer0 = new Integer(1850);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult1);
        Object object0 = new Object();
        internalNode1.insert(1, object0);
        internalNode1.insert(1850, insertionResult0);
        assertEquals(0, internalNode0.getNodeSize());

        internalNode1.insert(1, object0);
        assertEquals(1, internalNode1.getNodeSize());
    }

    @Test
    public void test07() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(535);
        InsertionResult<String> insertionResult0 = leafNode0.insert(Integer.MAX_VALUE, "");
        InsertionResult<String> insertionResult1 = new InsertionResult<String>((Integer) null, leafNode0, leafNode0, insertionResult0);
        InternalNode<String> internalNode0 = new InternalNode<String>(974, insertionResult1);
        int int0 = internalNode0.getNodeSize();
        assertEquals(2, int0);
    }

    @Test
    public void test08() throws Throwable {
        Integer integer0 = new Integer(271);
        InternalNode<String> internalNode0 = new InternalNode<String>(166);
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(271);
        InsertionResult<String> insertionResult1 = new InsertionResult<String>(integer0, internalNode0, internalNode0, insertionResult0);
        InternalNode<String> internalNode1 = new InternalNode<String>(166, insertionResult1);
        Node<String> node0 = internalNode1.getMaxChildNode();
        assertEquals(0, node0.getNodeSize());
    }

    @Test
    public void test09() throws Throwable {
        Integer integer0 = new Integer(1815);
        LeafNode<LeafNode<Object>> leafNode0 = new LeafNode<LeafNode<Object>>(1815);
        InsertionResult<LeafNode<Object>> insertionResult0 = new InsertionResult<LeafNode<Object>>(integer0, leafNode0, leafNode0);
        InternalNode<LeafNode<Object>> internalNode0 = new InternalNode<LeafNode<Object>>(1815, insertionResult0);
        Node<LeafNode<Object>> node0 = internalNode0.getChildNode(402);
        assertEquals(0, node0.getNodeSize());
    }

    @Test
    public void test10() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1265);
        // Undeclared exception!
        try {
            internalNode0.toString();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test11() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(54);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>((Integer) null, internalNode0, internalNode0);
        InternalNode<Integer> internalNode1 = new InternalNode<Integer>(1850, insertionResult0);
        // Undeclared exception!
        try {
            internalNode1.order(1850);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test12() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(5083);
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        internalNode0.keys = (List<Integer>) linkedList0;
        // Undeclared exception!
        try {
            internalNode0.order((-3912));
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: -1, Size: 0
            //
            
        }
    }

    @Test
    public void test13() throws Throwable {
        InternalNode<InternalNode<String>> internalNode0 = new InternalNode<InternalNode<String>>(1);
        // Undeclared exception!
        try {
            internalNode0.order(1903);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test14() throws Throwable {
        Integer integer0 = new Integer(1850);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult1);
        leafNode0.insert((-1), leafNode0);
        // Undeclared exception!
        try {
            internalNode1.insert(1850, insertionResult0);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            
        }
    }

    @Test
    public void test15() throws Throwable {
        Integer integer0 = new Integer(1850);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(54);
        // Undeclared exception!
        try {
            internalNode0.insert(1850, integer0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test16() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        LinkedList<Node<Object>> linkedList1 = new LinkedList<Node<Object>>();
        linkedList0.add((Integer) null);
        InternalNode<Object> internalNode0 = new InternalNode<Object>(2, linkedList0, linkedList1);
        // Undeclared exception!
        try {
            internalNode0.getChildNode(2);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test17() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer(0);
        linkedList0.add(integer0);
        LinkedList<Node<InternalNode<Integer>>> linkedList1 = new LinkedList<Node<InternalNode<Integer>>>();
        InternalNode<InternalNode<Integer>> internalNode0 = new InternalNode<InternalNode<Integer>>(1318, linkedList0, linkedList1);
        // Undeclared exception!
        try {
            internalNode0.getChildNode(0);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            
        }
    }

    @Test
    public void test18() throws Throwable {
        InternalNode<Object> internalNode0 = new InternalNode<Object>(2);
        // Undeclared exception!
        try {
            internalNode0.getChildNode(2);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test19() throws Throwable {
        InsertionResult<Object> insertionResult0 = new InsertionResult<Object>(0);
        InternalNode<Object> internalNode0 = null;
        try {
            internalNode0 = new InternalNode<Object>(3986, insertionResult0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test20() throws Throwable {
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(0);
        InternalNode<Integer> internalNode0 = null;
        try {
            internalNode0 = new InternalNode<Integer>((-1), insertionResult0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -2
            //
            
        }
    }

    @Test
    public void test21() throws Throwable {
        LinkedList<Node<String>> linkedList0 = new LinkedList<Node<String>>();
        InternalNode<String> internalNode0 = null;
        try {
            internalNode0 = new InternalNode<String>(1850, (List<Integer>) null, linkedList0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test22() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        LinkedList<Node<InternalNode<Object>>> linkedList1 = new LinkedList<Node<InternalNode<Object>>>();
        InternalNode<InternalNode<Object>> internalNode0 = null;
        try {
            internalNode0 = new InternalNode<InternalNode<Object>>((-1), linkedList0, linkedList1);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -2
            //
            
        }
    }

    @Test
    public void test23() throws Throwable {
        InternalNode<InternalNode<Integer>> internalNode0 = null;
        try {
            internalNode0 = new InternalNode<InternalNode<Integer>>(0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -1
            //
            
        }
    }

    @Test
    public void test24() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        LinkedList<Node<Object>> linkedList1 = new LinkedList<Node<Object>>();
        InternalNode<Object> internalNode0 = new InternalNode<Object>(2);
        linkedList1.add((Node<Object>) internalNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(2, linkedList0, linkedList1);
        assertEquals(0, internalNode1.getNodeSize());
    }

    @Test
    public void test25() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        LinkedList<Node<Integer>> linkedList1 = new LinkedList<Node<Integer>>();
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(308, linkedList0, linkedList1);
        int int0 = internalNode0.getNodeSize();
        assertEquals(0, int0);
    }

    @Test
    public void test26() throws Throwable {
        Integer integer0 = new Integer(0);
        LeafNode<String> leafNode0 = new LeafNode<String>(556);
        InsertionResult<String> insertionResult0 = leafNode0.insert(0, ")!ODryT");
        InsertionResult<String> insertionResult1 = new InsertionResult<String>(integer0, leafNode0, leafNode0, insertionResult0);
        InternalNode<String> internalNode0 = new InternalNode<String>(556, insertionResult1);
        internalNode0.getChildNode(2408);
        assertEquals(2, internalNode0.getNodeSize());
    }

    @Test
    public void test27() throws Throwable {
        Integer integer0 = new Integer(0);
        LeafNode<String> leafNode0 = new LeafNode<String>(556);
        InsertionResult<String> insertionResult0 = leafNode0.insert(0, ")!ODryT");
        InsertionResult<String> insertionResult1 = new InsertionResult<String>(integer0, leafNode0, leafNode0, insertionResult0);
        InternalNode<String> internalNode0 = new InternalNode<String>(556, insertionResult1);
        internalNode0.toString();
        assertEquals(2, internalNode0.getNodeSize());
    }

    @Test
    public void test28() throws Throwable {
        Integer integer0 = new Integer(1850);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult1);
        Object object0 = new Object();
        internalNode1.insert(1, object0);
        internalNode1.t = 1850;
        internalNode1.insert(1850, insertionResult0);
        internalNode1.insert(503, object0);
        assertEquals(2, internalNode1.getNodeSize());
    }

    @Test
    public void test29() throws Throwable {
        Integer integer0 = new Integer(2);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(2);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        Integer integer1 = new Integer(1);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer1, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult1);
        internalNode1.t = 2;
        InsertionResult<Object> insertionResult2 = internalNode1.insert(2, insertionResult0);
        assertEquals(0, internalNode1.getNodeSize());
        assertEquals(1, (int) insertionResult2.getSplitRootKey());
    }

    @Test
    public void test30() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        Integer integer0 = new Integer(1);
        LeafNode<InternalNode<Integer>> leafNode0 = new LeafNode<InternalNode<Integer>>(1);
        InsertionResult<InternalNode<Integer>> insertionResult0 = new InsertionResult<InternalNode<Integer>>(integer0, leafNode0, leafNode0);
        InternalNode<InternalNode<Integer>> internalNode1 = new InternalNode<InternalNode<Integer>>(1, insertionResult0);
        internalNode1.t = 2;
        InsertionResult<InternalNode<Integer>> insertionResult1 = internalNode1.insert(1, internalNode0);
        assertEquals(0, internalNode1.getNodeSize());
        assertEquals(1, (int) insertionResult1.getSplitRootKey());
    }

    @Test
    public void test31() throws Throwable {
        Integer integer0 = new Integer(2);
        LeafNode<String> leafNode0 = new LeafNode<String>(2);
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(integer0, leafNode0, leafNode0);
        InternalNode<String> internalNode0 = new InternalNode<String>(2, insertionResult0);
        internalNode0.insert(2, "");
        internalNode0.getMaxChildNode();
        assertEquals(1, internalNode0.getNodeSize());
    }

    @Test
    public void test32() throws Throwable {
        Integer integer0 = new Integer(1850);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult1);
        leafNode0.insert(1850, internalNode0);
        // Undeclared exception!
        try {
            internalNode1.insert(1850, insertionResult0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test33() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        Integer integer0 = new Integer(1);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult0 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, insertionResult0);
        leafNode0.insert(1850, internalNode0);
        assertEquals(0, internalNode0.getNodeSize());

        int int0 = internalNode1.order(1850);
        assertEquals((-1), int0);
    }

    @Test
    public void test34() throws Throwable {
        Integer integer0 = new Integer(1850);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1);
        InsertionResult<Object> insertionResult0 = new InsertionResult<Object>(integer0, leafNode0, leafNode0);
        InternalNode<Object> internalNode0 = new InternalNode<Object>(1, insertionResult0);
        Object object0 = new Object();
        InsertionResult<Object> insertionResult1 = internalNode0.insert(1, object0);
        assertEquals(1850, (int) insertionResult1.getSplitRootKey());

        int int0 = internalNode0.order(1850);
        assertEquals(0, internalNode0.getNodeSize());
        assertEquals((-1), int0);
    }

    @Test
    public void test35() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1850);
        // Undeclared exception!
        try {
            internalNode0.getMaxChildNode();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }
}
