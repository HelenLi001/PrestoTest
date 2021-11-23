/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 21 08:24:38 GMT 2021
 */

package com.facebook.presto.druid;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DruidPushdownUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.druid.DruidPushdownUtils"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-druid"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DruidPushdownUtils_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.common.type.AbstractType",
      "com.fasterxml.jackson.annotation.JsonProperty",
      "org.openjdk.jol.util.VMSupport$MyLongs4",
      "com.facebook.presto.common.type.VariableWidthType",
      "io.airlift.slice.SliceInput",
      "org.testng.xml.XmlScript",
      "org.openjdk.jol.util.VMSupport$MyInts4",
      "io.airlift.slice.Slices",
      "com.facebook.presto.common.QualifiedObjectName",
      "com.facebook.presto.spi.plan.OrderingScheme",
      "com.facebook.drift.annotations.ThriftEnum",
      "org.openjdk.jol.util.VMSupport$MyBytes4",
      "com.facebook.presto.spi.plan.AggregationNode$Step",
      "org.openjdk.jol.util.VMSupport$MyChars4",
      "com.facebook.presto.common.block.UncheckedBlock",
      "com.facebook.presto.common.type.TimeZoneKey$1",
      "org.testng.xml.XmlDependencies",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.facebook.presto.common.predicate.Utils",
      "com.facebook.presto.common.type.TypeUtils",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "com.facebook.presto.spi.plan.LimitNode$Step",
      "com.facebook.presto.spi.plan.LimitNode",
      "org.openjdk.jol.info.ClassLayout",
      "com.facebook.presto.common.block.IntArrayBlockBuilder",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Determinism",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.spi.ErrorCode",
      "io.airlift.slice.SliceOutput",
      "com.facebook.presto.druid.DruidErrorCode",
      "com.facebook.presto.druid.DruidAggregationColumnNode",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.facebook.presto.common.type.CharType",
      "com.facebook.presto.spi.function.SqlFunction",
      "com.facebook.presto.spi.function.RoutineCharacteristics",
      "com.facebook.presto.spi.relation.SpecialFormExpression$Form",
      "io.airlift.slice.BasicSliceInput",
      "com.facebook.presto.spi.function.SqlFunctionId",
      "com.facebook.presto.common.type.FixedWidthType",
      "com.facebook.presto.common.type.encoding.BaseNCodec",
      "com.facebook.presto.spi.function.Signature",
      "org.openjdk.jol.util.VMSupport$CompressedOopsClass",
      "org.openjdk.jol.info.FieldLayout",
      "com.facebook.presto.spi.plan.AggregationNode",
      "org.openjdk.jol.datamodel.DataModel",
      "com.facebook.presto.common.NotSupportedException",
      "com.facebook.presto.spi.relation.RowExpressionVisitor",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.common.block.VariableWidthBlockBuilder",
      "com.facebook.presto.common.predicate.Primitives",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "org.openjdk.jol.info.ClassData",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.VarcharEnumType$VarcharEnumMap",
      "org.testng.xml.XmlMethodSelectors",
      "com.facebook.presto.spi.relation.CallExpression",
      "com.facebook.presto.common.type.UserDefinedType",
      "com.facebook.presto.spi.relation.SpecialFormExpression",
      "com.google.common.collect.ImmutableCollection$Builder",
      "org.openjdk.jol.util.VMSupport$HeaderClass",
      "com.facebook.presto.common.block.ByteArrayBlock",
      "com.facebook.presto.spi.function.FunctionVersion",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.spi.relation.LambdaDefinitionExpression",
      "com.facebook.presto.common.type.VarcharType",
      "org.openjdk.jol.util.VMSupport$MyDoubles4",
      "com.facebook.presto.spi.plan.ProjectNode$Locality",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.facebook.presto.common.function.SqlFunctionProperties$Builder",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.UnscaledDecimal128Arithmetic",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "com.facebook.presto.spi.relation.InputReferenceExpression",
      "org.openjdk.jol.util.VMSupport$MyBooleans4",
      "com.facebook.presto.spi.function.FunctionKind",
      "com.facebook.presto.spi.function.LongVariableConstraint",
      "com.facebook.presto.spi.plan.UnionNode",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Builder",
      "com.facebook.presto.spi.plan.ExceptNode",
      "io.airlift.slice.DynamicSliceOutput",
      "com.facebook.presto.common.type.TimeZoneNotSupportedException",
      "com.facebook.presto.common.type.IntegerType",
      "com.google.common.collect.ImmutableList",
      "org.openjdk.jol.util.VMSupport$MyObject5",
      "org.openjdk.jol.util.VMSupport$MyObject3",
      "org.openjdk.jol.util.VMSupport$MyObject4",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "org.openjdk.jol.util.VMSupport$MyObject2",
      "com.facebook.presto.spi.plan.TopNNode$Step",
      "com.facebook.presto.common.type.Type",
      "com.facebook.presto.common.type.NamedTypeSignature",
      "com.facebook.presto.spi.security.SelectedRole",
      "com.fasterxml.jackson.annotation.JsonSubTypes",
      "com.facebook.presto.spi.function.RoutineCharacteristics$NullCallClause",
      "org.openjdk.jol.util.VMSupport$MyFloats4",
      "com.facebook.presto.common.type.Decimals",
      "com.facebook.drift.annotations.ThriftStruct",
      "com.facebook.presto.spi.plan.PlanNode",
      "com.facebook.presto.spi.function.FunctionHandle",
      "com.fasterxml.jackson.annotation.JsonCreator",
      "com.facebook.presto.common.CatalogSchemaName",
      "com.facebook.presto.druid.DruidPushdownUtils",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.DecimalParseResult",
      "com.google.common.collect.ImmutableList$SubList",
      "com.facebook.presto.spi.function.SqlInvokedFunction",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.spi.plan.ValuesNode",
      "com.google.common.collect.RegularImmutableList",
      "org.openjdk.jol.info.FieldData",
      "org.testng.xml.XmlTest",
      "com.facebook.presto.spi.plan.AggregationNode$GroupingSetDescriptor",
      "com.facebook.presto.common.type.UnknownType",
      "com.facebook.presto.common.block.BlockBuilder",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "org.testng.xml.XmlSuite",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.facebook.presto.spi.ConnectorSession",
      "com.facebook.drift.annotations.ThriftIdlAnnotation",
      "org.testng.xml.XmlSuite$ParallelMode",
      "com.facebook.presto.spi.plan.ProjectNode",
      "com.facebook.presto.common.block.AbstractVariableWidthBlock",
      "io.airlift.slice.SliceTooLargeException",
      "com.facebook.presto.common.GenericInternalException",
      "org.openjdk.jol.util.VMSupport$SizeInfo",
      "com.facebook.presto.spi.function.RoutineCharacteristics$Language",
      "com.facebook.presto.common.type.DecimalType",
      "io.airlift.slice.Slice",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.spi.plan.Assignments",
      "com.facebook.presto.spi.relation.ConstantExpression",
      "com.facebook.presto.spi.plan.DistinctLimitNode",
      "com.facebook.presto.spi.TableHandle",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "org.testng.ITestObjectFactory",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.google.common.collect.ImmutableList$1",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "com.facebook.presto.common.type.TimeZoneKey",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$None",
      "com.facebook.presto.spi.plan.TableScanNode",
      "com.facebook.presto.spi.plan.TopNNode",
      "com.facebook.presto.druid.DruidAggregationColumnNode$ExpressionType",
      "com.google.common.collect.UnmodifiableIterator",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "com.facebook.presto.spi.plan.IntersectNode",
      "com.facebook.presto.spi.relation.VariableReferenceExpression",
      "com.facebook.presto.spi.plan.PlanVisitor",
      "com.facebook.presto.spi.security.SelectedRole$Type",
      "org.openjdk.jol.util.VMSupport",
      "org.testng.xml.XmlDefine",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.facebook.presto.spi.function.SqlFunctionHandle",
      "com.google.common.collect.SingletonImmutableList",
      "org.testng.xml.XmlRun",
      "com.facebook.presto.spi.plan.SetOperationNode",
      "com.google.common.collect.AbstractIndexedListIterator",
      "org.testng.xml.XmlGroups",
      "com.facebook.presto.common.block.ByteArrayBlockBuilder",
      "io.airlift.slice.BasicSliceOutput",
      "com.facebook.presto.common.type.TypeSignature$EnumMapParsingData",
      "com.facebook.presto.spi.function.SqlFunctionVisibility",
      "com.facebook.presto.common.type.encoding.Base32",
      "io.airlift.slice.FixedLengthSliceInput",
      "com.facebook.presto.common.type.SmallintType",
      "com.fasterxml.jackson.annotation.JsonTypeInfo",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.MathUtil",
      "org.openjdk.jol.util.VMSupport$1",
      "com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.spi.plan.MarkDistinctNode",
      "com.facebook.presto.common.type.encoding.BaseNCodec$Context",
      "com.facebook.presto.spi.plan.PlanNodeId",
      "com.facebook.presto.common.block.Int128ArrayBlockBuilder",
      "com.facebook.presto.common.type.BooleanType",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "org.testng.xml.XmlMethodSelector",
      "com.facebook.presto.spi.PrestoException",
      "org.openjdk.jol.datamodel.CurrentDataModel",
      "org.testng.TestNGException",
      "org.openjdk.jol.util.VMSupport$MyShorts4",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.spi.plan.AggregationNode$Aggregation",
      "com.facebook.presto.common.block.PageBuilderStatus",
      "com.facebook.presto.spi.plan.FilterNode",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.spi.relation.RowExpression",
      "com.fasterxml.jackson.annotation.JsonSubTypes$Type",
      "com.facebook.presto.common.type.BigintEnumType$LongEnumMap",
      "com.facebook.presto.spi.function.TypeVariableConstraint",
      "org.openjdk.jol.layouters.Layouter",
      "com.facebook.presto.common.predicate.TupleDomain",
      "com.facebook.presto.spi.security.ConnectorIdentity",
      "com.facebook.presto.common.block.LongArrayBlockBuilder",
      "com.facebook.presto.common.block.Block"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.spi.ConnectorSession", false, DruidPushdownUtils_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DruidPushdownUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.druid.DruidPushdownUtils",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$Id",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.druid.DruidErrorCode",
      "com.facebook.presto.common.type.Decimals",
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
      "io.airlift.slice.Slice",
      "io.airlift.slice.Slices",
      "com.facebook.presto.common.type.UnscaledDecimal128Arithmetic",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.facebook.presto.common.type.AbstractType",
      "com.facebook.presto.common.type.AbstractVariableWidthType",
      "com.facebook.presto.common.type.CharType",
      "com.facebook.presto.common.type.TypeSignature",
      "com.facebook.presto.common.type.TypeSignatureParameter",
      "com.facebook.presto.common.type.ParameterKind",
      "com.facebook.presto.common.type.TypeSignatureBase",
      "com.facebook.presto.common.type.TypeSignatureParameter$1",
      "com.facebook.presto.common.type.AbstractVarcharType",
      "com.facebook.presto.common.type.VarcharType",
      "com.facebook.presto.common.type.BooleanType",
      "com.facebook.presto.common.block.BlockBuilderStatus",
      "com.facebook.presto.common.block.AbstractVariableWidthBlock",
      "com.facebook.presto.common.block.VariableWidthBlockBuilder",
      "com.facebook.presto.common.block.ByteArrayBlock",
      "com.facebook.presto.spi.relation.RowExpression",
      "com.facebook.presto.spi.relation.ConstantExpression",
      "com.facebook.presto.common.predicate.Primitives",
      "com.facebook.presto.common.type.AbstractIntType",
      "com.facebook.presto.common.type.IntegerType",
      "com.facebook.presto.common.block.ByteArrayBlockBuilder",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.common.type.DecimalType",
      "com.facebook.presto.common.type.LongDecimalType",
      "com.facebook.presto.common.InvalidFunctionArgumentException",
      "com.facebook.presto.common.block.IntArrayBlockBuilder",
      "com.facebook.presto.spi.relation.InputReferenceExpression",
      "com.facebook.presto.common.predicate.Utils",
      "com.facebook.presto.common.type.TypeUtils",
      "com.facebook.presto.common.type.ShortDecimalType",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.spi.relation.SpecialFormExpression",
      "com.facebook.presto.spi.relation.VariableReferenceExpression",
      "com.facebook.presto.common.block.Int128ArrayBlockBuilder",
      "com.facebook.presto.common.function.SqlFunctionProperties",
      "com.facebook.presto.common.type.AbstractLongType",
      "com.facebook.presto.common.type.BigintType",
      "com.facebook.presto.common.block.LongArrayBlockBuilder",
      "com.facebook.presto.spi.plan.PlanNodeId",
      "com.facebook.presto.spi.plan.PlanNode",
      "com.facebook.presto.spi.plan.AggregationNode",
      "com.facebook.presto.spi.plan.AggregationNode$GroupingSetDescriptor",
      "com.facebook.presto.spi.relation.CallExpression",
      "com.facebook.presto.common.type.SmallintType",
      "com.facebook.presto.spi.plan.AggregationNode$Aggregation",
      "org.testng.xml.XmlSuite$ParallelMode",
      "org.testng.xml.XmlSuite$FailurePolicy",
      "org.testng.xml.XmlSuite",
      "com.facebook.presto.common.type.UnknownType"
    );
  }
}
