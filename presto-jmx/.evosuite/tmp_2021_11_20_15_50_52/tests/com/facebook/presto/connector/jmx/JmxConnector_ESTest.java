/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 00:00:14 GMT 2021
 */

package com.facebook.presto.connector.jmx;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.connector.jmx.JmxConnector;
import com.facebook.presto.connector.jmx.JmxMetadata;
import com.facebook.presto.connector.jmx.JmxPeriodicSampler;
import com.facebook.presto.connector.jmx.JmxRecordSetProvider;
import com.facebook.presto.connector.jmx.JmxSplitManager;
import com.facebook.presto.spi.connector.ConnectorTransactionHandle;
import com.facebook.presto.spi.transaction.IsolationLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JmxConnector_ESTest extends JmxConnector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JmxSplitManager jmxSplitManager0 = mock(JmxSplitManager.class, new ViolatedAssumptionAnswer());
      JmxRecordSetProvider jmxRecordSetProvider0 = mock(JmxRecordSetProvider.class, new ViolatedAssumptionAnswer());
      JmxPeriodicSampler jmxPeriodicSampler0 = mock(JmxPeriodicSampler.class, new ViolatedAssumptionAnswer());
      JmxConnector jmxConnector0 = null;
      try {
        jmxConnector0 = new JmxConnector((JmxMetadata) null, jmxSplitManager0, jmxRecordSetProvider0, jmxPeriodicSampler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // jmxMetadata is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JmxMetadata jmxMetadata0 = mock(JmxMetadata.class, new ViolatedAssumptionAnswer());
      JmxSplitManager jmxSplitManager0 = mock(JmxSplitManager.class, new ViolatedAssumptionAnswer());
      JmxRecordSetProvider jmxRecordSetProvider0 = mock(JmxRecordSetProvider.class, new ViolatedAssumptionAnswer());
      JmxPeriodicSampler jmxPeriodicSampler0 = mock(JmxPeriodicSampler.class, new ViolatedAssumptionAnswer());
      JmxConnector jmxConnector0 = new JmxConnector(jmxMetadata0, jmxSplitManager0, jmxRecordSetProvider0, jmxPeriodicSampler0);
      jmxConnector0.shutdown();
      assertFalse(jmxConnector0.isSingleStatementWritesOnly());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JmxMetadata jmxMetadata0 = mock(JmxMetadata.class, new ViolatedAssumptionAnswer());
      JmxSplitManager jmxSplitManager0 = mock(JmxSplitManager.class, new ViolatedAssumptionAnswer());
      JmxRecordSetProvider jmxRecordSetProvider0 = mock(JmxRecordSetProvider.class, new ViolatedAssumptionAnswer());
      doReturn("timestamp").when(jmxRecordSetProvider0).toString();
      JmxPeriodicSampler jmxPeriodicSampler0 = mock(JmxPeriodicSampler.class, new ViolatedAssumptionAnswer());
      JmxConnector jmxConnector0 = new JmxConnector(jmxMetadata0, jmxSplitManager0, jmxRecordSetProvider0, jmxPeriodicSampler0);
      JmxRecordSetProvider jmxRecordSetProvider1 = jmxConnector0.getRecordSetProvider();
      assertSame(jmxRecordSetProvider1, jmxRecordSetProvider0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JmxMetadata jmxMetadata0 = mock(JmxMetadata.class, new ViolatedAssumptionAnswer());
      doReturn("jmxMetadata is null").when(jmxMetadata0).toString();
      JmxSplitManager jmxSplitManager0 = mock(JmxSplitManager.class, new ViolatedAssumptionAnswer());
      JmxRecordSetProvider jmxRecordSetProvider0 = mock(JmxRecordSetProvider.class, new ViolatedAssumptionAnswer());
      JmxPeriodicSampler jmxPeriodicSampler0 = mock(JmxPeriodicSampler.class, new ViolatedAssumptionAnswer());
      JmxConnector jmxConnector0 = new JmxConnector(jmxMetadata0, jmxSplitManager0, jmxRecordSetProvider0, jmxPeriodicSampler0);
      IsolationLevel isolationLevel0 = IsolationLevel.READ_UNCOMMITTED;
      ConnectorTransactionHandle connectorTransactionHandle0 = jmxConnector0.beginTransaction(isolationLevel0, false);
      JmxMetadata jmxMetadata1 = jmxConnector0.getMetadata(connectorTransactionHandle0);
      assertSame(jmxMetadata1, jmxMetadata0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JmxMetadata jmxMetadata0 = mock(JmxMetadata.class, new ViolatedAssumptionAnswer());
      JmxSplitManager jmxSplitManager0 = mock(JmxSplitManager.class, new ViolatedAssumptionAnswer());
      doReturn("node").when(jmxSplitManager0).toString();
      JmxRecordSetProvider jmxRecordSetProvider0 = mock(JmxRecordSetProvider.class, new ViolatedAssumptionAnswer());
      JmxPeriodicSampler jmxPeriodicSampler0 = mock(JmxPeriodicSampler.class, new ViolatedAssumptionAnswer());
      JmxConnector jmxConnector0 = new JmxConnector(jmxMetadata0, jmxSplitManager0, jmxRecordSetProvider0, jmxPeriodicSampler0);
      JmxSplitManager jmxSplitManager1 = jmxConnector0.getSplitManager();
      assertSame(jmxSplitManager1, jmxSplitManager0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JmxMetadata jmxMetadata0 = mock(JmxMetadata.class, new ViolatedAssumptionAnswer());
      JmxSplitManager jmxSplitManager0 = mock(JmxSplitManager.class, new ViolatedAssumptionAnswer());
      JmxRecordSetProvider jmxRecordSetProvider0 = mock(JmxRecordSetProvider.class, new ViolatedAssumptionAnswer());
      JmxPeriodicSampler jmxPeriodicSampler0 = mock(JmxPeriodicSampler.class, new ViolatedAssumptionAnswer());
      JmxConnector jmxConnector0 = new JmxConnector(jmxMetadata0, jmxSplitManager0, jmxRecordSetProvider0, jmxPeriodicSampler0);
      IsolationLevel isolationLevel0 = IsolationLevel.SERIALIZABLE;
      // Undeclared exception!
      try { 
        jmxConnector0.beginTransaction(isolationLevel0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Connector supported isolation level READ COMMITTED does not meet requested isolation level SERIALIZABLE
         //
         verifyException("com.facebook.presto.spi.transaction.IsolationLevel", e);
      }
  }
}
