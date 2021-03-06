/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 03:04:24 GMT 2021
 */

package com.facebook.presto.plugin.blackhole;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BlackHoleConnectorFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.plugin.blackhole.BlackHoleConnectorFactory"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-blackhole"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BlackHoleConnectorFactory_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.spi.ConnectorSplitSource",
      "com.facebook.presto.spi.ConnectorHandleResolver",
      "com.facebook.presto.testing.TestingConnectorContext",
      "com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator",
      "com.facebook.presto.spi.function.StandardFunctionResolution",
      "com.facebook.presto.plugin.blackhole.BlackHoleConnector",
      "com.facebook.presto.spi.connector.ConnectorTransactionHandle",
      "com.facebook.presto.spi.connector.ConnectorNodePartitioningProvider",
      "com.facebook.presto.spi.connector.ConnectorRecordSetProvider",
      "com.facebook.presto.spi.SchemaNotFoundException",
      "com.facebook.presto.plugin.blackhole.BlackHoleNodePartitioningProvider",
      "com.facebook.presto.spi.ConnectorPageSink",
      "com.facebook.presto.spi.PageIndexerFactory",
      "com.facebook.presto.spi.connector.ConnectorPageSourceProvider",
      "com.facebook.presto.plugin.blackhole.BlackHolePageSourceProvider",
      "com.facebook.presto.spi.connector.ConnectorSplitManager",
      "com.facebook.airlift.concurrent.Threads$ContextClassLoaderThreadFactory",
      "com.facebook.presto.spi.NodeManager",
      "com.facebook.presto.plugin.blackhole.BlackHoleSplitManager",
      "com.facebook.presto.spi.relation.RowExpressionService",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.google.common.util.concurrent.MoreExecutors$ListeningDecorator",
      "com.facebook.presto.plugin.blackhole.BlackHoleHandleResolver",
      "com.google.common.util.concurrent.ListeningExecutorService",
      "com.facebook.presto.spi.plan.FilterStatsCalculatorService",
      "com.google.common.util.concurrent.ThreadFactoryBuilder",
      "com.facebook.presto.spi.connector.ConnectorPartitioningHandle",
      "com.facebook.presto.spi.connector.ConnectorMetadata",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.ListenableFuture",
      "com.facebook.presto.spi.NotFoundException",
      "com.facebook.presto.spi.ConnectorTableLayoutHandle",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.spi.ConnectorOutputTableHandle",
      "com.facebook.presto.common.block.BlockEncodingSerde",
      "com.facebook.presto.spi.connector.ConnectorPlanOptimizerProvider",
      "com.facebook.airlift.concurrent.Threads",
      "com.google.common.util.concurrent.ThreadFactoryBuilder$1",
      "com.google.common.util.concurrent.AbstractListeningExecutorService",
      "com.facebook.presto.common.type.TypeManager",
      "com.facebook.presto.plugin.blackhole.BlackHolePageSinkProvider",
      "com.facebook.presto.plugin.blackhole.BlackHoleConnectorFactory",
      "com.facebook.presto.spi.connector.ConnectorContext",
      "com.facebook.presto.spi.PageSorter",
      "com.facebook.presto.spi.function.FunctionMetadataManager",
      "com.facebook.presto.spi.connector.ConnectorPageSinkProvider",
      "com.google.common.util.concurrent.ListeningScheduledExecutorService",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.connector.ConnectorContextInstance",
      "com.facebook.presto.spi.ConnectorInsertTableHandle",
      "com.facebook.presto.spi.connector.Connector",
      "com.facebook.presto.spi.connector.ConnectorIndexProvider",
      "com.facebook.presto.spi.connector.ConnectorFactory",
      "com.facebook.presto.spi.connector.ConnectorMetadataUpdaterProvider",
      "com.facebook.presto.spi.ConnectorPageSource",
      "com.facebook.presto.spi.transaction.IsolationLevel",
      "com.facebook.presto.spi.ColumnHandle",
      "com.google.common.util.concurrent.ListenableScheduledFuture",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.plugin.blackhole.BlackHoleMetadata",
      "com.facebook.presto.spi.connector.ConnectorAccessControl"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BlackHoleConnectorFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.plugin.blackhole.BlackHoleConnectorFactory",
      "com.facebook.presto.plugin.blackhole.BlackHoleHandleResolver",
      "com.facebook.airlift.concurrent.Threads",
      "com.google.common.util.concurrent.ThreadFactoryBuilder",
      "com.facebook.airlift.concurrent.Threads$ContextClassLoaderThreadFactory",
      "com.google.common.base.Preconditions",
      "com.google.common.util.concurrent.ThreadFactoryBuilder$1",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.AbstractListeningExecutorService",
      "com.google.common.util.concurrent.MoreExecutors$ListeningDecorator",
      "com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator",
      "com.facebook.presto.plugin.blackhole.BlackHoleConnector",
      "com.facebook.presto.plugin.blackhole.BlackHoleMetadata",
      "com.facebook.presto.plugin.blackhole.BlackHoleSplitManager",
      "com.facebook.presto.plugin.blackhole.BlackHolePageSourceProvider",
      "com.facebook.presto.plugin.blackhole.BlackHolePageSinkProvider",
      "com.facebook.presto.plugin.blackhole.BlackHoleNodePartitioningProvider"
    );
  }
}
