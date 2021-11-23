/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 23:42:24 GMT 2021
 */

package com.facebook.presto.atop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.atop.AtopConnectorFactory;
import com.facebook.presto.atop.AtopProcessFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AtopConnectorFactory_ESTest extends AtopConnectorFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<AtopProcessFactory> class0 = AtopProcessFactory.class;
      AtopConnectorFactory atopConnectorFactory0 = null;
      try {
        atopConnectorFactory0 = new AtopConnectorFactory(class0, (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // classLoader is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
