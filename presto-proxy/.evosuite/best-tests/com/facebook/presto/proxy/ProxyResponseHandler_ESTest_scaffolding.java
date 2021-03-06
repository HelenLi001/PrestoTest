/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 22 20:33:14 GMT 2021
 */

package com.facebook.presto.proxy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ProxyResponseHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.proxy.ProxyResponseHandler"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-proxy"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ProxyResponseHandler_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ListMultimap",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.ImmutableSet$Indexed",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.SortedMultiset",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.Optional",
      "com.facebook.presto.proxy.ProxyResponseHandler$ProxyResponse",
      "com.google.common.collect.LinkedHashMultiset",
      "com.google.common.collect.AbstractMapBasedMultiset$2",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.collect.Maps$13",
      "com.google.common.collect.Platform",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableMultimap$Values",
      "com.google.common.collect.Multisets",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.base.Predicate",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "com.google.common.collect.ImmutableMultimap$1",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.Present",
      "com.google.common.collect.ImmutableMultimap$2",
      "com.google.common.collect.Maps$12",
      "com.google.common.collect.ImmutableMultiset$ElementSet",
      "com.google.common.base.Joiner",
      "com.google.common.collect.Maps$TransformedEntriesMap",
      "com.google.common.collect.Iterables",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.RegularImmutableMultiset$NonTerminalEntry",
      "com.google.common.collect.AbstractMapBasedMultiset$2$1",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.Multisets$ImmutableEntry",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "com.google.common.collect.Count",
      "com.google.common.collect.Multisets$AbstractEntry",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.net.MediaType",
      "com.google.common.base.Charsets",
      "com.google.common.base.Absent",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.facebook.presto.proxy.ProxyResponseHandler",
      "com.google.common.base.CharMatcher",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.AbstractMultiset$EntrySet",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap$1",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.facebook.airlift.http.client.Response",
      "com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.Objects",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.base.Converter",
      "com.google.common.collect.Maps$8",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Maps$9",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.AbstractMapBasedMultiset",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Multiset$Entry",
      "com.google.common.collect.Iterators$4",
      "com.google.common.primitives.Ints$IntConverter",
      "com.google.common.collect.Iterators$5",
      "com.facebook.airlift.http.client.ResponseHandler",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.Multisets$EntrySet",
      "com.facebook.presto.proxy.ProxyException",
      "com.google.common.collect.ImmutableMultiset$1",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.collect.SortedMultisetBridge",
      "com.google.common.base.Ascii",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.collect.Maps",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.net.MediaType$1",
      "com.google.common.primitives.Ints",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.facebook.airlift.http.client.Request",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableMap$Values"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ProxyResponseHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.base.Charsets",
      "com.google.common.base.Ascii",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "com.google.common.collect.Platform",
      "com.google.common.collect.Maps",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.common.net.MediaType$1",
      "com.google.common.collect.Maps$9",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap",
      "com.google.common.collect.Maps$TransformedEntriesMap",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.Objects",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap$1",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.Maps$13",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Iterators$6",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Maps$12",
      "com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.AbstractMapBasedMultiset",
      "com.google.common.collect.LinkedHashMultiset",
      "com.google.common.collect.Multisets",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.Count",
      "com.google.common.collect.Multisets$EntrySet",
      "com.google.common.collect.AbstractMultiset$EntrySet",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.AbstractMapBasedMultiset$2",
      "com.google.common.collect.Multisets$AbstractEntry",
      "com.google.common.collect.AbstractMapBasedMultiset$2$1",
      "com.google.common.collect.Multisets$ImmutableEntry",
      "com.google.common.primitives.Ints",
      "com.google.common.base.Present",
      "com.google.common.base.Joiner",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.net.MediaType",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.google.common.collect.ImmutableMultimap$1",
      "com.google.common.base.MoreObjects",
      "com.facebook.presto.proxy.ProxyResponseHandler",
      "com.facebook.presto.proxy.ProxyResponseHandler$ProxyResponse",
      "com.facebook.airlift.http.client.HttpStatus$Family",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.facebook.airlift.http.client.HttpStatus",
      "com.google.common.base.CharMatcher$None",
      "com.facebook.presto.proxy.ProxyException"
    );
  }
}
