/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 03:49:11 GMT 2021
 */

package com.facebook.presto.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.example.ExampleConnectorId;
import com.facebook.presto.example.ExampleRecordSetProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExampleRecordSetProvider_ESTest extends ExampleRecordSetProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExampleRecordSetProvider exampleRecordSetProvider0 = null;
      try {
        exampleRecordSetProvider0 = new ExampleRecordSetProvider((ExampleConnectorId) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // connectorId is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
