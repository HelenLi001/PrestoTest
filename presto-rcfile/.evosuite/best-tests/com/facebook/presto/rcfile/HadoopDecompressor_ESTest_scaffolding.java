/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 20:29:18 GMT 2021
 */

package com.facebook.presto.rcfile;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class HadoopDecompressor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.rcfile.HadoopDecompressor"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-rcfile"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HadoopDecompressor_ESTest_scaffolding.class.getClassLoader() ,
      "io.airlift.slice.FixedLengthSliceInput",
      "org.apache.hadoop.io.compress.CompressionCodec",
      "com.facebook.presto.rcfile.HadoopDecompressor",
      "com.facebook.presto.rcfile.RcFileDecompressor",
      "org.apache.hadoop.io.compress.CompressionInputStream",
      "io.airlift.slice.SliceInput",
      "com.facebook.presto.rcfile.RcFileCorruptionException",
      "io.airlift.slice.BasicSliceInput",
      "org.apache.hadoop.fs.Seekable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HadoopDecompressor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.rcfile.HadoopDecompressor",
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
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.CacheBuilder$1",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Suppliers",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Suppliers$SupplierOfInstance",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.CacheStats",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Preconditions",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.CacheBuilder$2",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Ticker$1",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Ticker",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.CacheBuilder$3",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.CacheBuilder",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.CacheLoader",
      "org.apache.hadoop.io.compress.CodecPool$1",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.LocalCache$LocalManualCache",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.LocalCache$LocalLoadingCache",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.LocalCache$1",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.LocalCache$2",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.LocalCache",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.LocalCache$Strength",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.MoreObjects",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Equivalence",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Equivalence$Equals",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.CacheBuilder$OneWeigher",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.CacheBuilder$NullListener",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.LocalCache$EntryFactory",
      "com.facebook.presto.hadoop.$internal.com.google.common.cache.LocalCache$Segment",
      "org.apache.hadoop.io.compress.CodecPool"
    );
  }
}
