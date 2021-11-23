/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 22 18:58:29 GMT 2021
 */

package com.facebook.presto.jdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PrestoSqlWarning_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.jdbc.PrestoSqlWarning"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-jdbc"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PrestoSqlWarning_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.drift.annotations.ThriftIdlAnnotation",
      "com.facebook.presto.jdbc.PrestoSqlWarning",
      "com.facebook.presto.spi.StandardWarningCode",
      "com.facebook.presto.spi.WarningCodeSupplier",
      "com.facebook.presto.spi.PrestoWarning",
      "com.facebook.drift.annotations.ThriftStruct",
      "com.facebook.presto.spi.WarningCode"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PrestoSqlWarning_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.jdbc.PrestoSqlWarning",
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
      "com.facebook.presto.spi.PrestoWarning",
      "io.airlift.slice.SliceOutput",
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
      "io.airlift.slice.DynamicSliceOutput",
      "io.airlift.slice.Slice",
      "io.airlift.slice.Slices",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.util.ClassUtil",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.ValueInstantiators$Base",
      "com.fasterxml.jackson.databind.util.ArrayBuilders",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
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
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
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
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
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
      "com.fasterxml.jackson.databind.ObjectReader",
      "com.fasterxml.jackson.core.io.IOContext",
      "com.fasterxml.jackson.core.util.BufferRecyclers",
      "com.fasterxml.jackson.core.util.BufferRecycler",
      "com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper",
      "com.fasterxml.jackson.core.util.ByteArrayBuilder",
      "org.antlr.v4.runtime.atn.ATN",
      "org.antlr.v4.runtime.atn.ATNState",
      "org.antlr.v4.runtime.dfa.DFA",
      "org.antlr.v4.runtime.atn.Transition$1",
      "org.antlr.v4.runtime.atn.Transition",
      "org.antlr.v4.runtime.atn.AbstractPredicateTransition",
      "org.antlr.v4.runtime.atn.PrecedencePredicateTransition",
      "org.glassfish.jersey.uri.UriTemplate$1",
      "org.glassfish.jersey.uri.PatternWithGroups$EmptyStringMatchResult",
      "org.glassfish.jersey.uri.PatternWithGroups",
      "org.glassfish.jersey.uri.UriTemplate",
      "org.antlr.v4.runtime.Recognizer",
      "org.antlr.v4.runtime.Parser",
      "org.antlr.v4.runtime.RuntimeMetaData",
      "org.antlr.v4.runtime.atn.PredictionContextCache",
      "org.antlr.v4.runtime.VocabularyImpl",
      "org.antlr.v4.runtime.atn.ATNDeserializer",
      "org.antlr.v4.runtime.atn.ATNDeserializationOptions",
      "com.facebook.presto.sql.parser.SqlBaseParser",
      "org.antlr.v4.runtime.CommonTokenFactory",
      "org.antlr.v4.runtime.ListTokenSource",
      "org.antlr.v4.runtime.UnbufferedCharStream",
      "com.facebook.presto.spi.WarningCode",
      "com.facebook.presto.spi.StandardWarningCode"
    );
  }
}
