/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:24:43 GMT 2021
 */

package com.facebook.presto.cassandra;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.cassandra.CassandraHandleResolver;
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
public class CassandraHandleResolver_ESTest extends CassandraHandleResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CassandraHandleResolver cassandraHandleResolver0 = new CassandraHandleResolver();
      Class<? extends ConnectorInsertTableHandle> class0 = cassandraHandleResolver0.getInsertTableHandleClass();
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CassandraHandleResolver cassandraHandleResolver0 = new CassandraHandleResolver();
      Class<? extends ConnectorOutputTableHandle> class0 = cassandraHandleResolver0.getOutputTableHandleClass();
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CassandraHandleResolver cassandraHandleResolver0 = new CassandraHandleResolver();
      Class<? extends ConnectorTransactionHandle> class0 = cassandraHandleResolver0.getTransactionHandleClass();
      assertEquals(16385, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CassandraHandleResolver cassandraHandleResolver0 = new CassandraHandleResolver();
      Class<? extends ConnectorTableHandle> class0 = cassandraHandleResolver0.getTableHandleClass();
      assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CassandraHandleResolver cassandraHandleResolver0 = new CassandraHandleResolver();
      Class<? extends ConnectorSplit> class0 = cassandraHandleResolver0.getSplitClass();
      assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CassandraHandleResolver cassandraHandleResolver0 = new CassandraHandleResolver();
      Class<? extends ColumnHandle> class0 = cassandraHandleResolver0.getColumnHandleClass();
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CassandraHandleResolver cassandraHandleResolver0 = new CassandraHandleResolver();
      Class<? extends ConnectorTableLayoutHandle> class0 = cassandraHandleResolver0.getTableLayoutHandleClass();
      assertFalse(class0.isInterface());
  }
}
