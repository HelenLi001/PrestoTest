/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 21:24:00 GMT 2021
 */

package com.facebook.presto.hive.metastore.file;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TableMetadata_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.hive.metastore.file.TableMetadata"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-hive-metastore"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TableMetadata_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.fasterxml.jackson.annotation.JsonProperty",
      "com.facebook.hive.orc.OrcSerde",
      "org.apache.hadoop.hive.ql.io.avro.AvroContainerOutputFormat",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.RangeSet",
      "com.google.common.collect.ImmutableList$SubList",
      "com.facebook.hive.orc.OrcInputFormat",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.PeekingIterator",
      "org.apache.hadoop.hive.serde2.AbstractSerDe",
      "com.google.common.collect.RegularImmutableList",
      "org.apache.hadoop.mapred.SequenceFileInputFormat",
      "org.apache.hadoop.hive.ql.io.RCFileInputFormat",
      "com.google.common.collect.ImmutableRangeSet",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.facebook.presto.hive.metastore.StorageFormat",
      "com.google.common.collect.RegularImmutableMap",
      "org.apache.hadoop.hive.serde2.columnar.ColumnarSerDeBase",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.google.common.collect.Range",
      "org.apache.hadoop.hive.serde2.avro.AvroSerDe",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ImmutableRangeSet$ComplementRanges",
      "org.apache.hadoop.mapred.FileOutputFormat",
      "com.facebook.presto.hive.metastore.Table",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.RegularImmutableAsList",
      "org.apache.hadoop.hive.ql.io.HiveSequenceFileOutputFormat",
      "org.apache.hadoop.mapred.TextOutputFormat",
      "com.google.common.collect.SingletonImmutableSet",
      "com.facebook.presto.hive.metastore.HiveColumnStatistics",
      "com.google.common.collect.ImmutableMapEntrySet",
      "org.apache.hadoop.hive.ql.io.BatchToRowInputFormat",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.base.Functions$IdentityFunction",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.base.Functions",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.ImmutableRangeSet$Builder",
      "com.google.common.collect.Maps$BiMapConverter",
      "org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe",
      "com.google.common.collect.AbstractIterator",
      "org.apache.hadoop.hive.ql.io.AcidOutputFormat",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.hive.metastore.Table$Builder",
      "com.google.common.collect.MapDifference",
      "org.apache.hadoop.hive.ql.io.LlapCacheOnlyInputFormatInterface",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "com.facebook.presto.hive.HiveStorageFormat",
      "com.facebook.presto.hive.metastore.file.TableMetadata",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "org.apache.hadoop.hive.serde2.Deserializer",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "org.apache.hadoop.hive.ql.io.SelfDescribingInputFormatInterface",
      "com.google.common.collect.AbstractRangeSet",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.facebook.presto.hive.metastore.Storage$Builder",
      "com.google.common.collect.ImmutableEntry",
      "io.airlift.units.DataSize$Unit",
      "org.apache.hadoop.mapred.SequenceFileOutputFormat",
      "org.apache.hadoop.hive.ql.io.AcidInputFormat",
      "org.apache.hadoop.hive.serde2.columnar.LazyBinaryColumnarSerDe",
      "org.apache.hadoop.hive.serde2.AbstractEncodingAwareSerDe",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "org.apache.hadoop.hive.ql.io.orc.OrcSerde",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.facebook.presto.spi.SchemaTableName",
      "org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat",
      "org.apache.hive.hcatalog.data.JsonSerDe",
      "org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe",
      "org.apache.hadoop.mapred.InputFormat",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "org.apache.hadoop.mapred.OutputFormat",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.base.Converter",
      "com.google.common.collect.Maps$8",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "org.apache.hadoop.mapred.FileInputFormat",
      "com.google.common.collect.AbstractIndexedListIterator",
      "org.apache.hadoop.hive.ql.exec.vector.VectorizedSerde",
      "org.apache.hadoop.hive.ql.io.RCFileOutputFormat",
      "org.apache.hadoop.hive.ql.io.InputFormatChecker",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Iterators$1",
      "org.apache.hadoop.hive.ql.exec.vector.VectorizedInputFormatInterface",
      "org.apache.hadoop.hive.ql.io.HiveOutputFormat",
      "org.apache.hadoop.hive.serde2.SerDe",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.CollectCollectors",
      "com.google.common.collect.Iterators$5",
      "org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe",
      "io.airlift.units.DataSize",
      "com.facebook.presto.hive.metastore.PrestoTableType",
      "org.apache.hadoop.hive.ql.io.orc.OrcInputFormat",
      "com.facebook.hive.orc.OrcOutputFormat",
      "org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "org.apache.hadoop.hive.ql.io.orc.OrcOutputFormat",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.ImmutableList$Builder",
      "org.apache.hadoop.mapred.TextInputFormat",
      "io.airlift.units.Preconditions",
      "com.facebook.presto.hive.metastore.Column",
      "com.google.common.collect.Multiset",
      "com.facebook.presto.spi.PrestoException",
      "com.google.common.collect.Iterators",
      "org.apache.hadoop.hive.ql.io.avro.AvroContainerInputFormat",
      "com.google.common.collect.ImmutableBiMap",
      "org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat",
      "org.apache.hadoop.hive.serde2.OpenCSVSerde",
      "com.google.common.collect.ImmutableList",
      "com.fasterxml.jackson.annotation.JsonIgnore",
      "com.google.common.collect.ImmutableRangeSet$AsSet",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "org.apache.hadoop.hive.ql.io.LlapWrappableInputFormatInterface",
      "com.facebook.presto.hive.metastore.Storage",
      "org.apache.hadoop.hive.ql.io.CombineHiveInputFormat$AvoidSplitCombination",
      "com.google.common.collect.ImmutableRangeSet$1",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Maps",
      "org.apache.hadoop.mapred.JobConfigurable",
      "com.facebook.presto.hive.HiveStorageFormat$SerdeAndInputFormat",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.collect.Maps$EntryTransformer",
      "org.apache.hadoop.hive.serde2.Serializer",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.facebook.presto.hive.HiveBucketProperty",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.hive.metastore.Storage", false, TableMetadata_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.metastore.StorageFormat", false, TableMetadata_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.hive.metastore.Table", false, TableMetadata_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TableMetadata_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.hive.metastore.file.TableMetadata",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.facebook.presto.hive.metastore.PrestoTableType",
      "io.airlift.units.DataSize$Unit",
      "io.airlift.units.DataSize",
      "io.airlift.units.Preconditions",
      "com.google.common.base.Functions",
      "com.google.common.base.Functions$IdentityFunction",
      "com.google.common.collect.CollectCollectors",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.facebook.presto.hive.HiveStorageFormat$SerdeAndInputFormat",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.facebook.presto.hive.HiveStorageFormat",
      "com.facebook.presto.hive.metastore.StorageFormat",
      "com.facebook.presto.hive.metastore.Table",
      "com.facebook.presto.hive.metastore.Storage",
      "com.google.common.collect.Maps",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.facebook.presto.hive.metastore.Storage$Builder",
      "com.google.common.collect.Iterables"
    );
  }
}
