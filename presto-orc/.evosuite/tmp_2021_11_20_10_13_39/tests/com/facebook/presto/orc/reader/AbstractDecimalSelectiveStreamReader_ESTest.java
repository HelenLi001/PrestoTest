/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 18:40:52 GMT 2021
 */

package com.facebook.presto.orc.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractDecimalSelectiveStreamReader_ESTest extends AbstractDecimalSelectiveStreamReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "com.facebook.presto.orc.reader.AbstractDecimalSelectiveStreamReader";
      Thread thread0 = Thread.currentThread();
      ClassLoader classLoader0 = thread0.getContextClassLoader();
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        Class.forName(string0, boolean0, classLoader0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }
}
