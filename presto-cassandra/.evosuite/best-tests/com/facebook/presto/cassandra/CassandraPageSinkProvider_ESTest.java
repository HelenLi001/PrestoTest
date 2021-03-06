/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:14:44 GMT 2021
 */

package com.facebook.presto.cassandra;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.datastax.driver.core.ProtocolVersion;
import com.facebook.presto.cassandra.CassandraClientConfig;
import com.facebook.presto.cassandra.CassandraPageSinkProvider;
import com.facebook.presto.cassandra.CassandraSession;
import com.facebook.presto.spi.ConnectorInsertTableHandle;
import com.facebook.presto.spi.ConnectorOutputTableHandle;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.PageSinkContext;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CassandraPageSinkProvider_ESTest extends CassandraPageSinkProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CassandraSession cassandraSession0 = mock(CassandraSession.class, new ViolatedAssumptionAnswer());
      ProtocolVersion protocolVersion0 = ProtocolVersion.V4;
      CassandraClientConfig cassandraClientConfig0 = mock(CassandraClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(protocolVersion0).when(cassandraClientConfig0).getProtocolVersion();
      CassandraPageSinkProvider cassandraPageSinkProvider0 = new CassandraPageSinkProvider(cassandraSession0, cassandraClientConfig0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ConnectorOutputTableHandle connectorOutputTableHandle0 = mock(ConnectorOutputTableHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(pageSinkContext0).isCommitRequired();
      // Undeclared exception!
      try { 
        cassandraPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, connectorOutputTableHandle0, pageSinkContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // tableHandle is not an instance of CassandraOutputTableHandle
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CassandraSession cassandraSession0 = mock(CassandraSession.class, new ViolatedAssumptionAnswer());
      CassandraClientConfig cassandraClientConfig0 = mock(CassandraClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((ProtocolVersion) null).when(cassandraClientConfig0).getProtocolVersion();
      CassandraPageSinkProvider cassandraPageSinkProvider0 = new CassandraPageSinkProvider(cassandraSession0, cassandraClientConfig0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(pageSinkContext0).isCommitRequired();
      // Undeclared exception!
      try { 
        cassandraPageSinkProvider0.createPageSink(connectorTransactionHandle0, (ConnectorSession) null, (ConnectorInsertTableHandle) null, pageSinkContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tableHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CassandraSession cassandraSession0 = mock(CassandraSession.class, new ViolatedAssumptionAnswer());
      CassandraPageSinkProvider cassandraPageSinkProvider0 = null;
      try {
        cassandraPageSinkProvider0 = new CassandraPageSinkProvider(cassandraSession0, (CassandraClientConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // cassandraClientConfig is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CassandraSession cassandraSession0 = mock(CassandraSession.class, new ViolatedAssumptionAnswer());
      CassandraClientConfig cassandraClientConfig0 = mock(CassandraClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((ProtocolVersion) null).when(cassandraClientConfig0).getProtocolVersion();
      CassandraPageSinkProvider cassandraPageSinkProvider0 = new CassandraPageSinkProvider(cassandraSession0, cassandraClientConfig0);
      ConnectorInsertTableHandle connectorInsertTableHandle0 = mock(ConnectorInsertTableHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(pageSinkContext0).isCommitRequired();
      // Undeclared exception!
      try { 
        cassandraPageSinkProvider0.createPageSink((ConnectorTransactionHandle) null, (ConnectorSession) null, connectorInsertTableHandle0, pageSinkContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // tableHandle is not an instance of ConnectorInsertTableHandle
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CassandraSession cassandraSession0 = mock(CassandraSession.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ConnectorInsertTableHandle connectorInsertTableHandle0 = mock(ConnectorInsertTableHandle.class, new ViolatedAssumptionAnswer());
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(pageSinkContext0).isCommitRequired();
      ProtocolVersion protocolVersion0 = ProtocolVersion.V3;
      CassandraClientConfig cassandraClientConfig0 = mock(CassandraClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(protocolVersion0).when(cassandraClientConfig0).getProtocolVersion();
      CassandraPageSinkProvider cassandraPageSinkProvider0 = new CassandraPageSinkProvider(cassandraSession0, cassandraClientConfig0);
      // Undeclared exception!
      try { 
        cassandraPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, connectorInsertTableHandle0, pageSinkContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cassandra connector does not support page sink commit
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CassandraSession cassandraSession0 = mock(CassandraSession.class, new ViolatedAssumptionAnswer());
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(pageSinkContext0).isCommitRequired();
      ConnectorOutputTableHandle connectorOutputTableHandle0 = mock(ConnectorOutputTableHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ProtocolVersion protocolVersion0 = ProtocolVersion.V2;
      CassandraClientConfig cassandraClientConfig0 = mock(CassandraClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn(protocolVersion0).when(cassandraClientConfig0).getProtocolVersion();
      CassandraPageSinkProvider cassandraPageSinkProvider0 = new CassandraPageSinkProvider(cassandraSession0, cassandraClientConfig0);
      // Undeclared exception!
      try { 
        cassandraPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, connectorOutputTableHandle0, pageSinkContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cassandra connector does not support page sink commit
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CassandraSession cassandraSession0 = mock(CassandraSession.class, new ViolatedAssumptionAnswer());
      CassandraClientConfig cassandraClientConfig0 = mock(CassandraClientConfig.class, new ViolatedAssumptionAnswer());
      doReturn((ProtocolVersion) null).when(cassandraClientConfig0).getProtocolVersion();
      CassandraPageSinkProvider cassandraPageSinkProvider0 = new CassandraPageSinkProvider(cassandraSession0, cassandraClientConfig0);
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(pageSinkContext0).isCommitRequired();
      // Undeclared exception!
      try { 
        cassandraPageSinkProvider0.createPageSink((ConnectorTransactionHandle) null, connectorSession0, (ConnectorOutputTableHandle) null, pageSinkContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tableHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
