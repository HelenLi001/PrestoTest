/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 18:39:47 GMT 2021
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
public class DictionaryCompressionOptimizer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.orc.DictionaryCompressionOptimizer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DictionaryCompressionOptimizer_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "it.unimi.dsi.fastutil.objects.AbstractObjectSet",
      "com.google.common.collect.RangeSet",
      "it.unimi.dsi.fastutil.objects.Reference2IntMap$Entry",
      "com.google.common.collect.ImmutableList$SubList",
      "it.unimi.dsi.fastutil.objects.ObjectSpliterators$AbstractIndexBasedSpliterator",
      "it.unimi.dsi.fastutil.objects.Reference2ByteFunction",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.orc.writer.DictionaryColumnWriter",
      "it.unimi.dsi.fastutil.objects.Reference2IntFunction",
      "com.facebook.presto.orc.writer.SliceDictionaryColumnWriter",
      "it.unimi.dsi.fastutil.shorts.Short2IntFunction",
      "it.unimi.dsi.fastutil.longs.Long2IntFunction",
      "com.google.common.collect.ImmutableRangeSet",
      "it.unimi.dsi.fastutil.Function",
      "it.unimi.dsi.fastutil.objects.Reference2ShortFunction",
      "com.google.common.collect.Range",
      "it.unimi.dsi.fastutil.objects.ObjectCollection",
      "it.unimi.dsi.fastutil.ints.Int2LongFunction",
      "com.google.common.collect.RegularImmutableSet",
      "it.unimi.dsi.fastutil.objects.Object2ReferenceFunction",
      "com.google.common.base.Predicate",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer$BufferedBytesCounter",
      "com.google.common.collect.ImmutableRangeSet$ComplementRanges",
      "it.unimi.dsi.fastutil.objects.ReferenceCollection",
      "it.unimi.dsi.fastutil.bytes.Byte2IntFunction",
      "it.unimi.dsi.fastutil.ints.Int2CharFunction",
      "it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction",
      "it.unimi.dsi.fastutil.ints.Int2ShortFunction",
      "it.unimi.dsi.fastutil.ints.Int2ByteFunction",
      "com.google.common.collect.ImmutableAsList",
      "it.unimi.dsi.fastutil.ints.Int2ReferenceFunction",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "it.unimi.dsi.fastutil.objects.Reference2IntArrayMap",
      "it.unimi.dsi.fastutil.ints.IntCollection",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer$DictionaryColumnManager",
      "it.unimi.dsi.fastutil.objects.AbstractReference2IntMap",
      "it.unimi.dsi.fastutil.chars.Char2ReferenceFunction",
      "it.unimi.dsi.fastutil.ints.IntIterable",
      "it.unimi.dsi.fastutil.objects.Reference2LongFunction",
      "com.google.common.collect.UnmodifiableListIterator",
      "it.unimi.dsi.fastutil.objects.ObjectIterator",
      "it.unimi.dsi.fastutil.objects.ReferenceSet",
      "com.google.common.collect.ImmutableSortedSet",
      "it.unimi.dsi.fastutil.ints.Int2FloatFunction",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.ImmutableRangeSet$Builder",
      "it.unimi.dsi.fastutil.objects.ReferenceArraySet",
      "it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction",
      "it.unimi.dsi.fastutil.chars.Char2IntFunction",
      "it.unimi.dsi.fastutil.objects.ObjectSet",
      "com.google.common.collect.ImmutableList$1",
      "it.unimi.dsi.fastutil.objects.Reference2IntMap$FastEntrySet",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer",
      "it.unimi.dsi.fastutil.objects.AbstractReferenceCollection",
      "it.unimi.dsi.fastutil.objects.AbstractReference2IntFunction",
      "it.unimi.dsi.fastutil.longs.Long2ReferenceFunction",
      "com.google.common.collect.SortedIterable",
      "it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet",
      "it.unimi.dsi.fastutil.objects.Reference2IntArrayMap$EntrySet",
      "it.unimi.dsi.fastutil.floats.Float2ReferenceFunction",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.AbstractRangeSet",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "it.unimi.dsi.fastutil.doubles.Double2IntFunction",
      "it.unimi.dsi.fastutil.objects.Reference2IntMap",
      "io.airlift.units.DataSize$Unit",
      "it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.orc.writer.ColumnWriter",
      "it.unimi.dsi.fastutil.objects.Reference2FloatFunction",
      "it.unimi.dsi.fastutil.ints.Int2IntFunction",
      "it.unimi.dsi.fastutil.floats.Float2IntFunction",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer$DictionaryColumn",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.collect.ImmutableSet",
      "it.unimi.dsi.fastutil.objects.ObjectSpliterator",
      "it.unimi.dsi.fastutil.objects.ObjectIterable",
      "it.unimi.dsi.fastutil.ints.Int2ObjectFunction",
      "com.google.common.collect.AbstractIndexedListIterator",
      "it.unimi.dsi.fastutil.objects.AbstractReferenceSet",
      "com.google.common.collect.CollectCollectors",
      "it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction",
      "io.airlift.units.DataSize",
      "it.unimi.dsi.fastutil.objects.Reference2IntArrayMap$KeySet$KeySetSpliterator",
      "it.unimi.dsi.fastutil.objects.Reference2DoubleFunction",
      "it.unimi.dsi.fastutil.objects.AbstractObjectSpliterator",
      "com.google.common.collect.ImmutableList$Builder",
      "io.airlift.units.Preconditions",
      "it.unimi.dsi.fastutil.Hash",
      "it.unimi.dsi.fastutil.ints.Int2DoubleFunction",
      "it.unimi.dsi.fastutil.objects.ObjectSpliterators$EarlyBindingSizeIndexBasedSpliterator",
      "it.unimi.dsi.fastutil.objects.AbstractObjectCollection",
      "com.google.common.collect.ImmutableList",
      "it.unimi.dsi.fastutil.objects.Object2IntFunction",
      "com.google.common.collect.ImmutableRangeSet$AsSet",
      "it.unimi.dsi.fastutil.objects.Reference2IntArrayMap$KeySet",
      "it.unimi.dsi.fastutil.objects.Reference2ObjectFunction",
      "com.google.common.collect.ImmutableRangeSet$1",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer$DictionaryCompressionProjection",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "it.unimi.dsi.fastutil.ints.IntBinaryOperator",
      "it.unimi.dsi.fastutil.objects.Reference2CharFunction",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DictionaryCompressionOptimizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.airlift.units.DataSize$Unit",
      "io.airlift.units.DataSize",
      "io.airlift.units.Preconditions",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer$DictionaryColumnManager",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer$BufferedBytesCounter",
      "com.facebook.presto.orc.DictionaryCompressionOptimizer$DictionaryCompressionProjection",
      "com.google.common.collect.CollectCollectors",
      "com.facebook.presto.common.type.StatisticalDigestParametricType",
      "com.facebook.presto.common.type.TDigestParametricType",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.StatisticalDigestType",
      "com.facebook.presto.common.type.TDigestType",
      "it.unimi.dsi.fastutil.objects.AbstractReference2IntFunction",
      "it.unimi.dsi.fastutil.objects.AbstractReference2IntMap",
      "it.unimi.dsi.fastutil.objects.Reference2IntArrayMap",
      "it.unimi.dsi.fastutil.objects.AbstractReferenceCollection",
      "it.unimi.dsi.fastutil.objects.AbstractReferenceSet",
      "it.unimi.dsi.fastutil.objects.Reference2IntArrayMap$KeySet",
      "it.unimi.dsi.fastutil.objects.AbstractObjectSpliterator",
      "it.unimi.dsi.fastutil.objects.ObjectSpliterators$AbstractIndexBasedSpliterator",
      "it.unimi.dsi.fastutil.objects.ObjectSpliterators$EarlyBindingSizeIndexBasedSpliterator",
      "it.unimi.dsi.fastutil.objects.Reference2IntArrayMap$KeySet$KeySetSpliterator",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.RegularImmutableList"
    );
  }
}
