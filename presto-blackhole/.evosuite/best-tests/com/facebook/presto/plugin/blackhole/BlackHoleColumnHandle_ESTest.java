/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:57:53 GMT 2021
 */

package com.facebook.presto.plugin.blackhole;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.plugin.blackhole.BlackHoleColumnHandle;
import com.facebook.presto.spi.ColumnMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlackHoleColumnHandle_ESTest extends BlackHoleColumnHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("o=;c_=}se~", type0);
      ColumnMetadata columnMetadata0 = blackHoleColumnHandle0.toColumnMetadata();
      assertEquals("o=;c_=}se~", columnMetadata0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("Di", type0);
      String string0 = blackHoleColumnHandle0.getName();
      assertEquals("Di", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("", type0);
      String string0 = blackHoleColumnHandle0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("", type0);
      Type type1 = blackHoleColumnHandle0.getColumnType();
      assertSame(type1, type0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("com.facebook.presto.common.type.P4HyperLogLogType", (Type) null);
      // Undeclared exception!
      try { 
        blackHoleColumnHandle0.toColumnMetadata();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("", type0);
      // Undeclared exception!
      try { 
        blackHoleColumnHandle0.toColumnMetadata();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name is empty
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlackHoleColumnHandle blackHoleColumnHandle0 = null;
      try {
        blackHoleColumnHandle0 = new BlackHoleColumnHandle((ColumnMetadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.blackhole.BlackHoleColumnHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("", type0);
      Type type1 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlackHoleColumnHandle blackHoleColumnHandle1 = new BlackHoleColumnHandle("", type1);
      boolean boolean0 = blackHoleColumnHandle0.equals(blackHoleColumnHandle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ColumnMetadata columnMetadata0 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata0).getName();
      doReturn((Type) null).when(columnMetadata0).getType();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle(columnMetadata0);
      ColumnMetadata columnMetadata1 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata1).getName();
      doReturn((Type) null).when(columnMetadata1).getType();
      BlackHoleColumnHandle blackHoleColumnHandle1 = new BlackHoleColumnHandle(columnMetadata1);
      boolean boolean0 = blackHoleColumnHandle0.equals(blackHoleColumnHandle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("", type0);
      boolean boolean0 = blackHoleColumnHandle0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColumnMetadata columnMetadata0 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata0).getName();
      doReturn((Type) null).when(columnMetadata0).getType();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle(columnMetadata0);
      boolean boolean0 = blackHoleColumnHandle0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ColumnMetadata columnMetadata0 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata0).getName();
      doReturn((Type) null).when(columnMetadata0).getType();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle(columnMetadata0);
      boolean boolean0 = blackHoleColumnHandle0.equals(blackHoleColumnHandle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle("o=;c_=}se~", type0);
      ColumnMetadata columnMetadata0 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata0).getName();
      doReturn((Type) null).when(columnMetadata0).getType();
      BlackHoleColumnHandle blackHoleColumnHandle1 = new BlackHoleColumnHandle(columnMetadata0);
      boolean boolean0 = blackHoleColumnHandle0.equals(blackHoleColumnHandle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ColumnMetadata columnMetadata0 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata0).getName();
      doReturn((Type) null).when(columnMetadata0).getType();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle(columnMetadata0);
      blackHoleColumnHandle0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ColumnMetadata columnMetadata0 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata0).getName();
      doReturn((Type) null).when(columnMetadata0).getType();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle(columnMetadata0);
      String string0 = blackHoleColumnHandle0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ColumnMetadata columnMetadata0 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata0).getName();
      doReturn((Type) null).when(columnMetadata0).getType();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle(columnMetadata0);
      // Undeclared exception!
      try { 
        blackHoleColumnHandle0.toColumnMetadata();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name is null
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ColumnMetadata columnMetadata0 = mock(ColumnMetadata.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(columnMetadata0).getName();
      doReturn((Type) null).when(columnMetadata0).getType();
      BlackHoleColumnHandle blackHoleColumnHandle0 = new BlackHoleColumnHandle(columnMetadata0);
      Type type0 = blackHoleColumnHandle0.getColumnType();
      assertNull(type0);
  }
}
