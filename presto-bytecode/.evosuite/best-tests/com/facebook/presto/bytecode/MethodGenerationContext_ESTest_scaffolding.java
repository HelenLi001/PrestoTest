/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 18 22:00:46 GMT 2021
 */

package com.facebook.presto.bytecode;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MethodGenerationContext_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.bytecode.MethodGenerationContext"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MethodGenerationContext_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.asm.SymbolTable$Entry",
      "org.objectweb.asm.tree.FieldInsnNode",
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.google.common.collect.ImmutableList$SubList",
      "org.objectweb.asm.tree.analysis.AnalyzerException",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.facebook.presto.bytecode.BytecodeVisitor",
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.facebook.presto.bytecode.AnnotationDefinition",
      "com.google.common.collect.PeekingIterator",
      "org.objectweb.asm.SymbolTable",
      "org.objectweb.asm.ModuleWriter",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.FluentIterable",
      "com.google.common.base.Optional",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.facebook.presto.bytecode.expression.SetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.expression.GetElementBytecodeExpression",
      "com.google.common.collect.Iterators$ArrayItr",
      "org.objectweb.asm.Frame",
      "com.facebook.presto.bytecode.expression.ArrayLengthBytecodeExpression",
      "org.objectweb.asm.util.ASMifier",
      "com.facebook.presto.bytecode.Variable",
      "com.facebook.presto.bytecode.Parameter",
      "com.facebook.presto.bytecode.expression.SetArrayElementBytecodeExpression",
      "org.objectweb.asm.CurrentFrame",
      "org.objectweb.asm.tree.Util",
      "com.google.common.collect.Iterators$10",
      "com.facebook.presto.bytecode.Scope",
      "com.facebook.presto.bytecode.instruction.InstructionNode",
      "org.objectweb.asm.tree.VarInsnNode",
      "org.objectweb.asm.MethodWriter",
      "com.google.common.base.Present",
      "org.objectweb.asm.ClassTooLargeException",
      "org.objectweb.asm.util.TraceMethodVisitor",
      "com.facebook.presto.bytecode.expression.ReturnBytecodeExpression",
      "org.objectweb.asm.tree.AnnotationNode",
      "org.objectweb.asm.ClassWriter",
      "org.objectweb.asm.tree.MethodInsnNode",
      "org.objectweb.asm.AnnotationVisitor",
      "com.google.common.collect.Iterables",
      "org.objectweb.asm.tree.LineNumberNode",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "org.objectweb.asm.tree.IntInsnNode",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.bytecode.MethodGenerationContext$ScopeContext",
      "org.objectweb.asm.util.CheckMethodAdapter$Method",
      "com.facebook.presto.bytecode.debug.DebugNode",
      "com.google.common.base.Strings",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "org.objectweb.asm.tree.LocalVariableNode",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.objectweb.asm.Attribute",
      "org.objectweb.asm.tree.JumpInsnNode",
      "org.objectweb.asm.MethodTooLargeException",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "org.objectweb.asm.ByteVector",
      "org.objectweb.asm.Opcodes",
      "com.facebook.presto.bytecode.Access",
      "com.google.common.base.Absent",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.presto.bytecode.Variable$SetVariableBytecodeExpression",
      "org.objectweb.asm.tree.InsnList",
      "org.objectweb.asm.tree.analysis.BasicVerifier",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.google.common.collect.ImmutableList$1",
      "org.objectweb.asm.Handle",
      "org.objectweb.asm.util.Printer",
      "org.objectweb.asm.util.CheckMethodAdapter$1",
      "org.objectweb.asm.AnnotationWriter",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "org.objectweb.asm.tree.LookupSwitchInsnNode",
      "org.objectweb.asm.tree.analysis.BasicInterpreter",
      "com.facebook.presto.bytecode.ParameterizedType",
      "org.objectweb.asm.util.CheckMethodAdapter",
      "org.objectweb.asm.tree.TableSwitchInsnNode",
      "org.objectweb.asm.MethodVisitor",
      "org.objectweb.asm.FieldWriter",
      "org.objectweb.asm.tree.IincInsnNode",
      "com.google.common.collect.ImmutableCollection",
      "org.objectweb.asm.Type",
      "org.objectweb.asm.tree.MultiANewArrayInsnNode",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.facebook.presto.bytecode.debug.LocalVariableNode",
      "org.objectweb.asm.util.CheckAnnotationAdapter",
      "org.objectweb.asm.tree.TypeAnnotationNode",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "org.objectweb.asm.tree.LocalVariableAnnotationNode",
      "org.objectweb.asm.ClassVisitor",
      "com.google.common.collect.SingletonImmutableList",
      "org.objectweb.asm.tree.analysis.Interpreter",
      "com.google.common.collect.ImmutableCollection$Builder",
      "org.objectweb.asm.util.TraceClassVisitor",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.Iterators$9",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$1",
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.facebook.presto.bytecode.ClassDefinition",
      "com.facebook.presto.bytecode.expression.InvokeBytecodeExpression",
      "org.objectweb.asm.ClassReader",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "org.objectweb.asm.tree.InvokeDynamicInsnNode",
      "org.objectweb.asm.tree.FrameNode",
      "com.google.common.collect.Lists$2",
      "com.facebook.presto.bytecode.instruction.LabelNode",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.Iterables$5",
      "org.objectweb.asm.FieldVisitor",
      "org.objectweb.asm.RecordComponentWriter",
      "org.objectweb.asm.Symbol",
      "org.objectweb.asm.Label",
      "com.google.common.collect.Iterators",
      "org.objectweb.asm.tree.MethodNode",
      "org.objectweb.asm.tree.TypeInsnNode",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.FluentIterable$1",
      "com.google.common.collect.FluentIterable$2",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.google.common.collect.FluentIterable$3",
      "org.objectweb.asm.ModuleVisitor",
      "org.objectweb.asm.RecordComponentVisitor",
      "org.objectweb.asm.tree.UnsupportedClassVersionException",
      "org.objectweb.asm.tree.LabelNode",
      "com.facebook.presto.bytecode.expression.PopBytecodeExpression",
      "com.google.common.collect.TransformedIterator",
      "org.objectweb.asm.tree.LdcInsnNode",
      "com.facebook.presto.bytecode.BytecodeNode",
      "org.objectweb.asm.TypePath",
      "org.objectweb.asm.tree.AbstractInsnNode",
      "org.objectweb.asm.util.TraceAnnotationVisitor",
      "com.facebook.presto.bytecode.expression.GetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.FieldDefinition",
      "com.google.common.collect.Iterators$MergingIterator",
      "org.objectweb.asm.tree.InsnNode"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MethodGenerationContext_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.facebook.presto.bytecode.MethodGenerationContext$ScopeContext",
      "org.objectweb.asm.Type",
      "org.objectweb.asm.ClassVisitor",
      "org.objectweb.asm.ClassWriter",
      "org.objectweb.asm.SymbolTable",
      "org.objectweb.asm.ByteVector",
      "org.objectweb.asm.MethodVisitor",
      "org.objectweb.asm.MethodWriter",
      "org.objectweb.asm.Symbol",
      "org.objectweb.asm.SymbolTable$Entry",
      "org.objectweb.asm.util.Printer",
      "org.objectweb.asm.util.ASMifier",
      "org.objectweb.asm.util.TraceMethodVisitor",
      "com.facebook.presto.bytecode.control.DoWhileLoop",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.facebook.presto.bytecode.instruction.LabelNode",
      "org.objectweb.asm.Label",
      "com.google.common.base.Strings",
      "org.objectweb.asm.TypePath",
      "org.objectweb.asm.tree.MethodNode",
      "org.objectweb.asm.tree.InsnList",
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.facebook.presto.bytecode.Variable",
      "com.facebook.presto.bytecode.Parameter",
      "com.facebook.presto.bytecode.ParameterizedType",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "org.objectweb.asm.tree.Util",
      "org.objectweb.asm.util.CheckMethodAdapter$Method",
      "org.objectweb.asm.util.CheckMethodAdapter",
      "com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.bytecode.ClassDefinition",
      "com.google.common.collect.SingletonImmutableList",
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.Lists",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.FluentIterable",
      "com.google.common.collect.Iterables$5",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Iterators$6",
      "com.facebook.presto.bytecode.Scope",
      "com.facebook.presto.bytecode.FieldDefinition",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.SingletonImmutableSet",
      "org.objectweb.asm.util.CheckMethodAdapter$1",
      "com.facebook.presto.bytecode.control.IfStatement",
      "org.objectweb.asm.tree.AbstractInsnNode",
      "org.objectweb.asm.tree.LookupSwitchInsnNode",
      "org.objectweb.asm.tree.LabelNode",
      "org.objectweb.asm.util.Textifier",
      "org.objectweb.asm.signature.SignatureVisitor",
      "org.objectweb.asm.util.TraceSignatureVisitor",
      "org.objectweb.asm.signature.SignatureReader",
      "org.objectweb.asm.ClassReader",
      "com.facebook.presto.bytecode.control.WhileLoop",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "org.objectweb.asm.tree.VarInsnNode",
      "org.objectweb.asm.ModuleVisitor",
      "org.objectweb.asm.ModuleWriter",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "org.objectweb.asm.tree.TryCatchBlockNode",
      "org.objectweb.asm.tree.IntInsnNode",
      "org.objectweb.asm.tree.LocalVariableNode",
      "org.objectweb.asm.Attribute",
      "org.objectweb.asm.tree.TableSwitchInsnNode",
      "org.objectweb.asm.AnnotationVisitor",
      "org.objectweb.asm.util.CheckAnnotationAdapter",
      "org.objectweb.asm.AnnotationWriter",
      "org.objectweb.asm.Frame",
      "com.facebook.presto.bytecode.debug.LocalVariableNode",
      "org.objectweb.asm.tree.ParameterNode",
      "org.objectweb.asm.tree.AnnotationNode",
      "org.objectweb.asm.tree.TypeAnnotationNode",
      "org.objectweb.asm.tree.LocalVariableAnnotationNode",
      "com.facebook.presto.bytecode.control.ForLoop",
      "com.facebook.presto.bytecode.BytecodeVisitor",
      "org.objectweb.asm.tree.TypeInsnNode",
      "org.objectweb.asm.TypeReference",
      "org.objectweb.asm.util.TraceAnnotationVisitor",
      "com.google.common.primitives.Ints",
      "com.facebook.presto.bytecode.expression.GetElementBytecodeExpression",
      "com.facebook.presto.bytecode.expression.BytecodeExpressions",
      "com.facebook.presto.bytecode.expression.ConstantBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant",
      "com.facebook.presto.bytecode.instruction.Constant$IntConstant",
      "org.objectweb.asm.Handle",
      "com.facebook.presto.bytecode.instruction.VariableInstruction",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$LoadVariableInstruction",
      "org.objectweb.asm.tree.LdcInsnNode",
      "com.facebook.presto.bytecode.Variable$SetVariableBytecodeExpression",
      "com.facebook.presto.bytecode.expression.ArithmeticBytecodeExpression",
      "com.facebook.presto.bytecode.expression.ArithmeticBytecodeExpression$1",
      "org.objectweb.asm.tree.InvokeDynamicInsnNode",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.AbstractHashFunction",
      "com.google.common.hash.Murmur3_128HashFunction",
      "com.google.common.hash.AbstractHasher",
      "com.google.common.hash.AbstractStreamingHasher",
      "com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher",
      "com.google.common.hash.HashCode",
      "com.google.common.hash.HashCode$BytesHashCode",
      "com.google.common.primitives.Longs",
      "org.objectweb.asm.tree.JumpInsnNode",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.objectweb.asm.tree.FieldInsnNode",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression$TypeKind",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression$1",
      "com.facebook.presto.bytecode.instruction.TypeInstruction",
      "org.objectweb.asm.FieldVisitor",
      "org.objectweb.asm.tree.FieldNode",
      "com.facebook.presto.bytecode.instruction.FieldInstruction",
      "com.facebook.presto.bytecode.instruction.FieldInstruction$GetFieldInstruction",
      "com.facebook.presto.bytecode.expression.SetArrayElementBytecodeExpression",
      "com.facebook.presto.bytecode.expression.GetFieldBytecodeExpression",
      "org.objectweb.asm.tree.MultiANewArrayInsnNode",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction",
      "org.objectweb.asm.tree.MethodNode$1",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.facebook.presto.bytecode.expression.InvokeBytecodeExpression",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "org.objectweb.asm.RecordComponentVisitor",
      "org.objectweb.asm.RecordComponentWriter",
      "org.objectweb.asm.tree.analysis.Analyzer",
      "org.objectweb.asm.tree.analysis.Interpreter",
      "org.objectweb.asm.tree.analysis.BasicInterpreter",
      "org.objectweb.asm.tree.analysis.BasicVerifier",
      "org.objectweb.asm.tree.analysis.Subroutine",
      "org.objectweb.asm.tree.analysis.AnalyzerException",
      "org.objectweb.asm.util.CheckClassAdapter",
      "org.objectweb.asm.tree.MethodInsnNode",
      "com.google.common.primitives.UnsignedBytes",
      "com.google.common.base.Converter$ConverterComposition",
      "com.facebook.presto.bytecode.expression.PopBytecodeExpression",
      "org.objectweb.asm.tree.FrameNode",
      "org.objectweb.asm.FieldWriter",
      "org.objectweb.asm.tree.InsnNode",
      "org.objectweb.asm.tree.IincInsnNode",
      "com.facebook.presto.bytecode.expression.InstanceOfBytecodeExpression",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.base.Joiner",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.primitives.Primitives",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.bytecode.AnnotationDefinition",
      "com.google.common.collect.FluentIterable$3",
      "com.google.common.collect.FluentIterable$3$1",
      "com.google.common.collect.Iterators$ConcatenatedIterator",
      "org.objectweb.asm.tree.LineNumberNode",
      "com.facebook.presto.bytecode.instruction.Constant$ClassConstant",
      "com.facebook.presto.bytecode.expression.ArrayLengthBytecodeExpression",
      "com.facebook.presto.bytecode.expression.SetFieldBytecodeExpression",
      "com.google.common.collect.TransformedListIterator",
      "com.google.common.collect.Lists$TransformingRandomAccessList$1",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableCollection$Builder"
    );
  }
}
