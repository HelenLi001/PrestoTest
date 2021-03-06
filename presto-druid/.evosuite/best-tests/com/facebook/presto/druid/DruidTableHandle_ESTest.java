/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:47:52 GMT 2021
 */

package com.facebook.presto.druid;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.druid.DruidQueryGenerator;
import com.facebook.presto.druid.DruidTableHandle;
import com.facebook.presto.spi.SchemaTableName;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DruidTableHandle_ESTest extends DruidTableHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        DruidTableHandle.fromSchemaTableName((SchemaTableName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.DruidTableHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DruidTableHandle druidTableHandle0 = null;
      try {
        druidTableHandle0 = new DruidTableHandle("{ceaGme", "{ceaGme", (Optional<DruidQueryGenerator.GeneratedDql>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // dql is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
