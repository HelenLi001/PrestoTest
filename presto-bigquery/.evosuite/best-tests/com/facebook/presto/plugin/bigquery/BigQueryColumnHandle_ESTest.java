/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:33:40 GMT 2021
 */

package com.facebook.presto.plugin.bigquery;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.plugin.bigquery.BigQueryColumnHandle;
import com.facebook.presto.plugin.bigquery.BigQueryType;
import com.google.cloud.bigquery.Field;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BigQueryColumnHandle_ESTest extends BigQueryColumnHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Field.Mode field_Mode0 = Field.Mode.REPEATED;
      BigQueryType bigQueryType0 = BigQueryType.TIMESTAMP;
      BigQueryColumnHandle bigQueryColumnHandle0 = null;
      try {
        bigQueryColumnHandle0 = new BigQueryColumnHandle("typeName in*s null", bigQueryType0, field_Mode0, (List<BigQueryColumnHandle>) null, "typeName in*s null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // subColumns is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
