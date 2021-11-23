/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 01:35:08 GMT 2021
 */

package com.facebook.presto.accumulo.iterators;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MinByteArrayCombiner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.accumulo.iterators.MinByteArrayCombiner"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-accumulo"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MinByteArrayCombiner_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.accumulo.core.data.ByteSequence",
      "com.google.common.cache.LocalCache$WeightedStrongValueReference",
      "com.google.common.cache.LoadingCache",
      "com.facebook.presto.accumulo.iterators.MinByteArrayCombiner",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.base.FunctionalEquivalence",
      "com.google.common.cache.AbstractCache$StatsCounter",
      "org.apache.hadoop.io.Writable",
      "org.apache.accumulo.core.data.ArrayByteSequence",
      "com.google.common.cache.LocalCache$AccessQueue",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException",
      "com.google.common.cache.LocalCache$WeightedWeakValueReference",
      "org.apache.accumulo.core.data.Value",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.google.common.cache.CacheLoader$InvalidCacheLoadException",
      "com.google.common.cache.LocalCache$WeakValueReference",
      "com.google.common.cache.Weigher",
      "com.google.common.cache.ReferenceEntry",
      "com.google.common.base.Function",
      "com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder",
      "com.google.common.base.Ticker",
      "com.google.common.cache.LocalCache$EntryFactory$6",
      "com.google.common.cache.LocalCache$EntryFactory$7",
      "com.google.common.cache.LocalCache$EntryFactory$8",
      "com.google.common.cache.CacheLoader",
      "com.google.common.cache.LocalCache$EntryFactory$2",
      "com.google.common.cache.LocalCache$EntryFactory$3",
      "com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator",
      "com.google.common.cache.LocalCache$EntryFactory$4",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache$EntryFactory$5",
      "com.google.common.base.Predicate",
      "com.google.common.cache.LocalCache$EntryFactory$1",
      "com.google.common.base.Ticker$1",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.cache.LocalCache$SoftValueReference",
      "org.apache.accumulo.core.iterators.Combiner",
      "org.apache.accumulo.core.iterators.WrappingIterator",
      "com.google.common.cache.LocalCache$AccessQueue$1",
      "com.google.common.cache.CacheStats",
      "org.apache.accumulo.core.iterators.OptionDescriber$IteratorOptions",
      "com.google.common.cache.LocalCache$Strength",
      "com.google.common.cache.LocalCache$WeightedSoftValueReference",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.base.Supplier",
      "org.apache.hadoop.io.WritableComparable",
      "com.google.common.util.concurrent.ExecutionError",
      "com.google.common.cache.LocalCache$ValueReference",
      "org.apache.accumulo.core.iterators.SortedKeyValueIterator",
      "com.google.common.cache.LocalCache",
      "com.google.common.util.concurrent.UncheckedExecutionException",
      "com.google.common.base.PairwiseEquivalence",
      "org.apache.accumulo.core.data.Key",
      "com.google.common.cache.LocalCache$2",
      "com.google.common.base.Suppliers",
      "com.google.common.cache.CacheBuilder$NullListener",
      "com.google.common.cache.LocalCache$1",
      "com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.google.common.primitives.UnsignedBytes",
      "com.google.common.cache.LocalCache$LocalManualCache$1",
      "com.google.common.base.Equivalence",
      "com.google.common.cache.LocalCache$WriteQueue$1",
      "com.google.common.cache.LocalCache$Strength$3",
      "com.google.common.cache.LocalCache$Strength$2",
      "com.google.common.cache.LocalCache$StrongValueReference",
      "com.google.common.cache.LocalCache$Strength$1",
      "com.google.common.base.MoreObjects",
      "com.google.common.cache.LocalCache$WriteQueue",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.cache.LocalCache$Segment",
      "org.apache.accumulo.core.data.Range",
      "org.apache.accumulo.core.client.IteratorSetting",
      "org.apache.accumulo.core.iterators.OptionDescriber",
      "com.google.common.cache.CacheBuilder$1",
      "com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.base.Preconditions",
      "com.google.common.cache.RemovalListener",
      "com.google.common.cache.CacheBuilder$2",
      "com.google.common.cache.Cache",
      "org.apache.accumulo.core.iterators.IteratorEnvironment"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MinByteArrayCombiner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.accumulo.core.iterators.WrappingIterator",
      "com.google.common.cache.CacheBuilder$1",
      "com.google.common.base.Suppliers",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.cache.CacheStats",
      "com.google.common.base.Preconditions",
      "com.google.common.cache.CacheBuilder$2",
      "com.google.common.base.Ticker$1",
      "com.google.common.base.Ticker",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache$1",
      "com.google.common.cache.LocalCache$2",
      "com.google.common.cache.LocalCache",
      "com.google.common.cache.LocalCache$Strength",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.Equivalence",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.google.common.cache.CacheBuilder$NullListener",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.google.common.cache.LocalCache$Segment",
      "com.google.common.cache.LocalCache$WriteQueue",
      "com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.google.common.cache.LocalCache$WriteQueue$1",
      "com.google.common.cache.LocalCache$AccessQueue",
      "com.google.common.cache.LocalCache$AccessQueue$1",
      "org.apache.accumulo.core.iterators.Combiner",
      "com.facebook.presto.accumulo.iterators.MinByteArrayCombiner",
      "com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1",
      "com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator",
      "com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder",
      "com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator",
      "org.apache.accumulo.core.data.Key",
      "com.google.common.primitives.UnsignedBytes",
      "org.apache.accumulo.core.iterators.OptionDescriber$IteratorOptions",
      "org.apache.accumulo.core.iterators.IteratorUtil",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.Splitter$5",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.AbstractIterator$1",
      "org.apache.accumulo.core.iterators.conf.ColumnSet"
    );
  }
}
