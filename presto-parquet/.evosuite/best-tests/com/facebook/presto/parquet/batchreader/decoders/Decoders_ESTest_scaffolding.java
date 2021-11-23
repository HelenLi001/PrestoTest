/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 11:18:14 GMT 2021
 */

package com.facebook.presto.parquet.batchreader.decoders;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Decoders_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.parquet.batchreader.decoders.Decoders"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-parquet"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Decoders_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.parquet.RichColumnDescriptor",
      "com.facebook.presto.parquet.dictionary.LongDictionary",
      "org.apache.parquet.bytes.MultiBufferInputStream",
      "org.apache.parquet.ParquetRuntimeException",
      "org.apache.parquet.column.values.delta.DeltaBinaryPackingValuesReader",
      "org.apache.parquet.ShouldNeverHappenException",
      "com.facebook.presto.parquet.ParquetEncoding$6",
      "com.facebook.presto.parquet.dictionary.FloatDictionary",
      "com.facebook.presto.parquet.ParquetEncoding$5",
      "com.facebook.presto.parquet.ParquetEncoding$4",
      "com.facebook.presto.parquet.ParquetEncoding$3",
      "com.facebook.presto.parquet.ParquetEncoding$2",
      "com.facebook.presto.parquet.ParquetEncoding$1",
      "com.facebook.presto.parquet.batchreader.decoders.ValuesDecoder",
      "com.facebook.presto.parquet.ParquetEncoding$8",
      "org.apache.parquet.column.values.ValuesReader",
      "com.facebook.presto.parquet.ParquetEncoding$7",
      "org.apache.parquet.column.values.plain.BooleanPlainValuesReader",
      "org.apache.parquet.bytes.ByteBufferInputStream",
      "com.facebook.presto.hive.$internal.org.slf4j.impl.StaticLoggerBinder",
      "org.apache.parquet.column.values.plain.FixedLenByteArrayPlainValuesReader",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.facebook.presto.parquet.DataPage",
      "com.facebook.presto.parquet.DataPageV1",
      "org.apache.parquet.column.values.deltalengthbytearray.DeltaLengthByteArrayValuesReader",
      "com.facebook.presto.parquet.DataPageV2",
      "com.facebook.presto.parquet.batchreader.decoders.rle.BaseRLEBitPackedDecoder",
      "org.apache.parquet.column.values.plain.PlainValuesReader$IntegerPlainValuesReader",
      "com.facebook.presto.parquet.batchreader.decoders.RepetitionLevelDecoder",
      "org.apache.parquet.column.values.plain.PlainValuesReader$DoublePlainValuesReader",
      "org.apache.parquet.column.values.plain.PlainValuesReader",
      "com.facebook.presto.parquet.dictionary.DoubleDictionary",
      "com.facebook.presto.parquet.dictionary.IntegerDictionary",
      "org.apache.parquet.column.values.rle.RunLengthBitPackingHybridValuesReader",
      "org.apache.parquet.column.ColumnDescriptor",
      "com.facebook.presto.parquet.batchreader.decoders.DefinitionLevelDecoder",
      "com.facebook.presto.parquet.batchreader.decoders.rle.BaseRLEBitPackedDecoder$Mode",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.parquet.batchreader.decoders.FlatDefinitionLevelDecoder",
      "com.facebook.presto.parquet.DictionaryPage",
      "org.apache.parquet.column.values.deltastrings.DeltaByteArrayReader",
      "com.facebook.presto.parquet.ParquetEncoding",
      "io.airlift.slice.Slice",
      "com.facebook.presto.parquet.dictionary.DictionaryReader",
      "org.apache.parquet.io.ParquetDecodingException",
      "com.facebook.presto.hive.$internal.org.slf4j.LoggerFactory",
      "org.apache.parquet.bytes.BytesUtils",
      "com.facebook.presto.spi.PrestoException",
      "it.unimi.dsi.fastutil.ints.IntCollection",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NamedLoggerBase",
      "com.facebook.presto.hive.$internal.org.slf4j.event.LoggingEvent",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "it.unimi.dsi.fastutil.ints.IntIterable",
      "com.facebook.presto.parquet.dictionary.BinaryDictionary",
      "org.apache.parquet.column.values.rle.ZeroIntegerValuesReader",
      "com.facebook.presto.hive.$internal.org.slf4j.ILoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.event.SubstituteLoggingEvent",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NOPLogger",
      "org.apache.parquet.bytes.SingleBufferInputStream",
      "com.facebook.presto.parquet.batchreader.decoders.Decoders$FlatDecoders",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "org.apache.parquet.column.values.plain.PlainValuesReader$LongPlainValuesReader",
      "com.facebook.presto.hive.$internal.org.slf4j.spi.LoggerFactoryBinder",
      "com.facebook.presto.parquet.batchreader.decoders.Decoders$NestedDecoders",
      "org.apache.parquet.column.values.RequiresPreviousReader",
      "com.facebook.presto.parquet.dictionary.Dictionary",
      "com.facebook.presto.parquet.Page",
      "org.apache.parquet.column.values.bitpacking.ByteBitPackingValuesReader",
      "com.facebook.presto.parquet.batchreader.decoders.Decoders",
      "it.unimi.dsi.fastutil.ints.IntList",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.Util",
      "org.apache.parquet.column.values.plain.PlainValuesReader$FloatPlainValuesReader",
      "com.facebook.presto.parquet.ValuesType",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.hive.$internal.org.slf4j.Logger",
      "org.apache.parquet.column.values.plain.BinaryPlainValuesReader"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Decoders_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.parquet.batchreader.decoders.Decoders",
      "com.facebook.presto.parquet.batchreader.decoders.Decoders$FlatDecoders",
      "com.facebook.presto.parquet.batchreader.decoders.Decoders$NestedDecoders",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.Util",
      "com.facebook.presto.hive.$internal.org.slf4j.LoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.presto.parquet.ParquetEncoding",
      "org.apache.parquet.schema.PrimitiveType$PrimitiveTypeName",
      "com.facebook.presto.parquet.batchreader.decoders.Decoders$1",
      "org.apache.parquet.schema.OriginalType",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.parquet.ParquetErrorCode",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NamedLoggerBase",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NOPLogger",
      "org.apache.parquet.bytes.BytesUtils",
      "com.google.common.base.Preconditions",
      "org.apache.parquet.bytes.ByteBufferInputStream",
      "org.apache.parquet.bytes.SingleBufferInputStream",
      "com.facebook.presto.parquet.batchreader.decoders.rle.BaseRLEBitPackedDecoder",
      "com.facebook.presto.parquet.batchreader.decoders.DefinitionLevelDecoder",
      "com.facebook.presto.parquet.batchreader.decoders.rle.BaseRLEBitPackedDecoder$Mode",
      "com.facebook.presto.parquet.batchreader.decoders.RepetitionLevelDecoder"
    );
  }
}
