/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 21:02:52 GMT 2021
 */

package com.facebook.presto.hive.metastore;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MetastoreUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.hive.metastore.MetastoreUtil"; 
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

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MetastoreUtil_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.hadoop.$internal.org.slf4j.LoggerFactory",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.Util",
      "org.apache.hadoop.fs.FileSystem",
      "com.google.common.collect.ImmutableCollection",
      "org.apache.hadoop.io.Writable",
      "org.apache.hadoop.fs.permission.FsPermission$ImmutableFsPermission",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerAdapter",
      "org.apache.hadoop.fs.permission.FsPermission",
      "com.google.common.math.IntMath",
      "com.facebook.presto.hadoop.$internal.org.slf4j.Logger",
      "org.apache.hadoop.conf.Configured",
      "org.apache.hadoop.io.WritableFactories",
      "org.apache.hadoop.conf.Configurable",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLogFactory",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet",
      "com.facebook.presto.hive.filesystem.ExtendedFileSystem",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LoggerFactoryBinder",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.LogFactory",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.presto.hive.PartitionOfflineException",
      "com.facebook.presto.hive.TableOfflineException",
      "com.google.common.collect.ImmutableAsList",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LocationAwareLogger",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NamedLoggerBase",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.hadoop.$internal.org.slf4j.ILoggerFactory",
      "org.apache.hadoop.fs.permission.FsAction",
      "com.facebook.presto.hive.metastore.MetastoreUtil",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.Log",
      "com.google.common.collect.ImmutableList",
      "com.google.common.math.MathPreconditions",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "org.apache.hadoop.io.WritableFactory",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLog",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "org.apache.hadoop.fs.permission.FsPermission$1",
      "com.google.common.base.Preconditions"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MetastoreUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
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
      "org.apache.hadoop.fs.permission.FsPermission$1",
      "org.apache.hadoop.io.WritableFactories",
      "org.apache.hadoop.fs.permission.FsAction",
      "org.apache.hadoop.fs.permission.FsPermission",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.hive.metastore.MetastoreUtil",
      "org.apache.hadoop.hive.metastore.utils.StringUtils",
      "org.apache.hadoop.hive.metastore.ColumnType",
      "org.apache.hadoop.hive.metastore.ProtectMode",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.Util",
      "com.facebook.presto.hive.$internal.org.slf4j.LoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NamedLoggerBase",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NOPLogger",
      "org.apache.hadoop.hive.common.FileUtils$1",
      "org.apache.hadoop.hive.common.FileUtils$2",
      "org.apache.hadoop.hive.common.FileUtils",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.facebook.presto.hive.HiveErrorCode",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.IntegerType",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.common.type.TinyintType",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.common.type.DoubleType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.common.type.DateType",
      "org.joda.time.DateTimeZone",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.Chronology",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.format.FormatUtils",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.common.type.Decimals",
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
      "io.airlift.slice.Slice",
      "io.airlift.slice.Slices",
      "com.facebook.presto.common.type.UnscaledDecimal128Arithmetic",
      "com.google.common.io.BaseEncoding$StandardBaseEncoding",
      "com.google.common.io.BaseEncoding$Base64Encoding",
      "com.google.common.io.BaseEncoding$Alphabet",
      "com.google.common.io.BaseEncoding$Base16Encoding",
      "com.google.common.io.BaseEncoding",
      "io.airlift.slice.SliceUtf8",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.format.InternalParserDateTimeParser",
      "org.joda.time.format.DateTimeParserInternalParser",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.format.DateTimePrinterInternalPrinter",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "com.facebook.presto.spi.statistics.ColumnStatisticType",
      "com.google.common.primitives.Longs$AsciiDigits",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "org.checkerframework.framework.qual.TypeUseLocation"
    );
  }
}
