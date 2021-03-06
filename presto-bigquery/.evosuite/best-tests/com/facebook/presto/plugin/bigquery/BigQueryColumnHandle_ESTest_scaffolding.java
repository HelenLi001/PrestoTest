/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 02:33:40 GMT 2021
 */

package com.facebook.presto.plugin.bigquery;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BigQueryColumnHandle_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.plugin.bigquery.BigQueryColumnHandle"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-bigquery"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BigQueryColumnHandle_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "io.airlift.slice.Slice",
      "com.facebook.presto.common.type.DecimalType",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.type.VariableWidthType",
      "com.facebook.presto.plugin.bigquery.BigQueryColumnHandle",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
      "com.facebook.presto.plugin.bigquery.BigQueryType",
      "com.facebook.presto.common.type.Type",
      "com.google.cloud.bigquery.Field$Mode",
      "com.google.cloud.bigquery.Field",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.google.cloud.bigquery.Field$Builder",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.facebook.presto.spi.ColumnHandle",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.plugin.bigquery.BigQueryType$Adaptor",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.block.Block",
      "com.facebook.presto.common.type.DateType",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.common.type.DoubleType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BigQueryColumnHandle_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.plugin.bigquery.BigQueryColumnHandle",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.cloud.bigquery.Field$Mode",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap"
    );
  }
}
