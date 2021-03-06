/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 19:13:48 GMT 2021
 */

package com.facebook.presto.connector.thrift;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.connector.thrift.ThriftPlugin;
import com.facebook.presto.spi.connector.ConnectorFactory;
import com.google.inject.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThriftPlugin_ESTest extends ThriftPlugin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThriftPlugin thriftPlugin0 = null;
      try {
        thriftPlugin0 = new ThriftPlugin("pWu aM81a", (Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // module is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThriftPlugin thriftPlugin0 = null;
      try {
        thriftPlugin0 = new ThriftPlugin("", (Module) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name is null or empty
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThriftPlugin thriftPlugin0 = new ThriftPlugin();
      Iterable<ConnectorFactory> iterable0 = thriftPlugin0.getConnectorFactories();
      assertNotNull(iterable0);
  }
}
