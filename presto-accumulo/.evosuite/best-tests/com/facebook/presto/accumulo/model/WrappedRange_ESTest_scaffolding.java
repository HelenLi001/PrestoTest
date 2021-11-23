/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 01:41:50 GMT 2021
 */

package com.facebook.presto.accumulo.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class WrappedRange_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.accumulo.model.WrappedRange"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WrappedRange_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.hadoop.$internal.org.slf4j.LoggerFactory",
      "com.google.common.io.ByteStreams$1",
      "org.apache.accumulo.core.data.ByteSequence",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.Util",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LocationAwareLogger",
      "org.apache.hadoop.io.FastByteComparisons",
      "org.apache.hadoop.io.WritableComparable",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NamedLoggerBase",
      "org.apache.hadoop.io.Text",
      "org.apache.hadoop.io.Writable",
      "org.apache.accumulo.core.data.ArrayByteSequence",
      "org.apache.hadoop.io.BinaryComparable",
      "com.facebook.presto.accumulo.model.WrappedRange",
      "com.facebook.presto.hadoop.$internal.org.slf4j.ILoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerAdapter",
      "org.apache.hadoop.io.WritableComparator",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.Log",
      "com.facebook.presto.hadoop.$internal.org.slf4j.Logger",
      "com.google.common.io.ByteStreams$ByteArrayDataOutputStream",
      "org.apache.accumulo.core.data.Key",
      "com.google.common.io.ByteArrayDataInput",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder$UnsafeComparer$1",
      "org.apache.hadoop.conf.Configurable",
      "org.apache.thrift.TBase",
      "com.google.common.io.ByteArrayDataOutput",
      "org.apache.hadoop.io.FastByteComparisons$Comparer",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLogFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "org.apache.accumulo.core.data.Column",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLog",
      "org.apache.accumulo.core.data.thrift.TRange",
      "com.google.common.io.ByteStreams$ByteArrayDataInputStream",
      "com.google.common.io.ByteStreams$LimitedInputStream",
      "org.apache.accumulo.core.data.Range",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LoggerFactoryBinder",
      "org.apache.hadoop.io.RawComparator",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder$UnsafeComparer",
      "com.google.common.io.ByteStreams",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.LogFactory",
      "com.google.common.base.Preconditions",
      "org.apache.accumulo.core.data.PartialKey",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder",
      "org.apache.hadoop.io.WritableUtils",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.StaticLoggerBinder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WrappedRange_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.accumulo.model.WrappedRange",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.google.common.io.ByteStreams$1",
      "com.google.common.io.ByteStreams",
      "com.google.common.io.ByteStreams$ByteArrayDataInputStream",
      "com.google.common.base.Preconditions",
      "org.apache.accumulo.core.data.Range",
      "com.google.common.io.ByteStreams$ByteArrayDataOutputStream",
      "org.apache.accumulo.core.data.Key",
      "org.apache.hadoop.io.WritableUtils",
      "org.apache.accumulo.core.data.PartialKey",
      "org.apache.hadoop.io.WritableComparator",
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
      "org.apache.hadoop.io.FastByteComparisons",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder$UnsafeComparer$1",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder$UnsafeComparer",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder"
    );
  }
}
