/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 18 22:33:48 GMT 2021
 */

package com.facebook.presto.spark.classloader_interface;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.spark.classloader_interface.PrestoSparkNonRetryableExecutionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrestoSparkExecutionException_ESTest extends PrestoSparkExecutionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrestoSparkNonRetryableExecutionException prestoSparkNonRetryableExecutionException0 = new PrestoSparkNonRetryableExecutionException("org.apache.spark.rpc.RpcAddress", "com.facebook.presto.spark.classloader_interface.PrestoSparkExecutionException", (Throwable) null);
  }
}
