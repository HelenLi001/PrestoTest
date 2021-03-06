/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 00:38:04 GMT 2021
 */

package com.facebook.presto.kafka;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.kafka.KafkaConnectorFactory;
import com.facebook.presto.spi.connector.ConnectorContext;
import com.google.inject.Module;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaConnectorFactory_ESTest extends KafkaConnectorFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KafkaConnectorFactory kafkaConnectorFactory0 = null;
      try {
        kafkaConnectorFactory0 = new KafkaConnectorFactory((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // extension is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Module module0 = mock(Module.class, new ViolatedAssumptionAnswer());
      KafkaConnectorFactory kafkaConnectorFactory0 = new KafkaConnectorFactory(module0);
      kafkaConnectorFactory0.getName();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Module module0 = mock(Module.class, new ViolatedAssumptionAnswer());
      KafkaConnectorFactory kafkaConnectorFactory0 = new KafkaConnectorFactory(module0);
      kafkaConnectorFactory0.getHandleResolver();
      ConnectorContext connectorContext0 = mock(ConnectorContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        kafkaConnectorFactory0.create("7cJOlp)wW4l3'ZlIc", (Map<String, String>) null, connectorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // config is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Module module0 = mock(Module.class, new ViolatedAssumptionAnswer());
      KafkaConnectorFactory kafkaConnectorFactory0 = new KafkaConnectorFactory(module0);
      ConnectorContext connectorContext0 = mock(ConnectorContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        kafkaConnectorFactory0.create("binder", (Map<String, String>) null, connectorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // config is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Module module0 = mock(Module.class, new ViolatedAssumptionAnswer());
      KafkaConnectorFactory kafkaConnectorFactory0 = new KafkaConnectorFactory(module0);
      kafkaConnectorFactory0.getHandleResolver();
      kafkaConnectorFactory0.getName();
      ConnectorContext connectorContext0 = mock(ConnectorContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        kafkaConnectorFactory0.create("kafka", (Map<String, String>) null, connectorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // config is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
