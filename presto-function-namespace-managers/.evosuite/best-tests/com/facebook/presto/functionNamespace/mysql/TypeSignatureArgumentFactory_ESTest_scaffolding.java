/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 10:04:19 GMT 2021
 */

package com.facebook.presto.functionNamespace.mysql;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TypeSignatureArgumentFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.functionNamespace.mysql.TypeSignatureArgumentFactory"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-function-namespace-managers"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TypeSignatureArgumentFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.jdbi.v3.core.generic.internal.TypeCapture",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "org.jdbi.v3.core.generic.GenericTypes$1",
      "org.jdbi.v3.core.argument.AbstractArgumentFactory$ArgumentPredicate",
      "org.jdbi.v3.core.generic.internal.TypeVisitor",
      "org.jdbi.v3.core.generic.internal.TypeResolver$TypeVariableKey",
      "org.jdbi.v3.core.generic.GenericTypes$2",
      "org.jdbi.v3.core.config.ConfigRegistry",
      "org.jdbi.v3.core.config.JdbiConfig",
      "com.facebook.presto.common.type.TypeSignature",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.fasterxml.jackson.annotation.JsonValue",
      "org.jdbi.v3.core.argument.ObjectArgument",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.QualifiedObjectName",
      "org.jdbi.v3.core.generic.GenericTypes",
      "com.facebook.presto.common.type.UserDefinedType",
      "org.jdbi.v3.core.generic.internal.Preconditions",
      "org.jdbi.v3.core.generic.internal.TypeToken",
      "org.jdbi.v3.core.generic.internal.TypeResolver$WildcardCapturer",
      "org.jdbi.v3.core.generic.internal.TypeResolver$TypeTable$1",
      "org.jdbi.v3.core.generic.internal.TypeResolver",
      "org.jdbi.v3.core.argument.ArgumentFactory",
      "org.jdbi.v3.core.argument.Argument",
      "com.facebook.presto.common.type.TypeSignature$EnumMapParsingData",
      "org.jdbi.v3.core.statement.StatementContext",
      "org.jdbi.v3.core.generic.internal.TypeResolver$TypeMappingIntrospector",
      "org.jdbi.v3.core.argument.AbstractArgumentFactory",
      "com.facebook.presto.functionNamespace.mysql.TypeSignatureArgumentFactory",
      "org.jdbi.v3.core.generic.internal.TypeToken$SimpleTypeToken",
      "org.jdbi.v3.core.generic.internal.TypeParameter",
      "org.jdbi.v3.core.generic.internal.TypeResolver$TypeTable"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.common.type.TypeSignature", false, TypeSignatureArgumentFactory_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jdbi.v3.core.config.ConfigRegistry", false, TypeSignatureArgumentFactory_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TypeSignatureArgumentFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jdbi.v3.core.argument.AbstractArgumentFactory",
      "com.facebook.presto.functionNamespace.mysql.TypeSignatureArgumentFactory",
      "org.jdbi.v3.core.generic.GenericTypes",
      "org.jdbi.v3.core.generic.internal.TypeCapture",
      "org.jdbi.v3.core.generic.internal.TypeToken",
      "org.jdbi.v3.core.generic.internal.TypeToken$SimpleTypeToken",
      "org.jdbi.v3.core.generic.internal.Preconditions",
      "org.jdbi.v3.core.generic.internal.TypeResolver",
      "org.jdbi.v3.core.generic.internal.TypeResolver$TypeTable",
      "org.jdbi.v3.core.generic.internal.TypeVisitor",
      "org.jdbi.v3.core.generic.internal.TypeResolver$WildcardCapturer",
      "org.jdbi.v3.core.generic.internal.TypeResolver$TypeMappingIntrospector",
      "org.jdbi.v3.core.generic.internal.TypeResolver$TypeVariableKey",
      "org.jdbi.v3.core.generic.internal.TypeResolver$TypeTable$1",
      "com.facebook.presto.common.type.TypeSignature",
      "org.jdbi.v3.core.config.ConfigRegistry",
      "org.jdbi.v3.core.argument.ObjectArgument",
      "org.jdbi.v3.core.generic.internal.TypeToken$1"
    );
  }
}
