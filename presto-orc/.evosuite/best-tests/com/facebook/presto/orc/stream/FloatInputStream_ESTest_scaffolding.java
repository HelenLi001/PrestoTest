/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 20 19:36:06 GMT 2021
 */

package com.facebook.presto.orc.stream;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FloatInputStream_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.orc.stream.FloatInputStream"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-orc"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FloatInputStream_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "org.openjdk.jol.util.VMSupport$MyLongs4",
      "com.facebook.presto.common.type.VariableWidthType",
      "io.airlift.slice.SliceInput",
      "com.facebook.presto.common.type.BigintEnumType",
      "com.facebook.presto.common.type.TypeSignature",
      "org.openjdk.jol.util.VMSupport$MyInts4",
      "com.facebook.presto.common.type.JsonType",
      "com.facebook.presto.common.block.AbstractSingleRowBlock",
      "org.openjdk.jol.info.FieldData",
      "com.facebook.presto.common.block.RowBlockBuilder",
      "com.facebook.presto.common.type.UnknownType",
      "org.openjdk.jol.util.VMSupport$MyBytes4",
      "com.facebook.presto.common.type.TDigestType",
      "com.facebook.presto.common.block.BlockBuilder",
      "org.openjdk.jol.util.VMSupport$MyChars4",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.facebook.presto.common.type.HyperLogLogType",
      "com.facebook.presto.common.type.LongDecimalType",
      "org.openjdk.jol.info.ClassLayout",
      "com.facebook.presto.common.type.StatisticalDigestType",
      "com.facebook.presto.common.block.AbstractVariableWidthBlock",
      "com.facebook.presto.common.block.IntArrayBlockBuilder",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.orc.stream.OrcInputStream",
      "io.airlift.slice.Slice",
      "com.facebook.presto.common.type.DecimalType",
      "com.facebook.presto.common.type.P4HyperLogLogType",
      "com.facebook.presto.orc.stream.FloatInputStream",
      "io.airlift.slice.SliceOutput",
      "com.facebook.presto.orc.OrcLocalMemoryContext",
      "com.facebook.presto.common.type.ArrayType",
      "com.facebook.presto.common.type.CharType",
      "com.facebook.presto.orc.OrcDataSourceId",
      "com.facebook.presto.orc.OrcDecompressor",
      "com.facebook.presto.common.type.EnumType",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.orc.stream.SharedBuffer",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.FunctionType",
      "io.airlift.slice.BasicSliceInput",
      "com.facebook.presto.orc.metadata.OrcType$OrcTypeKind",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.facebook.presto.common.block.ArrayBlockBuilder",
      "com.facebook.presto.common.type.DoubleType",
      "com.facebook.presto.common.type.RowType",
      "com.facebook.presto.orc.OrcDecompressor$OutputBuffer",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "com.facebook.presto.common.block.VariableWidthBlockBuilder",
      "com.facebook.presto.common.block.SingleRowBlockWriter",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "org.openjdk.jol.util.VMSupport",
      "com.fasterxml.jackson.annotation.JsonValue",
      "com.facebook.presto.common.block.SingleArrayBlockWriter",
      "org.openjdk.jol.info.ClassData",
      "com.facebook.presto.common.block.MapBlockBuilder",
      "com.facebook.presto.common.type.TimeWithTimeZoneType",
      "com.facebook.presto.common.type.VarcharEnumType",
      "com.facebook.presto.common.type.TinyintType",
      "org.openjdk.jol.util.VMSupport$HeaderClass",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.block.AbstractSingleArrayBlock",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.RealType",
      "com.facebook.presto.common.block.ByteArrayBlockBuilder",
      "org.openjdk.jol.util.VMSupport$MyDoubles4",
      "com.facebook.presto.common.type.TimestampWithTimeZoneType",
      "com.facebook.presto.common.type.SmallintType",
      "io.airlift.slice.FixedLengthSliceInput",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.QuantileDigestType",
      "com.facebook.presto.common.type.VarbinaryType",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.MathUtil",
      "com.facebook.presto.orc.stream.ValueInputStream",
      "com.facebook.presto.common.block.ShortArrayBlockBuilder",
      "org.openjdk.jol.util.VMSupport$1",
      "com.facebook.presto.common.type.TimestampType",
      "com.facebook.presto.orc.DwrfDataEncryptor",
      "org.openjdk.jol.util.VMSupport$MyBooleans4",
      "com.facebook.presto.common.type.MapType",
      "com.facebook.presto.common.block.Int128ArrayBlockBuilder",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.block.AbstractMapBlock",
      "com.facebook.presto.orc.checkpoint.FloatStreamCheckpoint",
      "com.facebook.presto.common.block.AbstractSingleMapBlock",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "org.openjdk.jol.util.VMSupport$MyShorts4",
      "com.facebook.presto.common.type.IntegerType",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.orc.metadata.OrcType",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.common.type.TypeWithName",
      "com.facebook.presto.orc.OrcAggregatedMemoryContext",
      "com.facebook.presto.common.block.SingleMapBlockWriter",
      "com.facebook.presto.common.block.AbstractRowBlock",
      "com.facebook.presto.orc.OrcCorruptionException",
      "com.facebook.presto.orc.checkpoint.StreamCheckpoint",
      "com.facebook.presto.common.type.KdbTreeType",
      "com.facebook.presto.common.block.AbstractArrayBlock",
      "org.openjdk.jol.layouters.Layouter",
      "com.facebook.presto.orc.checkpoint.Checkpoints$ColumnPositionsList",
      "org.openjdk.jol.util.VMSupport$MyFloats4",
      "com.facebook.presto.common.type.TimeType",
      "com.facebook.presto.common.block.LongArrayBlockBuilder",
      "com.facebook.presto.common.block.Block",
      "com.facebook.presto.common.type.DateType"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.common.block.BlockBuilder", false, FloatInputStream_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.common.type.Type", false, FloatInputStream_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.orc.checkpoint.FloatStreamCheckpoint", false, FloatInputStream_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.orc.stream.OrcInputStream", false, FloatInputStream_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FloatInputStream_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.orc.stream.FloatInputStream",
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
      "com.facebook.presto.orc.stream.OrcInputStream",
      "com.facebook.presto.orc.checkpoint.FloatStreamCheckpoint"
    );
  }
}
