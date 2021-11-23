/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 08:45:55 GMT 2021
 */

package com.facebook.presto.druid;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DruidConfig_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.druid.DruidConfig"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-druid"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DruidConfig_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableList$SubList",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$InternalEntry",
      "org.apache.hadoop.fs.FileSystem",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$Strength",
      "com.google.common.base.CharMatcher$ForPredicate",
      "org.apache.hadoop.io.Writable",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerAdapter",
      "com.google.common.base.JdkPattern",
      "com.google.common.collect.PeekingIterator",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$WeakValueReference",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.AbstractMapDecorator",
      "com.facebook.presto.hadoop.$internal.org.slf4j.Logger",
      "io.airlift.units.Duration$1",
      "org.apache.hadoop.conf.Configuration",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLogFactory",
      "org.apache.hadoop.classification.InterfaceStability$Stable",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.MapIterator",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.MoreObjects",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment",
      "com.google.common.base.CommonPattern",
      "com.google.common.collect.Iterators$10",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.UnmodifiableMap",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMaker$Dummy",
      "com.google.common.base.Predicate",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.base.CharMatcher$Invisible",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.LogFactory",
      "com.google.common.base.CharMatcher$None",
      "org.apache.hadoop.fs.ChecksumFileSystem",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Function",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$StrongValueEntry",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.PairwiseEquivalence",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.collect.ImmutableAsList",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LocationAwareLogger",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NamedLoggerBase",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Preconditions",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.Interners",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "org.apache.hadoop.fs.FilterFileSystem",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.Log",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.apache.hadoop.util.StringInterner",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "org.apache.hadoop.conf.Configuration$IntegerRanges",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Equivalence",
      "com.google.common.base.CharMatcher",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLog",
      "com.google.common.collect.AbstractIterator",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.Interner",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.facebook.presto.hadoop.$internal.org.slf4j.LoggerFactory",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.Util",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.Interners$InternerImpl",
      "com.facebook.presto.druid.DruidConfig$DruidAuthenticationType",
      "com.google.common.collect.ImmutableCollection",
      "io.airlift.units.Duration",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$InternalEntryHelper",
      "org.apache.hadoop.conf.Configured",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Equivalence$Equals",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "org.apache.hadoop.fs.Path",
      "org.apache.hadoop.conf.Configurable",
      "org.apache.hadoop.classification.InterfaceAudience$Public",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "org.apache.hadoop.conf.Configuration$NegativeCacheSentinel",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "com.google.common.collect.Iterators$1",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Predicate",
      "com.google.common.collect.Iterators$4",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$Segment",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LoggerFactoryBinder",
      "com.google.common.collect.Iterators$5",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.base.Splitter$Strategy",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.IterableMap",
      "io.airlift.units.Preconditions",
      "com.google.common.base.AbstractIterator$1",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.ILoggerFactory",
      "com.google.common.collect.Iterators",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.collect.ImmutableList",
      "com.google.common.base.StandardSystemProperty",
      "org.apache.hadoop.conf.Configuration$Resource",
      "com.google.common.base.AbstractIterator$State",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMaker",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Equivalence$Identity",
      "org.apache.hadoop.HadoopIllegalArgumentException",
      "com.facebook.presto.druid.DruidConfig",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.Interners$InternerBuilder",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.FunctionalEquivalence",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$AbstractWeakKeyEntry",
      "com.google.common.base.CharMatcher$Negated",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.Unmodifiable",
      "org.apache.hadoop.hdfs.DistributedFileSystem",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$1",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.CharMatcher$Digit",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$Strength$1",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.lang.StringUtils",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$Strength$2",
      "com.google.common.collect.Iterators$MergingIterator",
      "org.apache.hadoop.fs.LocalFileSystem"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DruidConfig_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.druid.DruidConfig",
      "com.facebook.presto.druid.DruidConfig$DruidAuthenticationType",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.StandardSystemProperty",
      "io.airlift.units.Duration",
      "io.airlift.units.Preconditions",
      "com.google.common.collect.Iterators",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLogFactory",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.LogFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.Util",
      "com.facebook.presto.hadoop.$internal.org.slf4j.LoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NamedLoggerBase",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerAdapter",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Preconditions",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.AbstractMapDecorator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.UnmodifiableMap",
      "org.apache.hadoop.conf.Configuration",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.AbstractIterator$1",
      "io.airlift.units.Duration$1",
      "org.apache.hadoop.fs.Path",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.lang.StringUtils",
      "org.apache.hadoop.conf.Configuration$Resource",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.Iterators$9",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.Interners",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.Interners$InternerBuilder",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMaker",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.Interners$InternerImpl",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Equivalence",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Equivalence$Equals",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$1",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$Strength",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.MoreObjects",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$Segment",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Equivalence$Identity",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment",
      "org.apache.hadoop.util.StringInterner",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMaker$Dummy",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$AbstractWeakKeyEntry",
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry"
    );
  }
}
