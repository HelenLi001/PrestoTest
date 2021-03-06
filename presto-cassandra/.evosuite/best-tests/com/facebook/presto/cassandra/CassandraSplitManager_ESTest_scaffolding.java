/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 01:54:08 GMT 2021
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
public class CassandraSplitManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.cassandra.CassandraSplitManager"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CassandraSplitManager_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.spi.WarningCollector",
      "com.datastax.driver.$internal.com.google.common.base.PairwiseEquivalence",
      "com.datastax.driver.$internal.com.google.common.cache.Weigher",
      "com.datastax.driver.core.RegularStatement",
      "com.datastax.driver.core.DataType$NativeType",
      "com.datastax.driver.core.ColumnDefinitions",
      "com.google.common.base.JdkPattern",
      "com.datastax.driver.core.ConsistencyLevel",
      "com.datastax.driver.$internal.com.google.common.base.Equivalence$Equals",
      "com.datastax.driver.$internal.com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.spi.WarningCollector$1",
      "com.facebook.presto.common.QualifiedObjectName",
      "com.datastax.driver.core.TypeCodec$AbstractMapCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$1",
      "com.datastax.driver.core.TypeCodec$SetCodec",
      "io.airlift.units.MaxDurationValidator",
      "com.facebook.presto.common.predicate.NullableValue",
      "com.datastax.driver.core.TypeCodec$PrimitiveIntCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.datastax.driver.core.TypeCodec$BlobCodec",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableMap",
      "com.datastax.driver.$internal.com.google.common.cache.RemovalListener",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$LocalLoadingCache",
      "com.datastax.driver.core.TypeCodec$AbstractTupleCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntrySet",
      "com.datastax.driver.core.GettableByIndexData",
      "com.datastax.driver.$internal.com.google.common.collect.AbstractMapEntry",
      "com.facebook.presto.spi.ErrorCode",
      "com.datastax.driver.core.Row",
      "com.datastax.driver.$internal.com.google.common.collect.SetMultimap",
      "com.datastax.driver.core.TupleType",
      "com.datastax.driver.$internal.com.google.common.collect.Multimap",
      "com.datastax.driver.core.policies.FallthroughRetryPolicy",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap",
      "com.datastax.driver.$internal.com.google.common.base.Predicate",
      "com.datastax.driver.core.WriteType",
      "com.facebook.presto.cassandra.CassandraTable",
      "com.facebook.presto.spi.function.SqlFunctionId",
      "com.datastax.driver.core.TypeCodec$VarintCodec",
      "com.datastax.driver.$internal.com.google.common.collect.CollectPreconditions",
      "com.facebook.presto.spi.SchemaTablePrefix",
      "com.facebook.presto.spi.function.Signature",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$OneWeigher",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList$1",
      "com.google.common.base.CharMatcher$1",
      "com.datastax.driver.core.TypeCodec$UUIDCodec",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.datastax.driver.core.CodecRegistry$TypeCodecCacheLoader",
      "com.facebook.presto.common.predicate.EquatableValueSet",
      "com.datastax.driver.$internal.com.google.common.collect.BiMap",
      "com.facebook.presto.common.predicate.DiscreteValues",
      "com.google.common.collect.ImmutableCollection",
      "io.airlift.units.Duration",
      "com.datastax.driver.core.PagingIterable",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder",
      "com.facebook.presto.spi.SchemaTableName",
      "com.facebook.presto.spi.SchemaNotFoundException",
      "com.datastax.driver.$internal.com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSetMultimap",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$WeakValueReference",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$SoftValueReference",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.facebook.presto.cassandra.CassandraTokenSplitManager$TokenSplit",
      "com.facebook.presto.common.predicate.Range",
      "io.airlift.units.MaxDuration",
      "com.facebook.presto.common.function.SqlFunctionProperties$Builder",
      "com.google.common.base.CharMatcher$Is",
      "com.facebook.presto.spi.function.FunctionKind",
      "com.facebook.presto.spi.ConnectorTableLayoutHandle",
      "com.datastax.driver.$internal.com.google.common.base.Ticker",
      "com.facebook.presto.spi.ConnectorTableHandle",
      "com.datastax.driver.$internal.com.google.common.collect.IndexedImmutableSet",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Builder",
      "com.facebook.presto.common.type.TimeZoneNotSupportedException",
      "com.google.common.collect.ImmutableList",
      "com.datastax.driver.core.TypeCodec$StringCodec",
      "com.datastax.driver.$internal.com.google.common.base.FunctionalEquivalence",
      "com.datastax.driver.core.TypeCodec$UDTCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList$SubList",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.base.CharMatcher$Negated",
      "com.fasterxml.jackson.annotation.JsonSubTypes",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.spi.function.RoutineCharacteristics$NullCallClause",
      "com.datastax.driver.core.TypeCodec$IntCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.datastax.driver.$internal.com.google.common.collect.BaseImmutableMultimap",
      "com.datastax.driver.$internal.com.google.common.reflect.Invokable$MethodInvokable",
      "com.datastax.driver.core.SettableByNameData",
      "com.facebook.presto.cassandra.CassandraPartition",
      "com.datastax.driver.$internal.com.google.common.cache.Cache",
      "com.datastax.driver.$internal.com.google.common.base.Equivalence$Identity",
      "com.google.common.base.CharMatcher$Digit",
      "com.facebook.presto.spi.function.FunctionHandle",
      "com.facebook.presto.common.CatalogSchemaName",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableList",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$WeightedSoftValueReference",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapValues",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.connector.ConnectorTransactionHandle",
      "com.facebook.presto.common.type.TypeSignature",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$1",
      "com.facebook.presto.common.predicate.AllOrNone",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$3",
      "com.datastax.driver.$internal.com.google.common.collect.AbstractMultimap",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$2",
      "com.facebook.presto.cassandra.RetryPolicyType",
      "com.datastax.driver.core.VersionNumber",
      "com.datastax.driver.core.UDTValue",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.datastax.driver.core.TypeCodec$PrimitiveByteCodec",
      "com.datastax.driver.$internal.com.google.common.base.Suppliers",
      "com.datastax.driver.core.TypeCodec$DateCodec",
      "com.datastax.driver.core.DataType$CollectionType",
      "com.datastax.driver.core.ProtocolVersion",
      "com.datastax.driver.core.exceptions.DriverInternalError",
      "io.airlift.units.MinDurationValidator",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableAsList",
      "com.google.common.base.CharMatcher$IsEither",
      "com.facebook.presto.spi.connector.ConnectorSplitManager$SplitSchedulingStrategy",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Language",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$StrongValueReference",
      "com.facebook.presto.spi.connector.ConnectorPartitionHandle",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.RegularImmutableAsList",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableList",
      "com.datastax.driver.core.TypeCodec$VarcharCodec",
      "com.datastax.driver.core.SettableByIndexData",
      "com.datastax.driver.core.exceptions.DriverException",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.common.type.TimeZoneKey",
      "com.datastax.driver.core.TypeCodec$PrimitiveDoubleCodec",
      "com.datastax.driver.$internal.com.google.common.base.Ticker$1",
      "com.facebook.presto.common.predicate.AllOrNoneValueSet",
      "com.facebook.presto.cassandra.CassandraTableHandle",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.UnmodifiableIterator",
      "com.datastax.driver.$internal.com.google.common.util.concurrent.FutureCallback",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.facebook.presto.common.predicate.SortedRangeSet",
      "com.google.inject.BindingAnnotation",
      "com.datastax.driver.core.Token",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableMap$Values",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$WeightedStrongValueReference",
      "com.facebook.presto.spi.function.SqlFunctionHandle",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.collect.SingletonImmutableList",
      "com.facebook.presto.spi.connector.ConnectorSplitManager",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.datastax.driver.core.TupleValue",
      "com.datastax.driver.core.TypeCodec$LongCodec",
      "com.datastax.driver.$internal.com.google.common.math.IntMath",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.datastax.driver.$internal.com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.common.predicate.Ranges",
      "com.datastax.driver.core.TokenRange",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.datastax.driver.$internal.com.google.common.base.Suppliers$SupplierOfInstance",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$InvalidCacheLoadException",
      "com.facebook.presto.spi.PrestoException",
      "io.airlift.units.MinDuration",
      "com.datastax.driver.core.CodecRegistry",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "com.datastax.driver.core.BoundStatement",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$1",
      "com.facebook.presto.spi.WarningCode",
      "com.facebook.presto.spi.connector.ConnectorSplitManager$SplitSchedulingContext",
      "com.facebook.presto.spi.function.TypeVariableConstraint",
      "com.datastax.driver.core.PagingState",
      "com.datastax.driver.$internal.com.google.common.util.concurrent.ListenableFuture",
      "com.datastax.driver.core.TypeCodec$BooleanCodec",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Strength",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$2",
      "com.datastax.driver.core.Duration",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapKeySet",
      "com.datastax.driver.core.TypeCodec$TimeUUIDCodec",
      "com.datastax.driver.core.QueryOptions",
      "com.google.common.base.Splitter$MapSplitter",
      "com.datastax.driver.core.TypeCodec$TupleCodec",
      "com.facebook.drift.annotations.ThriftEnum",
      "com.datastax.driver.$internal.com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.datastax.driver.$internal.com.google.common.collect.IndexedImmutableSet$1",
      "com.facebook.presto.common.type.TimeZoneKey$1",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.google.common.base.Predicate",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory",
      "com.datastax.driver.core.TypeCodec$PrimitiveLongCodec",
      "com.datastax.driver.core.Cluster",
      "com.datastax.driver.core.Statement$1",
      "com.datastax.driver.core.DataType$Name",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Determinism",
      "com.datastax.driver.core.Statement",
      "com.datastax.driver.core.TypeCodec$AbstractUDTCodec",
      "com.datastax.driver.core.TypeCodec$TimestampCodec",
      "com.datastax.driver.core.QueryTrace",
      "com.datastax.driver.$internal.com.google.common.reflect.Invokable",
      "com.datastax.driver.core.TypeCodec$DecimalCodec",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.facebook.presto.spi.PrestoWarning",
      "com.facebook.presto.spi.function.SqlFunction",
      "com.facebook.presto.common.predicate.TupleDomain$ColumnDomain",
      "com.facebook.presto.spi.function.RoutineCharacteristics",
      "com.datastax.driver.core.TypeCodec$TimeCodec",
      "com.datastax.driver.core.DataType$CustomType",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader",
      "com.datastax.driver.$internal.com.google.common.cache.AbstractCache$StatsCounter",
      "com.google.common.base.CharMatcher",
      "com.facebook.presto.common.predicate.Domain",
      "com.datastax.driver.$internal.com.google.common.base.Supplier",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableEntry",
      "com.datastax.driver.core.LocalDate",
      "com.facebook.airlift.configuration.DefunctConfig",
      "com.facebook.presto.cassandra.CassandraTableLayoutHandle",
      "com.datastax.driver.$internal.com.google.common.util.concurrent.UncheckedExecutionException",
      "com.google.common.base.Preconditions",
      "com.datastax.driver.$internal.com.google.common.base.Preconditions",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.datastax.driver.core.GettableData",
      "com.datastax.driver.$internal.com.google.common.cache.ReferenceEntry",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.datastax.driver.core.TypeCodec$FloatCodec",
      "com.datastax.driver.core.AbstractGettableData",
      "com.datastax.driver.core.SettableData",
      "com.facebook.presto.spi.function.FunctionVersion",
      "com.datastax.driver.core.PreparedId",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$Builder",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.facebook.airlift.configuration.ConfigSecuritySensitive",
      "com.datastax.driver.core.TypeCodec$AbstractUUIDCodec",
      "com.datastax.driver.$internal.com.google.common.collect.SingletonImmutableSet",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.cassandra.SizeEstimate",
      "com.datastax.driver.core.Connection$DefaultResponseHandler",
      "com.google.common.base.Splitter$Strategy",
      "com.facebook.presto.spi.NotFoundException",
      "com.facebook.presto.spi.function.LongVariableConstraint",
      "com.facebook.presto.cassandra.BackoffRetryPolicy",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableBiMap",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMapEntry",
      "com.datastax.driver.$internal.com.google.common.reflect.Element",
      "com.datastax.driver.core.TypeCodec$SmallIntCodec",
      "com.datastax.driver.$internal.com.google.common.collect.SingletonImmutableBiMap",
      "com.datastax.driver.core.exceptions.UnsupportedFeatureException",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.spi.security.SelectedRole",
      "com.datastax.driver.core.ColumnDefinitions$Definition",
      "com.google.common.base.CharMatcher$Ascii",
      "com.facebook.drift.annotations.ThriftStruct",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$FunctionToCacheLoader",
      "com.datastax.driver.core.DataType",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$AccessQueue",
      "com.datastax.driver.$internal.com.google.common.util.concurrent.ExecutionError",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$LocalManualCache$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Strength$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Strength$2",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Strength$3",
      "com.facebook.presto.cassandra.CassandraTokenSplitManager",
      "com.facebook.presto.spi.ConnectorSplitSource",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.datastax.driver.core.TypeCodec$DoubleCodec",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableAsList",
      "com.facebook.presto.spi.function.SqlInvokedFunction",
      "com.google.common.collect.RegularImmutableList",
      "com.datastax.driver.core.TypeCodec$AbstractCollectionCodec",
      "com.datastax.driver.$internal.com.google.common.collect.AbstractIndexedListIterator",
      "com.datastax.driver.core.exceptions.PagingStateException",
      "com.datastax.driver.core.AbstractData",
      "com.facebook.airlift.configuration.ConfigDescription",
      "com.datastax.driver.core.AbstractGettableByIndexData",
      "com.datastax.driver.core.TypeCodec$CustomCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableCollection$Builder",
      "com.datastax.driver.core.TypeCodec$DurationCodec",
      "com.google.common.base.CommonPattern",
      "com.facebook.presto.spi.ConnectorSession",
      "com.facebook.drift.annotations.ThriftIdlAnnotation",
      "com.datastax.driver.core.TypeCodec$PrimitiveBooleanCodec",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$EntryFactory$1",
      "com.facebook.presto.cassandra.CassandraClientConfig",
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
      "com.facebook.airlift.configuration.Config",
      "com.datastax.driver.core.exceptions.CodecNotFoundException",
      "com.datastax.driver.core.policies.RetryPolicy",
      "com.google.common.base.JdkPattern$JdkMatcher",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet",
      "com.datastax.driver.core.TypeCodec$CounterCodec",
      "com.datastax.driver.core.PreparedStatement",
      "com.datastax.driver.core.Cluster$Manager",
      "com.datastax.driver.core.GettableByNameData",
      "com.datastax.driver.core.TypeCodec$TinyIntCodec",
      "com.datastax.driver.core.TypeCodec$PrimitiveShortCodec",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.cassandra.CassandraSplitManager",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableBiMap",
      "com.facebook.presto.spi.schedule.NodeSelectionStrategy",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeCapture",
      "com.facebook.presto.spi.ConnectorSplit",
      "com.datastax.driver.core.policies.DowngradingConsistencyRetryPolicy",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.datastax.driver.$internal.com.google.common.base.Equivalence",
      "com.facebook.presto.common.predicate.ValueSet",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableMultimap",
      "com.datastax.driver.$internal.com.google.common.math.IntMath$1",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken$2",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken$1",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$Segment",
      "com.datastax.driver.core.TypeCodec$AsciiCodec",
      "com.datastax.driver.$internal.com.google.common.base.Function",
      "com.facebook.presto.spi.security.SelectedRole$Type",
      "com.datastax.driver.core.Token$Factory",
      "com.google.common.base.CommonMatcher",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.datastax.driver.$internal.com.google.common.base.MoreObjects",
      "com.facebook.presto.cassandra.CassandraSession",
      "com.google.common.base.Splitter",
      "com.datastax.driver.core.policies.DefaultRetryPolicy",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableBiMap$Builder",
      "com.datastax.driver.$internal.com.google.common.cache.CacheLoader$SupplierToCacheLoader",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.datastax.driver.$internal.com.google.common.cache.CacheStats",
      "com.datastax.driver.core.TypeCodec$PrimitiveFloatCodec",
      "com.datastax.driver.core.exceptions.InvalidTypeException",
      "com.datastax.driver.$internal.com.google.common.reflect.Invokable$ConstructorInvokable",
      "com.datastax.driver.core.policies.RetryPolicy$RetryDecision",
      "com.datastax.driver.$internal.com.google.common.collect.RegularImmutableMap$KeySet",
      "com.facebook.presto.spi.function.SqlFunctionVisibility",
      "com.fasterxml.jackson.annotation.JsonTypeInfo",
      "com.datastax.driver.core.Host",
      "com.datastax.driver.$internal.com.google.common.cache.LoadingCache",
      "com.datastax.driver.core.ExecutionInfo",
      "com.datastax.driver.core.DataType$Name$1",
      "com.datastax.driver.core.DataType$Name$2",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$WeightedWeakValueReference",
      "com.datastax.driver.core.TypeCodec$ListCodec",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$ValueReference",
      "com.facebook.presto.cassandra.CassandraSplit",
      "com.datastax.driver.$internal.com.google.common.math.MathPreconditions",
      "com.datastax.driver.$internal.com.google.common.cache.CacheBuilder$NullListener",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache$AccessQueue$1",
      "com.datastax.driver.$internal.com.google.common.collect.ImmutableSet$Builder",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken",
      "com.google.common.base.Splitter$1$1",
      "com.datastax.driver.core.ResultSet",
      "com.datastax.driver.core.UserType",
      "com.datastax.driver.$internal.com.google.common.reflect.TypeToken$SimpleTypeToken",
      "com.facebook.presto.cassandra.CassandraConnectorId",
      "com.datastax.driver.core.TypeCodec$BigintCodec",
      "com.fasterxml.jackson.annotation.JsonSubTypes$Type",
      "com.datastax.driver.core.TypeCodec$InetCodec",
      "com.datastax.driver.core.AbstractAddressableByIndexData",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.facebook.presto.common.predicate.TupleDomain",
      "com.facebook.presto.spi.security.ConnectorIdentity",
      "com.facebook.presto.spi.TableNotFoundException",
      "com.datastax.driver.$internal.com.google.common.cache.LocalCache",
      "com.google.common.base.AbstractIterator",
      "com.datastax.driver.core.TypeCodec"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.cassandra.CassandraClientConfig", false, CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.cassandra.CassandraConnectorId", false, CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.cassandra.CassandraSession", false, CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.cassandra.CassandraTokenSplitManager", false, CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.ConnectorSession", false, CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.ConnectorTableLayoutHandle", false, CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.connector.ConnectorSplitManager$SplitSchedulingContext", false, CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.spi.connector.ConnectorTransactionHandle", false, CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CassandraSplitManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.cassandra.CassandraSplitManager",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.cassandra.CassandraConnectorId",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.facebook.presto.cassandra.CassandraClientConfig",
      "com.facebook.presto.spi.connector.ConnectorSplitManager$SplitSchedulingContext",
      "com.facebook.presto.cassandra.CassandraTokenSplitManager",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder"
    );
  }
}
