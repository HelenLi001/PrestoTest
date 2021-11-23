/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 00:25:08 GMT 2021
 */

package com.facebook.presto.kafka;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class KafkaInternalFieldDescription_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.kafka.KafkaInternalFieldDescription"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-kafka"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KafkaInternalFieldDescription_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableEntry",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.RangeSet",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.common.type.VariableWidthType",
      "com.facebook.presto.kafka.KafkaColumnHandle",
      "com.google.common.base.JdkPattern",
      "com.facebook.presto.common.type.TypeSignature",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.Platform",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.ImmutableRangeSet",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.common.type.BigintType",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.google.common.collect.Range",
      "com.google.common.collect.CollectPreconditions",
      "com.facebook.presto.common.type.VarcharType",
      "com.google.common.base.CommonPattern",
      "com.google.common.collect.CollectCollectors",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.facebook.presto.kafka.encoder.EncoderColumnHandle",
      "com.facebook.presto.spi.ColumnMetadata",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ImmutableRangeSet$ComplementRanges",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.decoder.DecoderColumnHandle",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.ImmutableList$Builder",
      "io.airlift.slice.Slice",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.facebook.presto.common.type.BooleanType",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.base.Strings",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.google.common.base.PatternCompiler",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.facebook.presto.common.type.ParameterKind",
      "com.google.common.collect.ImmutableRangeSet$AsSet",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.facebook.presto.spi.ColumnMetadata$Builder",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.common.type.Type",
      "com.google.common.collect.ImmutableSortedSet",
      "com.facebook.presto.kafka.KafkaInternalFieldDescription",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.ImmutableRangeSet$Builder",
      "com.google.common.collect.ImmutableRangeSet$1",
      "com.facebook.presto.spi.SchemaUtil",
      "com.google.common.base.MoreObjects",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "com.facebook.presto.spi.ColumnHandle",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.AbstractRangeSet",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.facebook.presto.common.block.Block",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(KafkaInternalFieldDescription_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.BigintType",
      "com.google.common.base.Strings",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.Platform",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.VarcharType",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.CollectCollectors",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.facebook.presto.kafka.KafkaInternalFieldDescription",
      "com.facebook.presto.kafka.KafkaColumnHandle",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.facebook.presto.spi.ColumnMetadata",
      "com.facebook.presto.spi.SchemaUtil"
    );
  }
}
