/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 21:48:23 GMT 2021
 */

package com.facebook.presto.hive;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class HdfsEnvironment_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.hive.HdfsEnvironment"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HdfsEnvironment_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "org.apache.hadoop.fs.FileSystem",
      "org.apache.hadoop.fs.PrestoFilterFileSystemWrapper",
      "org.apache.hadoop.fs.BlockLocation",
      "org.apache.hadoop.io.Writable",
      "org.apache.hadoop.fs.HadoopExtendedFileSystemCache",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerAdapter",
      "org.apache.hadoop.fs.FileStatus",
      "org.apache.hadoop.fs.CanUnbuffer",
      "com.facebook.presto.hadoop.$internal.org.slf4j.Logger",
      "com.facebook.presto.hive.metastore.ExtendedHiveMetastore",
      "org.apache.hadoop.conf.Configuration",
      "org.apache.hadoop.security.Credentials",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLogFactory",
      "com.facebook.airlift.configuration.ConfigDescription",
      "org.apache.hadoop.classification.InterfaceStability$Stable",
      "org.apache.hadoop.fs.FSDataInputStream",
      "org.apache.hadoop.fs.FileSystem$Statistics",
      "org.apache.hadoop.fs.FileChecksum",
      "com.facebook.presto.hive.filesystem.ExtendedFileSystem",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.hive.HiveFileContext",
      "com.facebook.presto.spi.ConnectorSession",
      "com.facebook.drift.annotations.ThriftIdlAnnotation",
      "org.apache.hadoop.fs.ByteBufferReadable",
      "io.airlift.units.MinDurationValidator",
      "org.apache.hadoop.fs.FsStatus",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "org.apache.hadoop.fs.CanSetReadahead",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.LogFactory",
      "org.apache.hadoop.fs.ChecksumFileSystem",
      "com.facebook.drift.annotations.ThriftField",
      "org.apache.hadoop.fs.RemoteIterator",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.airlift.configuration.Config",
      "org.apache.hadoop.fs.HadoopExtendedFileSystem",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LocationAwareLogger",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NamedLoggerBase",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "org.apache.hadoop.fs.PrestoExtendedFileSystemCache",
      "org.apache.hadoop.fs.permission.FsAction",
      "org.apache.hadoop.fs.ContentSummary",
      "org.apache.hadoop.fs.FSDataOutputStream",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "org.apache.hadoop.fs.FilterFileSystem",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.Log",
      "org.apache.hadoop.fs.Syncable",
      "org.apache.hadoop.security.UserGroupInformation",
      "org.apache.hadoop.fs.CanSetDropBehind",
      "org.apache.hadoop.fs.XAttrSetFlag",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "com.facebook.presto.hive.metastore.CachingHiveMetastore$MetastoreCacheScope",
      "org.apache.hadoop.fs.FileAlreadyExistsException",
      "org.apache.hadoop.fs.FileSystem$Cache$Key",
      "com.facebook.presto.hive.metastore.CachingHiveMetastore$KeyAndContext",
      "org.apache.hadoop.conf.Configuration$IntegerRanges",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLog",
      "org.apache.hadoop.fs.HasEnhancedByteBufferAccess",
      "com.google.common.net.HostAndPort",
      "org.apache.hadoop.security.token.Token",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "org.apache.hadoop.classification.InterfaceAudience$LimitedPrivate",
      "org.apache.hadoop.fs.UnsupportedFileSystemException",
      "com.facebook.presto.hadoop.$internal.org.slf4j.LoggerFactory",
      "com.facebook.presto.hive.HdfsEnvironment",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.Util",
      "org.apache.hadoop.util.Progressable",
      "org.apache.hadoop.fs.permission.FsPermission",
      "com.facebook.presto.spi.security.SelectedRole$Type",
      "io.airlift.units.Duration",
      "com.google.inject.BindingAnnotation",
      "org.apache.hadoop.fs.Seekable",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "org.apache.hadoop.fs.FileSystem$3",
      "com.facebook.presto.hive.authentication.HdfsAuthentication",
      "org.apache.hadoop.conf.Configured",
      "org.apache.hadoop.fs.Options$ChecksumOpt",
      "org.apache.hadoop.fs.Path",
      "com.facebook.presto.hive.authentication.GenericExceptionAction",
      "org.apache.hadoop.conf.Configurable",
      "org.apache.hadoop.classification.InterfaceAudience$Public",
      "com.facebook.presto.hive.HdfsContext",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LoggerFactoryBinder",
      "org.apache.hadoop.fs.permission.AccessControlException",
      "org.apache.hadoop.fs.FsServerDefaults",
      "io.airlift.units.Preconditions",
      "com.google.common.util.concurrent.ListenableFuture",
      "org.apache.hadoop.fs.HasFileDescriptor",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerFactory",
      "org.apache.hadoop.fs.PathFilter",
      "com.facebook.presto.hadoop.$internal.org.slf4j.ILoggerFactory",
      "io.airlift.units.MinDuration",
      "com.facebook.presto.hive.HdfsConfiguration",
      "org.apache.hadoop.fs.PrestoFileSystemCache",
      "org.apache.hadoop.fs.FileSystem$Cache$ClientFinalizer",
      "org.apache.hadoop.fs.ParentNotDirectoryException",
      "org.apache.hadoop.fs.PositionedReadable",
      "org.apache.hadoop.HadoopIllegalArgumentException",
      "com.facebook.presto.hadoop.$internal.org.apache.avro.reflect.Stringable",
      "org.apache.hadoop.fs.permission.AclStatus",
      "org.apache.hadoop.fs.CreateFlag",
      "com.facebook.presto.hive.MetastoreClientConfig",
      "com.facebook.presto.spi.security.SelectedRole",
      "com.facebook.presto.hive.metastore.CachingHiveMetastore",
      "com.facebook.presto.hadoop.HadoopNative",
      "com.facebook.drift.annotations.ThriftStruct",
      "com.facebook.drift.annotations.ThriftConstructor",
      "com.facebook.presto.spi.security.ConnectorIdentity",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "org.apache.hadoop.security.AccessControlException",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "org.apache.hadoop.fs.LocalFileSystem",
      "org.apache.hadoop.fs.FileSystem$Cache"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.hive.HdfsConfiguration", false, HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.HdfsContext", false, HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.MetastoreClientConfig", false, HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.authentication.GenericExceptionAction", false, HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.authentication.HdfsAuthentication", false, HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.security.SelectedRole", false, HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.lang.Runnable", false, HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.hadoop.fs.Path", false, HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HdfsEnvironment_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.hadoop.fs.HadoopExtendedFileSystemCache",
      "org.apache.hadoop.fs.FileSystem$Cache",
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
      "org.apache.hadoop.fs.PrestoFileSystemCache",
      "org.apache.hadoop.fs.PrestoExtendedFileSystemCache",
      "org.apache.hadoop.fs.FileSystem$Cache$ClientFinalizer",
      "org.apache.hadoop.conf.Configured",
      "org.apache.hadoop.fs.FileSystem$3",
      "org.apache.hadoop.fs.FileSystem",
      "com.facebook.presto.hive.HdfsEnvironment",
      "com.facebook.presto.hadoop.HadoopNative",
      "org.apache.hadoop.io.compress.CompressionCodecFactory",
      "com.facebook.presto.hive.MetastoreClientConfig",
      "com.facebook.presto.hive.HdfsContext",
      "org.apache.hadoop.fs.Path",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "io.airlift.units.Duration",
      "io.airlift.units.Preconditions",
      "com.facebook.presto.hive.metastore.CachingHiveMetastore$MetastoreCacheScope",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.Util",
      "com.facebook.presto.hive.$internal.org.slf4j.LoggerFactory",
      "com.facebook.presto.hive.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NamedLoggerBase",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "com.facebook.presto.hive.$internal.org.slf4j.helpers.NOPLogger",
      "org.apache.hadoop.hive.metastore.security.MemoryTokenStore",
      "org.apache.hadoop.io.AbstractMapWritable",
      "org.apache.hadoop.io.MapWritable",
      "io.airlift.units.Duration$1",
      "com.facebook.presto.spi.security.SelectedRole",
      "com.facebook.presto.spi.security.ConnectorIdentity",
      "com.facebook.presto.server.BasicQueryStats",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.Chronology",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.DurationField",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.tz.ZoneInfoProvider$1",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "io.airlift.units.DataSize$Unit",
      "io.airlift.units.DataSize",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.base.Preconditions",
      "org.apache.hadoop.fs.FilterFileSystem",
      "org.apache.hadoop.fs.ChecksumFileSystem$9",
      "org.apache.hadoop.fs.ChecksumFileSystem",
      "org.apache.hadoop.fs.LocalFileSystem",
      "org.apache.hadoop.fs.RawLocalFileSystem",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.lang.StringUtils",
      "com.facebook.presto.hive.filesystem.ExtendedFileSystem",
      "org.apache.hadoop.fs.HadoopExtendedFileSystem",
      "com.facebook.airlift.http.server.HttpServerConfig",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.airlift.http.server.HttpServerConfig$AuthorizationPolicy",
      "com.facebook.airlift.node.NodeInfo",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Preconditions",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.AbstractMapDecorator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.UnmodifiableMap",
      "org.apache.hadoop.conf.Configuration",
      "org.apache.hadoop.mapreduce.util.ConfigUtil",
      "org.apache.hadoop.mapreduce.OutputFormat",
      "org.apache.hadoop.mapreduce.lib.output.FileOutputFormat",
      "org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat",
      "org.apache.hadoop.mapreduce.lib.output.SequenceFileAsBinaryOutputFormat",
      "org.apache.hadoop.io.WritableComparator",
      "org.apache.hadoop.mapreduce.lib.partition.KeyFieldBasedComparator",
      "org.apache.hadoop.mapreduce.Partitioner",
      "org.apache.hadoop.mapreduce.lib.partition.KeyFieldBasedPartitioner",
      "org.apache.hadoop.mapreduce.Mapper",
      "org.apache.hadoop.mapreduce.lib.map.RegexMapper",
      "org.apache.hadoop.mapreduce.lib.output.FilterOutputFormat",
      "org.apache.hadoop.mapreduce.lib.output.LazyOutputFormat",
      "org.apache.hadoop.mapreduce.lib.output.TextOutputFormat",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.collection.AbstractCollectionDecorator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.set.AbstractSetDecorator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.UnmodifiableEntrySet",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.iterators.AbstractIteratorDecorator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.UnmodifiableEntrySet$UnmodifiableEntrySetIterator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.keyvalue.AbstractMapEntryDecorator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.UnmodifiableEntrySet$UnmodifiableEntry",
      "com.facebook.presto.hadoop.$internal.org.apache.log4j.Priority",
      "com.facebook.presto.hadoop.$internal.org.apache.log4j.Level",
      "org.apache.hadoop.mapred.JobConf",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.io.Charsets",
      "org.apache.hadoop.security.Credentials",
      "org.apache.hadoop.conf.Configuration$Resource",
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
      "com.facebook.presto.hadoop.$internal.com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry",
      "org.apache.hadoop.mapreduce.ID",
      "org.apache.hadoop.mapred.ID",
      "org.apache.hadoop.mapreduce.TaskAttemptID",
      "org.apache.hadoop.mapred.TaskAttemptID"
    );
  }
}
