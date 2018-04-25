/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 24 13:30:56 GMT 2018
 */

package main.java.net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.net.mooctest.Date;
import main.java.net.mooctest.Day;
import main.java.net.mooctest.Month;
import main.java.net.mooctest.Year;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Date_ESTest extends Date_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Date date0 = new Date(2, 2, (-2649));
      Year year0 = date0.getYear();
      assertEquals((-2649), year0.getYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Date date0 = null;
      try {
        date0 = new Date((-3877), 11, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not a valid month
         //
         verifyException("main.java.net.mooctest.Year", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Date date0 = new Date(3, 3, 3);
      Date date1 = new Date(11, 3, 3);
      boolean boolean0 = date0.equals(date1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Date date0 = new Date(3, 3, 3);
      Date date1 = new Date(11, 11, 11);
      boolean boolean0 = date0.equals(date1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Date date0 = new Date(3, 3, 3);
      boolean boolean0 = date0.equals(date0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = new Date(12, 31, (-2264));
      date0.increment();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Date date0 = new Date(1, 31, 31);
      date0.increment();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Date date0 = new Date(3, 3, 3);
      date0.increment();
      Date date1 = new Date(3, 3, 3);
      boolean boolean0 = date0.equals(date1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Date date0 = new Date(12, 31, (-2264));
      Month month0 = date0.getMonth();
      assertEquals(12, month0.getMonth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = new Date(11, 11, (-1498));
      String string0 = date0.toString();
      assertEquals("11/11/-1498", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Date date0 = new Date(3, 3, 3);
      Year year0 = date0.getYear();
      boolean boolean0 = date0.equals(year0);
      assertFalse(boolean0);
      assertEquals(3, year0.getYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Date date0 = new Date(11, 11, (-1498));
      Day day0 = date0.getDay();
      assertEquals(11, day0.getDay());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Date date0 = new Date(11, 11, (-1498));
      date0.printDate();
  }
}