/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 03:16:00 GMT 2021
 */

package com.facebook.presto.plugin.memory;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.plugin.memory.MemoryPageSinkProvider;
import com.facebook.presto.plugin.memory.MemoryPagesStore;
import com.facebook.presto.spi.ConnectorInsertTableHandle;
import com.facebook.presto.spi.ConnectorOutputTableHandle;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.HostAddress;
import com.facebook.presto.spi.Node;
import com.facebook.presto.spi.NodeManager;
import com.facebook.presto.spi.PageSinkContext;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MemoryPageSinkProvider_ESTest extends MemoryPageSinkProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MemoryPagesStore memoryPagesStore0 = mock(MemoryPagesStore.class, new ViolatedAssumptionAnswer());
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      MemoryPageSinkProvider memoryPageSinkProvider0 = new MemoryPageSinkProvider(memoryPagesStore0, hostAddress0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(pageSinkContext0).isCommitRequired();
      // Undeclared exception!
      try { 
        memoryPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, (ConnectorInsertTableHandle) null, pageSinkContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.memory.MemoryPageSinkProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MemoryPagesStore memoryPagesStore0 = mock(MemoryPagesStore.class, new ViolatedAssumptionAnswer());
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      MemoryPageSinkProvider memoryPageSinkProvider0 = new MemoryPageSinkProvider(memoryPagesStore0, hostAddress0);
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(pageSinkContext0).isCommitRequired();
      // Undeclared exception!
      try { 
        memoryPageSinkProvider0.createPageSink((ConnectorTransactionHandle) null, connectorSession0, (ConnectorOutputTableHandle) null, pageSinkContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.memory.MemoryPageSinkProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      MemoryPageSinkProvider memoryPageSinkProvider0 = null;
      try {
        memoryPageSinkProvider0 = new MemoryPageSinkProvider((MemoryPagesStore) null, hostAddress0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // pagesStore is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MemoryPagesStore memoryPagesStore0 = mock(MemoryPagesStore.class, new ViolatedAssumptionAnswer());
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(hostAddress0).when(node0).getHostAndPort();
      NodeManager nodeManager0 = mock(NodeManager.class, new ViolatedAssumptionAnswer());
      doReturn(node0).when(nodeManager0).getCurrentNode();
      MemoryPageSinkProvider memoryPageSinkProvider0 = new MemoryPageSinkProvider(memoryPagesStore0, nodeManager0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MemoryPagesStore memoryPagesStore0 = mock(MemoryPagesStore.class, new ViolatedAssumptionAnswer());
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      MemoryPageSinkProvider memoryPageSinkProvider0 = new MemoryPageSinkProvider(memoryPagesStore0, hostAddress0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ConnectorInsertTableHandle connectorInsertTableHandle0 = mock(ConnectorInsertTableHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(pageSinkContext0).isCommitRequired();
      // Undeclared exception!
      try { 
        memoryPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, connectorInsertTableHandle0, pageSinkContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.facebook.presto.spi.ConnectorInsertTableHandle$MockitoMock$476074379 cannot be cast to com.facebook.presto.plugin.memory.MemoryInsertTableHandle
         //
         verifyException("com.facebook.presto.plugin.memory.MemoryPageSinkProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ConnectorInsertTableHandle connectorInsertTableHandle0 = mock(ConnectorInsertTableHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(pageSinkContext0).isCommitRequired();
      MemoryPagesStore memoryPagesStore0 = mock(MemoryPagesStore.class, new ViolatedAssumptionAnswer());
      MemoryPageSinkProvider memoryPageSinkProvider0 = new MemoryPageSinkProvider(memoryPagesStore0, hostAddress0);
      // Undeclared exception!
      try { 
        memoryPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, connectorInsertTableHandle0, pageSinkContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Memory connector does not support page sink commit
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      ConnectorOutputTableHandle connectorOutputTableHandle0 = mock(ConnectorOutputTableHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(pageSinkContext0).isCommitRequired();
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      MemoryPagesStore memoryPagesStore0 = mock(MemoryPagesStore.class, new ViolatedAssumptionAnswer());
      MemoryPageSinkProvider memoryPageSinkProvider0 = new MemoryPageSinkProvider(memoryPagesStore0, hostAddress0);
      // Undeclared exception!
      try { 
        memoryPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, connectorOutputTableHandle0, pageSinkContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.facebook.presto.spi.ConnectorOutputTableHandle$MockitoMock$676724623 cannot be cast to com.facebook.presto.plugin.memory.MemoryOutputTableHandle
         //
         verifyException("com.facebook.presto.plugin.memory.MemoryPageSinkProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MemoryPagesStore memoryPagesStore0 = mock(MemoryPagesStore.class, new ViolatedAssumptionAnswer());
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      MemoryPageSinkProvider memoryPageSinkProvider0 = new MemoryPageSinkProvider(memoryPagesStore0, hostAddress0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ConnectorOutputTableHandle connectorOutputTableHandle0 = mock(ConnectorOutputTableHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(pageSinkContext0).isCommitRequired();
      // Undeclared exception!
      try { 
        memoryPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, connectorOutputTableHandle0, pageSinkContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Memory connector does not support page sink commit
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MemoryPageSinkProvider memoryPageSinkProvider0 = null;
      try {
        memoryPageSinkProvider0 = new MemoryPageSinkProvider((MemoryPagesStore) null, (NodeManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // nodeManager is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
