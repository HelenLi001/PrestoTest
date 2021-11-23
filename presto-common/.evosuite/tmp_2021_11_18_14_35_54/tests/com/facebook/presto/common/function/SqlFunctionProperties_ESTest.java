/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 18 23:50:48 GMT 2021
 */

package com.facebook.presto.common.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.function.SqlFunctionProperties;
import com.facebook.presto.common.type.TimeZoneKey;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlFunctionProperties_ESTest extends SqlFunctionProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      sqlFunctionProperties_Builder0.setLegacyMapSubscript(true);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      sqlFunctionProperties_Builder0.setLegacyTimestamp(true);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      sqlFunctionProperties_Builder0.setLegacyRowFieldOrdinalAccessEnabled(true);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      sqlFunctionProperties_Builder0.setParseDecimalLiteralAsDouble(true);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      // Undeclared exception!
      try { 
        sqlFunctionProperties_Builder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // timeZoneKey is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      sqlFunctionProperties_Builder0.setSessionUser("k}v/");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      sqlFunctionProperties_Builder0.setSessionLocale((Locale) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      sqlFunctionProperties_Builder0.setSessionStartTime(3360L);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      // Undeclared exception!
      try { 
        sqlFunctionProperties_Builder0.setTimeZoneKey((TimeZoneKey) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // timeZoneKey is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SqlFunctionProperties.Builder sqlFunctionProperties_Builder0 = SqlFunctionProperties.builder();
      sqlFunctionProperties_Builder0.setLegacyTypeCoercionWarningEnabled(false);
  }
}
