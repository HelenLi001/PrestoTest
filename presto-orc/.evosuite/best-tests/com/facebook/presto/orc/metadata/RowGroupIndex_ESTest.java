/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 20:04:24 GMT 2021
 */

package com.facebook.presto.orc.metadata;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.orc.metadata.RowGroupIndex;
import com.facebook.presto.orc.metadata.statistics.ColumnStatistics;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RowGroupIndex_ESTest extends RowGroupIndex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RowGroupIndex rowGroupIndex0 = null;
      try {
        rowGroupIndex0 = new RowGroupIndex((List<Integer>) null, (ColumnStatistics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // positions is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
