package main.java.net.mooctest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class InsertionResultTest {

    @Test
    public void test00() throws Throwable {
        InsertionResult<Object> insertionResult0 = new InsertionResult<Object>((-1199));
        insertionResult0.getSplitRootKey();
        assertEquals((-1199), insertionResult0.getMinGap());
    }

    @Test
    public void test01() throws Throwable {
        Integer integer0 = new Integer(0);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, (Node<Integer>) null, (Node<Integer>) null);
        Integer integer1 = insertionResult0.getSplitRootKey();
        assertEquals(0, (int) integer1);
    }

    @Test
    public void test02() throws Throwable {
        Integer integer0 = new Integer(2145);
        InternalNode<Object> internalNode0 = new InternalNode<Object>(1);
        InsertionResult<Object> insertionResult0 = new InsertionResult<Object>(integer0, internalNode0, internalNode0);
        Integer integer1 = insertionResult0.getSplitRootKey();
        assertEquals(2145, (int) integer1);
    }

    @Test
    public void test03() throws Throwable {
        Integer integer0 = new Integer(0);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, (Node<Integer>) null, (Node<Integer>) null);
        Node<Integer> node0 = insertionResult0.getRightNode();
        assertNull(node0);
    }

    @Test
    public void test04() throws Throwable {
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(0);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2220);
        leafNode0.insert((-1), insertionResult0);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>((Integer) null, (Node<Object>) null, leafNode0);
        Node<Object> node0 = insertionResult1.getRightNode();
        assertEquals(1, node0.getNodeSize());
    }

    @Test
    public void test05() throws Throwable {
        Integer integer0 = new Integer(2145);
        InternalNode<Object> internalNode0 = new InternalNode<Object>(1);
        InsertionResult<Object> insertionResult0 = new InsertionResult<Object>(integer0, internalNode0, internalNode0);
        int int0 = insertionResult0.getMinGap();
        assertEquals(0, int0);
    }

    @Test
    public void test06() throws Throwable {
        InsertionResult<String> insertionResult0 = new InsertionResult<String>((-3616));
        int int0 = insertionResult0.getMinGap();
        assertEquals((-3616), int0);
    }

    @Test
    public void test07() throws Throwable {
        Integer integer0 = new Integer(2145);
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(1);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, leafNode0, leafNode0);
        Node<Integer> node0 = insertionResult0.getLeftNode();
        assertEquals(0, node0.getNodeSize());
    }

    @Test
    public void test08() throws Throwable {
        InternalNode<Object> internalNode0 = new InternalNode<Object>(1310);
        LeafNode<Object> leafNode0 = new LeafNode<Object>(1310);
        Integer integer0 = new Integer(1310);
        InsertionResult<Object> insertionResult0 = leafNode0.insert((-21), internalNode0);
        InsertionResult<Object> insertionResult1 = new InsertionResult<Object>(integer0, leafNode0, leafNode0, insertionResult0);
        insertionResult1.getLeftNode();
        assertEquals(Integer.MAX_VALUE, insertionResult1.getMinGap());
        assertEquals(Integer.MAX_VALUE, insertionResult0.getMinGap());
    }

    @Test
    public void test09() throws Throwable {
        Integer integer0 = new Integer((-656));
        LeafNode<String> leafNode0 = new LeafNode<String>(2804);
        InsertionResult<String> insertionResult0 = null;
        try {
            insertionResult0 = new InsertionResult<String>(integer0, leafNode0, leafNode0, (InsertionResult<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            
        }
    }

    @Test
    public void test10() throws Throwable {
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(1);
        int int0 = insertionResult0.getMinGap();
        assertEquals(1, int0);
    }

    @Test
    public void test11() throws Throwable {
        Integer integer0 = new Integer(2145);
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(1);
        InsertionResult<Integer> insertionResult0 = leafNode0.insert(1371, integer0);
        Node<Integer> node0 = insertionResult0.getRightNode();
        assertEquals(Integer.MAX_VALUE, insertionResult0.getMinGap());
        assertEquals(0, node0.getNodeSize());
    }

    @Test
    public void test12() throws Throwable {
        Integer integer0 = new Integer((-1));
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(integer0, (Node<String>) null, (Node<String>) null);
        Node<String> node0 = insertionResult0.getLeftNode();
        assertNull(node0);
    }

    @Test
    public void test13() throws Throwable {
        Integer integer0 = new Integer((-1));
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(integer0, (Node<String>) null, (Node<String>) null);
        Integer integer1 = insertionResult0.getSplitRootKey();
        assertEquals((-1), (int) integer1);
    }
}