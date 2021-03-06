/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:44:02 GMT 2021
 */

package com.facebook.presto.plugin.bigquery;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.plugin.bigquery.BigQueryConfig;
import com.facebook.presto.plugin.bigquery.BigQueryPageSourceProvider;
import com.facebook.presto.plugin.bigquery.BigQueryStorageClientFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BigQueryPageSourceProvider_ESTest extends BigQueryPageSourceProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigQueryPageSourceProvider bigQueryPageSourceProvider0 = null;
      try {
        bigQueryPageSourceProvider0 = new BigQueryPageSourceProvider((BigQueryStorageClientFactory) null, (BigQueryConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.bigquery.BigQueryPageSourceProvider", e);
      }
  }
}
