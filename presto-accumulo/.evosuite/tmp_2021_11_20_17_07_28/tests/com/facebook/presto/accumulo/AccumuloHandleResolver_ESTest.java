/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 01:42:52 GMT 2021
 */

package com.facebook.presto.accumulo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.accumulo.AccumuloHandleResolver;
import com.facebook.presto.spi.ColumnHandle;
import com.facebook.presto.spi.ConnectorInsertTableHandle;
import com.facebook.presto.spi.ConnectorOutputTableHandle;
import com.facebook.presto.spi.ConnectorSplit;
import com.facebook.presto.spi.ConnectorTableHandle;
import com.facebook.presto.spi.ConnectorTableLayoutHandle;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AccumuloHandleResolver_ESTest extends AccumuloHandleResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccumuloHandleResolver accumuloHandleResolver0 = new AccumuloHandleResolver();
      Class<? extends ConnectorSplit> class0 = accumuloHandleResolver0.getSplitClass();
      assertEquals("class com.facebook.presto.accumulo.model.AccumuloSplit", class0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AccumuloHandleResolver accumuloHandleResolver0 = new AccumuloHandleResolver();
      Class<? extends ConnectorTableHandle> class0 = accumuloHandleResolver0.getTableHandleClass();
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AccumuloHandleResolver accumuloHandleResolver0 = new AccumuloHandleResolver();
      Class<? extends ConnectorOutputTableHandle> class0 = accumuloHandleResolver0.getOutputTableHandleClass();
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AccumuloHandleResolver accumuloHandleResolver0 = new AccumuloHandleResolver();
      Class<? extends ConnectorInsertTableHandle> class0 = accumuloHandleResolver0.getInsertTableHandleClass();
      assertEquals(1, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AccumuloHandleResolver accumuloHandleResolver0 = new AccumuloHandleResolver();
      Class<? extends ConnectorTransactionHandle> class0 = accumuloHandleResolver0.getTransactionHandleClass();
      assertEquals("class com.facebook.presto.accumulo.AccumuloTransactionHandle", class0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AccumuloHandleResolver accumuloHandleResolver0 = new AccumuloHandleResolver();
      Class<? extends ColumnHandle> class0 = accumuloHandleResolver0.getColumnHandleClass();
      assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AccumuloHandleResolver accumuloHandleResolver0 = new AccumuloHandleResolver();
      Class<? extends ConnectorTableLayoutHandle> class0 = accumuloHandleResolver0.getTableLayoutHandleClass();
      assertEquals("class com.facebook.presto.accumulo.model.AccumuloTableLayoutHandle", class0.toString());
  }
}
