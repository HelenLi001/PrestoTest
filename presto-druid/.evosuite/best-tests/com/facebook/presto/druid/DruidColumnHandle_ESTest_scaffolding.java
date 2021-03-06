/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 08:53:34 GMT 2021
 */

package com.facebook.presto.druid;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DruidColumnHandle_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.druid.DruidColumnHandle"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-druid"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DruidColumnHandle_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "io.airlift.slice.Slice",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.facebook.presto.spi.relation.RowExpressionVisitor",
      "com.facebook.presto.spi.relation.VariableReferenceExpression",
      "com.facebook.presto.spi.relation.ConstantExpression",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.druid.DruidColumnHandle",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.fasterxml.jackson.annotation.JsonValue",
      "com.facebook.presto.spi.ColumnMetadata$Builder",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.spi.relation.CallExpression",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.spi.relation.SpecialFormExpression",
      "com.facebook.presto.spi.relation.RowExpression",
      "com.facebook.presto.druid.DruidColumnHandle$DruidColumnType",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.fasterxml.jackson.annotation.JsonSubTypes",
      "com.fasterxml.jackson.annotation.JsonSubTypes$Type",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.spi.SchemaUtil",
      "com.google.common.base.MoreObjects",
      "com.facebook.presto.spi.relation.LambdaDefinitionExpression",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.facebook.presto.spi.ColumnMetadata",
      "com.fasterxml.jackson.annotation.JsonTypeInfo",
      "com.facebook.presto.spi.ColumnHandle",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.common.block.Block",
      "com.facebook.presto.spi.relation.InputReferenceExpression"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.common.type.Type", false, DruidColumnHandle_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.relation.VariableReferenceExpression", false, DruidColumnHandle_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DruidColumnHandle_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.druid.DruidColumnHandle",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.druid.DruidColumnHandle$DruidColumnType",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.spi.relation.RowExpression",
      "com.facebook.presto.spi.relation.VariableReferenceExpression",
      "com.facebook.presto.spi.ColumnMetadata",
      "com.facebook.presto.spi.SchemaUtil"
    );
  }
}
