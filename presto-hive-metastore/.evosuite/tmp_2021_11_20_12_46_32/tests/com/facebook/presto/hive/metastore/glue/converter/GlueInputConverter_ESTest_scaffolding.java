/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 21:34:29 GMT 2021
 */

package com.facebook.presto.hive.metastore.glue.converter;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class GlueInputConverter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.hive.metastore.glue.converter.GlueInputConverter"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-hive-metastore"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GlueInputConverter_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "com.facebook.presto.hive.metastore.Table",
      "com.facebook.presto.hive.metastore.Database",
      "com.facebook.presto.hive.metastore.Column",
      "com.facebook.presto.hive.metastore.PartitionWithStatistics",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.hive.metastore.Partition",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.google.common.base.Strings",
      "com.facebook.presto.spi.SchemaTableName",
      "com.facebook.presto.hive.metastore.Database$Builder",
      "com.amazonaws.services.glue.model.Order",
      "com.fasterxml.jackson.annotation.JsonIgnore",
      "com.facebook.presto.hive.metastore.glue.converter.GlueInputConverter",
      "com.amazonaws.services.glue.model.Table",
      "com.amazonaws.protocol.StructuredPojo",
      "com.facebook.presto.hive.metastore.SortingColumn",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.hive.metastore.Storage",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.amazonaws.services.glue.model.Column",
      "com.facebook.presto.spi.security.PrincipalType",
      "com.amazonaws.services.glue.model.DatabaseInput",
      "com.amazonaws.services.glue.model.TableInput",
      "com.facebook.presto.hive.metastore.Table$Builder",
      "com.amazonaws.services.glue.model.StorageDescriptor",
      "com.facebook.presto.hive.metastore.PrestoTableType",
      "com.facebook.presto.hive.metastore.Partition$Builder",
      "com.amazonaws.protocol.ProtocolMarshaller",
      "com.facebook.presto.hive.metastore.PartitionStatistics",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.google.common.base.Preconditions",
      "com.amazonaws.services.glue.model.PartitionInput"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.amazonaws.services.glue.model.Table", false, GlueInputConverter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.metastore.Database", false, GlueInputConverter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.metastore.Partition", false, GlueInputConverter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.metastore.PartitionWithStatistics", false, GlueInputConverter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.metastore.Table", false, GlueInputConverter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GlueInputConverter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.hive.metastore.glue.converter.GlueInputConverter",
      "com.facebook.presto.hive.metastore.PrestoTableType",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.CollectCollectors",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.hive.metastore.Database",
      "com.facebook.presto.hive.metastore.Partition",
      "com.amazonaws.services.glue.model.PartitionInput",
      "com.amazonaws.services.glue.model.DatabaseInput",
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
      "com.facebook.presto.hive.metastore.Column",
      "com.amazonaws.services.glue.model.Column",
      "com.facebook.presto.hive.metastore.Table",
      "com.amazonaws.services.glue.model.TableInput",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Strings",
      "com.facebook.presto.hive.metastore.PartitionWithStatistics",
      "com.amazonaws.services.glue.model.Table",
      "it.unimi.dsi.fastutil.objects.AbstractObject2ObjectFunction",
      "it.unimi.dsi.fastutil.objects.AbstractObject2ObjectMap",
      "it.unimi.dsi.fastutil.objects.AbstractObject2ObjectSortedMap",
      "it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenCustomHashMap",
      "it.unimi.dsi.fastutil.HashCommon",
      "it.unimi.dsi.fastutil.objects.Object2ObjectFunctions$EmptyFunction",
      "it.unimi.dsi.fastutil.objects.Object2ObjectMaps$EmptyMap",
      "it.unimi.dsi.fastutil.objects.Object2ObjectMaps",
      "it.unimi.dsi.fastutil.objects.AbstractObjectCollection",
      "it.unimi.dsi.fastutil.objects.AbstractObjectSet",
      "it.unimi.dsi.fastutil.objects.AbstractObjectSortedSet",
      "it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenCustomHashMap$MapEntrySet",
      "it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenCustomHashMap$MapIterator",
      "it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenCustomHashMap$FastEntryIterator",
      "it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenCustomHashMap$MapEntry",
      "it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap"
    );
  }
}
