/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 10:37:05 GMT 2021
 */

package com.facebook.presto.spark;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.client.Column;
import com.facebook.presto.spark.PrestoSparkQueryData;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrestoSparkQueryData_ESTest extends PrestoSparkQueryData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrestoSparkQueryData prestoSparkQueryData0 = null;
      try {
        prestoSparkQueryData0 = new PrestoSparkQueryData((List<Column>) null, (List<List<Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // columns is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
