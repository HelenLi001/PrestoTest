/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 22 19:13:55 GMT 2021
 */

package com.facebook.presto.connector.thrift;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ThriftMetadata_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.connector.thrift.ThriftMetadata"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-thrift-connector"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ThriftMetadata_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.spi.ConnectorIndexHandle",
      "com.facebook.presto.connector.thrift.DefaultThriftHeaderProvider",
      "com.facebook.presto.spi.connector.ConnectorMetadata",
      "io.airlift.units.Preconditions",
      "com.facebook.presto.thrift.api.connector.PrestoThriftService",
      "com.facebook.presto.thrift.api.connector.PrestoThriftServiceException",
      "com.facebook.presto.spi.NotFoundException",
      "com.facebook.presto.spi.ConnectorTableLayoutHandle",
      "com.facebook.drift.client.DriftClient",
      "com.facebook.presto.spi.PrestoException",
      "io.airlift.units.Duration",
      "com.facebook.presto.spi.ConnectorSession",
      "com.facebook.presto.spi.TableNotFoundException",
      "com.facebook.presto.common.type.TypeManager",
      "com.facebook.presto.connector.thrift.ThriftMetadata",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.drift.TException",
      "com.facebook.presto.connector.thrift.ThriftHeaderProvider"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.drift.client.DriftClient", false, ThriftMetadata_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ThriftMetadata_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.airlift.units.Duration",
      "io.airlift.units.Preconditions",
      "com.facebook.presto.connector.thrift.ThriftMetadata",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.connector.thrift.ThriftErrorCode",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.google.common.collect.CollectCollectors",
      "com.google.common.cache.CacheBuilder$1",
      "com.google.common.base.Suppliers",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.cache.CacheStats",
      "com.google.common.cache.CacheBuilder$2",
      "com.google.common.base.Ticker$1",
      "com.google.common.base.Ticker",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.cache.CacheBuilder",
      "io.airlift.units.Duration$1",
      "com.google.common.cache.CacheLoader",
      "com.google.common.cache.CacheLoader$FunctionToCacheLoader",
      "com.facebook.presto.connector.thrift.DefaultThriftHeaderProvider",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.Splitter$MapSplitter",
      "com.facebook.presto.transaction.TransactionManagerConfig",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.facebook.presto.metadata.CatalogManager",
      "com.facebook.presto.transaction.TransactionManager",
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.transaction.InMemoryTransactionManager",
      "com.facebook.presto.sql.analyzer.FeaturesConfig",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$JoinDistributionType",
      "io.airlift.units.DataSize",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$JoinReorderingStrategy",
      "com.facebook.presto.operator.aggregation.arrayagg.ArrayAggGroupImplementation",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$AggregationPartitioningMergingStrategy",
      "com.facebook.presto.metadata.MetadataManager",
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
      "com.facebook.presto.metadata.FunctionAndTypeManager",
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
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureBase",
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
      "com.google.common.collect.ImmutableList$Builder",
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
      "com.facebook.presto.operator.annotations.FunctionsParserHelper",
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
      "com.facebook.presto.operator.aggregation.ParametricAggregation",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.operator.aggregation.RealAverageAggregation",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.VarcharType",
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
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CaseFormat",
      "com.google.common.base.Ascii",
      "com.facebook.presto.operator.annotations.LiteralImplementationDependency",
      "com.facebook.presto.operator.scalar.annotations.OperatorValidator",
      "com.facebook.presto.operator.scalar.annotations.OperatorValidator$1",
      "com.google.common.base.Joiner",
      "com.facebook.presto.spi.function.LongVariableConstraint",
      "com.google.common.base.Strings",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.MoreExecutors$DirectExecutor",
      "com.facebook.presto.transaction.NoOpTransactionManager",
      "com.facebook.presto.transaction.DelegatingTransactionManager",
      "com.facebook.presto.execution.MockQueryExecution",
      "com.facebook.presto.connector.thrift.ThriftSessionProperties",
      "net.jodah.expiringmap.internal.NamedThreadFactory",
      "io.netty.util.concurrent.DefaultThreadFactory"
    );
  }
}
