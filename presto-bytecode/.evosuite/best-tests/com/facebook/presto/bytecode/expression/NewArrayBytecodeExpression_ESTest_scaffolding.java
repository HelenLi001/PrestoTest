/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 18 22:04:09 GMT 2021
 */

package com.facebook.presto.bytecode.expression;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class NewArrayBytecodeExpression_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.bytecode.expression.NewArrayBytecodeExpression"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-bytecode"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NewArrayBytecodeExpression_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant",
      "org.objectweb.asm.MethodVisitor",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedFloatConstant",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.bytecode.BytecodeVisitor",
      "org.objectweb.asm.Type",
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.google.common.collect.PeekingIterator",
      "com.facebook.presto.bytecode.expression.InstanceOfBytecodeExpression",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.bytecode.instruction.Constant$FloatConstant",
      "com.facebook.presto.bytecode.instruction.Constant$BooleanConstant",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.facebook.presto.bytecode.expression.SetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.expression.GetElementBytecodeExpression",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.facebook.presto.bytecode.expression.ArrayLengthBytecodeExpression",
      "com.google.common.collect.Iterators$9",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedIntegerConstant",
      "com.facebook.presto.bytecode.expression.SetArrayElementBytecodeExpression",
      "com.facebook.presto.bytecode.expression.ConstantBytecodeExpression",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$1",
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.facebook.presto.bytecode.expression.OrBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedLongConstant",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Iterators$10",
      "com.facebook.presto.bytecode.expression.InvokeBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.InstructionNode",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression",
      "com.facebook.presto.bytecode.expression.NewInstanceBytecodeExpression",
      "com.facebook.presto.bytecode.expression.InlineIfBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedBooleanConstant",
      "com.facebook.presto.bytecode.expression.ReturnBytecodeExpression",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.ImmutableAsList",
      "com.facebook.presto.bytecode.expression.BytecodeExpressions",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.bytecode.instruction.Constant$NullConstant",
      "com.google.common.collect.Iterators",
      "com.google.common.base.Strings",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedDoubleConstant",
      "com.facebook.presto.bytecode.instruction.Constant$DoubleConstant",
      "com.facebook.presto.bytecode.instruction.Constant$LongConstant",
      "com.facebook.presto.bytecode.expression.InvokeDynamicBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$IntConstant",
      "com.google.common.collect.AbstractIterator",
      "com.facebook.presto.bytecode.expression.NegateBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$StringConstant",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.bytecode.expression.PopBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$ClassConstant",
      "com.facebook.presto.bytecode.BytecodeNode",
      "com.facebook.presto.bytecode.expression.NewArrayBytecodeExpression",
      "com.facebook.presto.bytecode.expression.NotBytecodeExpression",
      "com.facebook.presto.bytecode.expression.GetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.FieldDefinition",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.bytecode.expression.AndBytecodeExpression",
      "com.facebook.presto.bytecode.ParameterizedType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NewArrayBytecodeExpression_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.facebook.presto.bytecode.expression.NewArrayBytecodeExpression",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.facebook.presto.bytecode.OpCode",
      "com.facebook.presto.bytecode.ArrayOpCode$AType",
      "com.facebook.presto.bytecode.ArrayOpCode",
      "com.facebook.presto.bytecode.expression.BytecodeExpressions",
      "com.facebook.presto.bytecode.expression.ConstantBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant",
      "com.facebook.presto.bytecode.instruction.Constant$IntConstant",
      "com.facebook.presto.bytecode.ParameterizedType",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.base.Strings",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "org.objectweb.asm.Type",
      "com.facebook.presto.bytecode.Variable",
      "com.facebook.presto.bytecode.Parameter",
      "com.facebook.presto.bytecode.expression.GetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.ClassDefinition",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.primitives.Primitives",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.bytecode.AnnotationDefinition",
      "com.google.common.collect.SingletonImmutableList",
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Iterables",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.google.common.collect.Lists",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.FluentIterable",
      "com.google.common.collect.Iterables$5",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Iterators$6",
      "com.facebook.presto.bytecode.Scope",
      "com.facebook.presto.bytecode.expression.InvokeBytecodeExpression",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.presto.bytecode.expression.AndBytecodeExpression",
      "com.facebook.presto.bytecode.Variable$SetVariableBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction",
      "com.facebook.presto.bytecode.expression.ReturnBytecodeExpression",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression$TypeKind",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression$1",
      "com.facebook.presto.bytecode.instruction.TypeInstruction",
      "com.facebook.presto.bytecode.expression.GetElementBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.VariableInstruction",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$IncrementVariableInstruction",
      "com.facebook.presto.bytecode.expression.ArithmeticBytecodeExpression",
      "com.facebook.presto.bytecode.expression.ArithmeticBytecodeExpression$1",
      "com.facebook.presto.bytecode.expression.InstanceOfBytecodeExpression",
      "org.objectweb.asm.MethodVisitor",
      "org.objectweb.asm.tree.MethodNode",
      "org.objectweb.asm.tree.InsnList",
      "org.objectweb.asm.util.CheckMethodAdapter$Method",
      "org.objectweb.asm.util.CheckMethodAdapter",
      "org.objectweb.asm.util.CheckMethodAdapter$1",
      "org.objectweb.asm.tree.Util",
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.facebook.presto.bytecode.expression.ComparisonBytecodeExpression",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedIntegerConstant",
      "com.facebook.presto.bytecode.expression.SetArrayElementBytecodeExpression",
      "com.facebook.presto.bytecode.expression.PopBytecodeExpression",
      "com.facebook.presto.bytecode.expression.InlineIfBytecodeExpression",
      "org.objectweb.asm.util.Printer",
      "org.objectweb.asm.util.ASMifier",
      "org.objectweb.asm.util.TraceMethodVisitor",
      "org.objectweb.asm.tree.AbstractInsnNode",
      "org.objectweb.asm.tree.FrameNode",
      "org.objectweb.asm.TypePath",
      "org.objectweb.asm.ByteVector",
      "org.objectweb.asm.util.Textifier",
      "com.facebook.presto.bytecode.expression.OrBytecodeExpression",
      "org.objectweb.asm.tree.InsnNode",
      "com.facebook.presto.bytecode.FieldDefinition",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableEnumSet",
      "com.facebook.presto.bytecode.expression.ArrayLengthBytecodeExpression",
      "org.objectweb.asm.tree.VarInsnNode",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedFloatConstant",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedBooleanConstant",
      "com.facebook.presto.bytecode.expression.SetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$LongConstant",
      "com.facebook.presto.bytecode.instruction.Constant$ClassConstant",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction$InvokeDynamicInstruction",
      "com.facebook.presto.bytecode.instruction.Constant$NullConstant",
      "com.google.common.collect.SingletonImmutableSet",
      "com.facebook.presto.bytecode.expression.NegateBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$BooleanConstant",
      "com.facebook.presto.bytecode.instruction.Constant$DoubleConstant",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$LoadVariableInstruction",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedLongConstant",
      "com.facebook.presto.bytecode.Binding",
      "com.facebook.presto.bytecode.expression.NotBytecodeExpression",
      "com.facebook.presto.bytecode.StaticTypeBytecodeExpression",
      "com.facebook.presto.bytecode.BytecodeVisitor",
      "com.facebook.presto.bytecode.control.WhileLoop",
      "com.facebook.presto.bytecode.instruction.LabelNode",
      "org.objectweb.asm.Label",
      "com.facebook.presto.bytecode.instruction.FieldInstruction",
      "com.facebook.presto.bytecode.instruction.FieldInstruction$PutFieldInstruction",
      "com.facebook.presto.bytecode.instruction.Constant$FloatConstant",
      "com.facebook.presto.bytecode.instruction.Constant$StringConstant",
      "com.facebook.presto.bytecode.expression.NewInstanceBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedDoubleConstant",
      "org.objectweb.asm.tree.ParameterNode",
      "org.objectweb.asm.ClassReader",
      "com.google.common.primitives.Ints"
    );
  }
}
