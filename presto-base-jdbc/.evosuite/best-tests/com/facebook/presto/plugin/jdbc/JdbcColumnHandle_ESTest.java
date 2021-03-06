/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 04:55:01 GMT 2021
 */

package com.facebook.presto.plugin.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.plugin.jdbc.JdbcColumnHandle;
import com.facebook.presto.plugin.jdbc.JdbcTypeHandle;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JdbcColumnHandle_ESTest extends JdbcColumnHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JdbcTypeHandle jdbcTypeHandle0 = mock(JdbcTypeHandle.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      Optional<String> optional0 = null;
      JdbcColumnHandle jdbcColumnHandle0 = null;
      try {
        jdbcColumnHandle0 = new JdbcColumnHandle("!#xYs>", "!#xYs>", jdbcTypeHandle0, type0, false, (Optional<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // comment is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JdbcTypeHandle jdbcTypeHandle0 = mock(JdbcTypeHandle.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      JdbcColumnHandle jdbcColumnHandle0 = null;
      try {
        jdbcColumnHandle0 = new JdbcColumnHandle("date", "date", jdbcTypeHandle0, type0, false, (Optional<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // comment is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      JdbcColumnHandle jdbcColumnHandle0 = null;
      try {
        jdbcColumnHandle0 = new JdbcColumnHandle("map", "map", (JdbcTypeHandle) null, type0, true, (Optional<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // jdbcTypeHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JdbcTypeHandle jdbcTypeHandle0 = mock(JdbcTypeHandle.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      JdbcColumnHandle jdbcColumnHandle0 = null;
      try {
        jdbcColumnHandle0 = new JdbcColumnHandle((String) null, (String) null, jdbcTypeHandle0, type0, true, (Optional<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // connectorId is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JdbcTypeHandle jdbcTypeHandle0 = mock(JdbcTypeHandle.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      JdbcColumnHandle jdbcColumnHandle0 = null;
      try {
        jdbcColumnHandle0 = new JdbcColumnHandle("2Iu", "2Iu", jdbcTypeHandle0, type0, true, (Optional<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // comment is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
