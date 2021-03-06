/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 10:20:29 GMT 2021
 */

package com.facebook.presto.cache.alluxio;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PrestoCacheContext_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.cache.alluxio.PrestoCacheContext"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-cache"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PrestoCacheContext_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.hash.HashCode$LongHashCode",
      "alluxio.shaded.client.com.google.common.collect.PeekingIterator",
      "alluxio.shaded.client.com.google.common.collect.AbstractMapEntry",
      "alluxio.shaded.client.com.google.common.collect.RegularImmutableList",
      "alluxio.shaded.client.com.google.common.collect.ImmutableEntry",
      "alluxio.shaded.client.com.google.common.collect.Iterators",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "alluxio.shaded.client.com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.facebook.presto.common.RuntimeStats",
      "alluxio.shaded.client.com.google.common.base.Preconditions",
      "alluxio.shaded.client.com.google.common.collect.Iterators$MergingIterator",
      "alluxio.shaded.client.com.google.common.collect.ImmutableList$ReverseImmutableList",
      "alluxio.shaded.client.com.google.common.collect.ImmutableList$SubList",
      "alluxio.shaded.client.com.google.common.collect.Iterators$ArrayItr",
      "alluxio.shaded.client.com.google.common.collect.UnmodifiableIterator",
      "alluxio.shaded.client.com.google.common.collect.ImmutableBiMap",
      "alluxio.shaded.client.com.google.common.collect.RegularImmutableMap$KeySet",
      "com.facebook.presto.hive.HiveFileContext",
      "alluxio.client.quota.CacheScope$Level",
      "alluxio.shaded.client.com.google.common.collect.BiMap",
      "alluxio.shaded.client.com.google.common.collect.ImmutableList",
      "alluxio.shaded.client.com.google.common.collect.Iterators$10",
      "io.airlift.units.DataSize",
      "com.facebook.presto.hive.CacheQuota",
      "com.google.common.hash.AbstractHasher",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMapEntry",
      "alluxio.shaded.client.com.google.common.collect.RegularImmutableMap$Values",
      "alluxio.shaded.client.com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "alluxio.shaded.client.com.google.common.collect.ImmutableCollection",
      "alluxio.client.quota.CacheQuota$1",
      "alluxio.shaded.client.com.google.common.collect.AbstractIterator",
      "com.google.common.hash.HashFunction",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "alluxio.shaded.client.com.google.common.collect.ImmutableAsList",
      "alluxio.shaded.client.com.google.common.collect.ImmutableSet",
      "com.google.common.hash.Hashing$Md5Holder",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMap",
      "alluxio.shaded.client.com.google.common.collect.SingletonImmutableSet",
      "com.google.common.hash.Hashing",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "alluxio.shaded.client.com.google.common.collect.RegularImmutableAsList",
      "com.google.common.hash.MessageDigestHashFunction",
      "alluxio.shaded.client.com.google.common.collect.Iterators$1",
      "com.google.common.hash.AbstractHashFunction",
      "alluxio.shaded.client.com.google.common.base.MoreObjects$ToStringHelper",
      "alluxio.shaded.client.com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "alluxio.shaded.client.com.google.common.collect.Iterators$4",
      "alluxio.shaded.client.com.google.common.collect.Iterators$5",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.hash.MessageDigestHashFunction$MessageDigestHasher",
      "alluxio.shaded.client.com.google.common.collect.Iterators$9",
      "com.google.common.hash.PrimitiveSink",
      "com.google.common.hash.Hasher",
      "alluxio.shaded.client.com.google.common.collect.ImmutableEnumSet",
      "com.google.common.hash.AbstractByteHasher",
      "alluxio.client.quota.CacheQuota",
      "alluxio.client.quota.CacheScope",
      "alluxio.shaded.client.com.google.common.collect.Sets",
      "com.google.common.hash.HashCode",
      "alluxio.shaded.client.com.google.common.collect.Sets$SetView",
      "alluxio.client.file.CacheContext",
      "com.google.common.hash.HashCode$BytesHashCode",
      "com.google.common.hash.HashCode$IntHashCode",
      "alluxio.shaded.client.com.google.common.collect.Sets$4",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMap$1",
      "alluxio.shaded.client.com.google.common.collect.Sets$1",
      "alluxio.shaded.client.com.google.common.collect.IndexedImmutableSet",
      "alluxio.shaded.client.com.google.common.collect.ImmutableList$1",
      "alluxio.shaded.client.com.google.common.collect.Sets$3",
      "alluxio.shaded.client.com.google.common.collect.Sets$2",
      "alluxio.shaded.client.com.google.common.collect.RegularImmutableMap",
      "alluxio.shaded.client.com.google.common.collect.UnmodifiableListIterator",
      "alluxio.shaded.client.com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Preconditions",
      "alluxio.shaded.client.com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.facebook.presto.cache.alluxio.PrestoCacheContext",
      "alluxio.shaded.client.com.google.common.collect.AbstractIndexedListIterator",
      "alluxio.shaded.client.com.google.common.base.MoreObjects",
      "alluxio.shaded.client.com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.hive.HiveFileContext$ExtraHiveFileInfo"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.hive.CacheQuota", false, PrestoCacheContext_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.HiveFileContext", false, PrestoCacheContext_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PrestoCacheContext_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "alluxio.client.file.CacheContext",
      "com.facebook.presto.cache.alluxio.PrestoCacheContext",
      "alluxio.client.quota.CacheScope$Level",
      "alluxio.client.quota.CacheScope",
      "alluxio.client.quota.CacheQuota$1",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMap",
      "alluxio.shaded.client.com.google.common.collect.RegularImmutableMap",
      "alluxio.client.quota.CacheQuota",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.AbstractHashFunction",
      "com.google.common.hash.MessageDigestHashFunction",
      "com.google.common.base.Preconditions",
      "com.google.common.hash.Hashing$Md5Holder",
      "com.google.common.hash.AbstractHasher",
      "com.google.common.hash.AbstractByteHasher",
      "com.google.common.hash.MessageDigestHashFunction$MessageDigestHasher",
      "com.google.common.hash.HashCode",
      "com.google.common.hash.HashCode$BytesHashCode",
      "com.facebook.presto.hive.CacheQuota",
      "com.facebook.presto.common.RuntimeStats",
      "com.facebook.presto.hive.HiveFileContext",
      "alluxio.shaded.client.com.google.common.base.MoreObjects",
      "alluxio.shaded.client.com.google.common.base.MoreObjects$ToStringHelper",
      "alluxio.shaded.client.com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "alluxio.shaded.client.com.google.common.base.Preconditions",
      "alluxio.shaded.client.com.google.common.collect.ImmutableCollection",
      "alluxio.shaded.client.com.google.common.collect.ImmutableSet",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMapEntrySet",
      "alluxio.shaded.client.com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "alluxio.shaded.client.com.google.common.collect.ImmutableList",
      "alluxio.shaded.client.com.google.common.collect.RegularImmutableList",
      "alluxio.shaded.client.com.google.common.collect.Sets",
      "alluxio.shaded.client.com.google.common.collect.Iterators",
      "alluxio.shaded.client.com.google.common.collect.UnmodifiableIterator",
      "alluxio.shaded.client.com.google.common.collect.UnmodifiableListIterator",
      "alluxio.shaded.client.com.google.common.collect.AbstractIndexedListIterator",
      "alluxio.shaded.client.com.google.common.collect.Iterators$ArrayItr",
      "io.airlift.units.DataSize",
      "io.airlift.units.Preconditions",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "alluxio.shaded.client.com.google.common.base.ExtraObjectsMethodsForWeb",
      "alluxio.shaded.client.com.google.common.base.Objects",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Strings",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "com.google.common.primitives.UnsignedBytes",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$ConverterComposition"
    );
  }
}
