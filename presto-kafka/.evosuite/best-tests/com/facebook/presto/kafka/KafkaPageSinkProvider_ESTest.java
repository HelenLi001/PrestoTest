/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 00:30:39 GMT 2021
 */

package com.facebook.presto.kafka;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.kafka.KafkaPageSinkProvider;
import com.facebook.presto.kafka.PlainTextKafkaProducerFactory;
import com.facebook.presto.kafka.encoder.DispatchingRowEncoderFactory;
import com.facebook.presto.kafka.server.KafkaClusterMetadataSupplier;
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
public class KafkaPageSinkProvider_ESTest extends KafkaPageSinkProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DispatchingRowEncoderFactory dispatchingRowEncoderFactory0 = mock(DispatchingRowEncoderFactory.class, new ViolatedAssumptionAnswer());
      PlainTextKafkaProducerFactory plainTextKafkaProducerFactory0 = mock(PlainTextKafkaProducerFactory.class, new ViolatedAssumptionAnswer());
      KafkaClusterMetadataSupplier kafkaClusterMetadataSupplier0 = mock(KafkaClusterMetadataSupplier.class, new ViolatedAssumptionAnswer());
      KafkaPageSinkProvider kafkaPageSinkProvider0 = new KafkaPageSinkProvider(dispatchingRowEncoderFactory0, plainTextKafkaProducerFactory0, kafkaClusterMetadataSupplier0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        kafkaPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, (ConnectorInsertTableHandle) null, pageSinkContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tableHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlainTextKafkaProducerFactory plainTextKafkaProducerFactory0 = mock(PlainTextKafkaProducerFactory.class, new ViolatedAssumptionAnswer());
      KafkaClusterMetadataSupplier kafkaClusterMetadataSupplier0 = mock(KafkaClusterMetadataSupplier.class, new ViolatedAssumptionAnswer());
      KafkaPageSinkProvider kafkaPageSinkProvider0 = null;
      try {
        kafkaPageSinkProvider0 = new KafkaPageSinkProvider((DispatchingRowEncoderFactory) null, plainTextKafkaProducerFactory0, kafkaClusterMetadataSupplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // encoderFactory is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DispatchingRowEncoderFactory dispatchingRowEncoderFactory0 = mock(DispatchingRowEncoderFactory.class, new ViolatedAssumptionAnswer());
      KafkaClusterMetadataSupplier kafkaClusterMetadataSupplier0 = mock(KafkaClusterMetadataSupplier.class, new ViolatedAssumptionAnswer());
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorInsertTableHandle connectorInsertTableHandle0 = mock(ConnectorInsertTableHandle.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      PlainTextKafkaProducerFactory plainTextKafkaProducerFactory0 = mock(PlainTextKafkaProducerFactory.class, new ViolatedAssumptionAnswer());
      KafkaPageSinkProvider kafkaPageSinkProvider0 = new KafkaPageSinkProvider(dispatchingRowEncoderFactory0, plainTextKafkaProducerFactory0, kafkaClusterMetadataSupplier0);
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        kafkaPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, connectorInsertTableHandle0, pageSinkContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.facebook.presto.spi.ConnectorInsertTableHandle$MockitoMock$220612004 cannot be cast to com.facebook.presto.kafka.KafkaTableHandle
         //
         verifyException("com.facebook.presto.kafka.KafkaPageSinkProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DispatchingRowEncoderFactory dispatchingRowEncoderFactory0 = mock(DispatchingRowEncoderFactory.class, new ViolatedAssumptionAnswer());
      PlainTextKafkaProducerFactory plainTextKafkaProducerFactory0 = mock(PlainTextKafkaProducerFactory.class, new ViolatedAssumptionAnswer());
      KafkaClusterMetadataSupplier kafkaClusterMetadataSupplier0 = mock(KafkaClusterMetadataSupplier.class, new ViolatedAssumptionAnswer());
      KafkaPageSinkProvider kafkaPageSinkProvider0 = new KafkaPageSinkProvider(dispatchingRowEncoderFactory0, plainTextKafkaProducerFactory0, kafkaClusterMetadataSupplier0);
      ConnectorTransactionHandle connectorTransactionHandle0 = mock(ConnectorTransactionHandle.class, new ViolatedAssumptionAnswer());
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      PageSinkContext pageSinkContext0 = mock(PageSinkContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        kafkaPageSinkProvider0.createPageSink(connectorTransactionHandle0, connectorSession0, (ConnectorOutputTableHandle) null, pageSinkContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Table creation is not supported by the kafka connector
         //
         verifyException("com.facebook.presto.kafka.KafkaPageSinkProvider", e);
      }
  }
}
