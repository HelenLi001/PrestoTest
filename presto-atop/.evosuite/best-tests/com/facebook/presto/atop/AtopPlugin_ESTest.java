/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 23:46:00 GMT 2021
 */

package com.facebook.presto.atop;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.atop.AtopPlugin;
import com.facebook.presto.spi.connector.ConnectorFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AtopPlugin_ESTest extends AtopPlugin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AtopPlugin atopPlugin0 = new AtopPlugin();
      Iterable<ConnectorFactory> iterable0 = atopPlugin0.getConnectorFactories();
      assertNotNull(iterable0);
  }
}
