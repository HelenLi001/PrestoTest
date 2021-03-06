/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 18:41:31 GMT 2021
 */

package com.facebook.presto.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.jdbc.PrestoConnection;
import com.facebook.presto.jdbc.PrestoPreparedStatement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrestoPreparedStatement_ESTest extends PrestoPreparedStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrestoPreparedStatement prestoPreparedStatement0 = null;
      try {
        prestoPreparedStatement0 = new PrestoPreparedStatement((PrestoConnection) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // connection is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
