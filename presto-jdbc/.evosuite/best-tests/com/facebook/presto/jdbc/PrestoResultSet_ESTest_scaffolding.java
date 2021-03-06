/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 22 18:47:06 GMT 2021
 */

package com.facebook.presto.jdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PrestoResultSet_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.jdbc.PrestoResultSet"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-jdbc"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PrestoResultSet_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.annotation.JsonProperty",
      "org.joda.time.DateTimeZone",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId",
      "com.facebook.presto.jdbc.PrestoIntervalDayTime",
      "org.joda.time.format.DateTimeParser",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "com.facebook.presto.client.QueryError",
      "com.facebook.presto.client.QueryData",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.fasterxml.jackson.annotation.JsonValue",
      "org.joda.time.JodaTimePermission",
      "com.facebook.presto.jdbc.WarningsManager",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.DateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.format.ISODateTimeFormat",
      "com.google.common.base.Verify",
      "com.facebook.presto.common.type.TimeZoneKey$1",
      "org.joda.time.format.InternalPrinterDateTimePrinter",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.jdbc.ColumnInfo",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.tz.Provider",
      "com.facebook.drift.annotations.ThriftIdlAnnotation",
      "com.facebook.presto.client.FailureInfo$FailureException",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "org.joda.time.DurationFieldType",
      "org.joda.time.format.DateTimePrinter",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.tz.NameProvider",
      "com.facebook.drift.annotations.ThriftField",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "com.facebook.presto.jdbc.PrestoIntervalYearMonth",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.tz.ZoneInfoProvider$1",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "com.facebook.presto.client.StatementStats",
      "com.facebook.presto.client.StatementClient",
      "org.joda.time.format.InternalPrinter",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.format.DateTimePrinterInternalPrinter",
      "com.facebook.presto.client.Column",
      "org.joda.time.chrono.AssembledChronology",
      "com.facebook.presto.common.type.TimeZoneNotSupportedException",
      "com.facebook.presto.jdbc.NotImplementedException",
      "com.facebook.presto.client.FailureInfo",
      "org.joda.time.tz.ZoneInfoProvider",
      "com.facebook.presto.client.ErrorLocation",
      "com.facebook.presto.jdbc.QueryStats",
      "com.facebook.presto.spi.PrestoWarning",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.chrono.BaseChronology",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.jdbc.PrestoResultSet",
      "com.google.common.base.VerifyException",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "com.facebook.presto.spi.security.SelectedRole",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "org.joda.time.format.DateTimeFormatter",
      "com.facebook.presto.client.QueryStatusInfo",
      "org.joda.time.Chronology",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.tz.FixedDateTimeZone",
      "com.facebook.drift.annotations.ThriftStruct",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.format.DateTimeParserInternalParser",
      "com.facebook.drift.annotations.ThriftConstructor",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.UTCDateTimeZone",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "com.facebook.presto.jdbc.PrestoSqlWarning",
      "com.facebook.presto.common.type.TimeZoneKey",
      "org.joda.time.format.InternalParserDateTimeParser",
      "org.joda.time.format.InternalParser",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "org.joda.time.DurationFieldType$StandardDurationFieldType"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.client.FailureInfo", false, PrestoResultSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.client.QueryError", false, PrestoResultSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.client.QueryStatusInfo", false, PrestoResultSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.client.StatementClient", false, PrestoResultSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.common.type.TimeZoneKey", false, PrestoResultSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.jdbc.WarningsManager", false, PrestoResultSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.sql.Statement", false, PrestoResultSet_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.Consumer", false, PrestoResultSet_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PrestoResultSet_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.format.InternalParserDateTimeParser",
      "org.joda.time.format.DateTimeParserInternalParser",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.format.DateTimePrinterInternalPrinter",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.tz.ZoneInfoProvider$1",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId",
      "org.joda.time.format.InternalPrinterDateTimePrinter",
      "com.facebook.presto.jdbc.PrestoResultSet",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.AbstractIterator",
      "com.facebook.presto.jdbc.PrestoResultSet$ResultsPageIterator",
      "org.joda.time.Chronology",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.format.FormatUtils",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.TypeSignature$RowTypeSignatureParsingState",
      "com.facebook.presto.common.type.TypeSignature$1",
      "com.facebook.presto.common.type.TypeSignature$EnumMapParsingState",
      "com.facebook.presto.jdbc.ColumnInfo$Nullable",
      "com.facebook.presto.jdbc.ColumnInfo",
      "com.facebook.presto.jdbc.ColumnInfo$1",
      "com.facebook.presto.client.IntervalYearMonth",
      "com.facebook.presto.client.IntervalDayTime",
      "com.facebook.presto.jdbc.WarningsManager",
      "com.facebook.drift.annotations.ThriftField$Requiredness",
      "com.facebook.drift.annotations.ThriftField$Recursiveness",
      "com.facebook.presto.common.type.TimeZoneKey$1",
      "com.facebook.presto.common.type.TimeZoneKey",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.tz.CachedDateTimeZone",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.facebook.presto.client.QueryError",
      "com.google.common.base.Verify",
      "com.google.common.base.VerifyException",
      "com.facebook.presto.jdbc.QueryStats",
      "com.google.common.base.Strings",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.Platform",
      "okhttp3.OkHttpClient$Builder",
      "okhttp3.Dispatcher",
      "okhttp3.Protocol",
      "okhttp3.ResponseBody",
      "okio.Buffer",
      "okio.Util",
      "okhttp3.ResponseBody$1",
      "okhttp3.RequestBody",
      "okhttp3.RequestBody$2",
      "okio.ByteString",
      "okhttp3.internal.Util$1",
      "okhttp3.internal.Util",
      "okhttp3.CipherSuite$1",
      "okhttp3.CipherSuite",
      "okhttp3.ConnectionSpec$Builder",
      "okhttp3.TlsVersion",
      "okhttp3.ConnectionSpec",
      "okhttp3.internal.Internal",
      "okhttp3.OkHttpClient$1",
      "okhttp3.OkHttpClient",
      "okhttp3.EventListener$1",
      "okhttp3.EventListener",
      "okhttp3.EventListener$2",
      "okhttp3.CookieJar$1",
      "okhttp3.CookieJar",
      "okhttp3.internal.tls.OkHostnameVerifier",
      "okhttp3.CertificatePinner$Builder",
      "okhttp3.CertificatePinner",
      "okhttp3.Authenticator$1",
      "okhttp3.Authenticator",
      "okhttp3.internal.Util$2",
      "okhttp3.ConnectionPool",
      "okhttp3.ConnectionPool$1",
      "okhttp3.internal.connection.RouteDatabase",
      "okhttp3.Dns$1",
      "okhttp3.Dns",
      "com.facebook.presto.client.OkHttpUtil",
      "com.facebook.presto.client.SocketChannelSocketFactory",
      "okhttp3.internal.tls.CertificateChainCleaner",
      "okhttp3.internal.platform.AndroidPlatform",
      "okhttp3.internal.platform.Jdk9Platform",
      "okhttp3.internal.platform.Platform",
      "okhttp3.internal.tls.BasicCertificateChainCleaner",
      "okhttp3.internal.tls.BasicTrustRootIndex",
      "com.facebook.presto.jdbc.PrestoDriver",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread$1",
      "com.mysql.jdbc.AbandonedConnectionCleanupThread",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.fabric.jdbc.FabricMySQLDriver",
      "org.h2.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.facebook.presto.client.FailureInfo",
      "com.facebook.presto.client.StatementStats",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.format.DateTimeParserBucket",
      "com.facebook.presto.client.StageStats",
      "com.facebook.presto.jdbc.StageStats"
    );
  }
}
