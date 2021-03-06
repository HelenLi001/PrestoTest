/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 00:30:40 GMT 2021
 */

package com.facebook.presto.kafka;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class KafkaPageSinkProvider_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.kafka.KafkaPageSinkProvider"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-kafka"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.kafka.KafkaTableHandle",
      "com.facebook.presto.kafka.encoder.DispatchingRowEncoderFactory",
      "com.facebook.presto.spi.ConnectorTableHandle",
      "com.facebook.presto.spi.function.SqlInvokedFunction",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.spi.ConnectorOutputTableHandle",
      "com.facebook.presto.kafka.KafkaColumnHandle",
      "com.facebook.presto.spi.connector.ConnectorTransactionHandle",
      "com.facebook.presto.kafka.server.KafkaClusterMetadataSupplier",
      "com.facebook.presto.kafka.encoder.RowEncoderFactory",
      "org.apache.kafka.clients.producer.KafkaProducer",
      "com.facebook.presto.spi.connector.ConnectorMetadataUpdater",
      "com.facebook.presto.spi.ConnectorPageSink",
      "com.facebook.presto.spi.function.SqlFunction",
      "com.facebook.presto.spi.connector.ConnectorPageSinkProvider",
      "com.facebook.presto.kafka.encoder.RowEncoder",
      "com.facebook.presto.spi.PageSinkContext$Builder",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.facebook.presto.spi.ConnectorInsertTableHandle",
      "org.apache.kafka.clients.producer.Producer",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.facebook.presto.spi.PageSinkContext",
      "com.facebook.presto.spi.HostAddress",
      "com.facebook.presto.kafka.KafkaPageSinkProvider",
      "com.facebook.presto.spi.ConnectorSession",
      "com.facebook.presto.spi.security.ConnectorIdentity",
      "com.facebook.presto.kafka.encoder.EncoderColumnHandle",
      "com.facebook.presto.spi.function.SqlFunctionId",
      "com.facebook.presto.spi.ColumnHandle",
      "org.apache.kafka.common.serialization.Serializer",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.decoder.DecoderColumnHandle",
      "com.facebook.presto.spi.PageSinkContext$1",
      "com.facebook.presto.kafka.PlainTextKafkaProducerFactory",
      "com.google.common.collect.ImmutableList$Builder"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.kafka.PlainTextKafkaProducerFactory", false, KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.kafka.encoder.DispatchingRowEncoderFactory", false, KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.kafka.server.KafkaClusterMetadataSupplier", false, KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.ConnectorInsertTableHandle", false, KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.ConnectorSession", false, KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.PageSinkContext", false, KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.connector.ConnectorTransactionHandle", false, KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(KafkaPageSinkProvider_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.kafka.KafkaPageSinkProvider",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.kafka.KafkaErrorCode",
      "com.facebook.presto.kafka.encoder.DispatchingRowEncoderFactory",
      "com.facebook.presto.kafka.PlainTextKafkaProducerFactory",
      "com.facebook.presto.spi.PageSinkContext$Builder",
      "com.facebook.presto.spi.PageSinkContext"
    );
  }
}
