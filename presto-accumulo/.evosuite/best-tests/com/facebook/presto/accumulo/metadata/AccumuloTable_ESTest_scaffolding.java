/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 01:35:13 GMT 2021
 */

package com.facebook.presto.accumulo.metadata;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AccumuloTable_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.accumulo.metadata.AccumuloTable"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-accumulo"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AccumuloTable_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.spi.SchemaTableName",
      "com.facebook.presto.accumulo.serializers.AccumuloRowSerializer",
      "com.facebook.presto.spi.ColumnHandle",
      "com.facebook.presto.accumulo.metadata.AccumuloTable",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.accumulo.model.AccumuloColumnHandle"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AccumuloTable_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.accumulo.metadata.AccumuloTable",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "org.apache.accumulo.core.security.ColumnVisibility$Node",
      "org.apache.accumulo.core.security.ColumnVisibility$NodeType",
      "org.apache.accumulo.core.security.ColumnVisibility",
      "com.facebook.presto.accumulo.index.Indexer$MetricsKey",
      "org.apache.hadoop.io.BinaryComparable",
      "org.apache.hadoop.io.Text$1",
      "org.apache.hadoop.io.Text$2",
      "org.apache.hadoop.io.WritableComparator",
      "org.apache.hadoop.io.Text$Comparator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLogFactory",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.LogFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.Util",
      "com.facebook.presto.hadoop.$internal.org.slf4j.LoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NamedLoggerBase",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerAdapter",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Preconditions",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.AbstractMapDecorator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.UnmodifiableMap",
      "org.apache.hadoop.conf.Configuration",
      "org.apache.hadoop.io.Text",
      "org.apache.accumulo.core.client.lexicoder.AbstractEncoder",
      "org.apache.accumulo.core.client.lexicoder.impl.AbstractLexicoder",
      "org.apache.accumulo.core.iterators.LongCombiner$StringEncoder",
      "com.facebook.presto.accumulo.index.Indexer",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.spi.StandardErrorCode"
    );
  }
}
