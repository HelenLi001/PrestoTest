/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 09:56:29 GMT 2021
 */

package com.facebook.presto.functionNamespace.mysql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.functionNamespace.mysql.UserDefinedTypeRowMapper;
import java.sql.ResultSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdbi.v3.core.statement.StatementContext;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserDefinedTypeRowMapper_ESTest extends UserDefinedTypeRowMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserDefinedTypeRowMapper userDefinedTypeRowMapper0 = new UserDefinedTypeRowMapper();
      // Undeclared exception!
      try { 
        userDefinedTypeRowMapper0.map((ResultSet) null, (StatementContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.functionNamespace.mysql.UserDefinedTypeRowMapper", e);
      }
  }
}
