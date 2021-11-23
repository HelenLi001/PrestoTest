/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 22:49:56 GMT 2021
 */

package com.facebook.presto.server.testing;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TestingPrestoServerLauncherOptions_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.server.testing.TestingPrestoServerLauncherOptions"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-testing-server-launcher"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TestingPrestoServerLauncherOptions_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.facebook.presto.server.testing.TestingPrestoServerLauncherOptions",
      "com.google.common.base.JdkPattern",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$And",
      "com.facebook.presto.server.testing.TestingPrestoServerLauncherOptions$Catalog",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CommonPattern",
      "com.google.common.base.Predicate",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.Preconditions",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.Splitter$Strategy"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TestingPrestoServerLauncherOptions_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.facebook.presto.server.testing.TestingPrestoServerLauncherOptions",
      "com.facebook.presto.server.testing.TestingPrestoServerLauncherOptions$Catalog",
      "io.airlift.airline.OptionType",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList"
    );
  }
}
