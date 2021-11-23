/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 09:46:01 GMT 2021
 */

package com.facebook.presto.functionNamespace.execution.thrift;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ThriftSqlFunctionExecutor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-function-namespace-managers"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ThriftSqlFunctionExecutor_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "com.fasterxml.jackson.annotation.JsonProperty",
      "com.google.common.collect.RangeSet",
      "org.openjdk.jol.util.VMSupport$MyLongs4",
      "com.facebook.presto.common.type.VariableWidthType",
      "io.airlift.slice.SliceInput",
      "com.facebook.presto.common.type.BigintEnumType",
      "org.openjdk.jol.util.VMSupport$MyInts4",
      "com.facebook.presto.common.type.JsonType",
      "com.facebook.presto.common.block.IntArrayBlock",
      "com.facebook.presto.common.block.MapBlock",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftBlock",
      "io.airlift.slice.Slices",
      "com.facebook.presto.common.QualifiedObjectName",
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor$1",
      "com.google.common.collect.ImmutableRangeSet",
      "com.facebook.drift.annotations.ThriftEnum",
      "com.facebook.presto.thrift.api.udf.ThriftUdfPageFormat",
      "org.openjdk.jol.util.VMSupport$MyBytes4",
      "com.facebook.presto.functionNamespace.execution.ExceptionUtils$1",
      "com.mysql.jdbc.CachedResultSetMetaData",
      "org.openjdk.jol.util.VMSupport$MyChars4",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.google.common.base.Converter$IdentityConverter",
      "com.facebook.presto.common.type.TypeUtils",
      "com.facebook.presto.common.predicate.Utils",
      "com.mysql.jdbc.MysqlIO",
      "com.mysql.jdbc.Connection",
      "com.facebook.presto.common.block.MapBlockEncoding",
      "org.openjdk.jol.info.ClassLayout",
      "com.mysql.jdbc.SingleByteCharsetConverter",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "com.facebook.presto.common.block.AbstractMapBlock$HashTables",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ImmutableRangeSet$ComplementRanges",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.google.common.util.concurrent.MoreExecutors$ListeningDecorator",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Determinism",
      "com.facebook.presto.common.function.SqlFunctionResult",
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor",
      "com.google.common.util.concurrent.MoreExecutors$DirectExecutor",
      "com.facebook.presto.common.type.P4HyperLogLogType",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.spi.ErrorCode",
      "io.airlift.slice.SliceOutput",
      "com.facebook.presto.common.block.RunLengthBlockEncoding",
      "com.mysql.jdbc.log.Log",
      "com.facebook.presto.thrift.api.udf.ThriftFunctionHandle",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.facebook.presto.common.type.CharType",
      "com.facebook.presto.spi.function.RoutineCharacteristics",
      "com.google.common.collect.ImmutableSortedSet",
      "com.facebook.presto.common.block.ArrayBlockEncoding",
      "com.google.common.collect.ImmutableRangeSet$Builder",
      "com.facebook.presto.thrift.api.udf.ThriftUdfService",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.facebook.presto.common.type.FunctionType",
      "io.airlift.slice.BasicSliceInput",
      "com.facebook.presto.spi.RecordSet",
      "com.mysql.jdbc.Statement",
      "com.mysql.jdbc.Buffer",
      "com.facebook.presto.spi.function.SqlFunctionId",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.facebook.presto.common.type.encoding.BaseNCodec",
      "org.openjdk.jol.util.VMSupport$CompressedOopsClass",
      "com.google.common.base.Preconditions",
      "org.openjdk.jol.info.FieldLayout",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.AbstractRangeSet",
      "com.facebook.presto.common.type.RowType",
      "com.google.common.base.Converter$ConverterComposition",
      "org.openjdk.jol.datamodel.DataModel",
      "com.facebook.presto.common.NotSupportedException",
      "com.facebook.presto.common.block.BlockEncoding",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.common.predicate.Primitives",
      "com.mysql.fabric.jdbc.FabricMySQLDriver",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "io.airlift.units.Duration",
      "com.facebook.presto.spi.SchemaTableName",
      "com.facebook.presto.spi.function.ScalarFunctionImplementation",
      "org.openjdk.jol.info.ClassData",
      "com.mysql.jdbc.profiler.ProfilerEventHandler",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.VarcharEnumType$VarcharEnumMap",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
      "com.facebook.presto.common.type.UserDefinedType",
      "com.facebook.presto.thrift.api.udf.PrestoThriftPage",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftTimestamp",
      "com.facebook.presto.common.type.VarcharEnumType",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftDouble",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.collect.BiMap",
      "org.openjdk.jol.util.VMSupport$HeaderClass",
      "com.facebook.presto.common.block.ByteArrayBlock",
      "com.google.common.collect.ImmutableSet",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.spi.InMemoryRecordSet$InMemoryRecordCursor",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.RealType",
      "org.openjdk.jol.util.VMSupport$MyDoubles4",
      "com.google.common.collect.CollectCollectors",
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutionConfig",
      "com.google.common.base.Converter$ReverseConverter",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftBigint",
      "com.facebook.presto.common.function.SqlFunctionProperties$Builder",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.thrift.api.udf.ThriftUdfServiceException",
      "com.facebook.presto.common.type.TimestampType",
      "org.openjdk.jol.util.VMSupport$MyBooleans4",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.facebook.presto.thrift.api.datatypes.SliceData$CreateSliceThriftBlockFunction",
      "com.facebook.presto.common.type.MapType",
      "com.google.common.util.concurrent.ListenableFuture",
      "com.google.common.base.Supplier",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Builder",
      "com.facebook.presto.spi.InMemoryRecordSet",
      "com.facebook.presto.common.block.BlockEncodingSerde",
      "com.facebook.presto.common.block.ShortArrayBlock",
      "io.airlift.slice.DynamicSliceOutput",
      "com.facebook.presto.common.type.IntegerType",
      "org.openjdk.jol.util.VMSupport$MyObject5",
      "com.google.common.collect.ImmutableList",
      "org.openjdk.jol.util.VMSupport$MyObject3",
      "org.openjdk.jol.util.VMSupport$MyObject4",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "com.google.common.collect.ImmutableRangeSet$AsSet",
      "org.openjdk.jol.util.VMSupport$MyObject2",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.facebook.presto.common.block.SingleRowBlockEncoding",
      "com.facebook.presto.common.type.Type",
      "com.facebook.drift.annotations.ThriftService",
      "com.facebook.presto.common.type.NamedTypeSignature",
      "com.facebook.presto.spi.function.RoutineCharacteristics$NullCallClause",
      "org.openjdk.jol.util.VMSupport$MyFloats4",
      "com.mysql.jdbc.NetworkResources",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.facebook.drift.annotations.ThriftStruct",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.collect.ImmutableRangeMap$Builder",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "com.facebook.presto.spi.function.FunctionHandle",
      "com.facebook.presto.common.CatalogSchemaName",
      "com.facebook.presto.common.block.ByteArrayBlockEncoding",
      "com.facebook.drift.TException",
      "com.facebook.presto.common.type.DateType",
      "com.facebook.presto.thrift.api.datatypes.SliceData",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftTypeUtils",
      "com.facebook.presto.thrift.api.udf.UdfExecutionFailureInfo",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.facebook.presto.common.Page",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.block.RunLengthEncodedBlock",
      "com.google.common.collect.ImmutableList$SubList",
      "com.facebook.presto.common.Page$DictionaryBlockIndexes",
      "com.google.common.collect.ImmutableSortedMap$Builder",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.mysql.jdbc.Extension",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread$1",
      "com.facebook.presto.common.block.ShortArrayBlockEncoding",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.util.concurrent.GwtFluentFutureCatchingSpecialization",
      "com.google.common.collect.ImmutableRangeMap",
      "org.hsqldb.jdbc.JDBCDriver",
      "io.airlift.slice.InputStreamSliceInput",
      "org.openjdk.jol.info.FieldData",
      "com.mysql.jdbc.StatementImpl",
      "com.facebook.presto.common.type.UnknownType",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "com.facebook.presto.thrift.api.udf.ThriftUdfErrorCodeSupplier",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.google.common.collect.Range",
      "com.facebook.presto.thrift.api.udf.ThriftUdfResult",
      "com.facebook.presto.common.type.HyperLogLogType",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.facebook.presto.thrift.api.udf.ThriftSerializedPage",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.drift.annotations.ThriftIdlAnnotation",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftJson",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "io.airlift.slice.SliceTooLargeException",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftInteger",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftBigintArray",
      "com.facebook.drift.annotations.ThriftField",
      "com.facebook.presto.common.GenericInternalException",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Language",
      "com.google.common.util.concurrent.ListeningExecutorService",
      "org.openjdk.jol.util.VMSupport$SizeInfo",
      "com.facebook.presto.common.block.Int128ArrayBlock",
      "com.facebook.presto.common.block.DictionaryId",
      "io.airlift.slice.Slice",
      "com.facebook.presto.common.type.DecimalType",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftVarchar",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.util.concurrent.AbstractListeningExecutorService",
      "com.facebook.presto.common.block.BlockEncodingManager",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftBoolean",
      "com.facebook.presto.common.type.ArrayType",
      "com.google.common.util.concurrent.ListeningScheduledExecutorService",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.thrift.api.udf.ThriftUdfRequest",
      "com.google.common.collect.ImmutableSortedMap",
      "com.mysql.jdbc.MySQLConnection",
      "com.facebook.presto.spi.ConnectorTableMetadata",
      "com.facebook.presto.common.type.EnumType",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.common.block.LazyBlockEncoding",
      "com.facebook.presto.thrift.api.udf.ThriftUdfPage",
      "com.google.common.base.MoreObjects",
      "com.facebook.drift.client.DriftClient",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.mysql.jdbc.Wrapper",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.spi.InMemoryRecordSet$Builder",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "com.facebook.presto.common.type.TimeZoneKey",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.RangeMap",
      "com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.common.type.DoubleType",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "com.facebook.presto.thrift.api.udf.ThriftUdfStats",
      "com.facebook.presto.spi.page.SerializedPage",
      "com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator",
      "com.mysql.jdbc.PreparedStatement",
      "org.openjdk.jol.util.VMSupport",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "com.mysql.jdbc.Field",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.facebook.presto.spi.function.SqlFunctionHandle",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Converter",
      "com.facebook.presto.spi.function.ThriftScalarFunctionImplementation",
      "com.facebook.presto.common.type.RowType$Field",
      "com.facebook.presto.common.type.TinyintType",
      "com.facebook.presto.common.block.DictionaryBlockEncoding",
      "com.google.common.base.Function",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftHyperLogLog",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.mysql.jdbc.ConnectionProperties",
      "com.facebook.presto.common.block.ByteArrayBlockBuilder",
      "io.airlift.slice.BasicSliceOutput",
      "com.mysql.jdbc.Driver",
      "com.facebook.presto.common.type.TypeSignature$EnumMapParsingData",
      "com.facebook.presto.common.type.encoding.Base32",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.google.common.collect.ImmutableSortedMapFauxverideShim",
      "io.airlift.slice.FixedLengthSliceInput",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.spi.RecordCursor",
      "com.mysql.jdbc.ServerPreparedStatement",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread$ConnectionFinalizerPhantomReference",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.facebook.presto.common.block.Int128ArrayBlockEncoding",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.MathUtil",
      "org.openjdk.jol.util.VMSupport$1",
      "com.facebook.presto.functionNamespace.execution.ExceptionUtils",
      "com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.common.type.encoding.BaseNCodec$Context",
      "com.facebook.presto.common.block.LongArrayBlockEncoding",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.block.AbstractMapBlock",
      "com.facebook.presto.spi.PrestoException",
      "org.openjdk.jol.datamodel.CurrentDataModel",
      "com.google.common.collect.ImmutableBiMap",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "org.openjdk.jol.util.VMSupport$MyShorts4",
      "io.airlift.slice.OutputStreamSliceOutput",
      "com.facebook.presto.common.block.PageBuilderStatus",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.block.RowBlockEncoding",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.common.block.IntArrayBlockEncoding",
      "com.facebook.presto.common.type.TypeWithName",
      "com.facebook.presto.common.type.BigintEnumType$LongEnumMap",
      "com.facebook.presto.common.block.VariableWidthBlockEncoding",
      "com.facebook.presto.common.block.SingleMapBlockEncoding",
      "com.google.common.collect.ImmutableRangeSet$1",
      "org.openjdk.jol.layouters.Layouter",
      "com.facebook.presto.common.type.KdbTreeType",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftDate",
      "com.mysql.jdbc.ResultSetInternalMethods",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftColumnData",
      "com.facebook.presto.common.type.TimeType",
      "com.facebook.presto.common.block.DictionaryBlock",
      "com.facebook.presto.common.block.LongArrayBlockBuilder",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.google.common.util.concurrent.ListenableScheduledFuture",
      "com.facebook.presto.common.type.RowFieldName",
      "com.mysql.jdbc.ExceptionInterceptor",
      "com.facebook.presto.common.block.Block",
      "com.google.common.collect.RegularImmutableSortedSet",
      "com.google.common.util.concurrent.AbstractFuture",
      "com.google.common.util.concurrent.FluentFuture"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ThriftSqlFunctionExecutor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor",
      "com.google.common.collect.CollectCollectors",
      "com.google.common.util.concurrent.MoreExecutors$DirectExecutor",
      "com.facebook.presto.thrift.api.udf.ThriftUdfPageFormat",
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor$1",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.IntegerType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.type.DoubleType",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.type.DateType",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.HyperLogLogType",
      "org.openjdk.jol.util.VMSupport$1",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "org.openjdk.jol.util.MathUtil",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "org.openjdk.jol.util.VMSupport",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.functionNamespace.execution.ExceptionUtils$1",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.thrift.api.udf.ThriftUdfErrorCodeSupplier",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Language",
      "com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutionConfig",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.spi.function.SqlFunctionId",
      "com.facebook.presto.common.QualifiedObjectName",
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
      "io.airlift.slice.SliceInput",
      "io.airlift.slice.FixedLengthSliceInput",
      "org.openjdk.jol.info.ClassLayout",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "org.openjdk.jol.info.ClassData",
      "org.openjdk.jol.info.FieldData",
      "org.openjdk.jol.datamodel.CurrentDataModel",
      "org.openjdk.jol.info.FieldLayout",
      "io.airlift.slice.BasicSliceInput",
      "com.facebook.presto.spi.function.ThriftScalarFunctionImplementation",
      "com.facebook.presto.spi.function.SqlFunctionHandle",
      "com.facebook.presto.common.CatalogSchemaName",
      "com.facebook.presto.common.Page",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.KdbTreeType",
      "com.facebook.presto.common.type.FunctionType",
      "com.facebook.presto.common.type.TinyintType",
      "com.facebook.presto.common.type.VarcharEnumType$VarcharEnumMap",
      "com.facebook.presto.common.type.TypeUtils",
      "com.facebook.presto.thrift.api.udf.ThriftUdfServiceException",
      "com.facebook.presto.common.type.RowType",
      "com.facebook.presto.common.type.TypeWithName",
      "com.facebook.presto.common.type.UserDefinedType",
      "com.facebook.presto.common.type.DecimalType",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.facebook.presto.spi.page.SerializedPage",
      "io.airlift.units.Duration",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.facebook.presto.common.type.ArrayType",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.common.block.RunLengthEncodedBlock",
      "com.facebook.presto.common.predicate.Utils",
      "com.facebook.presto.common.predicate.Primitives",
      "com.facebook.presto.common.type.CharType",
      "com.facebook.presto.common.type.TimeType",
      "com.facebook.presto.common.type.RowType$Field",
      "com.facebook.presto.common.type.P4HyperLogLogType",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.facebook.presto.common.type.BigintEnumType$LongEnumMap",
      "com.facebook.presto.common.type.BigintEnumType",
      "io.airlift.slice.InputStreamSliceInput",
      "com.facebook.presto.thrift.api.udf.PrestoThriftPage",
      "com.facebook.presto.thrift.api.udf.ThriftUdfPage",
      "com.facebook.presto.thrift.api.udf.ThriftUdfStats",
      "com.facebook.presto.thrift.api.udf.ThriftUdfResult",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftHyperLogLog",
      "com.facebook.presto.thrift.api.datatypes.SliceData",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftTypeUtils",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.common.type.UnknownType",
      "com.facebook.presto.common.type.JsonType",
      "com.facebook.presto.thrift.api.udf.ThriftSerializedPage",
      "io.airlift.slice.Slice",
      "io.airlift.slice.Slices",
      "com.facebook.presto.common.type.NamedTypeSignature",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftTimestamp",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread$1",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.fabric.jdbc.FabricMySQLDriver",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.google.common.base.MoreObjects",
      "com.facebook.presto.thrift.api.udf.UdfExecutionFailureInfo",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftVarchar",
      "com.facebook.presto.spi.InMemoryRecordSet",
      "com.facebook.presto.spi.InMemoryRecordSet$InMemoryRecordCursor",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftBlock",
      "com.facebook.presto.common.block.ByteArrayBlockBuilder",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftInteger",
      "io.airlift.slice.SliceOutput",
      "io.airlift.slice.OutputStreamSliceOutput",
      "com.facebook.presto.common.block.Int128ArrayBlock",
      "com.facebook.presto.common.type.VarcharEnumType",
      "com.facebook.presto.common.function.SqlFunctionResult",
      "io.airlift.slice.DynamicSliceOutput",
      "com.facebook.presto.common.type.MapType",
      "com.facebook.presto.common.block.ByteArrayBlock",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftDate",
      "com.facebook.presto.common.block.IntArrayBlock",
      "com.facebook.presto.common.block.LongArrayBlockBuilder",
      "com.facebook.presto.common.block.ShortArrayBlock",
      "com.facebook.presto.thrift.api.datatypes.PrestoThriftBigint"
    );
  }
}
