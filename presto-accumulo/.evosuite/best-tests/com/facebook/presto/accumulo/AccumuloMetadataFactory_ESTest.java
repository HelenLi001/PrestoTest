/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 01:44:50 GMT 2021
 */

package com.facebook.presto.accumulo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.accumulo.AccumuloClient;
import com.facebook.presto.accumulo.AccumuloConnectorId;
import com.facebook.presto.accumulo.AccumuloMetadataFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AccumuloMetadataFactory_ESTest extends AccumuloMetadataFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccumuloMetadataFactory accumuloMetadataFactory0 = null;
      try {
        accumuloMetadataFactory0 = new AccumuloMetadataFactory((AccumuloConnectorId) null, (AccumuloClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // connectorId is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
