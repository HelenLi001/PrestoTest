/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 19:46:37 GMT 2021
 */

package com.facebook.presto.orc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DwrfKeyProvider_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.orc.DwrfKeyProvider"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-orc"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DwrfKeyProvider_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableEntry",
      "io.airlift.slice.Slice",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.orc.DwrfKeyProvider",
      "com.google.common.collect.Multimap",
      "com.google.errorprone.annotations.concurrent.LazyInit",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.facebook.presto.orc.metadata.OrcType",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.SetMultimap",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.ImmutableMap$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DwrfKeyProvider_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.orc.DwrfKeyProvider",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList"
    );
  }
}
