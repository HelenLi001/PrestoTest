/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 17:44:24 GMT 2021
 */

package com.facebook.presto.resourceGroups.db;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.resourceGroups.db.ResourceGroupGlobalProperties;
import io.airlift.units.Duration;
import java.sql.ResultSet;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdbi.v3.core.statement.StatementContext;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResourceGroupGlobalProperties_ESTest extends ResourceGroupGlobalProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ResourceGroupGlobalProperties resourceGroupGlobalProperties0 = null;
      try {
        resourceGroupGlobalProperties0 = new ResourceGroupGlobalProperties((Optional<Duration>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cpu Quota Period is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResourceGroupGlobalProperties.Mapper resourceGroupGlobalProperties_Mapper0 = new ResourceGroupGlobalProperties.Mapper();
      // Undeclared exception!
      try { 
        resourceGroupGlobalProperties_Mapper0.map((ResultSet) null, (StatementContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.resourceGroups.db.ResourceGroupGlobalProperties$Mapper", e);
      }
  }
}
