/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 01:28:32 GMT 2021
 */

package org.apache.log4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.log4j.JulAppender;
import org.apache.log4j.spi.LoggingEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JulAppender_ESTest extends JulAppender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulAppender julAppender0 = new JulAppender();
      // Undeclared exception!
      try { 
        julAppender0.append((LoggingEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.log4j.JulAppender", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JulAppender julAppender0 = new JulAppender();
      julAppender0.close();
      assertNull(julAppender0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JulAppender julAppender0 = new JulAppender();
      boolean boolean0 = julAppender0.requiresLayout();
      assertTrue(boolean0);
  }
}
