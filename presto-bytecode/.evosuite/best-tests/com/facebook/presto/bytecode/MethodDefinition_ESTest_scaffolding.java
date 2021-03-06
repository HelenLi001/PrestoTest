/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 18 21:59:41 GMT 2021
 */

package com.facebook.presto.bytecode;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class MethodDefinition_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.bytecode.MethodDefinition"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MethodDefinition_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.facebook.presto.bytecode.BytecodeVisitor",
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.facebook.presto.bytecode.AnnotationDefinition",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.Lists$RandomAccessReverseList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.math.IntMath",
      "com.google.common.collect.FluentIterable",
      "com.google.common.base.Optional",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.facebook.presto.bytecode.expression.SetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.expression.GetElementBytecodeExpression",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.facebook.presto.bytecode.expression.ArrayLengthBytecodeExpression",
      "com.facebook.presto.bytecode.Variable",
      "com.facebook.presto.bytecode.Parameter",
      "com.facebook.presto.bytecode.expression.SetArrayElementBytecodeExpression",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators$10",
      "com.facebook.presto.bytecode.Scope",
      "com.facebook.presto.bytecode.instruction.InstructionNode",
      "com.google.common.base.Present",
      "com.facebook.presto.bytecode.expression.ReturnBytecodeExpression",
      "com.google.common.base.Joiner",
      "org.objectweb.asm.AnnotationVisitor",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.Lists$CharSequenceAsList",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.base.Strings",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.math.MathPreconditions",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.objectweb.asm.Attribute",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.facebook.presto.bytecode.Access",
      "com.google.common.base.Absent",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.presto.bytecode.Variable$SetVariableBytecodeExpression",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.facebook.presto.bytecode.ParameterizedType",
      "com.google.common.base.Joiner$1",
      "org.objectweb.asm.MethodVisitor",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.ImmutableCollection",
      "org.objectweb.asm.Type",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.TransformedListIterator",
      "org.objectweb.asm.ClassVisitor",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.collect.Iterators$6",
      "com.google.common.base.Function",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Lists$ReverseList",
      "com.google.common.collect.Iterators$1",
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.facebook.presto.bytecode.ClassDefinition",
      "com.facebook.presto.bytecode.expression.InvokeBytecodeExpression",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.facebook.presto.bytecode.instruction.LabelNode",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.Iterables$5",
      "org.objectweb.asm.FieldVisitor",
      "com.google.common.collect.Lists$TransformingRandomAccessList$1",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.FluentIterable$1",
      "com.google.common.collect.FluentIterable$2",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.google.common.collect.FluentIterable$3",
      "org.objectweb.asm.ModuleVisitor",
      "org.objectweb.asm.RecordComponentVisitor",
      "com.facebook.presto.bytecode.expression.PopBytecodeExpression",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.primitives.Primitives",
      "com.facebook.presto.bytecode.BytecodeNode",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "org.objectweb.asm.TypePath",
      "com.facebook.presto.bytecode.FieldDefinition",
      "com.facebook.presto.bytecode.expression.GetFieldBytecodeExpression",
      "com.google.common.collect.Iterators$MergingIterator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.facebook.presto.bytecode.ClassDefinition", false, MethodDefinition_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.bytecode.Parameter", false, MethodDefinition_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.facebook.presto.bytecode.ParameterizedType", false, MethodDefinition_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.objectweb.asm.ClassVisitor", false, MethodDefinition_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MethodDefinition_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.bytecode.Access",
      "com.facebook.presto.bytecode.ClassDefinition",
      "com.facebook.presto.bytecode.ParameterizedType",
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.facebook.presto.bytecode.Variable",
      "com.facebook.presto.bytecode.Parameter",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Iterables",
      "com.google.common.base.Preconditions",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.google.common.collect.Lists",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.FluentIterable",
      "com.google.common.collect.Iterables$5",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.base.Joiner",
      "com.google.common.collect.TransformedListIterator",
      "com.google.common.collect.Lists$TransformingRandomAccessList$1",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableList$1",
      "com.facebook.presto.bytecode.Scope",
      "org.objectweb.asm.ClassVisitor",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.primitives.Primitives",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.bytecode.AnnotationDefinition",
      "com.google.common.base.Strings"
    );
  }
}
