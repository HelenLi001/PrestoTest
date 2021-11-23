/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 22 07:18:22 GMT 2021
 */

package com.facebook.presto.redis;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class RedisRecordSet_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.redis.RedisRecordSet"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-redis"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RedisRecordSet_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.redis.RedisJedisManager",
      "org.apache.commons.pool2.impl.BaseObjectPoolConfig",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "org.apache.commons.pool2.impl.GenericObjectPoolConfig",
      "com.facebook.presto.redis.RedisSplit",
      "redis.clients.jedis.JedisPool",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.redis.RedisRecordSet",
      "com.facebook.presto.decoder.FieldValueProvider",
      "com.facebook.presto.spi.NodeManager",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.decoder.RowDecoder",
      "com.facebook.presto.spi.schedule.NodeSelectionStrategy",
      "com.facebook.presto.spi.HostAddress",
      "redis.clients.util.Pool",
      "com.facebook.presto.redis.RedisDataType",
      "com.facebook.presto.spi.RecordSet",
      "com.facebook.presto.spi.RecordCursor",
      "com.facebook.presto.spi.ConnectorSplit",
      "com.facebook.presto.redis.RedisConnectorConfig",
      "com.facebook.presto.spi.ColumnHandle",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "com.facebook.presto.decoder.DecoderColumnHandle",
      "redis.clients.jedis.JedisPoolConfig",
      "com.facebook.presto.redis.RedisColumnHandle"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.decoder.RowDecoder", false, RedisRecordSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.redis.RedisJedisManager", false, RedisRecordSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.redis.RedisSplit", false, RedisRecordSet_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RedisRecordSet_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.redis.RedisRecordSet",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.redis.RedisSplit",
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.redis.RedisJedisManager"
    );
  }
}
