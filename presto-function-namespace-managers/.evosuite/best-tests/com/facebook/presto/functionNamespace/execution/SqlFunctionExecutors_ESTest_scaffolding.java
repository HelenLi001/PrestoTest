/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 10:03:21 GMT 2021
 */

package com.facebook.presto.functionNamespace.execution;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SqlFunctionExecutors_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.functionNamespace.execution.SqlFunctionExecutors"; 
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
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SqlFunctionExecutors_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.Page",
      "com.google.inject.Inject",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Builder",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.common.block.BlockEncodingSerde",
      "com.facebook.presto.spi.function.ScalarFunctionImplementation",
      "com.facebook.presto.spi.function.RoutineCharacteristics",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.thrift.api.udf.ThriftUdfRequest",
      "com.facebook.presto.spi.function.ThriftScalarFunctionImplementation",
      "com.facebook.presto.thrift.api.udf.ThriftUdfService",
      "com.facebook.presto.spi.function.RoutineCharacteristics$NullCallClause",
      "com.facebook.presto.spi.function.FunctionImplementationType",
      "com.facebook.presto.thrift.api.udf.ThriftUdfPage",
      "com.facebook.drift.client.DriftClient",
      "com.facebook.presto.thrift.api.udf.ThriftUdfResult",
      "com.facebook.presto.functionNamespace.execution.SqlFunctionExecutors",
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutionConfig",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Determinism",
      "com.facebook.drift.TException",
      "com.facebook.presto.common.function.SqlFunctionResult",
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Language",
      "com.facebook.presto.thrift.api.udf.ThriftUdfServiceException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor", false, SqlFunctionExecutors_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SqlFunctionExecutors_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.functionNamespace.execution.SqlFunctionExecutors",
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Language",
      "org.openjdk.jol.info.ClassLayout",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "org.openjdk.jol.info.ClassData",
      "org.openjdk.jol.info.FieldData",
      "org.openjdk.jol.util.VMSupport$1",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "org.openjdk.jol.util.MathUtil",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "org.openjdk.jol.util.VMSupport",
      "org.openjdk.jol.datamodel.CurrentDataModel",
      "org.openjdk.jol.info.FieldLayout",
      "com.facebook.presto.common.Page"
    );
  }
}
