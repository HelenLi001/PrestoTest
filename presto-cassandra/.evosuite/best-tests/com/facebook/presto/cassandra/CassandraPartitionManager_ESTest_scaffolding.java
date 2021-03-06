/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 02:05:30 GMT 2021
 */

package com.facebook.presto.cassandra;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CassandraPartitionManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.cassandra.CassandraPartitionManager"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-cassandra"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CassandraPartitionManager_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "com.datastax.driver.core.TokenRange",
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.spi.NotFoundException",
      "com.datastax.driver.core.RegularStatement",
      "com.facebook.presto.common.predicate.DiscreteValues",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.spi.ConnectorTableHandle",
      "com.facebook.presto.spi.PrestoException",
      "com.datastax.driver.core.PagingIterable",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.datastax.driver.core.PreparedStatement",
      "com.facebook.presto.common.predicate.AllOrNone",
      "com.facebook.presto.spi.SchemaTableName",
      "com.datastax.driver.core.ResultSet",
      "com.facebook.presto.spi.SchemaNotFoundException",
      "com.fasterxml.jackson.annotation.JsonIgnore",
      "com.facebook.presto.cassandra.CassandraSession",
      "com.datastax.driver.core.VersionNumber",
      "com.facebook.presto.common.predicate.TupleDomain$ColumnDomain",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.cassandra.CassandraPartitionManager",
      "com.google.common.collect.ImmutableSet",
      "com.facebook.presto.common.predicate.NullableValue",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.facebook.presto.common.predicate.TupleDomain",
      "com.facebook.presto.common.predicate.Domain",
      "com.facebook.presto.common.predicate.Range",
      "com.facebook.presto.cassandra.CassandraPartition",
      "com.facebook.presto.cassandra.CassandraTable",
      "com.facebook.presto.spi.TableNotFoundException",
      "com.facebook.presto.spi.ColumnHandle",
      "com.facebook.presto.cassandra.CassandraColumnHandle",
      "com.facebook.presto.cassandra.CassandraPartitionResult",
      "com.datastax.driver.core.Host",
      "com.facebook.presto.cassandra.SizeEstimate",
      "com.facebook.presto.cassandra.CassandraTableHandle",
      "com.datastax.driver.core.Statement",
      "com.facebook.presto.common.predicate.ValueSet",
      "com.facebook.presto.common.predicate.Ranges"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.cassandra.CassandraSession", false, CassandraPartitionManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.common.predicate.TupleDomain", false, CassandraPartitionManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.ConnectorTableHandle", false, CassandraPartitionManager_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CassandraPartitionManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.cassandra.CassandraPartitionManager",
      "com.google.common.collect.Maps$EntryFunction",
      "com.facebook.presto.cassandra.util.CassandraCqlUtils",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.type.DoubleType",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.common.type.IntegerType",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.common.type.TinyintType",
      "com.facebook.presto.common.type.DateType",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.cassandra.CassandraType",
      "com.facebook.presto.cassandra.util.CassandraCqlUtils$1",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.common.predicate.TupleDomain"
    );
  }
}
