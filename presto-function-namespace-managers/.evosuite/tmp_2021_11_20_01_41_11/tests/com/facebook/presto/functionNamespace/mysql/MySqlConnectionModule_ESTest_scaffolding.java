/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 10:01:27 GMT 2021
 */

package com.facebook.presto.functionNamespace.mysql;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MySqlConnectionModule_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-function-namespace-managers"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MySqlConnectionModule_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.inject.Module",
      "com.facebook.presto.functionNamespace.mysql.FunctionNamespaceDao",
      "org.jdbi.v3.core.extension.HandleSupplier",
      "org.jdbi.v3.core.transaction.UnableToRestoreAutoCommitStateException",
      "com.facebook.airlift.configuration.ConfigBinder$InternalConfigBinder",
      "com.facebook.airlift.configuration.ConfigBinder$GuiceConfigBinder$1",
      "org.jdbi.v3.core.statement.DefaultStatementBuilder",
      "com.facebook.presto.functionNamespace.mysql.FunctionNamespacesTableCustomizerFactory$Config",
      "org.jdbi.v3.core.config.ConfigRegistry",
      "org.jdbi.v3.core.config.JdbiConfig",
      "com.facebook.airlift.configuration.ConfigBinder$GuiceConfigBinder",
      "org.jdbi.v3.core.transaction.TransactionException",
      "org.jdbi.v3.core.extension.Extensions",
      "org.jdbi.v3.core.statement.StatementBuilder",
      "com.google.inject.Binder",
      "com.facebook.airlift.configuration.AbstractConfigurationAwareModule",
      "com.facebook.airlift.configuration.ConfigurationFactory",
      "org.jdbi.v3.core.transaction.LocalTransactionHandler",
      "org.jdbi.v3.core.ConnectionException",
      "org.jdbi.v3.core.statement.StatementBuilderFactory",
      "org.jdbi.v3.core.spi.JdbiPlugin",
      "com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule$1",
      "org.jdbi.v3.core.Jdbi",
      "com.facebook.presto.functionNamespace.mysql.MySqlFunctionNamespaceManagerConfig",
      "com.google.common.reflect.TypeParameter",
      "org.jdbi.v3.sqlobject.SqlObjectPlugin",
      "com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule",
      "com.facebook.airlift.configuration.ConfigurationAwareModule",
      "org.jdbi.v3.core.ConnectionFactory",
      "com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule$FunctionNamespaceDaoProvider",
      "org.jdbi.v3.core.transaction.TransactionHandler",
      "com.google.inject.Injector",
      "com.google.common.reflect.TypeCapture",
      "com.google.inject.Provider",
      "org.jdbi.v3.core.config.Configurable",
      "org.jdbi.v3.core.extension.NoSuchExtensionException",
      "com.facebook.airlift.configuration.ConfigBinder",
      "org.jdbi.v3.sqlobject.SqlObjectFactory",
      "org.jdbi.v3.core.extension.ExtensionFactory",
      "com.google.inject.TypeLiteral",
      "org.jdbi.v3.core.JdbiException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MySqlConnectionModule_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.airlift.configuration.AbstractConfigurationAwareModule",
      "com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule",
      "com.google.inject.TypeLiteral",
      "com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule$1",
      "com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule$FunctionNamespaceDaoProvider",
      "org.jdbi.v3.core.Jdbi",
      "org.jdbi.v3.core.config.ConfigRegistry",
      "org.jdbi.v3.core.transaction.LocalTransactionHandler",
      "org.jdbi.v3.core.statement.DefaultStatementBuilder",
      "org.jdbi.v3.sqlobject.SqlObjectPlugin",
      "org.jdbi.v3.sqlobject.SqlObjectFactory",
      "org.jdbi.v3.core.extension.Extensions",
      "com.facebook.presto.functionNamespace.mysql.FunctionNamespacesTableCustomizerFactory$Config",
      "com.google.common.base.Preconditions",
      "com.facebook.airlift.configuration.ConfigBinder",
      "com.facebook.airlift.configuration.ConfigBinder$GuiceConfigBinder"
    );
  }
}
