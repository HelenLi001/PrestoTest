/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 01:16:52 GMT 2021
 */

package com.facebook.presto.accumulo.serializers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class StringRowSerializer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.accumulo.serializers.StringRowSerializer"; 
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
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StringRowSerializer_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "org.apache.accumulo.core.data.ByteSequence",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "org.apache.hadoop.fs.FileSystem",
      "org.apache.hadoop.io.Text",
      "org.apache.hadoop.io.Writable",
      "com.facebook.presto.common.type.VariableWidthType",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerAdapter",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.common.type.TypeSignature",
      "org.apache.accumulo.core.client.TableNotFoundException",
      "org.apache.hadoop.io.BytesWritable$Comparator",
      "com.facebook.presto.common.type.JsonType",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.AbstractMapDecorator",
      "com.facebook.presto.hadoop.$internal.org.slf4j.Logger",
      "org.apache.hadoop.conf.Configuration",
      "com.facebook.presto.spi.ConnectorPageSink",
      "org.apache.thrift.TBase",
      "org.apache.accumulo.core.data.thrift.TKey",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLogFactory",
      "org.apache.hadoop.classification.InterfaceStability$Stable",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "org.apache.accumulo.core.client.MutationsRejectedException",
      "com.facebook.presto.common.type.TypeUtils",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.MapIterator",
      "org.apache.accumulo.core.security.ColumnVisibility$NodeType",
      "com.facebook.presto.common.type.HyperLogLogType",
      "org.apache.hadoop.fs.DelegationTokenRenewer$Renewable",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.map.UnmodifiableMap",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.LogFactory",
      "com.facebook.presto.common.type.AbstractLongType",
      "org.apache.hadoop.fs.ChecksumFileSystem",
      "com.facebook.presto.common.GenericInternalException",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.StaticLoggerBinder",
      "com.facebook.presto.common.type.P4HyperLogLogType",
      "io.airlift.slice.Slice",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LocationAwareLogger",
      "com.facebook.presto.spi.ErrorCode",
      "org.apache.hadoop.io.WritableComparable",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NamedLoggerBase",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "org.apache.hadoop.io.WritableComparator",
      "com.facebook.presto.hadoop.$internal.com.google.common.base.Preconditions",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.MarkerIgnoringBase",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "org.apache.hadoop.fs.FilterFileSystem",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.Log",
      "org.apache.accumulo.core.data.Key",
      "com.facebook.presto.common.type.ArrayType",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.SubstituteLoggerFactory",
      "com.facebook.presto.common.type.EnumType",
      "org.apache.hadoop.io.Text$2",
      "com.facebook.presto.accumulo.io.AccumuloPageSink",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLog",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.NOPLoggerFactory",
      "com.facebook.presto.common.type.FixedWidthType",
      "org.apache.accumulo.core.security.ColumnVisibility",
      "org.apache.hadoop.io.Text$1",
      "org.apache.accumulo.core.data.PartialKey",
      "com.facebook.presto.common.type.RowType",
      "com.facebook.presto.common.type.DoubleType",
      "com.facebook.presto.hadoop.$internal.org.slf4j.LoggerFactory",
      "com.facebook.presto.hadoop.$internal.org.slf4j.helpers.Util",
      "com.facebook.presto.common.NotSupportedException",
      "org.apache.accumulo.core.data.Value$Comparator",
      "org.apache.accumulo.core.data.ArrayByteSequence",
      "org.apache.hadoop.hdfs.web.HsftpFileSystem",
      "org.apache.hadoop.io.Text$Comparator",
      "org.apache.hadoop.conf.Configured",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.VarcharEnumType$VarcharEnumMap",
      "org.apache.hadoop.hdfs.web.HftpFileSystem",
      "org.apache.accumulo.core.data.Value",
      "org.apache.hadoop.conf.Configurable",
      "org.apache.hadoop.classification.InterfaceAudience$Public",
      "org.apache.hadoop.conf.Configuration$NegativeCacheSentinel",
      "com.facebook.presto.common.type.VarcharEnumType",
      "org.apache.accumulo.core.security.ColumnVisibility$Node",
      "com.facebook.presto.common.type.RowType$Field",
      "com.facebook.presto.common.type.TinyintType",
      "com.facebook.presto.common.type.BigintType",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.hadoop.$internal.org.slf4j.spi.LoggerFactoryBinder",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.IterableMap",
      "com.facebook.presto.accumulo.serializers.AccumuloRowSerializer",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.hadoop.$internal.org.slf4j.impl.JDK14LoggerFactory",
      "org.apache.hadoop.io.BinaryComparable",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.hadoop.$internal.org.slf4j.ILoggerFactory",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.accumulo.serializers.StringRowSerializer",
      "com.facebook.presto.common.type.IntegerType",
      "org.apache.hadoop.hdfs.web.TokenAspect$TokenManagementDelegator",
      "org.apache.accumulo.core.client.AccumuloSecurityException",
      "com.facebook.presto.common.type.ParameterKind",
      "org.apache.hadoop.io.BytesWritable",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.hadoop.$internal.org.apache.avro.reflect.Stringable",
      "com.facebook.presto.accumulo.Types",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.common.type.NamedTypeSignature",
      "org.apache.accumulo.core.security.ColumnVisibility$NodeComparator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.collections.Unmodifiable",
      "org.apache.accumulo.core.client.AccumuloException",
      "com.facebook.presto.common.type.TimeType",
      "org.apache.hadoop.io.RawComparator",
      "com.facebook.presto.hadoop.$internal.org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "com.facebook.presto.common.type.RowFieldName",
      "com.facebook.presto.common.block.Block",
      "com.facebook.presto.common.type.DateType",
      "org.apache.hadoop.fs.LocalFileSystem"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StringRowSerializer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.accumulo.serializers.StringRowSerializer",
      "com.facebook.presto.spi.ConnectorPageSink",
      "org.apache.hadoop.io.BinaryComparable",
      "org.apache.hadoop.io.Text$1",
      "org.apache.hadoop.io.Text$2",
      "org.apache.hadoop.io.WritableComparator",
      "org.apache.hadoop.io.Text$Comparator",
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
      "org.apache.hadoop.io.Text",
      "com.facebook.presto.accumulo.io.AccumuloPageSink",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.DateType",
      "com.facebook.presto.common.type.DoubleType",
      "com.facebook.presto.common.type.IntegerType",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.common.type.TimeType",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.common.type.TinyintType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.VarcharType",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "com.facebook.presto.common.type.UnknownType",
      "org.apache.accumulo.core.data.Value$Comparator",
      "org.apache.hadoop.io.BytesWritable$Comparator",
      "org.apache.accumulo.core.data.Value",
      "com.facebook.presto.accumulo.Types",
      "com.facebook.presto.spi.PrestoException",
      "org.apache.hadoop.io.WritableUtils",
      "com.facebook.presto.common.type.RowType",
      "com.facebook.presto.common.type.BigintEnumType$LongEnumMap",
      "com.facebook.presto.common.QualifiedObjectName",
      "com.facebook.presto.common.type.JsonType",
      "com.facebook.presto.common.type.KdbTreeType",
      "com.facebook.presto.common.type.FunctionType",
      "com.facebook.presto.common.type.ArrayType",
      "com.facebook.presto.common.type.RowType$Field",
      "com.facebook.presto.common.type.NamedTypeSignature",
      "com.facebook.presto.common.type.VarcharEnumType$VarcharEnumMap",
      "com.facebook.presto.common.type.TypeUtils",
      "com.facebook.presto.common.type.VarcharEnumType",
      "com.facebook.presto.common.type.DecimalType",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
      "com.facebook.presto.common.type.HyperLogLogType",
      "com.facebook.presto.common.type.P4HyperLogLogType",
      "org.apache.hadoop.io.FastByteComparisons",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder$UnsafeComparer$1",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder$UnsafeComparer",
      "org.apache.hadoop.io.FastByteComparisons$LexicographicalComparerHolder",
      "org.apache.accumulo.core.client.lexicoder.AbstractEncoder",
      "org.apache.accumulo.core.client.lexicoder.impl.AbstractLexicoder",
      "org.apache.accumulo.core.client.lexicoder.ULongLexicoder",
      "org.apache.accumulo.core.client.lexicoder.LongLexicoder",
      "org.apache.accumulo.core.client.lexicoder.DoubleLexicoder",
      "com.facebook.presto.accumulo.serializers.BooleanLexicoder",
      "org.apache.accumulo.core.client.lexicoder.BytesLexicoder",
      "org.apache.accumulo.core.client.lexicoder.StringLexicoder",
      "com.facebook.presto.accumulo.serializers.LexicoderRowSerializer",
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
      "com.facebook.presto.common.block.LongArrayBlockBuilder",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread$1",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.fabric.jdbc.FabricMySQLDriver",
      "org.h2.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.common.type.BigintEnumType",
      "com.facebook.presto.common.block.ShortArrayBlock",
      "io.airlift.slice.SliceOutput",
      "io.airlift.slice.DynamicSliceOutput",
      "io.airlift.slice.Slice",
      "io.airlift.slice.Slices",
      "com.facebook.presto.common.block.Int128ArrayBlock",
      "com.facebook.presto.common.type.ShortDecimalType",
      "io.airlift.slice.SliceInput",
      "io.airlift.slice.FixedLengthSliceInput",
      "io.airlift.slice.BasicSliceInput",
      "io.airlift.slice.InputStreamSliceInput",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "org.apache.accumulo.core.data.Key",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.common.type.TypeWithName",
      "com.facebook.presto.common.type.UserDefinedType",
      "com.facebook.presto.common.block.IntArrayBlockBuilder",
      "com.facebook.presto.common.type.RowFieldName",
      "com.facebook.presto.common.block.DictionaryId",
      "com.facebook.presto.common.block.DictionaryBlock",
      "com.facebook.presto.metadata.FunctionAndTypeManager",
      "com.facebook.presto.spi.transaction.IsolationLevel",
      "com.facebook.presto.transaction.TransactionManager",
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.transaction.InMemoryTransactionManager",
      "com.facebook.presto.metadata.CatalogManager",
      "io.airlift.units.Duration",
      "io.airlift.units.Preconditions",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.MoreExecutors$DirectExecutor",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.facebook.presto.common.block.BlockEncodingManager",
      "com.facebook.presto.common.block.VariableWidthBlockEncoding",
      "com.facebook.presto.common.block.ByteArrayBlockEncoding",
      "com.facebook.presto.common.block.ShortArrayBlockEncoding",
      "com.facebook.presto.common.block.IntArrayBlockEncoding",
      "com.facebook.presto.common.block.LongArrayBlockEncoding",
      "com.facebook.presto.common.block.Int128ArrayBlockEncoding",
      "com.facebook.presto.common.block.DictionaryBlockEncoding",
      "com.facebook.presto.common.block.ArrayBlockEncoding",
      "com.facebook.presto.common.block.MapBlockEncoding",
      "com.facebook.presto.common.block.SingleMapBlockEncoding",
      "com.facebook.presto.common.block.RowBlockEncoding",
      "com.facebook.presto.common.block.SingleRowBlockEncoding",
      "com.facebook.presto.common.block.RunLengthBlockEncoding",
      "com.facebook.presto.common.block.LazyBlockEncoding",
      "com.facebook.presto.sql.analyzer.FeaturesConfig",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$JoinDistributionType",
      "io.airlift.units.DataSize$Unit",
      "io.airlift.units.DataSize",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$TaskSpillingStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$SingleStreamSpillerChoice",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$JoinReorderingStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$PartialMergePushdownStrategy",
      "com.facebook.presto.sql.analyzer.RegexLibrary",
      "com.facebook.presto.operator.aggregation.histogram.HistogramGroupImplementation",
      "com.facebook.presto.operator.aggregation.arrayagg.ArrayAggGroupImplementation",
      "com.facebook.presto.operator.aggregation.multimapagg.MultimapAggGroupImplementation",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$PartialAggregationStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$AggregationPartitioningMergingStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$PartitioningPrecisionStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$AggregationIfToFilterRewriteStrategy",
      "com.facebook.presto.metadata.HandleResolver",
      "com.google.common.util.concurrent.GwtFuturesCatchingSpecialization",
      "com.google.common.util.concurrent.Futures",
      "com.google.common.util.concurrent.GwtFluentFutureCatchingSpecialization",
      "com.google.common.util.concurrent.FluentFuture",
      "com.google.common.util.concurrent.ImmediateFuture",
      "com.google.common.util.concurrent.ImmediateFuture$ImmediateSuccessfulFuture",
      "com.facebook.presto.operator.Operator",
      "com.facebook.presto.spi.ConnectorId",
      "com.facebook.presto.operator.ExchangeOperator",
      "com.facebook.presto.metadata.HandleResolver$MaterializedHandleResolver",
      "com.facebook.presto.metadata.RemoteHandleResolver",
      "com.facebook.presto.connector.system.SystemHandleResolver",
      "com.facebook.presto.connector.informationSchema.InformationSchemaHandleResolver",
      "com.facebook.presto.split.EmptySplitHandleResolver",
      "com.facebook.presto.metadata.HandleResolver$MaterializedFunctionHandleResolver",
      "com.facebook.presto.metadata.BuiltInFunctionNamespaceHandleResolver",
      "com.facebook.presto.metadata.SessionFunctionHandleResolver",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.common.CatalogSchemaName",
      "com.facebook.presto.metadata.BuiltInTypeAndFunctionNamespaceManager",
      "com.facebook.presto.metadata.BuiltInTypeAndFunctionNamespaceManager$FunctionMap",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.facebook.presto.metadata.BuiltInFunction",
      "com.facebook.presto.metadata.SqlScalarFunction",
      "com.facebook.presto.metadata.BuiltInTypeAndFunctionNamespaceManager$MagicLiteralFunction",
      "com.facebook.presto.spi.function.Signature",
      "com.facebook.presto.spi.function.FunctionKind",
      "com.google.common.cache.CacheBuilder$1",
      "com.google.common.base.Suppliers",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.cache.CacheStats",
      "com.google.common.cache.CacheBuilder$2",
      "com.google.common.base.Ticker$1",
      "com.google.common.base.Ticker",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.cache.CacheLoader",
      "com.google.common.cache.CacheLoader$FunctionToCacheLoader",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache$LocalLoadingCache",
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
      "com.google.common.cache.LocalCache$AccessQueue",
      "com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.google.common.cache.LocalCache$AccessQueue$1",
      "com.google.common.cache.LocalCache$WriteQueue",
      "com.google.common.cache.LocalCache$WriteQueue$1",
      "com.facebook.presto.metadata.FunctionListBuilder",
      "com.facebook.presto.operator.window.WindowAnnotationsParser",
      "com.google.common.collect.CollectCollectors",
      "com.facebook.presto.operator.window.SqlWindowFunction",
      "com.facebook.presto.operator.window.AbstractWindowFunctionSupplier",
      "com.facebook.presto.operator.window.ReflectionWindowFunctionSupplier",
      "com.google.common.collect.SingletonImmutableList",
      "com.facebook.presto.spi.function.TypeVariableConstraint",
      "com.facebook.presto.metadata.SqlAggregationFunction",
      "com.facebook.presto.operator.aggregation.AggregationFromAnnotationsParser",
      "com.facebook.presto.operator.ParametricImplementationsGroup",
      "com.facebook.presto.operator.ParametricImplementationsGroup$Builder",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.facebook.presto.spi.function.SqlFunctionVisibility",
      "com.facebook.presto.operator.aggregation.AggregationHeader",
      "com.facebook.presto.common.function.OperatorType",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.facebook.presto.operator.annotations.FunctionsParserHelper",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.Iterators$9",
      "com.facebook.presto.operator.aggregation.AggregationImplementation$Parser",
      "com.facebook.presto.spi.function.InvocationConvention$InvocationReturnConvention",
      "com.google.common.collect.Iterables",
      "com.facebook.presto.operator.aggregation.AggregationMetadata$ParameterMetadata$ParameterType",
      "com.facebook.presto.operator.aggregation.AggregationImplementation$AggregateNativeContainerType",
      "com.facebook.presto.util.Reflection",
      "com.facebook.presto.operator.aggregation.AggregationImplementation",
      "com.google.common.collect.CollectPreconditions",
      "com.facebook.presto.operator.annotations.ImplementationDependency$Factory",
      "com.facebook.presto.operator.annotations.ScalarImplementationDependency",
      "com.facebook.presto.operator.annotations.OperatorImplementationDependency",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.facebook.presto.operator.aggregation.ParametricAggregation",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.facebook.presto.operator.aggregation.RealAverageAggregation",
      "com.facebook.presto.operator.aggregation.StatisticalDigestAggregationFunction",
      "com.facebook.presto.operator.aggregation.state.StatisticalDigestStateFactory",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.presto.operator.aggregation.QuantileDigestAggregationFunction",
      "com.facebook.presto.operator.aggregation.MergeStatisticalDigestFunction",
      "com.facebook.presto.operator.aggregation.MergeQuantileDigestFunction",
      "com.facebook.presto.operator.scalar.annotations.ScalarFromAnnotationsParser",
      "com.facebook.presto.operator.scalar.annotations.ScalarImplementationHeader",
      "com.facebook.presto.operator.scalar.ScalarHeader",
      "com.facebook.presto.util.Failures",
      "com.facebook.presto.operator.scalar.annotations.ScalarFromAnnotationsParser$ScalarHeaderAndMethods",
      "com.facebook.presto.operator.scalar.annotations.ParametricScalarImplementation$Parser",
      "com.google.common.primitives.Primitives",
      "com.facebook.presto.operator.annotations.TypeImplementationDependency",
      "com.facebook.presto.operator.scalar.BuiltInScalarFunctionImplementation$NullConvention",
      "com.facebook.presto.operator.scalar.BuiltInScalarFunctionImplementation$ArgumentProperty",
      "com.facebook.presto.operator.scalar.BuiltInScalarFunctionImplementation$ArgumentType",
      "com.facebook.presto.operator.scalar.BuiltInScalarFunctionImplementation$1",
      "com.facebook.presto.operator.scalar.annotations.ParametricScalarImplementation$ParametricScalarImplementationChoice",
      "com.facebook.presto.operator.scalar.BuiltInScalarFunctionImplementation$ReturnPlaceConvention",
      "com.facebook.presto.operator.scalar.annotations.ParametricScalarImplementation",
      "com.facebook.presto.operator.scalar.annotations.ParametricScalarImplementation$SpecializedSignature",
      "com.google.common.collect.Maps",
      "com.google.common.collect.Sets",
      "com.facebook.presto.operator.scalar.annotations.ParametricScalarImplementation$Builder",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.operator.scalar.ParametricScalar",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CaseFormat",
      "com.google.common.base.Ascii",
      "com.facebook.presto.operator.annotations.LiteralImplementationDependency",
      "com.facebook.presto.operator.scalar.annotations.OperatorValidator",
      "com.facebook.presto.operator.scalar.annotations.OperatorValidator$1",
      "com.google.common.base.Joiner",
      "com.facebook.presto.spi.function.LongVariableConstraint",
      "com.google.common.base.Strings",
      "com.facebook.presto.common.type.StatisticalDigestParametricType",
      "com.facebook.presto.common.type.QuantileDigestParametricType",
      "com.facebook.presto.common.type.BigintEnumParametricType",
      "com.fasterxml.jackson.core.util.ByteArrayBuilder",
      "com.facebook.presto.transaction.DelegatingTransactionManager",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.apache.accumulo.core.security.ColumnVisibility$Node",
      "org.apache.accumulo.core.security.ColumnVisibility$NodeType",
      "org.apache.accumulo.core.security.ColumnVisibility",
      "com.facebook.presto.common.type.TDigestParametricType",
      "com.facebook.presto.common.type.StatisticalDigestType",
      "com.facebook.presto.common.type.TDigestType",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "org.glassfish.jersey.server.internal.AbstractResourceFinderAdapter",
      "org.glassfish.jersey.server.internal.scanning.CompositeResourceFinder",
      "com.facebook.presto.common.PageBuilder",
      "com.facebook.presto.common.block.PageBuilderStatus",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.annotation.Nulls",
      "com.fasterxml.jackson.annotation.JsonSetter$Value",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.facebook.presto.common.type.MapType",
      "org.weakref.jmx.testing.TestingMBeanServer",
      "com.facebook.presto.common.type.VarcharEnumParametricType",
      "it.unimi.dsi.fastutil.objects.AbstractReference2ReferenceFunction",
      "it.unimi.dsi.fastutil.objects.AbstractReference2ReferenceMap",
      "it.unimi.dsi.fastutil.objects.AbstractReference2ReferenceSortedMap",
      "it.unimi.dsi.fastutil.objects.Reference2ReferenceLinkedOpenHashMap",
      "org.apache.accumulo.core.security.Authorizations",
      "org.apache.accumulo.core.security.VisibilityEvaluator",
      "org.apache.thrift.protocol.TStruct",
      "org.apache.thrift.protocol.TField",
      "org.apache.accumulo.core.data.thrift.TKey$TKeyStandardSchemeFactory",
      "org.apache.accumulo.core.data.thrift.TKey$TKeyTupleSchemeFactory",
      "org.apache.accumulo.core.data.thrift.TKey$_Fields",
      "org.apache.thrift.meta_data.FieldMetaData",
      "org.apache.thrift.meta_data.FieldValueMetaData",
      "org.apache.accumulo.core.data.thrift.TKey",
      "org.apache.accumulo.core.util.ByteBufferUtil",
      "com.facebook.presto.common.type.CharType",
      "com.facebook.presto.metadata.MetadataManager",
      "org.apache.http.entity.AbstractHttpEntity",
      "org.apache.http.entity.FileEntity",
      "org.apache.http.util.Args",
      "org.antlr.v4.runtime.atn.Transition$1",
      "org.antlr.v4.runtime.atn.Transition",
      "org.antlr.v4.runtime.atn.ActionTransition",
      "com.facebook.presto.common.block.ByteArrayBlock",
      "org.apache.accumulo.core.util.TextUtil",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1",
      "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "io.airlift.slice.OutputStreamSliceOutput",
      "org.glassfish.jersey.server.internal.scanning.PackageNamesScanner",
      "org.glassfish.jersey.internal.util.ReflectionHelper$1",
      "org.glassfish.jersey.internal.util.TypeVisitor",
      "org.glassfish.jersey.internal.util.ReflectionHelper$11",
      "org.glassfish.jersey.internal.util.ReflectionHelper$2",
      "org.glassfish.jersey.internal.util.ReflectionHelper",
      "org.glassfish.jersey.internal.util.ReflectionHelper$8",
      "org.glassfish.jersey.internal.util.Tokenizer",
      "org.glassfish.jersey.server.internal.scanning.JarZipSchemeResourceFinderFactory",
      "org.glassfish.jersey.server.internal.scanning.FileSchemeResourceFinderFactory",
      "org.glassfish.jersey.server.internal.scanning.VfsSchemeResourceFinderFactory",
      "org.glassfish.jersey.server.internal.scanning.BundleSchemeResourceFinderFactory",
      "org.glassfish.jersey.server.internal.scanning.PackageNamesScanner$ResourcesProvider",
      "org.glassfish.jersey.server.internal.scanning.PackageNamesScanner$ResourcesProvider$1",
      "com.facebook.presto.transaction.NoOpTransactionManager",
      "com.facebook.presto.common.block.ByteArrayBlockBuilder",
      "com.facebook.presto.common.block.IntArrayBlock"
    );
  }
}
