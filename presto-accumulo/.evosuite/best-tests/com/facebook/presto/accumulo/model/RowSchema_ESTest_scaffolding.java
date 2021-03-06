/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 01:31:23 GMT 2021
 */

package com.facebook.presto.accumulo.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RowSchema_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.accumulo.model.RowSchema"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RowSchema_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.DecimalType",
      "io.airlift.slice.Slice",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.spi.ErrorCode",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.facebook.presto.common.type.VariableWidthType",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.accumulo.model.RowSchema",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.type.KdbTreeType",
      "com.google.common.base.MoreObjects",
      "com.facebook.presto.common.type.HyperLogLogType",
      "com.facebook.presto.accumulo.model.AccumuloColumnHandle",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.spi.ColumnMetadata",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.facebook.presto.spi.ColumnHandle",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.common.block.Block",
      "com.facebook.presto.common.GenericInternalException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RowSchema_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.accumulo.model.RowSchema",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.DecimalType",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.accumulo.model.AccumuloColumnHandle",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.common.type.KdbTreeType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.CharType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
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
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.common.block.AbstractVariableWidthBlock",
      "com.facebook.presto.common.block.VariableWidthBlockBuilder",
      "org.jvnet.hk2.internal.ServiceLocatorImpl$1",
      "org.jvnet.hk2.internal.ServiceLocatorImpl$2",
      "org.jvnet.hk2.internal.DescriptorComparator",
      "org.jvnet.hk2.internal.ServiceHandleComparator",
      "org.jvnet.hk2.internal.ServiceLocatorImpl",
      "org.glassfish.hk2.utilities.reflection.internal.ClassReflectionHelperImpl",
      "org.glassfish.hk2.utilities.cache.LRUHybridCache$1",
      "org.glassfish.hk2.utilities.cache.LRUHybridCache$CacheEntryImplComparator",
      "org.glassfish.hk2.utilities.cache.LRUHybridCache",
      "org.glassfish.hk2.utilities.reflection.internal.ClassReflectionHelperImpl$1",
      "org.glassfish.hk2.utilities.reflection.internal.ClassReflectionHelperImpl$2",
      "org.glassfish.hk2.utilities.reflection.internal.ClassReflectionHelperImpl$3",
      "org.glassfish.hk2.utilities.reflection.internal.ClassReflectionHelperImpl$4",
      "org.jvnet.hk2.internal.PerLocatorUtilities",
      "org.glassfish.hk2.utilities.general.Hk2ThreadLocal",
      "org.jvnet.hk2.internal.PerLocatorUtilities$1",
      "org.jvnet.hk2.internal.PerLocatorUtilities$2",
      "org.jvnet.hk2.internal.PerLocatorUtilities$3",
      "org.jvnet.hk2.internal.IndexedListData",
      "org.jvnet.hk2.internal.SingletonContext",
      "org.glassfish.hk2.utilities.cache.Cache$1",
      "org.glassfish.hk2.utilities.cache.Cache",
      "org.jvnet.hk2.internal.SingletonContext$1",
      "org.jvnet.hk2.internal.SingletonContext$2",
      "org.jvnet.hk2.internal.PerLookupContext",
      "org.jvnet.hk2.internal.ServiceLocatorImpl$3",
      "org.jvnet.hk2.internal.ServiceLocatorImpl$4",
      "org.glassfish.hk2.api.ServiceLocatorState",
      "org.jvnet.hk2.internal.ServiceLocatorImpl$8",
      "org.glassfish.hk2.utilities.cache.CacheUtilities",
      "org.glassfish.hk2.utilities.cache.internal.WeakCARCacheImpl",
      "org.glassfish.hk2.utilities.general.GeneralUtilities",
      "org.glassfish.hk2.utilities.general.internal.WeakHashClockImpl",
      "org.glassfish.hk2.utilities.general.internal.WeakHashLRUImpl",
      "org.jvnet.hk2.internal.ServiceLocatorImpl$9",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.IntegerType",
      "com.facebook.presto.common.block.IntArrayBlock",
      "com.facebook.presto.common.type.DoubleType",
      "com.facebook.presto.common.block.LazyBlockEncoding",
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
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.MapType",
      "com.facebook.presto.common.block.ByteArrayBlockBuilder",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.presto.common.type.ArrayType",
      "com.facebook.presto.common.type.UnknownType",
      "org.testng.xml.XmlDependencies",
      "org.testng.collections.Maps",
      "com.facebook.presto.common.type.VarcharEnumType$VarcharEnumMap",
      "com.facebook.presto.common.type.TypeUtils",
      "com.facebook.presto.common.type.VarcharEnumType",
      "com.facebook.presto.common.block.Int128ArrayBlock",
      "com.facebook.presto.common.block.Int128ArrayBlockBuilder",
      "com.facebook.presto.spi.ColumnMetadata",
      "com.facebook.presto.spi.SchemaUtil",
      "com.facebook.presto.common.type.BigintEnumParametricType",
      "com.facebook.presto.sql.analyzer.FeaturesConfig",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$JoinDistributionType",
      "io.airlift.units.DataSize",
      "io.airlift.units.Preconditions",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$TaskSpillingStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$SingleStreamSpillerChoice",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$JoinReorderingStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$PartialMergePushdownStrategy",
      "com.facebook.presto.operator.aggregation.histogram.HistogramGroupImplementation",
      "com.facebook.presto.operator.aggregation.arrayagg.ArrayAggGroupImplementation",
      "com.facebook.presto.operator.aggregation.multimapagg.MultimapAggGroupImplementation",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$PartialAggregationStrategy",
      "io.airlift.units.Duration",
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
      "com.facebook.presto.metadata.FunctionAndTypeManager",
      "com.facebook.presto.common.type.StatisticalDigestParametricType",
      "com.facebook.presto.common.type.TDigestParametricType",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.Iterables",
      "com.facebook.presto.common.type.TypeParameter",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread$1",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.fabric.jdbc.FabricMySQLDriver",
      "org.h2.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.google.common.collect.Lists",
      "com.facebook.presto.common.type.QuantileDigestParametricType",
      "org.glassfish.hk2.utilities.reflection.Logger$1",
      "org.glassfish.hk2.utilities.reflection.Logger",
      "org.apache.bval.cdi.EmptyAnnotationLiteral",
      "org.apache.bval.cdi.BValAnnotatedType$BValBindingLiteral",
      "com.facebook.presto.common.type.BigintEnumType",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.common.type.JsonType",
      "com.facebook.presto.spi.transaction.IsolationLevel",
      "com.facebook.presto.transaction.TransactionManager",
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.transaction.InMemoryTransactionManager",
      "com.facebook.presto.metadata.CatalogManager",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.MoreExecutors$DirectExecutor",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
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
      "com.google.common.collect.ImmutableCollection$Builder",
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
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.facebook.presto.operator.annotations.FunctionsParserHelper",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.facebook.presto.operator.aggregation.AggregationImplementation$Parser",
      "com.facebook.presto.spi.function.InvocationConvention$InvocationReturnConvention",
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
      "com.facebook.presto.operator.aggregation.RealAverageAggregation",
      "com.facebook.presto.operator.aggregation.StatisticalDigestAggregationFunction",
      "com.facebook.presto.operator.aggregation.state.StatisticalDigestStateFactory",
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
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.type.RowType",
      "com.facebook.presto.common.type.RowType$Field",
      "com.facebook.presto.common.type.NamedTypeSignature",
      "com.facebook.presto.common.type.P4HyperLogLogType",
      "com.facebook.presto.spi.function.SqlFunctionId",
      "com.facebook.presto.common.type.VarcharEnumParametricType",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.block.AbstractRowBlock",
      "com.facebook.presto.common.block.RowBlockBuilder",
      "com.facebook.presto.common.PageBuilder",
      "com.facebook.presto.common.block.PageBuilderStatus",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.facebook.presto.common.block.LongArrayBlockBuilder",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
      "com.fasterxml.jackson.databind.util.ClassUtil",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.type.TypeBindings",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator",
      "com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Base",
      "com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.core.TokenStreamFactory",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.io.CharTypes",
      "com.fasterxml.jackson.core.io.JsonStringEncoder",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$TableInfo",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations",
      "com.fasterxml.jackson.databind.introspect.AnnotationCollector",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.annotation.Nulls",
      "com.fasterxml.jackson.annotation.JsonSetter$Value",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.cfg.ConfigOverride",
      "com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.core.util.Separators",
      "com.fasterxml.jackson.core.PrettyPrinter",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "com.fasterxml.jackson.core.type.TypeReference",
      "com.facebook.presto.common.type.TinyintType",
      "com.facebook.presto.common.block.AbstractMapBlock",
      "com.facebook.presto.common.block.MapBlockBuilder",
      "com.facebook.presto.common.type.DateType",
      "com.fasterxml.jackson.core.TSFBuilder",
      "com.fasterxml.jackson.core.JsonFactoryBuilder",
      "com.facebook.presto.common.type.StatisticalDigestType",
      "com.facebook.presto.common.type.TDigestType",
      "com.facebook.presto.common.type.HyperLogLogType",
      "com.facebook.presto.common.type.RealType",
      "org.joda.time.tz.UTCProvider",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.testing.TestingMetadata$TestingColumnHandle",
      "com.facebook.presto.common.type.TimeType",
      "com.facebook.presto.common.block.AbstractArrayBlock",
      "com.facebook.presto.common.block.ArrayBlockBuilder",
      "com.facebook.presto.common.type.TimestampType",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Converter$ConverterComposition",
      "com.facebook.presto.spi.session.PropertyMetadata",
      "org.apache.hadoop.fs.DelegationTokenRenewer$RenewAction",
      "com.fasterxml.jackson.databind.type.PlaceholderForType",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.internal.Configuration",
      "org.testng.collections.Lists",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.internal.annotations.JDK15TagFactory$1",
      "org.testng.internal.annotations.JDK15TagFactory$2",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.SuiteRunner",
      "org.testng.TestListenerAdapter",
      "org.testng.SuiteRunState",
      "org.testng.internal.Attributes",
      "org.testng.internal.Utils$1",
      "org.testng.internal.Utils",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "org.testng.SuiteRunner$1",
      "org.testng.xml.XmlTest",
      "org.testng.TestRunner",
      "org.testng.collections.Sets",
      "org.testng.TestRunner$ConfigurationListener",
      "org.testng.internal.TestNGProperty",
      "org.testng.internal.Constants",
      "org.testng.internal.XmlMethodSelector",
      "org.testng.collections.MultiMap",
      "org.testng.collections.ListMultiMap",
      "org.testng.internal.Dynamic",
      "org.testng.internal.BshMock",
      "org.testng.internal.ResultMap",
      "org.testng.internal.RunInfo",
      "org.testng.log4testng.Logger",
      "org.testng.TestNG",
      "org.testng.PreserveOrderMethodInterceptor",
      "org.testng.internal.Invoker$CanRunFromClassPredicate",
      "org.testng.internal.Invoker$SameClassNamePredicate",
      "org.testng.internal.Invoker",
      "org.testng.internal.MethodSelectorDescriptor",
      "org.testng.internal.ClassInfoMap",
      "org.testng.internal.BaseClassFinder",
      "org.testng.internal.TestNGClassFinder",
      "org.testng.internal.ObjectFactoryImpl",
      "org.testng.internal.TestNGMethodFinder",
      "org.testng.internal.MethodGroupsHelper",
      "org.testng.internal.MethodHelper",
      "org.testng.internal.Graph",
      "org.testng.ClassMethodMap",
      "org.testng.internal.ConfigurationGroupMethods",
      "org.testng.internal.BaseTestMethod$1",
      "org.testng.internal.BaseTestMethod",
      "org.testng.internal.FactoryMethod",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.glassfish.jersey.internal.inject.AnnotationLiteral",
      "org.glassfish.jersey.server.ManagedAsyncExecutorLiteral"
    );
  }
}
