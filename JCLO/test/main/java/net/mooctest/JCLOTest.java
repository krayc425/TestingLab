package main.java.net.mooctest;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class JCLOTest {

    @Test
    public void test00() throws Throwable {
        String[][] stringArray0 = new String[9][8];
        String[] stringArray1 = new String[8];
        stringArray1[0] = "0{cI#ZjwwG[g";
        stringArray0[0] = stringArray1;
        stringArray0[1] = stringArray0[0];
        stringArray0[2] = stringArray0[1];
        String[] stringArray2 = new String[6];
        stringArray2[0] = "-`6N!HA[=LY:&J22_6N!HA[";
        stringArray0[3] = stringArray2;
        stringArray0[4] = stringArray1;
        stringArray0[5] = stringArray0[0];
        stringArray0[6] = stringArray1;
        stringArray0[7] = stringArray0[6];
        String[] stringArray3 = new String[0];
        stringArray0[8] = stringArray3;
        JCLO jCLO0 = new JCLO("0{cI#ZjwwG[g", "0{cI#ZjwwG[g", stringArray0);
        // Undeclared exception!
        try {
            jCLO0.parse(stringArray2);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //

        }
    }

    @Test
    public void test01() throws Throwable {
        String[][] stringArray0 = new String[6][9];
        JCLO jCLO0 = null;
        try {
            jCLO0 = new JCLO((String) null, (Object) null, stringArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test
    public void test02() throws Throwable {
        JCLO jCLO0 = null;
        try {
            jCLO0 = new JCLO((String) null, (Object) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test
    public void test03() throws Throwable {
        String[][] stringArray0 = new String[8][0];
        JCLO jCLO0 = null;
        try {
            jCLO0 = new JCLO((Object) null, stringArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test
    public void test04() throws Throwable {
        JCLO jCLO0 = null;
        try {
            jCLO0 = new JCLO((Object) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test
    public void test05() throws Throwable {
        String[] stringArray0 = new String[0];
        JCLO jCLO0 = new JCLO("-mXQ96=6666");
        jCLO0.parse(stringArray0);
        assertEquals(0, stringArray0.length);
    }

    @Test
    public void test06() throws Throwable {
        String[][] stringArray0 = new String[3][2];
        String[] stringArray1 = new String[2];
        stringArray1[0] = "-z";
        String[] stringArray2 = new String[2];
        stringArray2[0] = "";
        stringArray0[0] = stringArray2;
        JCLO jCLO0 = new JCLO((Object) "-x", stringArray0);
        // Undeclared exception!
        try {
            jCLO0.parse(stringArray1);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test07() throws Throwable {
        String[][] stringArray0 = new String[3][2];
        String[] stringArray1 = new String[2];
        stringArray1[0] = "-z";
        stringArray0[1] = stringArray1;
        stringArray0[0] = stringArray1;
        stringArray0[2] = stringArray1;
        JCLO jCLO0 = new JCLO((Object) "-x", stringArray0);
        // Undeclared exception!
        try {
            jCLO0.parse(stringArray1);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No such option: \"\"
            //

        }
    }

    @Test
    public void test08() throws Throwable {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-mXQ96=6";
        JCLO jCLO0 = new JCLO("-mXQ96=6666");
        // Undeclared exception!
        try {
            jCLO0.parse(stringArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No such option: \"XQ96\"
            //

        }
    }

    @Test
    public void test09() throws Throwable {
        JCLO jCLO0 = new JCLO("t", "t");
        String string0 = jCLO0.usage();
        assertEquals("", string0);
    }

    @Test
    public void test10() throws Throwable {
        JCLO jCLO0 = new JCLO("", "");
        String string0 = jCLO0.usage();
        assertEquals("-hash int\n", string0);
    }

    @Test
    public void test11() throws Throwable {
        Object object0 = new Object();
        JCLO jCLO0 = new JCLO(",H)rLFwow", object0);
        String string0 = jCLO0.toString();
        assertEquals("", string0);
    }

    @Test
    public void test12() throws Throwable {
        Object object0 = new Object();
        String[] stringArray0 = new String[1];
        stringArray0[0] = ",H)rLFwow";
        JCLO jCLO0 = new JCLO(",H)rLFwow", object0);
        jCLO0.parse(stringArray0);
        assertEquals(1, stringArray0.length);
    }

    @Test
    public void test13() throws Throwable {
        JCLO jCLO0 = new JCLO("<;39k:=Wuwo=mJq");
        String[] stringArray0 = new String[6];
        stringArray0[0] = "-`CASE_INSENSITIVE_ORDER";
        // Undeclared exception!
        try {
            jCLO0.parse(stringArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // '-`CASE_INSENSITIVE_ORDER' requires '=VALUE'
            //

        }
    }

    @Test
    public void test14() throws Throwable {
        String[][] stringArray0 = new String[3][2];
        JCLO jCLO0 = new JCLO((Object) "-x", stringArray0);
        String string0 = jCLO0.usage();
        assertEquals("-hash int\n", string0);
    }

    @Test
    public void test15() throws Throwable {
        JCLO jCLO0 = new JCLO("", "");
        // Undeclared exception!
        try {
            jCLO0.toString();
            fail("Expecting exception: ClassCastException");

        } catch (ClassCastException e) {
            //
            // [C cannot be cast to [Ljava.lang.Object;
            //

        }
    }

    @Test
    public void test16() {
        JCLO jclo = new JCLO(new A());
        jclo.parse(new String[]{"-a=2", "-d=true", "-f=A", "-e=13"});
        jclo.usage();
        jclo.toString();
    }

    @Test
    public void test17() {
        JCLO jclo = new JCLO(new A());
        jclo.parse(new String[]{"-a=1", "-c=2", "this this"});
        jclo.usage();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test18() {
        JCLO jclo = new JCLO(new B());
        jclo.parse(new String[]{"-a=1", "-A=2"});
        jclo.usage();
    }

    @Test
    public void test19() {
        JCLO jclo = new JCLO(new A());
        jclo.parse(new String[]{"-a=1", "-c=2", "-d=false", "-f=C", "-g=0", "-h=1.2", "-i='d'", "-j=2", "-k=3"});
        jclo.usage();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test20() {
        JCLO jclo = new JCLO(new C());
        jclo.parse(new String[]{"-a=1"});
        jclo.usage();
    }


    @Test(expected = IllegalArgumentException.class)
    public void test21() {
        JCLO jclo = new JCLO(new A());
        jclo.parse(new String[]{"-1"});
        jclo.usage();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test22() {
        JCLO jclo = new JCLO(new A());
        jclo.parse(new String[]{"-anull"});
        jclo.usage();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test23() {
        JCLO jclo = new JCLO(new D());
        jclo.parse(new String[]{"--a="});
        jclo.usage();
    }

    @Test
    public void test24() {
        JCLO jclo = new JCLO(new D());
        jclo.parse(new String[]{"1 2 3"});
        jclo.usage();
    }

    @Test
    public void test25() {
        JCLO jclo = new JCLO(new D());
        jclo.parse(new String[]{"-a", "1", "2", "3"});
        jclo.usage();
    }

    @Test
    public void test26() {
        JCLO jclo = new JCLO(new B());
        jclo.parse(new String[]{"-c", "fa"});
        jclo.usage();
    }

    @Test
    public void test27() {
        JCLO jclo = new JCLO(new D());
        jclo.parse(new String[]{"a", "1", "2", "3"});
        jclo.usage();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test28() {
        JCLO jclo = new JCLO(new D());
        jclo.parse(new String[]{"-a", "12", "-b"});
        jclo.usage();
    }

    @Test
    public void test29() {
        JCLO jclo = new JCLO(new D());
        jclo.parse(new String[]{"-a=1", "-a=2"});
        jclo.usage();
    }

    @Test
    public void test30() {
        String aliases[][] = {{"alias", "a"}};
        JCLO jclo = new JCLO(new D(), aliases);
        jclo.parse(new String[]{"-alias=1", "-a=2"});
        jclo.usage();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test31() {
        JCLO jclo = new JCLO(new D());
        jclo.parse(new String[]{"--a", "-a=2"});
        jclo.usage();
    }

    enum E {
        A, B, C, D, E
    }

    class A {
        private int a;
        private String b;
        private double c;
        private boolean d;
        private int e;
        private E f;
        private String[] additional;
        private byte g;
        private float h;
        private char i;
        private short j;
        private long k;
    }

    class B {
        private int a;
        private A b;
        private boolean c;
    }

    class C {
        private Integer a;
    }

    class D {
        private int[] a;
        private int b;
    }

}

