/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 03:02:22 GMT 2021
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
public class BlackHoleConnector_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.plugin.blackhole.BlackHoleConnector"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BlackHoleConnector_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.Page",
      "com.google.common.collect.ImmutableList$SubList",
      "com.facebook.presto.spi.ConnectorSplitSource",
      "com.facebook.presto.spi.security.PrestoPrincipal",
      "com.facebook.presto.common.type.VariableWidthType",
      "com.facebook.presto.plugin.blackhole.BlackHoleConnector",
      "com.facebook.presto.spi.session.PropertyMetadata",
      "com.facebook.presto.spi.connector.ConnectorTransactionHandle",
      "com.facebook.presto.common.type.TypeSignature",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.spi.connector.ConnectorRecordSetProvider",
      "com.facebook.presto.plugin.blackhole.BlackHoleNodePartitioningProvider",
      "com.facebook.presto.spi.ConnectorMaterializedViewDefinition",
      "com.facebook.presto.spi.ConnectorPageSink",
      "com.facebook.presto.spi.SystemTable",
      "com.facebook.presto.spi.connector.ConnectorPageSourceProvider",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.plugin.blackhole.BlackHoleSplitManager",
      "com.facebook.presto.spi.ConnectorSession",
      "com.facebook.presto.spi.statistics.TableStatisticsMetadata",
      "com.facebook.presto.common.GenericInternalException",
      "com.facebook.presto.spi.connector.ConnectorPartitioningHandle",
      "io.airlift.slice.Slice",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.spi.ConnectorOutputTableHandle",
      "com.facebook.presto.tpch.TpchTransactionHandle",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.facebook.presto.spi.function.FunctionMetadataManager",
      "com.facebook.presto.spi.ConnectorTableMetadata",
      "com.facebook.presto.spi.connector.Connector",
      "com.facebook.presto.testing.TestingTransactionHandle",
      "com.facebook.presto.spi.Constraint",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.plugin.blackhole.BlackHoleTransactionHandle",
      "com.facebook.presto.spi.ConnectorSplit",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.facebook.presto.spi.SchemaTablePrefix",
      "com.facebook.presto.spi.ColumnHandle",
      "com.facebook.presto.spi.QueryId",
      "com.facebook.presto.plugin.blackhole.BlackHoleMetadata",
      "com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.spi.TableLayoutFilterCoverage",
      "com.facebook.presto.spi.connector.ConnectorAccessControl",
      "com.facebook.presto.metadata.FunctionAndTypeManager",
      "com.facebook.presto.spi.connector.ConnectorCapabilities",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.spi.statistics.TableStatistics",
      "com.facebook.presto.plugin.blackhole.BlackHoleTableHandle",
      "com.facebook.presto.spi.connector.ConnectorNodePartitioningProvider",
      "io.airlift.units.Duration",
      "com.facebook.presto.spi.SchemaTableName",
      "com.facebook.presto.spi.SplitContext",
      "com.facebook.presto.spi.SchemaNotFoundException",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.facebook.presto.plugin.blackhole.BlackHolePageSourceProvider",
      "com.facebook.presto.spi.connector.ConnectorSplitManager",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.spi.procedure.Procedure",
      "com.facebook.presto.spi.ColumnMetadata",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.spi.connector.ConnectorMetadata",
      "com.facebook.presto.spi.NotFoundException",
      "com.facebook.presto.spi.ConnectorTableLayoutHandle",
      "com.facebook.presto.spi.ConnectorTableHandle",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.spi.connector.ConnectorPlanOptimizerProvider",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.IntegerType",
      "com.google.common.collect.ImmutableList",
      "com.facebook.presto.common.type.TypeManager",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.plugin.blackhole.BlackHolePageSinkProvider",
      "com.facebook.presto.spi.connector.ConnectorPageSinkProvider",
      "com.facebook.presto.metadata.RemoteTransactionHandle",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.spi.ConnectorInsertTableHandle",
      "com.facebook.presto.spi.connector.ConnectorSplitManager$SplitSchedulingContext",
      "com.facebook.presto.plugin.blackhole.BlackHoleColumnHandle",
      "com.facebook.presto.spi.connector.ConnectorIndexProvider",
      "com.facebook.presto.spi.ConnectorTableLayout",
      "com.facebook.presto.spi.PageSinkContext",
      "com.facebook.presto.common.predicate.TupleDomain",
      "com.facebook.presto.spi.connector.ConnectorMetadataUpdaterProvider",
      "com.facebook.presto.spi.ConnectorPageSource",
      "com.facebook.presto.spi.transaction.IsolationLevel",
      "com.facebook.presto.spi.BucketFunction",
      "com.facebook.presto.spi.connector.ConnectorBucketNodeMap",
      "com.facebook.presto.spi.MaterializedViewStatus",
      "com.facebook.presto.common.block.Block"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BlackHoleConnector_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.plugin.blackhole.BlackHoleConnector",
      "com.facebook.presto.plugin.blackhole.BlackHoleTransactionHandle",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.IntegerType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.VarcharType",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "io.airlift.units.Duration"
    );
  }
}
