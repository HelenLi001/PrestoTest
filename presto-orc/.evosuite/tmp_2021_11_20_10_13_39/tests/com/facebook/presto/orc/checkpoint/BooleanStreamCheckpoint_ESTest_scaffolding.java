/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 19:55:08 GMT 2021
 */

package com.facebook.presto.orc.checkpoint;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BooleanStreamCheckpoint_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.orc.checkpoint.BooleanStreamCheckpoint"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-orc"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BooleanStreamCheckpoint_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.facebook.presto.orc.checkpoint.InvalidCheckpointException",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.facebook.presto.orc.checkpoint.Checkpoints",
      "com.facebook.presto.orc.checkpoint.InputStreamCheckpoint",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.orc.checkpoint.Checkpoints$1",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.facebook.presto.orc.checkpoint.ByteStreamCheckpoint",
      "com.facebook.presto.orc.checkpoint.Checkpoints$ColumnAndSequence",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.presto.orc.checkpoint.StreamCheckpoint",
      "com.facebook.presto.orc.checkpoint.Checkpoints$ColumnPositionsList",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.orc.checkpoint.BooleanStreamCheckpoint",
      "com.facebook.presto.orc.metadata.OrcType$OrcTypeKind",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.UnmodifiableIterator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.orc.checkpoint.ByteStreamCheckpoint", false, BooleanStreamCheckpoint_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.orc.checkpoint.Checkpoints$ColumnPositionsList", false, BooleanStreamCheckpoint_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BooleanStreamCheckpoint_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.orc.checkpoint.BooleanStreamCheckpoint",
      "com.facebook.presto.orc.checkpoint.ByteStreamCheckpoint",
      "com.facebook.presto.orc.checkpoint.Checkpoints$ColumnPositionsList",
      "com.facebook.presto.orc.checkpoint.InputStreamCheckpoint",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.Lists"
    );
  }
}
