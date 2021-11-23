/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 19:12:15 GMT 2021
 */

package com.facebook.presto.connector.thrift;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.predicate.TupleDomain;
import com.facebook.presto.connector.thrift.ThriftIndexHandle;
import com.facebook.presto.spi.ColumnHandle;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.SchemaTableName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThriftIndexHandle_ESTest extends ThriftIndexHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SchemaTableName schemaTableName0 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      doReturn("rT46hZypq$vy4?o", "rT46hZypq$vy4?o", "k,E", "#Y", "").when(schemaTableName0).toString();
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      ThriftIndexHandle thriftIndexHandle0 = new ThriftIndexHandle(schemaTableName0, tupleDomain0);
      thriftIndexHandle0.toString();
      thriftIndexHandle0.toString();
      thriftIndexHandle0.getSchemaTableName();
      String string0 = thriftIndexHandle0.toString();
      String string1 = thriftIndexHandle0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SchemaTableName schemaTableName0 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      ThriftIndexHandle thriftIndexHandle0 = null;
      try {
        thriftIndexHandle0 = new ThriftIndexHandle(schemaTableName0, (TupleDomain<ColumnHandle>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tupleDomain is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SchemaTableName schemaTableName0 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      SchemaTableName schemaTableName1 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tupleDomain0).toString();
      ThriftIndexHandle thriftIndexHandle0 = new ThriftIndexHandle(schemaTableName1, tupleDomain0);
      TupleDomain<ColumnHandle> tupleDomain1 = thriftIndexHandle0.getTupleDomain();
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ThriftIndexHandle thriftIndexHandle1 = new ThriftIndexHandle(schemaTableName0, tupleDomain1, connectorSession0);
      boolean boolean0 = thriftIndexHandle1.equals(thriftIndexHandle0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SchemaTableName schemaTableName0 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      ThriftIndexHandle thriftIndexHandle0 = new ThriftIndexHandle(schemaTableName0, tupleDomain0);
      boolean boolean0 = thriftIndexHandle0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SchemaTableName schemaTableName0 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      ThriftIndexHandle thriftIndexHandle0 = new ThriftIndexHandle(schemaTableName0, tupleDomain0);
      boolean boolean0 = thriftIndexHandle0.equals(thriftIndexHandle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SchemaTableName schemaTableName0 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tupleDomain0).toString();
      ThriftIndexHandle thriftIndexHandle0 = new ThriftIndexHandle(schemaTableName0, tupleDomain0);
      TupleDomain<ColumnHandle> tupleDomain1 = thriftIndexHandle0.getTupleDomain();
      boolean boolean0 = thriftIndexHandle0.equals(tupleDomain1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SchemaTableName schemaTableName0 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      doReturn("%kt%jI.D").when(tupleDomain0).toString();
      ThriftIndexHandle thriftIndexHandle0 = new ThriftIndexHandle(schemaTableName0, tupleDomain0);
      TupleDomain<ColumnHandle> tupleDomain1 = thriftIndexHandle0.getTupleDomain();
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ThriftIndexHandle thriftIndexHandle1 = new ThriftIndexHandle(schemaTableName0, tupleDomain1, connectorSession0);
      boolean boolean0 = thriftIndexHandle1.equals(thriftIndexHandle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SchemaTableName schemaTableName0 = mock(SchemaTableName.class, new ViolatedAssumptionAnswer());
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      ThriftIndexHandle thriftIndexHandle0 = new ThriftIndexHandle(schemaTableName0, tupleDomain0);
      thriftIndexHandle0.hashCode();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ThriftIndexHandle thriftIndexHandle0 = null;
      try {
        thriftIndexHandle0 = new ThriftIndexHandle((SchemaTableName) null, (TupleDomain<ColumnHandle>) null, connectorSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // schemaTableName is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
