/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:35:19 GMT 2021
 */

package com.facebook.presto.druid;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.TypeManager;
import com.facebook.presto.druid.DruidAggregationProjectConverter;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.function.FunctionMetadataManager;
import com.facebook.presto.spi.function.StandardFunctionResolution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DruidAggregationProjectConverter_ESTest extends DruidAggregationProjectConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DruidAggregationProjectConverter druidAggregationProjectConverter0 = null;
      try {
        druidAggregationProjectConverter0 = new DruidAggregationProjectConverter((ConnectorSession) null, (TypeManager) null, (FunctionMetadataManager) null, (StandardFunctionResolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type manager
         //
         verifyException("java.util.Objects", e);
      }
  }
}
