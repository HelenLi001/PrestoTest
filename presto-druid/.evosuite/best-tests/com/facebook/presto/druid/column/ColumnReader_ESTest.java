/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:49:41 GMT 2021
 */

package com.facebook.presto.druid.column;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.druid.column.ColumnReader;
import org.apache.druid.segment.ColumnValueSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ColumnReader_ESTest extends ColumnReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ColumnReader.createColumnReader((Type) null, (ColumnValueSelector) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported type: null
         //
         verifyException("com.facebook.presto.druid.column.ColumnReader", e);
      }
  }
}
