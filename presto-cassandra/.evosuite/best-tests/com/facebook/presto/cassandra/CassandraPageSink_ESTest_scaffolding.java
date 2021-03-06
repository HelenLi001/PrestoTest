/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 01:58:04 GMT 2021
 */

package com.facebook.presto.cassandra;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class CassandraPageSink_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.cassandra.CassandraPageSink"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-cassandra"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CassandraPageSink_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "com.datastax.driver.$internal.com.google.common.base.PairwiseEquivalence",
      "com.datastax.driver.$internal.com.google.common.cache.Weigher",
      "com.datastax.driver.core.RegularStatement",
      "com.datastax.driver.core.DataType$NativeType",
      "com.datastax.driver.core.ColumnDefinitions",
      "com.facebook.presto.common.type.VariableWidthType",
      "io.airlift.slice.SliceInput",
      "com.datastax.driver.core.ConsistencyLevel",
      "com.datastax.driver.$internal.com.google.common.base.Equivalence$Equals",
      "com.datastax.driver.$internal.com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.common.QualifiedObjectName",
      "com.datastax.driver.core.TypeCodec$AbstractMapCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$1",
      "com.datastax.driver.core.TypeCodec$SetCodec",
      "org.openjdk.jol.util.VMSupport$MyChars4",
      "com.facebook.presto.common.predicate.NullableValue",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.datastax.driver.core.TypeCodec$PrimitiveIntCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.datastax.driver.core.TypeCodec$BlobCodec",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableMap",
      "com.datastax.driver.$internal.com.google.common.cache.RemovalListener",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$LocalLoadingCache",
      "com.datastax.driver.core.TypeCodec$AbstractTupleCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntrySet",
      "com.datastax.driver.core.GettableByIndexData",
      "com.datastax.driver.$internal.com.google.common.collect.AbstractMapEntry",
      "com.facebook.presto.spi.ErrorCode",
      "com.datastax.driver.core.Row",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultimap$Values",
      "io.airlift.slice.SliceOutput",
      "com.datastax.driver.$internal.com.google.common.collect.SetMultimap",
      "com.datastax.driver.core.TupleType",
      "com.datastax.driver.$internal.com.google.common.collect.Multimap",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSortedSet$Builder",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableSortedSet",
      "com.datastax.driver.$internal.com.google.common.base.Predicate",
      "com.datastax.driver.core.WriteType",
      "com.facebook.presto.cassandra.CassandraTable",
      "com.datastax.driver.core.TypeCodec$VarintCodec",
      "com.datastax.driver.$internal.com.google.common.collect.CollectPreconditions",
      "com.facebook.presto.spi.SchemaTablePrefix",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$OneWeigher",
      "org.openjdk.jol.util.VMSupport$CompressedOopsClass",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList$1",
      "com.datastax.driver.core.TypeCodec$UUIDCodec",
      "com.datastax.driver.core.CodecRegistry$TypeCodecCacheLoader",
      "com.facebook.presto.common.predicate.EquatableValueSet",
      "com.datastax.driver.$internal.com.google.common.collect.BiMap",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultiset",
      "com.facebook.presto.common.predicate.DiscreteValues",
      "com.google.common.collect.ImmutableCollection",
      "com.datastax.driver.core.PagingIterable",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableBiMapEntry",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder",
      "com.facebook.presto.spi.SchemaTableName",
      "com.facebook.presto.spi.SchemaNotFoundException",
      "com.datastax.driver.$internal.com.google.common.collect.UnmodifiableListIterator",
      "org.openjdk.jol.info.ClassData",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.UserDefinedType",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSetMultimap",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$WeakValueReference",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$SoftValueReference",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.common.predicate.Range",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.function.SqlFunctionProperties$Builder",
      "com.datastax.driver.$internal.com.google.common.collect.EmptyImmutableSetMultimap",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.datastax.driver.$internal.com.google.common.base.Ticker",
      "com.datastax.driver.$internal.com.google.common.collect.IndexedImmutableSet",
      "com.facebook.presto.spi.ConnectorTableHandle",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeResolver",
      "com.facebook.presto.common.type.IntegerType",
      "com.google.common.collect.ImmutableList",
      "org.openjdk.jol.util.VMSupport$MyObject5",
      "org.openjdk.jol.util.VMSupport$MyObject3",
      "com.datastax.driver.core.TypeCodec$StringCodec",
      "org.openjdk.jol.util.VMSupport$MyObject4",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "org.openjdk.jol.util.VMSupport$MyObject2",
      "com.datastax.driver.$internal.com.google.common.base.FunctionalEquivalence",
      "com.datastax.driver.core.TypeCodec$UDTCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList$SubList",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$LocalManualCache",
      "com.fasterxml.jackson.annotation.JsonSubTypes",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList$Builder",
      "com.datastax.driver.core.TypeCodec$IntCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableBiMapFauxverideShim",
      "org.openjdk.jol.util.VMSupport$MyFloats4",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultimap$Keys",
      "com.datastax.driver.$internal.com.google.common.collect.BaseImmutableMultimap",
      "com.datastax.driver.$internal.com.google.common.reflect.Invokable$MethodInvokable",
      "com.datastax.driver.core.SettableByNameData",
      "com.facebook.presto.cassandra.CassandraPartition",
      "com.datastax.driver.$internal.com.google.common.cache.Cache",
      "com.datastax.driver.$internal.com.google.common.base.Equivalence$Identity",
      "com.facebook.presto.common.CatalogSchemaName",
      "com.facebook.presto.common.type.DateType",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.common.Page",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$WeightedSoftValueReference",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapValues",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultimap$1",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$1",
      "com.facebook.presto.common.predicate.AllOrNone",
      "com.datastax.driver.$internal.com.google.common.collect.AbstractMultimap",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$3",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$2",
      "org.openjdk.jol.info.FieldData",
      "com.datastax.driver.core.VersionNumber",
      "com.datastax.driver.core.UDTValue",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultimap$Builder",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.datastax.driver.core.TypeCodec$PrimitiveByteCodec",
      "com.datastax.driver.$internal.com.google.common.base.Suppliers",
      "com.datastax.driver.core.TypeCodec$DateCodec",
      "com.datastax.driver.core.DataType$CollectionType",
      "com.datastax.driver.core.ProtocolVersion",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultimap$2",
      "com.datastax.driver.core.exceptions.DriverInternalError",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.common.GenericInternalException",
      "org.openjdk.jol.util.VMSupport$SizeInfo",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$StrongValueReference",
      "com.facebook.presto.common.block.DictionaryId",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList",
      "com.datastax.driver.core.TypeCodec$VarcharCodec",
      "com.datastax.driver.core.SettableByIndexData",
      "com.datastax.driver.$internal.com.google.common.collect.ListMultimap",
      "com.datastax.driver.$internal.com.google.common.collect.Multiset",
      "com.datastax.driver.core.exceptions.DriverException",
      "com.datastax.driver.core.querybuilder.Utils$Appendeable",
      "com.datastax.driver.core.querybuilder.Insert$Options",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.collect.ImmutableList$1",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "com.facebook.presto.common.type.TimeZoneKey",
      "com.datastax.driver.core.TypeCodec$PrimitiveDoubleCodec",
      "com.datastax.driver.$internal.com.google.common.base.Ticker$1",
      "com.facebook.presto.common.predicate.AllOrNoneValueSet",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.facebook.presto.cassandra.CassandraTableHandle",
      "com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.common.type.DoubleType",
      "com.datastax.driver.$internal.com.google.common.util.concurrent.FutureCallback",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.facebook.presto.common.predicate.SortedRangeSet",
      "org.openjdk.jol.util.VMSupport",
      "com.datastax.driver.core.Token",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableMap$Values",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$WeightedStrongValueReference",
      "com.google.common.collect.SingletonImmutableList",
      "com.facebook.presto.common.type.TinyintType",
      "com.datastax.driver.core.TupleValue",
      "com.datastax.driver.core.TypeCodec$LongCodec",
      "io.airlift.slice.BasicSliceOutput",
      "com.facebook.presto.common.type.SmallintType",
      "com.datastax.driver.$internal.com.google.common.math.IntMath",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSortedSet",
      "com.facebook.presto.spi.StandardErrorCode",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.VMSupport$1",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableBiMap$Inverse",
      "com.datastax.driver.$internal.com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.common.predicate.Ranges",
      "com.datastax.driver.core.TokenRange",
      "com.facebook.presto.common.type.BooleanType",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.datastax.driver.$internal.com.google.common.base.Suppliers$SupplierOfInstance",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$InvalidCacheLoadException",
      "com.facebook.presto.spi.PrestoException",
      "org.openjdk.jol.datamodel.CurrentDataModel",
      "com.datastax.driver.core.CodecRegistry",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "org.openjdk.jol.util.VMSupport$MyShorts4",
      "com.facebook.presto.common.block.PageBuilderStatus",
      "com.datastax.driver.core.BoundStatement",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$1",
      "com.facebook.presto.common.type.BigintEnumType$LongEnumMap",
      "com.datastax.driver.core.PagingState",
      "com.datastax.driver.$internal.com.google.common.util.concurrent.ListenableFuture",
      "com.datastax.driver.core.TypeCodec$BooleanCodec",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Strength",
      "com.facebook.presto.common.block.DictionaryBlock",
      "com.datastax.driver.core.querybuilder.Using",
      "com.facebook.presto.common.block.Block",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$2",
      "com.datastax.driver.core.Duration",
      "org.openjdk.jol.util.VMSupport$MyLongs4",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapKeySet",
      "org.openjdk.jol.util.VMSupport$MyInts4",
      "com.datastax.driver.core.TypeCodec$TimeUUIDCodec",
      "com.datastax.driver.core.QueryOptions",
      "com.datastax.driver.$internal.com.google.common.collect.SortedIterable",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.facebook.drift.annotations.ThriftEnum",
      "com.datastax.driver.core.TypeCodec$TupleCodec",
      "org.openjdk.jol.util.VMSupport$MyBytes4",
      "com.datastax.driver.$internal.com.google.common.collect.SingletonImmutableList",
      "com.datastax.driver.$internal.com.google.common.collect.IndexedImmutableSet$1",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "org.openjdk.jol.info.ClassLayout",
      "com.facebook.presto.cassandra.CassandraPageSink",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory",
      "com.datastax.driver.core.TypeCodec$PrimitiveLongCodec",
      "com.datastax.driver.core.Cluster",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.datastax.driver.core.Statement$1",
      "com.datastax.driver.core.DataType$Name",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.datastax.driver.core.Statement",
      "com.datastax.driver.core.TypeCodec$AbstractUDTCodec",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.datastax.driver.core.TypeCodec$TimestampCodec",
      "com.datastax.driver.core.QueryTrace",
      "com.datastax.driver.$internal.com.google.common.reflect.Invokable",
      "com.datastax.driver.core.TypeCodec$DecimalCodec",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.facebook.presto.common.predicate.TupleDomain$ColumnDomain",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeParameter",
      "com.datastax.driver.core.TypeCodec$TimeCodec",
      "com.datastax.driver.core.DataType$CustomType",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader",
      "com.datastax.driver.$internal.com.google.common.cache.AbstractCache$StatsCounter",
      "com.facebook.presto.common.predicate.Domain",
      "com.datastax.driver.$internal.com.google.common.base.Supplier",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableEntry",
      "com.datastax.driver.core.LocalDate",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.facebook.presto.common.type.encoding.BaseNCodec",
      "com.datastax.driver.$internal.com.google.common.util.concurrent.UncheckedExecutionException",
      "com.datastax.driver.core.querybuilder.BuiltStatement",
      "org.openjdk.jol.info.FieldLayout",
      "com.datastax.driver.$internal.com.google.common.base.Preconditions",
      "com.datastax.driver.core.GettableData",
      "org.openjdk.jol.datamodel.DataModel",
      "com.datastax.driver.$internal.com.google.common.cache.ReferenceEntry",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.facebook.presto.common.type.VarcharEnumType$VarcharEnumMap",
      "com.datastax.driver.core.TypeCodec$FloatCodec",
      "com.datastax.driver.core.AbstractGettableData",
      "org.openjdk.jol.util.VMSupport$HeaderClass",
      "com.datastax.driver.core.SettableData",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapValues$1",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapValues$2",
      "com.datastax.driver.core.PreparedId",
      "org.openjdk.jol.util.VMSupport$MyDoubles4",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$Builder",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.datastax.driver.core.TypeCodec$AbstractUUIDCodec",
      "com.datastax.driver.core.querybuilder.BindMarker",
      "com.datastax.driver.$internal.com.google.common.collect.SingletonImmutableSet",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.cassandra.SizeEstimate",
      "com.datastax.driver.core.Connection$DefaultResponseHandler",
      "com.facebook.presto.common.type.TimestampType",
      "org.openjdk.jol.util.VMSupport$MyBooleans4",
      "com.facebook.presto.spi.NotFoundException",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableBiMap",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntry",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$SerializedForm",
      "com.datastax.driver.$internal.com.google.common.reflect.Element",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken$Bounds",
      "com.datastax.driver.core.TypeCodec$SmallIntCodec",
      "com.datastax.driver.$internal.com.google.common.collect.SingletonImmutableBiMap",
      "com.datastax.driver.core.exceptions.UnsupportedFeatureException",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.common.type.NamedTypeSignature",
      "com.datastax.driver.core.ColumnDefinitions$Definition",
      "com.datastax.driver.core.querybuilder.Insert",
      "com.facebook.drift.annotations.ThriftStruct",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$FunctionToCacheLoader",
      "com.datastax.driver.core.DataType",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$AccessQueue",
      "com.datastax.driver.$internal.com.google.common.util.concurrent.ExecutionError",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$LocalManualCache$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Strength$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Strength$2",
      "com.datastax.driver.$internal.com.google.common.collect.ForwardingCollection",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Strength$3",
      "com.google.common.collect.ImmutableList$SubList",
      "com.facebook.presto.common.Page$DictionaryBlockIndexes",
      "com.datastax.driver.core.TypeCodec$DoubleCodec",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableAsList",
      "com.datastax.driver.core.querybuilder.BuiltStatement$ForwardingStatement",
      "com.google.common.collect.RegularImmutableList",
      "com.datastax.driver.core.TypeCodec$AbstractCollectionCodec",
      "com.datastax.driver.$internal.com.google.common.collect.AbstractIndexedListIterator",
      "com.facebook.presto.spi.ConnectorPageSink",
      "com.datastax.driver.core.exceptions.PagingStateException",
      "com.datastax.driver.core.AbstractData",
      "com.datastax.driver.core.AbstractGettableByIndexData",
      "com.datastax.driver.core.TypeCodec$CustomCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableCollection$Builder",
      "com.datastax.driver.core.TypeCodec$DurationCodec",
      "com.facebook.drift.annotations.ThriftIdlAnnotation",
      "com.datastax.driver.core.TypeCodec$PrimitiveBooleanCodec",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$3",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$2",
      "com.datastax.driver.core.TypeCodec$MapCodec",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$5",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$4",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$7",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$6",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableSet",
      "com.datastax.driver.core.CodecRegistry$TypeCodecWeigher",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$8",
      "io.airlift.slice.Slice",
      "com.datastax.driver.core.exceptions.CodecNotFoundException",
      "com.datastax.driver.core.policies.RetryPolicy",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet",
      "com.datastax.driver.core.TypeCodec$CounterCodec",
      "com.datastax.driver.core.PreparedStatement",
      "com.datastax.driver.core.Cluster$Manager",
      "com.datastax.driver.core.GettableByNameData",
      "com.datastax.driver.core.TypeCodec$TinyIntCodec",
      "com.datastax.driver.core.TypeCodec$PrimitiveShortCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableCollection",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableBiMap",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeCapture",
      "com.datastax.driver.$internal.com.google.common.collect.ForwardingSet",
      "com.datastax.driver.$internal.com.google.common.base.Equivalence",
      "com.facebook.presto.common.predicate.ValueSet",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultimap",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "com.datastax.driver.$internal.com.google.common.math.IntMath$1",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken$2",
      "com.datastax.driver.$internal.com.google.common.collect.ForwardingObject",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Segment",
      "com.datastax.driver.core.TypeCodec$AsciiCodec",
      "com.datastax.driver.$internal.com.google.common.base.Function",
      "com.datastax.driver.core.Token$Factory",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.datastax.driver.$internal.com.google.common.base.MoreObjects",
      "com.facebook.presto.cassandra.CassandraSession",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableBiMap$Builder",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken$TypeSet",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$SupplierToCacheLoader",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.datastax.driver.$internal.com.google.common.cache.CacheStats",
      "com.datastax.driver.core.TypeCodec$PrimitiveFloatCodec",
      "com.datastax.driver.core.exceptions.InvalidTypeException",
      "com.datastax.driver.$internal.com.google.common.reflect.Invokable$ConstructorInvokable",
      "com.facebook.presto.common.type.TypeSignature$EnumMapParsingData",
      "com.datastax.driver.core.policies.RetryPolicy$RetryDecision",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableMap$KeySet",
      "com.facebook.presto.common.type.encoding.Base32",
      "com.fasterxml.jackson.annotation.JsonTypeInfo",
      "com.datastax.driver.core.Host",
      "com.datastax.driver.$internal.com.google.common.cache.LoadingCache",
      "com.datastax.driver.core.ExecutionInfo",
      "com.datastax.driver.core.DataType$Name$1",
      "org.openjdk.jol.util.MathUtil",
      "com.datastax.driver.core.DataType$Name$2",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$WeightedWeakValueReference",
      "com.datastax.driver.core.TypeCodec$ListCodec",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$ValueReference",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet$Builder",
      "com.datastax.driver.$internal.com.google.common.math.MathPreconditions",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$NullListener",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$AccessQueue$1",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.datastax.driver.core.ResultSet",
      "com.datastax.driver.core.UserType",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken$SimpleTypeToken",
      "com.datastax.driver.core.TypeCodec$BigintCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableListMultimap",
      "com.fasterxml.jackson.annotation.JsonSubTypes$Type",
      "com.datastax.driver.core.TypeCodec$InetCodec",
      "org.openjdk.jol.layouters.Layouter",
      "com.datastax.driver.core.AbstractAddressableByIndexData",
      "com.facebook.presto.common.predicate.TupleDomain",
      "com.facebook.presto.spi.TableNotFoundException",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache",
      "com.datastax.driver.core.TypeCodec"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.cassandra.CassandraSession", false, CassandraPageSink_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CassandraPageSink_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.spi.ConnectorPageSink",
      "com.facebook.presto.cassandra.CassandraPageSink",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.datastax.driver.core.VersionNumber",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$Builder",
      "com.datastax.driver.$internal.com.google.common.collect.CollectPreconditions",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableCollection$Builder",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableMap",
      "com.datastax.driver.$internal.com.google.common.base.Preconditions",
      "com.datastax.driver.$internal.com.google.common.collect.AbstractMapEntry",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableEntry",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntry",
      "com.datastax.driver.$internal.com.google.common.collect.Hashing",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.datastax.driver.core.ProtocolVersion",
      "com.datastax.driver.core.querybuilder.BindMarker",
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
      "com.facebook.presto.common.type.DoubleType",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.common.type.DateType",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.spi.StandardErrorCode",
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
      "com.facebook.presto.common.Page"
    );
  }
}
