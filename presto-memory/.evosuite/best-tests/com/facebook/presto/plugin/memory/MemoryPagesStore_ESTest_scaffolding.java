/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 03:11:12 GMT 2021
 */

package com.facebook.presto.plugin.memory;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MemoryPagesStore_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.plugin.memory.MemoryPagesStore"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-memory"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MemoryPagesStore_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.Page",
      "io.airlift.units.DataSize$Unit",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "org.openjdk.jol.datamodel.DataModel",
      "com.google.common.collect.ImmutableList$SubList",
      "com.facebook.presto.common.Page$DictionaryBlockIndexes",
      "org.openjdk.jol.util.VMSupport$MyLongs4",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.PeekingIterator",
      "com.facebook.presto.spi.ErrorType",
      "org.openjdk.jol.util.VMSupport$MyInts4",
      "com.google.common.collect.RegularImmutableList",
      "org.openjdk.jol.util.VMSupport",
      "org.openjdk.jol.info.ClassData",
      "org.openjdk.jol.info.FieldData",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.SingletonImmutableList",
      "org.openjdk.jol.util.VMSupport$MyBytes4",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.facebook.presto.plugin.memory.MemoryConfig",
      "org.openjdk.jol.util.VMSupport$HeaderClass",
      "com.google.common.collect.Iterators$9",
      "org.openjdk.jol.util.VMSupport$MyChars4",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$1",
      "com.facebook.presto.plugin.memory.MemoryPagesStore$TableData",
      "org.openjdk.jol.util.VMSupport$MyDoubles4",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Iterators$10",
      "io.airlift.units.DataSize",
      "org.openjdk.jol.info.ClassLayout",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.MathUtil",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "org.openjdk.jol.util.VMSupport$1",
      "com.google.common.collect.ImmutableList$Builder",
      "org.openjdk.jol.util.VMSupport$MyBooleans4",
      "com.facebook.presto.common.block.DictionaryId",
      "io.airlift.units.Preconditions",
      "com.google.common.collect.ImmutableAsList",
      "com.facebook.presto.spi.ErrorCode",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.spi.PrestoException",
      "org.openjdk.jol.datamodel.CurrentDataModel",
      "com.google.common.collect.Iterators",
      "org.openjdk.jol.util.VMSupport$MyShorts4",
      "io.airlift.slice.SizeOf",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "com.facebook.presto.plugin.memory.MemoryErrorCode",
      "org.openjdk.jol.layouters.Layouter",
      "com.google.common.collect.AbstractIterator",
      "org.openjdk.jol.util.VMSupport$MyFloats4",
      "com.google.common.collect.ImmutableList$1",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "com.facebook.presto.common.block.DictionaryBlock",
      "com.facebook.presto.plugin.memory.MemoryPagesStore",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.base.Preconditions",
      "org.openjdk.jol.info.FieldLayout",
      "com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.common.block.Block"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MemoryPagesStore_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.plugin.memory.MemoryPagesStore",
      "com.facebook.presto.plugin.memory.MemoryPagesStore$TableData",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.plugin.memory.MemoryErrorCode",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.plugin.memory.MemoryConfig",
      "io.airlift.units.DataSize",
      "io.airlift.units.Preconditions",
      "com.facebook.presto.spi.PrestoException",
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
      "com.facebook.presto.common.Page",
      "com.facebook.presto.common.block.AbstractRowBlock",
      "com.facebook.presto.common.block.RowBlockBuilder",
      "io.airlift.slice.SizeOf",
      "com.facebook.presto.common.block.IntArrayBlockBuilder",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Iterators",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.KdbTreeType",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.BigintEnumType",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.UnknownType",
      "com.facebook.presto.common.block.AbstractArrayBlock",
      "com.facebook.presto.common.block.ArrayBlockBuilder",
      "com.facebook.presto.common.block.AbstractVariableWidthBlock",
      "com.facebook.presto.common.block.VariableWidthBlockBuilder",
      "com.facebook.presto.common.type.RowType",
      "com.facebook.presto.common.block.LongArrayBlockBuilder",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.HyperLogLogType",
      "com.facebook.presto.common.type.FunctionType",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.QualifiedObjectName",
      "com.facebook.presto.common.type.TypeWithName",
      "com.facebook.presto.common.type.TinyintType",
      "com.facebook.presto.common.block.ByteArrayBlockBuilder",
      "com.facebook.presto.common.block.Int128ArrayBlockBuilder",
      "com.facebook.presto.common.block.ByteArrayBlock",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.block.Int128ArrayBlock",
      "com.facebook.presto.common.type.JsonType",
      "com.facebook.presto.common.block.RunLengthEncodedBlock",
      "com.facebook.presto.common.predicate.Utils",
      "com.facebook.presto.common.predicate.Primitives",
      "com.facebook.presto.common.block.ShortArrayBlock",
      "com.facebook.presto.common.type.MapType",
      "com.facebook.presto.common.type.UserDefinedType",
      "com.facebook.presto.common.block.AbstractMapBlock",
      "com.facebook.presto.common.block.MapBlockBuilder",
      "com.facebook.presto.common.type.P4HyperLogLogType",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.common.block.ShortArrayBlockBuilder",
      "com.facebook.presto.common.type.TimeType",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.common.type.BigintEnumType$LongEnumMap",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.block.LazyBlock",
      "com.facebook.presto.common.block.DictionaryBlock",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.IncludeExclude",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.DateType",
      "org.eclipse.jetty.util.RegexSet",
      "com.facebook.presto.common.type.VarbinaryType",
      "com.facebook.presto.common.type.RowType$Field",
      "com.facebook.presto.common.block.LongArrayBlock",
      "com.facebook.presto.common.type.DecimalType",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.common.type.DoubleType",
      "org.apache.bval.util.ObjectWrapper",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.type.ArrayType",
      "com.facebook.presto.common.type.VarcharEnumType$VarcharEnumMap",
      "com.facebook.presto.common.type.VarcharEnumType",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.facebook.presto.common.type.CharType",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "org.eclipse.jetty.util.PathWatcher$PathMatcherSet",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
      "com.facebook.presto.common.block.DictionaryId",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread$1",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.fabric.jdbc.FabricMySQLDriver",
      "org.h2.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.google.common.collect.Range$1",
      "com.google.common.collect.Cut$BelowValue",
      "com.facebook.presto.common.block.AbstractMapBlock$HashTables",
      "com.facebook.presto.common.block.MapBlock",
      "com.facebook.presto.common.block.IntArrayBlock",
      "com.google.common.base.Strings",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.common.type.IntegerType",
      "com.facebook.presto.common.type.NamedTypeSignature",
      "com.facebook.presto.common.type.RowFieldName",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.sql.analyzer.FeaturesConfig",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$JoinDistributionType",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$TaskSpillingStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$SingleStreamSpillerChoice",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$JoinReorderingStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$PartialMergePushdownStrategy",
      "com.facebook.presto.sql.analyzer.RegexLibrary",
      "com.facebook.presto.operator.aggregation.histogram.HistogramGroupImplementation",
      "com.facebook.presto.operator.aggregation.arrayagg.ArrayAggGroupImplementation",
      "com.facebook.presto.operator.aggregation.multimapagg.MultimapAggGroupImplementation",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$PartialAggregationStrategy",
      "io.airlift.units.Duration",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$AggregationPartitioningMergingStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$PartitioningPrecisionStrategy",
      "com.facebook.presto.sql.analyzer.FeaturesConfig$AggregationIfToFilterRewriteStrategy",
      "com.facebook.presto.execution.MockQueryExecution",
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
      "com.facebook.presto.spi.session.SessionPropertyConfigurationManager$SystemSessionPropertyConfiguration",
      "org.glassfish.hk2.utilities.DescriptorImpl",
      "org.glassfish.hk2.utilities.AbstractActiveDescriptor",
      "org.glassfish.hk2.internal.ConstantActiveDescriptor",
      "org.glassfish.hk2.api.DescriptorType",
      "org.glassfish.hk2.api.DescriptorVisibility",
      "com.facebook.presto.common.PageBuilder",
      "com.facebook.presto.common.block.PageBuilderStatus",
      "org.antlr.v4.runtime.misc.DoubleKeyMap",
      "com.facebook.presto.sql.tree.NodeLocation",
      "com.facebook.presto.sql.tree.Node",
      "com.facebook.presto.sql.tree.Statement",
      "com.facebook.presto.sql.tree.Rollback",
      "org.antlr.v4.runtime.atn.ATNState",
      "org.antlr.v4.runtime.atn.DecisionState",
      "org.antlr.v4.runtime.atn.BlockStartState",
      "org.antlr.v4.runtime.atn.BasicBlockStartState",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "org.testng.collections.Maps",
      "org.testng.log4testng.Logger",
      "org.testng.TestNG",
      "com.google.common.collect.ObjectArrays",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.annotation.Nulls",
      "com.fasterxml.jackson.annotation.JsonSetter$Value",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "org.glassfish.hk2.api.AnnotationLiteral",
      "org.glassfish.hk2.utilities.NamedImpl",
      "org.glassfish.hk2.api.AnnotationLiteral$1",
      "org.glassfish.hk2.api.AnnotationLiteral$2"
    );
  }
}
