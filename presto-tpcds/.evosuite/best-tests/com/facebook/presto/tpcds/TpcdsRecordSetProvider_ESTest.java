/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 09:25:14 GMT 2021
 */

package com.facebook.presto.tpcds;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.spi.ColumnHandle;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.ConnectorSplit;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import com.facebook.presto.tpcds.TpcdsRecordSetProvider;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TpcdsRecordSetProvider_ESTest extends TpcdsRecordSetProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TpcdsRecordSetProvider tpcdsRecordSetProvider0 = new TpcdsRecordSetProvider();
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tpcdsRecordSetProvider0.getRecordSet(connectorTransactionHandle0, connectorSession0, (ConnectorSplit) null, (List<? extends ColumnHandle>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tpcds.TpcdsRecordSetProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      TpcdsRecordSetProvider tpcdsRecordSetProvider0 = new TpcdsRecordSetProvider();
      ConnectorSplit connectorSplit0 = mock(ConnectorSplit.class, new ViolatedAssumptionAnswer());
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tpcdsRecordSetProvider0.getRecordSet(connectorTransactionHandle0, connectorSession0, connectorSplit0, (List<? extends ColumnHandle>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.facebook.presto.spi.ConnectorSplit$MockitoMock$847503189 cannot be cast to com.facebook.presto.tpcds.TpcdsSplit
         //
         verifyException("com.facebook.presto.tpcds.TpcdsRecordSetProvider", e);
      }
  }
}
