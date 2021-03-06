/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 03:05:24 GMT 2021
 */

package com.facebook.presto.plugin.blackhole;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.plugin.blackhole.BlackHoleHandleResolver;
import com.facebook.presto.spi.ColumnHandle;
import com.facebook.presto.spi.ConnectorInsertTableHandle;
import com.facebook.presto.spi.ConnectorOutputTableHandle;
import com.facebook.presto.spi.ConnectorSplit;
import com.facebook.presto.spi.ConnectorTableHandle;
import com.facebook.presto.spi.ConnectorTableLayoutHandle;
import com.facebook.presto.spi.connector.ConnectorPartitioningHandle;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlackHoleHandleResolver_ESTest extends BlackHoleHandleResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlackHoleHandleResolver blackHoleHandleResolver0 = new BlackHoleHandleResolver();
      Class<? extends ConnectorInsertTableHandle> class0 = blackHoleHandleResolver0.getInsertTableHandleClass();
      assertFalse(class0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BlackHoleHandleResolver blackHoleHandleResolver0 = new BlackHoleHandleResolver();
      Class<? extends ConnectorOutputTableHandle> class0 = blackHoleHandleResolver0.getOutputTableHandleClass();
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BlackHoleHandleResolver blackHoleHandleResolver0 = new BlackHoleHandleResolver();
      Class<? extends ConnectorTableLayoutHandle> class0 = blackHoleHandleResolver0.getTableLayoutHandleClass();
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BlackHoleHandleResolver blackHoleHandleResolver0 = new BlackHoleHandleResolver();
      Class<? extends ConnectorSplit> class0 = blackHoleHandleResolver0.getSplitClass();
      assertEquals("class com.facebook.presto.plugin.blackhole.BlackHoleSplit", class0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BlackHoleHandleResolver blackHoleHandleResolver0 = new BlackHoleHandleResolver();
      Class<? extends ConnectorTransactionHandle> class0 = blackHoleHandleResolver0.getTransactionHandleClass();
      assertFalse(class0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BlackHoleHandleResolver blackHoleHandleResolver0 = new BlackHoleHandleResolver();
      Class<? extends ColumnHandle> class0 = blackHoleHandleResolver0.getColumnHandleClass();
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BlackHoleHandleResolver blackHoleHandleResolver0 = new BlackHoleHandleResolver();
      Class<? extends ConnectorTableHandle> class0 = blackHoleHandleResolver0.getTableHandleClass();
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BlackHoleHandleResolver blackHoleHandleResolver0 = new BlackHoleHandleResolver();
      Class<? extends ConnectorPartitioningHandle> class0 = blackHoleHandleResolver0.getPartitioningHandleClass();
      assertFalse(class0.isPrimitive());
  }
}
