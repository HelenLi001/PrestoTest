/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 03:00:03 GMT 2021
 */

package com.facebook.presto.plugin.blackhole;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.plugin.blackhole.BlackHoleColumnHandle;
import com.facebook.presto.plugin.blackhole.BlackHoleTableHandle;
import com.facebook.presto.spi.ConnectorTableMetadata;
import io.airlift.units.Duration;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlackHoleTableHandle_ESTest extends BlackHoleTableHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "", (List<BlackHoleColumnHandle>) null, 4462, 4462, 4462, 4462, (Duration) null);
      boolean boolean0 = blackHoleTableHandle0.equals(blackHoleTableHandle0);
      assertTrue(boolean0);
      assertEquals(4462, blackHoleTableHandle0.getSplitCount());
      assertEquals(4462, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(4462, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(4462, blackHoleTableHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 4466, 4466, 4466, 4466, (Duration) null);
      blackHoleTableHandle0.getTableName();
      assertEquals(4466, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(4466, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4466, blackHoleTableHandle0.getSplitCount());
      assertEquals(4466, blackHoleTableHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "", (List<BlackHoleColumnHandle>) null, 4466, 4466, 4466, 4466, (Duration) null);
      String string0 = blackHoleTableHandle0.getTableName();
      assertEquals(4466, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(4466, blackHoleTableHandle0.getSplitCount());
      assertNotNull(string0);
      assertEquals(4466, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4466, blackHoleTableHandle0.getPagesPerSplit());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "':1", (List<BlackHoleColumnHandle>) null, 0, 0, 0, 0, (Duration) null);
      int int0 = blackHoleTableHandle0.getSplitCount();
      assertEquals(0, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(0, blackHoleTableHandle0.getFieldsLength());
      assertEquals(0, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("", "", (List<BlackHoleColumnHandle>) null, (-1668), (-1668), (-1668), (-1668), (Duration) null);
      int int0 = blackHoleTableHandle0.getSplitCount();
      assertEquals((-1668), blackHoleTableHandle0.getFieldsLength());
      assertEquals((-1668), int0);
      assertEquals((-1668), blackHoleTableHandle0.getPagesPerSplit());
      assertEquals((-1668), blackHoleTableHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("fmQl", "faZiz?J", (List<BlackHoleColumnHandle>) null, 1, 0, 0, 2028, (Duration) null);
      String string0 = blackHoleTableHandle0.getSchemaName();
      assertEquals("faZiz?J", blackHoleTableHandle0.getTableName());
      assertEquals(0, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableHandle0.getRowsPerPage());
      assertEquals("fmQl", string0);
      assertEquals(1, blackHoleTableHandle0.getSplitCount());
      assertEquals(2028, blackHoleTableHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("", "", (List<BlackHoleColumnHandle>) null, 0, (-1992), 2317, 0, (Duration) null);
      blackHoleTableHandle0.getSchemaName();
      assertEquals(0, blackHoleTableHandle0.getFieldsLength());
      assertEquals((-1992), blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(2317, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(0, blackHoleTableHandle0.getSplitCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("':1", "value is not a number", (List<BlackHoleColumnHandle>) null, 0, (-383), 0, (-383), (Duration) null);
      int int0 = blackHoleTableHandle0.getRowsPerPage();
      assertEquals((-383), blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableHandle0.getSplitCount());
      assertEquals(0, int0);
      assertEquals((-383), blackHoleTableHandle0.getFieldsLength());
      assertEquals("':1", blackHoleTableHandle0.getSchemaName());
      assertEquals("value is not a number", blackHoleTableHandle0.getTableName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("]:)`8ZqoWP|BSx5V)", "", (List<BlackHoleColumnHandle>) null, 0, (-763), (-208), 4466, (Duration) null);
      int int0 = blackHoleTableHandle0.getRowsPerPage();
      assertEquals("", blackHoleTableHandle0.getTableName());
      assertEquals(4466, blackHoleTableHandle0.getFieldsLength());
      assertEquals("]:)`8ZqoWP|BSx5V)", blackHoleTableHandle0.getSchemaName());
      assertEquals((-763), blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableHandle0.getSplitCount());
      assertEquals((-208), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "':1", (List<BlackHoleColumnHandle>) null, 0, 0, 0, 0, (Duration) null);
      int int0 = blackHoleTableHandle0.getPagesPerSplit();
      assertEquals(0, int0);
      assertEquals(0, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(0, blackHoleTableHandle0.getFieldsLength());
      assertEquals(0, blackHoleTableHandle0.getSplitCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "':1", (List<BlackHoleColumnHandle>) null, (-2715), (-2715), (-2715), (-2715), (Duration) null);
      int int0 = blackHoleTableHandle0.getPagesPerSplit();
      assertEquals((-2715), blackHoleTableHandle0.getRowsPerPage());
      assertEquals((-2715), blackHoleTableHandle0.getSplitCount());
      assertEquals((-2715), int0);
      assertEquals((-2715), blackHoleTableHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "", (List<BlackHoleColumnHandle>) null, 0, 0, 0, 0, (Duration) null);
      int int0 = blackHoleTableHandle0.getFieldsLength();
      assertEquals(0, blackHoleTableHandle0.getSplitCount());
      assertEquals(0, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(0, int0);
      assertEquals(0, blackHoleTableHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("':1", "':1", (List<BlackHoleColumnHandle>) null, 0, (-1275), 278, (-1303), (Duration) null);
      int int0 = blackHoleTableHandle0.getFieldsLength();
      assertEquals(278, blackHoleTableHandle0.getRowsPerPage());
      assertEquals((-1303), int0);
      assertEquals(0, blackHoleTableHandle0.getSplitCount());
      assertEquals((-1275), blackHoleTableHandle0.getPagesPerSplit());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("':1", "7/} Qtg7ad", (List<BlackHoleColumnHandle>) null, (-594), (-594), (-594), 0, (Duration) null);
      // Undeclared exception!
      try { 
        blackHoleTableHandle0.toTableMetadata();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.blackhole.BlackHoleTableHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("5dN:c5b&p", "", (List<BlackHoleColumnHandle>) null, (-892), 0, 4462, 4462, (Duration) null);
      // Undeclared exception!
      try { 
        blackHoleTableHandle0.toTableMetadata();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // tableName is empty
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "", (List<BlackHoleColumnHandle>) null, 4466, 4466, 4466, 4466, (Duration) null);
      // Undeclared exception!
      try { 
        blackHoleTableHandle0.toSchemaTableName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // schemaName is null
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("", (String) null, (List<BlackHoleColumnHandle>) null, 0, 1, 4462, 1, (Duration) null);
      // Undeclared exception!
      try { 
        blackHoleTableHandle0.toSchemaTableName();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // schemaName is empty
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("':1", "value is not a number", (List<BlackHoleColumnHandle>) null, 0, (-383), 0, (-383), (Duration) null);
      String string0 = blackHoleTableHandle0.getTableName();
      assertEquals((-383), blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(0, blackHoleTableHandle0.getSplitCount());
      assertEquals("value is not a number", string0);
      assertEquals("':1", blackHoleTableHandle0.getSchemaName());
      assertEquals((-383), blackHoleTableHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle("com.facebook.presto.plugin.blackhole.BlackHoleTableHandle", "com.facebook.presto.plugin.blackhole.BlackHoleTableHandle", (List<BlackHoleColumnHandle>) null, 1, 32, 1, 32, (Duration) null);
      blackHoleTableHandle0.toSchemaTableName();
      assertEquals(32, blackHoleTableHandle0.getFieldsLength());
      assertEquals(32, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(1, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(1, blackHoleTableHandle0.getSplitCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "':1", (List<BlackHoleColumnHandle>) null, 0, 0, 0, 0, (Duration) null);
      String string0 = blackHoleTableHandle0.getSchemaName();
      assertEquals(0, blackHoleTableHandle0.getFieldsLength());
      assertEquals(0, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableHandle0.getSplitCount());
      assertEquals(0, blackHoleTableHandle0.getRowsPerPage());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "", (List<BlackHoleColumnHandle>) null, 4462, 4462, 4462, 4462, (Duration) null);
      BlackHoleTableHandle blackHoleTableHandle1 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 4462, 4462, 4462, 4462, (Duration) null);
      boolean boolean0 = blackHoleTableHandle0.equals(blackHoleTableHandle1);
      assertEquals(4462, blackHoleTableHandle1.getSplitCount());
      assertEquals(4462, blackHoleTableHandle1.getRowsPerPage());
      assertFalse(boolean0);
      assertEquals(4462, blackHoleTableHandle1.getFieldsLength());
      assertEquals(4462, blackHoleTableHandle1.getPagesPerSplit());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "9'", (List<BlackHoleColumnHandle>) null, 4530, 4530, 4530, 4530, (Duration) null);
      boolean boolean0 = blackHoleTableHandle0.equals("9'");
      assertEquals(4530, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4530, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(4530, blackHoleTableHandle0.getSplitCount());
      assertEquals(4530, blackHoleTableHandle0.getRowsPerPage());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "9'", (List<BlackHoleColumnHandle>) null, 4530, 4530, 4530, 4530, (Duration) null);
      boolean boolean0 = blackHoleTableHandle0.equals((Object) null);
      assertEquals(4530, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4530, blackHoleTableHandle0.getSplitCount());
      assertEquals(4530, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(4530, blackHoleTableHandle0.getPagesPerSplit());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 4462, 4462, 4462, 4462, (Duration) null);
      blackHoleTableHandle0.getColumnHandles();
      assertEquals(4462, blackHoleTableHandle0.getSplitCount());
      assertEquals(4462, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(4462, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4462, blackHoleTableHandle0.getPagesPerSplit());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "9'", (List<BlackHoleColumnHandle>) null, 4530, 4530, 4530, 4530, (Duration) null);
      int int0 = blackHoleTableHandle0.getSplitCount();
      assertEquals(4530, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(4530, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(4530, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4530, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "9'", (List<BlackHoleColumnHandle>) null, 4530, 4530, 4530, 4530, (Duration) null);
      blackHoleTableHandle0.getPageProcessingDelay();
      assertEquals(4530, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4530, blackHoleTableHandle0.getSplitCount());
      assertEquals(4530, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(4530, blackHoleTableHandle0.getPagesPerSplit());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "9'", (List<BlackHoleColumnHandle>) null, 4530, 4530, 4530, 4530, (Duration) null);
      blackHoleTableHandle0.hashCode();
      assertEquals(4530, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4530, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(4530, blackHoleTableHandle0.getSplitCount());
      assertEquals(4530, blackHoleTableHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 4462, 4462, 4462, 4462, (Duration) null);
      BlackHoleTableHandle blackHoleTableHandle1 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 4462, 4462, (-11), (-11), (Duration) null);
      boolean boolean0 = blackHoleTableHandle0.equals(blackHoleTableHandle1);
      assertEquals(4462, blackHoleTableHandle1.getPagesPerSplit());
      assertEquals(4462, blackHoleTableHandle1.getSplitCount());
      assertEquals((-11), blackHoleTableHandle1.getFieldsLength());
      assertEquals((-11), blackHoleTableHandle1.getRowsPerPage());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 4462, 4462, 4462, 4462, (Duration) null);
      // Undeclared exception!
      try { 
        blackHoleTableHandle0.toTableMetadata();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // schemaName is null
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 1882, 1882, 1882, 1882, (Duration) null);
      BlackHoleTableHandle blackHoleTableHandle1 = new BlackHoleTableHandle("com.facebook.presto.plugin.blackhole.BlackHoleTableHandle", (String) null, (List<BlackHoleColumnHandle>) null, 1882, 1882, 1882, 1882, (Duration) null);
      boolean boolean0 = blackHoleTableHandle0.equals(blackHoleTableHandle1);
      assertEquals(1882, blackHoleTableHandle1.getSplitCount());
      assertEquals(1882, blackHoleTableHandle1.getRowsPerPage());
      assertFalse(boolean0);
      assertEquals(1882, blackHoleTableHandle1.getFieldsLength());
      assertEquals(1882, blackHoleTableHandle1.getPagesPerSplit());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 1882, 1882, 1882, 1882, (Duration) null);
      int int0 = blackHoleTableHandle0.getRowsPerPage();
      assertEquals(1882, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(1882, int0);
      assertEquals(1882, blackHoleTableHandle0.getFieldsLength());
      assertEquals(1882, blackHoleTableHandle0.getSplitCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, (String) null, (List<BlackHoleColumnHandle>) null, 1882, 1882, 1882, 1882, (Duration) null);
      int int0 = blackHoleTableHandle0.getFieldsLength();
      assertEquals(1882, blackHoleTableHandle0.getSplitCount());
      assertEquals(1882, blackHoleTableHandle0.getPagesPerSplit());
      assertEquals(1882, int0);
      assertEquals(1882, blackHoleTableHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = new BlackHoleTableHandle((String) null, "9'", (List<BlackHoleColumnHandle>) null, 4530, 4530, 4530, 4530, (Duration) null);
      int int0 = blackHoleTableHandle0.getPagesPerSplit();
      assertEquals(4530, blackHoleTableHandle0.getFieldsLength());
      assertEquals(4530, blackHoleTableHandle0.getRowsPerPage());
      assertEquals(4530, blackHoleTableHandle0.getSplitCount());
      assertEquals(4530, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BlackHoleTableHandle blackHoleTableHandle0 = null;
      try {
        blackHoleTableHandle0 = new BlackHoleTableHandle((ConnectorTableMetadata) null, 1, 1710, 0, 0, (Duration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.blackhole.BlackHoleTableHandle", e);
      }
  }
}
