/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 24 13:31:36 GMT 2018
 */

package main.java.net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.net.mooctest.Date;
import main.java.net.mooctest.Nextday;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Nextday_ESTest extends Nextday_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Nextday.nextDay((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.net.mooctest.Nextday", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Date date0 = new Date(12, 12, 12);
      Date date1 = Nextday.nextDay(date0);
      assertNotSame(date1, date0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Nextday nextday0 = new Nextday();
  }
}
