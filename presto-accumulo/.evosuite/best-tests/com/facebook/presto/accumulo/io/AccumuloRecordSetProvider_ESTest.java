/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 01:40:49 GMT 2021
 */

package com.facebook.presto.accumulo.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.accumulo.AccumuloConnectorId;
import com.facebook.presto.accumulo.conf.AccumuloConfig;
import com.facebook.presto.accumulo.io.AccumuloRecordSetProvider;
import org.apache.accumulo.core.client.Connector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AccumuloRecordSetProvider_ESTest extends AccumuloRecordSetProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccumuloRecordSetProvider accumuloRecordSetProvider0 = null;
      try {
        accumuloRecordSetProvider0 = new AccumuloRecordSetProvider((Connector) null, (AccumuloConnectorId) null, (AccumuloConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // connector is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
