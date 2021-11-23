/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 02:39:29 GMT 2021
 */

package com.facebook.presto.plugin.bigquery;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BigQueryTableLayoutHandle_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.plugin.bigquery.BigQueryTableLayoutHandle"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-bigquery"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BigQueryTableLayoutHandle_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.cloud.bigquery.ModelTableDefinition",
      "com.google.cloud.bigquery.TableDefinition$Type$1",
      "com.google.cloud.bigquery.ViewDefinition",
      "com.google.cloud.bigquery.HivePartitioningOptions",
      "com.google.cloud.bigquery.StandardTableDefinition",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.cloud.bigquery.TableId",
      "com.google.common.collect.ImmutableCollection",
      "com.google.cloud.bigquery.ExternalTableDefinition$Builder",
      "com.google.common.base.JdkPattern",
      "com.google.cloud.bigquery.ExternalTableDefinition$1",
      "com.google.cloud.bigquery.ExternalTableDefinition$2",
      "com.google.api.services.bigquery.model.ExternalDataConfiguration",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.Platform",
      "com.google.cloud.bigquery.TableDefinition$Builder",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.cloud.bigquery.Schema",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.api.client.json.GenericJson",
      "com.facebook.presto.plugin.bigquery.BigQueryTableHandle",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.cloud.bigquery.GoogleSheetsOptions",
      "com.google.cloud.bigquery.TableInfo$1",
      "com.google.cloud.bigquery.AutoValue_Labels",
      "com.google.cloud.bigquery.TableInfo$2",
      "com.facebook.presto.plugin.bigquery.BigQueryTableLayoutHandle",
      "com.google.api.client.util.GenericData",
      "com.google.cloud.bigquery.TableDefinition",
      "com.google.cloud.bigquery.AutoValue_ExternalTableDefinition",
      "com.google.common.base.Function",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.google.cloud.StringEnumType",
      "com.google.cloud.bigquery.TableDefinition$Type",
      "com.google.common.base.CommonPattern",
      "com.google.cloud.bigquery.BigtableOptions",
      "com.google.cloud.bigquery.AutoValue_ExternalTableDefinition$Builder",
      "com.google.cloud.bigquery.ExternalTableDefinition",
      "com.google.cloud.bigquery.TableId$1",
      "com.google.api.core.ApiFunction",
      "com.google.cloud.bigquery.TableId$2",
      "com.google.cloud.bigquery.FormatOptions",
      "com.google.common.collect.ImmutableAsList",
      "com.facebook.presto.spi.ConnectorTableLayoutHandle",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.spi.ConnectorTableHandle",
      "com.google.cloud.bigquery.CsvOptions",
      "com.google.common.base.Strings",
      "com.google.common.base.PatternCompiler",
      "com.google.common.collect.ImmutableList",
      "com.google.cloud.bigquery.TableInfo$BuilderImpl",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.cloud.bigquery.DatastoreBackupOptions$Builder",
      "com.google.cloud.bigquery.DatastoreBackupOptions",
      "com.google.cloud.bigquery.TableInfo$Builder",
      "com.google.cloud.bigquery.$AutoValue_Labels",
      "com.google.api.services.bigquery.model.TableReference",
      "com.google.cloud.bigquery.Labels",
      "com.google.cloud.bigquery.MaterializedViewDefinition",
      "com.facebook.presto.common.predicate.TupleDomain",
      "com.google.api.services.bigquery.model.Table",
      "com.google.common.collect.ImmutableList$1",
      "com.google.cloud.StringEnumValue",
      "com.facebook.presto.spi.ColumnHandle",
      "com.google.cloud.bigquery.EncryptionConfiguration",
      "com.google.cloud.bigquery.TableInfo",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BigQueryTableLayoutHandle_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.plugin.bigquery.BigQueryTableLayoutHandle",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.plugin.bigquery.BigQueryConfig",
      "com.facebook.presto.plugin.bigquery.BigQueryClient",
      "com.facebook.presto.plugin.bigquery.BigQueryTableHandle",
      "com.facebook.presto.common.predicate.TupleDomain",
      "org.antlr.v4.runtime.RuleContext",
      "org.antlr.v4.runtime.ParserRuleContext",
      "org.antlr.v4.runtime.InterpreterRuleContext",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Preconditions",
      "com.google.cloud.bigquery.TableId$1",
      "com.google.cloud.bigquery.TableId$2",
      "com.google.cloud.bigquery.TableId",
      "com.google.common.base.Strings",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.Platform",
      "com.google.cloud.bigquery.UserDefinedFunction$1",
      "com.google.cloud.bigquery.UserDefinedFunction$2",
      "com.google.cloud.bigquery.UserDefinedFunction",
      "com.google.cloud.bigquery.UserDefinedFunction$InlineFunction",
      "com.google.cloud.bigquery.UserDefinedFunction$Type",
      "com.google.cloud.bigquery.UserDefinedFunction$UriFunction",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.api.client.util.GenericData",
      "com.google.api.client.json.GenericJson",
      "com.google.api.services.bigquery.model.TableReference",
      "com.google.api.client.util.GenericData$Flags",
      "com.google.api.client.util.ArrayMap",
      "com.google.api.client.util.ClassInfo",
      "com.google.api.client.util.Preconditions",
      "com.google.api.client.util.ClassInfo$1",
      "com.google.api.client.util.FieldInfo",
      "com.google.api.client.util.DateTime",
      "com.google.api.client.util.Data",
      "com.google.common.base.Ascii",
      "com.google.api.client.util.Objects",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.Objects",
      "com.google.api.client.util.GenericData$EntrySet",
      "com.google.api.client.util.DataMap",
      "com.google.api.client.util.DataMap$EntrySet",
      "com.google.api.client.util.GenericData$EntryIterator",
      "com.google.api.client.util.DataMap$EntryIterator",
      "com.google.api.client.util.ArrayMap$EntrySet",
      "com.google.api.client.util.ArrayMap$EntryIterator",
      "com.google.api.client.util.DataMap$Entry",
      "com.google.cloud.bigquery.TableDefinition",
      "com.google.cloud.bigquery.ViewDefinition",
      "com.google.cloud.bigquery.TableDefinition$Builder",
      "com.google.cloud.bigquery.ViewDefinition$Builder",
      "com.google.cloud.bigquery.AutoValue_ViewDefinition$Builder",
      "com.google.cloud.StringEnumValue",
      "com.google.cloud.bigquery.TableDefinition$Type$1",
      "com.google.cloud.StringEnumType",
      "com.google.cloud.bigquery.TableDefinition$Type",
      "com.google.cloud.bigquery.AutoValue_ViewDefinition",
      "com.google.cloud.bigquery.TableInfo$1",
      "com.google.cloud.bigquery.TableInfo$2",
      "com.google.cloud.bigquery.TableInfo",
      "com.google.cloud.bigquery.TableInfo$Builder",
      "com.google.cloud.bigquery.TableInfo$BuilderImpl",
      "com.google.cloud.bigquery.$AutoValue_Labels",
      "com.google.cloud.bigquery.AutoValue_Labels",
      "com.google.cloud.bigquery.Labels",
      "com.google.cloud.bigquery.FormatOptions",
      "com.google.cloud.bigquery.DatastoreBackupOptions",
      "com.google.cloud.bigquery.DatastoreBackupOptions$Builder",
      "com.google.cloud.bigquery.ExternalTableDefinition$1",
      "com.google.cloud.bigquery.ExternalTableDefinition$2",
      "com.google.cloud.bigquery.ExternalTableDefinition",
      "com.google.cloud.bigquery.ExternalTableDefinition$Builder",
      "com.google.cloud.bigquery.AutoValue_ExternalTableDefinition$Builder",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.cloud.bigquery.AutoValue_ExternalTableDefinition",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.CharType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.InvalidFunctionArgumentException"
    );
  }
}
