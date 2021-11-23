/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 02:28:56 GMT 2021
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
public class BigQueryMetadata_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.plugin.bigquery.BigQueryMetadata"; 
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
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BigQueryMetadata_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.plugin.bigquery.BigQueryClient",
      "com.facebook.presto.spi.connector.ConnectorMetadata",
      "com.facebook.presto.spi.TableNotFoundException",
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.spi.NotFoundException",
      "com.facebook.presto.spi.ConnectorTableLayoutHandle",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.spi.ConnectorTableHandle",
      "com.facebook.presto.plugin.bigquery.BigQueryMetadata",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.plugin.bigquery.BigQueryException",
      "com.facebook.presto.plugin.bigquery.BigQueryConfig"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BigQueryMetadata_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.airlift.log.Logger",
      "com.facebook.presto.plugin.bigquery.BigQueryMetadata",
      "com.google.common.collect.CollectCollectors",
      "com.google.cloud.StringEnumValue",
      "com.google.cloud.bigquery.TableDefinition$Type$1",
      "com.google.cloud.StringEnumType",
      "com.google.common.base.Preconditions",
      "com.google.cloud.bigquery.TableDefinition$Type",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.plugin.bigquery.BigQueryErrorCode",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.plugin.bigquery.BigQueryConfig",
      "com.facebook.presto.plugin.bigquery.BigQueryClient",
      "com.facebook.presto.plugin.bigquery.ReadSessionCreatorConfig",
      "com.google.auth.Credentials",
      "com.google.auth.oauth2.OAuth2Credentials",
      "com.google.auth.oauth2.DefaultCredentialsProvider",
      "com.google.auth.oauth2.GoogleCredentials",
      "com.google.api.client.http.HttpTransport",
      "com.google.api.client.http.javanet.NetHttpTransport",
      "com.google.api.client.http.javanet.DefaultConnectionFactory",
      "com.google.auth.oauth2.OAuth2Utils$DefaultHttpTransportFactory",
      "com.google.api.client.json.JsonFactory",
      "com.google.api.client.json.jackson2.JacksonFactory",
      "com.fasterxml.jackson.core.TokenStreamFactory",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.core.io.CharTypes",
      "com.fasterxml.jackson.core.io.JsonStringEncoder",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$TableInfo",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo",
      "com.google.api.client.json.jackson2.JacksonFactory$InstanceHolder",
      "com.google.auth.oauth2.OAuth2Utils",
      "com.google.api.client.util.Preconditions",
      "com.facebook.presto.testing.TestingHandle",
      "com.facebook.presto.spi.SchemaTablePrefix",
      "com.facebook.presto.spi.SchemaUtil",
      "com.google.cloud.bigquery.Option",
      "com.google.cloud.bigquery.BigQuery$TableOption",
      "com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option",
      "com.google.cloud.FieldSelector$Helper$1",
      "com.google.cloud.FieldSelector$Helper",
      "com.facebook.presto.execution.TestQueryManager",
      "com.facebook.presto.spi.QueryId",
      "com.facebook.presto.spi.security.SelectedRole",
      "com.google.cloud.bigquery.DatasetId",
      "com.google.common.base.Strings",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.Platform",
      "com.facebook.presto.spi.SchemaTableName",
      "com.facebook.presto.common.type.P4HyperLogLogType",
      "com.facebook.presto.common.type.UnknownType",
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
      "com.google.api.client.json.JsonObjectParser",
      "com.google.api.client.json.JsonObjectParser$Builder",
      "com.google.api.client.util.Sets",
      "com.google.api.client.json.JsonParser",
      "com.google.api.client.json.jackson2.JacksonParser",
      "com.fasterxml.jackson.core.io.IOContext",
      "com.fasterxml.jackson.core.util.BufferRecyclers",
      "com.fasterxml.jackson.core.util.BufferRecycler",
      "com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper",
      "com.fasterxml.jackson.core.JsonEncoding",
      "com.fasterxml.jackson.core.JsonParser",
      "com.fasterxml.jackson.core.base.ParserMinimalBase",
      "com.fasterxml.jackson.core.base.ParserBase",
      "com.fasterxml.jackson.core.json.UTF8StreamJsonParser",
      "com.fasterxml.jackson.core.util.TextBuffer",
      "com.fasterxml.jackson.core.JsonStreamContext",
      "com.fasterxml.jackson.core.json.JsonReadContext",
      "com.fasterxml.jackson.core.JsonToken",
      "com.fasterxml.jackson.core.JsonProcessingException",
      "com.fasterxml.jackson.core.exc.StreamReadException",
      "com.fasterxml.jackson.core.JsonParseException",
      "com.fasterxml.jackson.core.JsonLocation"
    );
  }
}
