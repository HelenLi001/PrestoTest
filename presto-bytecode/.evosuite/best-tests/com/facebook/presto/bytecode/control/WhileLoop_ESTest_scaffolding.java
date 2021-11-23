/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 18 22:09:32 GMT 2021
 */

package com.facebook.presto.bytecode.control;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class WhileLoop_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.bytecode.control.WhileLoop"; 
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
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-bytecode"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WhileLoop_ESTest_scaffolding.class.getClassLoader() ,
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.facebook.presto.bytecode.BytecodeVisitor",
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.facebook.presto.bytecode.instruction.FieldInstruction$GetFieldInstruction",
      "com.facebook.presto.bytecode.AnnotationDefinition",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.bytecode.instruction.Constant$FloatConstant",
      "com.facebook.presto.bytecode.instruction.Constant$BooleanConstant",
      "com.facebook.presto.bytecode.control.ForLoop",
      "com.facebook.presto.bytecode.expression.SetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.OpCode",
      "com.facebook.presto.bytecode.expression.GetElementBytecodeExpression",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$StoreVariableInstruction",
      "com.facebook.presto.bytecode.control.IfStatement",
      "com.facebook.presto.bytecode.expression.ArrayLengthBytecodeExpression",
      "com.facebook.presto.bytecode.Variable",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedIntegerConstant",
      "com.facebook.presto.bytecode.Parameter",
      "com.facebook.presto.bytecode.expression.SetArrayElementBytecodeExpression",
      "com.google.common.collect.RegularImmutableMap",
      "com.facebook.presto.bytecode.StaticTypeBytecodeExpression",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.facebook.presto.bytecode.instruction.InstructionNode",
      "com.facebook.presto.bytecode.Scope",
      "org.objectweb.asm.MethodWriter",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedBooleanConstant",
      "com.facebook.presto.bytecode.instruction.VariableInstruction",
      "org.objectweb.asm.util.TraceMethodVisitor",
      "com.facebook.presto.bytecode.expression.ReturnBytecodeExpression",
      "org.objectweb.asm.AnnotationVisitor",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.RegularImmutableAsList",
      "com.facebook.presto.bytecode.debug.DebugNode",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.facebook.presto.bytecode.debug.LineNumberNode",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.objectweb.asm.Attribute",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedDoubleConstant",
      "com.facebook.presto.bytecode.instruction.Constant$DoubleConstant",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$LoadVariableInstruction",
      "com.facebook.presto.bytecode.instruction.Constant$IntConstant",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.presto.bytecode.Variable$SetVariableBytecodeExpression",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.facebook.presto.bytecode.instruction.Constant$StringConstant",
      "com.google.common.collect.ImmutableList$1",
      "org.objectweb.asm.Handle",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction$InvokeDynamicInstruction",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "org.objectweb.asm.util.CheckMethodAdapter",
      "com.facebook.presto.bytecode.ParameterizedType",
      "com.google.common.collect.ImmutableEntry",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$IncrementVariableInstruction",
      "com.facebook.presto.bytecode.control.SwitchStatement",
      "com.facebook.presto.bytecode.instruction.JumpInstruction",
      "org.objectweb.asm.MethodVisitor",
      "com.facebook.presto.bytecode.instruction.Constant",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedFloatConstant",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.bytecode.control.TryCatch",
      "com.facebook.presto.bytecode.debug.LocalVariableNode",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.facebook.presto.bytecode.instruction.FieldInstruction$PutFieldInstruction",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Iterators$1",
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedLongConstant",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.facebook.presto.bytecode.ClassDefinition",
      "com.facebook.presto.bytecode.expression.InvokeBytecodeExpression",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.LabelNode",
      "com.google.common.collect.ImmutableMap$1",
      "com.facebook.presto.bytecode.control.DoWhileLoop",
      "org.objectweb.asm.Label",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableBiMap",
      "org.objectweb.asm.tree.MethodNode",
      "com.facebook.presto.bytecode.control.WhileLoop",
      "com.google.common.collect.ImmutableList",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.facebook.presto.bytecode.instruction.Constant$LongConstant",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.facebook.presto.bytecode.expression.PopBytecodeExpression",
      "com.facebook.presto.bytecode.instruction.Constant$ClassConstant",
      "com.facebook.presto.bytecode.BytecodeNode",
      "org.objectweb.asm.TypePath",
      "com.facebook.presto.bytecode.control.FlowControl",
      "com.facebook.presto.bytecode.FieldDefinition",
      "com.facebook.presto.bytecode.expression.GetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.Comment",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.facebook.presto.bytecode.instruction.FieldInstruction"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.bytecode.BytecodeVisitor", false, WhileLoop_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.bytecode.MethodGenerationContext", false, WhileLoop_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.objectweb.asm.MethodVisitor", false, WhileLoop_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WhileLoop_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.bytecode.control.WhileLoop",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.facebook.presto.bytecode.instruction.LabelNode",
      "org.objectweb.asm.Label",
      "com.google.common.base.Preconditions",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "org.objectweb.asm.MethodVisitor",
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.facebook.presto.bytecode.BytecodeVisitor",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.facebook.presto.bytecode.instruction.JumpInstruction",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.facebook.presto.bytecode.OpCode"
    );
  }
}
