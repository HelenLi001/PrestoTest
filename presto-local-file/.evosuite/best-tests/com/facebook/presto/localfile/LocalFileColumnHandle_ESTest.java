/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 04:00:41 GMT 2021
 */

package com.facebook.presto.localfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.localfile.LocalFileColumnHandle;
import com.facebook.presto.spi.ColumnMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocalFileColumnHandle_ESTest extends LocalFileColumnHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("`(2", type0, 9);
      ColumnMetadata columnMetadata0 = localFileColumnHandle0.toColumnMetadata();
      assertEquals(9, localFileColumnHandle0.getOrdinalPosition());
      assertEquals("`(2", columnMetadata0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("!", type0, 0);
      int int0 = localFileColumnHandle0.getOrdinalPosition();
      assertEquals("!", localFileColumnHandle0.getColumnName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("", type0, (-1259));
      int int0 = localFileColumnHandle0.getOrdinalPosition();
      assertEquals("", localFileColumnHandle0.getColumnName());
      assertEquals((-1259), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("com.facebook.presto.common.Subfield", type0, 2);
      String string0 = localFileColumnHandle0.getColumnName();
      assertEquals(2, localFileColumnHandle0.getOrdinalPosition());
      assertEquals("com.facebook.presto.common.Subfield", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalFileColumnHandle localFileColumnHandle0 = null;
      try {
        localFileColumnHandle0 = new LocalFileColumnHandle("m14H`(}o)q*C_Kw", (Type) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // columnType is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).toString();
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("com.facebook.presto.common.Subfield", type0, 2);
      Type type1 = localFileColumnHandle0.getColumnType();
      LocalFileColumnHandle localFileColumnHandle1 = new LocalFileColumnHandle("com.facebook.presto.common.Subfield", type1, 0);
      boolean boolean0 = localFileColumnHandle0.equals(localFileColumnHandle1);
      assertEquals(2, localFileColumnHandle0.getOrdinalPosition());
      assertEquals("com.facebook.presto.common.Subfield", localFileColumnHandle1.getColumnName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("`(2", type0, 9);
      Type type1 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle1 = new LocalFileColumnHandle("`(2", type1, 9);
      boolean boolean0 = localFileColumnHandle1.equals(localFileColumnHandle0);
      assertFalse(boolean0);
      assertEquals(9, localFileColumnHandle1.getOrdinalPosition());
      assertEquals("`(2", localFileColumnHandle1.getColumnName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("com.face_ook.prest.commoB.`pa.S9allinnType", type0, 39);
      Type type1 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle1 = new LocalFileColumnHandle("server_address", type1, 39);
      boolean boolean0 = localFileColumnHandle0.equals(localFileColumnHandle1);
      assertEquals(39, localFileColumnHandle1.getOrdinalPosition());
      assertFalse(boolean0);
      assertEquals("com.face_ook.prest.commoB.`pa.S9allinnType", localFileColumnHandle0.getColumnName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("com.facebook.presto.common.Subfield").when(type0).toString();
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("com.facebook.presto.common.Subfield", type0, 2);
      Type type1 = localFileColumnHandle0.getColumnType();
      LocalFileColumnHandle localFileColumnHandle1 = new LocalFileColumnHandle("com.facebook.presto.common.Subfield", type1, 2);
      boolean boolean0 = localFileColumnHandle0.equals(localFileColumnHandle1);
      assertEquals(2, localFileColumnHandle1.getOrdinalPosition());
      assertTrue(boolean0);
      assertEquals("com.facebook.presto.common.Subfield", localFileColumnHandle1.getColumnName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("com.facebook.presto.common.Subfield", type0, 2418);
      boolean boolean0 = localFileColumnHandle0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(2418, localFileColumnHandle0.getOrdinalPosition());
      assertEquals("com.facebook.presto.common.Subfield", localFileColumnHandle0.getColumnName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("", type0, 2);
      boolean boolean0 = localFileColumnHandle0.equals(localFileColumnHandle0);
      assertEquals(2, localFileColumnHandle0.getOrdinalPosition());
      assertTrue(boolean0);
      assertEquals("", localFileColumnHandle0.getColumnName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("", type0, 2);
      boolean boolean0 = localFileColumnHandle0.equals("");
      assertEquals(2, localFileColumnHandle0.getOrdinalPosition());
      assertFalse(boolean0);
      assertEquals("", localFileColumnHandle0.getColumnName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("v5!Uzs8\u0001n").when(type0).toString();
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("", type0, 2);
      String string0 = localFileColumnHandle0.toString();
      assertEquals("LocalFileColumnHandle{columnName=, columnType=v5!Uzs8\u0001n, ordinalPosition=2}", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("", type0, 2);
      // Undeclared exception!
      try { 
        localFileColumnHandle0.toColumnMetadata();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name is empty
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("com.facebook.presto.common.Subfield", type0, 2);
      localFileColumnHandle0.hashCode();
      assertEquals("com.facebook.presto.common.Subfield", localFileColumnHandle0.getColumnName());
      assertEquals(2, localFileColumnHandle0.getOrdinalPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("com.facebook.presto.common.Subfield", type0, 2418);
      int int0 = localFileColumnHandle0.getOrdinalPosition();
      assertEquals("com.facebook.presto.common.Subfield", localFileColumnHandle0.getColumnName());
      assertEquals(2418, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      LocalFileColumnHandle localFileColumnHandle0 = new LocalFileColumnHandle("", type0, 2);
      String string0 = localFileColumnHandle0.getColumnName();
      assertEquals("", string0);
      assertEquals(2, localFileColumnHandle0.getOrdinalPosition());
  }
}
