/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 18:06:15 GMT 2021
 */

package com.facebook.presto.decoder.json;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class MillisecondsSinceEpochJsonFieldDecoder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.decoder.json.MillisecondsSinceEpochJsonFieldDecoder"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-record-decoder"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MillisecondsSinceEpochJsonFieldDecoder_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.databind.JsonSerializable$Base",
      "com.facebook.presto.decoder.RowDecoderFactory",
      "com.google.common.collect.ImmutableCollection",
      "com.fasterxml.jackson.core.Versioned",
      "com.google.common.collect.PeekingIterator",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.fasterxml.jackson.databind.jsontype.TypeSerializer",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.google.common.math.IntMath",
      "com.fasterxml.jackson.annotation.JsonValue",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.fasterxml.jackson.databind.node.BaseJsonNode",
      "com.fasterxml.jackson.databind.JsonSerializable",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
      "com.fasterxml.jackson.databind.JsonNode",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.facebook.presto.decoder.FieldValueProvider",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.facebook.presto.decoder.json.MillisecondsSinceEpochJsonFieldDecoder",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.RegularImmutableSet",
      "com.fasterxml.jackson.databind.node.ValueNode",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Iterators$10",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.decoder.DecoderColumnHandle",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.decoder.json.MillisecondsSinceEpochJsonFieldDecoder$MillisecondsSinceEpochJsonValueProvider",
      "io.airlift.slice.Slice",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.google.common.collect.ImmutableAsList",
      "com.fasterxml.jackson.core.JsonGenerator",
      "com.facebook.presto.spi.ErrorCode",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.decoder.json.AbstractDateTimeJsonValueProvider",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.google.common.collect.SingletonImmutableSet",
      "com.facebook.presto.spi.PrestoException",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.google.common.collect.Iterators",
      "com.fasterxml.jackson.core.JsonPointer",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.google.common.collect.ImmutableList",
      "com.facebook.presto.common.Subfield",
      "com.google.common.math.MathPreconditions",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.core.JsonToken",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.common.type.Type",
      "com.fasterxml.jackson.databind.node.JsonNodeType",
      "com.fasterxml.jackson.core.TreeNode",
      "com.facebook.presto.decoder.DecoderErrorCode",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.core.JsonParser",
      "com.google.common.collect.AbstractIterator",
      "com.facebook.presto.decoder.RowDecoder",
      "com.facebook.presto.decoder.json.JsonRowDecoderFactory",
      "com.facebook.presto.decoder.json.JsonFieldDecoder",
      "com.facebook.presto.common.type.TimeType",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.facebook.presto.spi.ColumnHandle",
      "com.google.common.base.Preconditions",
      "com.fasterxml.jackson.databind.node.MissingNode",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.common.block.Block"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.common.type.Type", false, MillisecondsSinceEpochJsonFieldDecoder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.decoder.DecoderColumnHandle", false, MillisecondsSinceEpochJsonFieldDecoder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.fasterxml.jackson.databind.JsonNode", false, MillisecondsSinceEpochJsonFieldDecoder_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MillisecondsSinceEpochJsonFieldDecoder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.TimeType",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.decoder.json.MillisecondsSinceEpochJsonFieldDecoder",
      "com.facebook.presto.decoder.FieldValueProvider",
      "com.facebook.presto.decoder.json.AbstractDateTimeJsonValueProvider",
      "com.facebook.presto.decoder.json.MillisecondsSinceEpochJsonFieldDecoder$MillisecondsSinceEpochJsonValueProvider",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.facebook.presto.decoder.json.JsonRowDecoderFactory",
      "com.fasterxml.jackson.databind.JsonSerializable$Base",
      "com.fasterxml.jackson.databind.JsonNode",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.decoder.DecoderErrorCode",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.DateType"
    );
  }
}
