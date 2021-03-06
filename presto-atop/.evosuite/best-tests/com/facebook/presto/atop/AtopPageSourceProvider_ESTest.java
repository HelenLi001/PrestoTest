/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 23:45:16 GMT 2021
 */

package com.facebook.presto.atop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.atop.AtopConnectorConfig;
import com.facebook.presto.atop.AtopFactory;
import com.facebook.presto.atop.AtopPageSourceProvider;
import com.facebook.presto.common.type.TypeManager;
import com.facebook.presto.spi.ColumnHandle;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.ConnectorSplit;
import com.facebook.presto.spi.SplitContext;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AtopPageSourceProvider_ESTest extends AtopPageSourceProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = mock(AtopConnectorConfig.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(atopConnectorConfig0).getConcurrentReadersPerNode();
      AtopFactory atopFactory0 = mock(AtopFactory.class, new ViolatedAssumptionAnswer());
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      AtopPageSourceProvider atopPageSourceProvider0 = new AtopPageSourceProvider(atopConnectorConfig0, atopFactory0, typeManager0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      SplitContext splitContext0 = mock(SplitContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        atopPageSourceProvider0.createPageSource(connectorTransactionHandle0, connectorSession0, (ConnectorSplit) null, (List<ColumnHandle>) null, splitContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.atop.AtopPageSourceProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = mock(AtopConnectorConfig.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(atopConnectorConfig0).getConcurrentReadersPerNode();
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      AtopPageSourceProvider atopPageSourceProvider0 = null;
      try {
        atopPageSourceProvider0 = new AtopPageSourceProvider(atopConnectorConfig0, (AtopFactory) null, typeManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // atopFactory is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = mock(AtopConnectorConfig.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(atopConnectorConfig0).getConcurrentReadersPerNode();
      AtopFactory atopFactory0 = mock(AtopFactory.class, new ViolatedAssumptionAnswer());
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      AtopPageSourceProvider atopPageSourceProvider0 = new AtopPageSourceProvider(atopConnectorConfig0, atopFactory0, typeManager0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ConnectorSplit connectorSplit0 = mock(ConnectorSplit.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        atopPageSourceProvider0.createPageSource(connectorTransactionHandle0, connectorSession0, connectorSplit0, (List<ColumnHandle>) null, (SplitContext) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.facebook.presto.spi.ConnectorSplit$MockitoMock$50081269 cannot be cast to com.facebook.presto.atop.AtopSplit
         //
         verifyException("com.facebook.presto.atop.AtopPageSourceProvider", e);
      }
  }
}
