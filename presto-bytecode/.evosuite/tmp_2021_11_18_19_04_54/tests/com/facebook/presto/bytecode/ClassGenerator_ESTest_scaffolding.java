/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 19 03:41:07 GMT 2021
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
public class ClassGenerator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.bytecode.ClassGenerator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ClassGenerator_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.asm.SymbolTable$Entry",
      "com.google.common.primitives.Longs$LongConverter",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.base.Suppliers$NonSerializableMemoizingSupplier",
      "org.objectweb.asm.tree.analysis.Frame",
      "com.google.common.collect.MultimapBuilder$ArrayListSupplier",
      "com.google.common.collect.PeekingIterator",
      "org.objectweb.asm.SymbolTable",
      "com.google.common.hash.BloomFilter$Strategy",
      "com.google.common.math.IntMath",
      "com.facebook.presto.bytecode.control.ForLoop",
      "com.google.common.base.Enums$StringConverter",
      "com.google.common.collect.MultimapBuilder$EnumSetSupplier",
      "org.objectweb.asm.tree.ParameterNode",
      "org.objectweb.asm.Frame",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.facebook.presto.bytecode.Variable",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "org.objectweb.asm.tree.RecordComponentNode",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.facebook.presto.bytecode.Scope",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "org.objectweb.asm.ClassTooLargeException",
      "com.google.common.collect.TreeBasedTable$Factory",
      "org.objectweb.asm.util.TraceMethodVisitor",
      "com.google.common.base.Joiner",
      "com.facebook.presto.bytecode.MethodGenerationContext$ScopeContext",
      "org.objectweb.asm.util.CheckMethodAdapter$Method",
      "com.facebook.presto.bytecode.debug.DebugNode",
      "com.google.common.base.Strings",
      "org.objectweb.asm.Context",
      "com.google.common.collect.Lists$Partition",
      "org.objectweb.asm.tree.LocalVariableNode",
      "com.google.common.collect.DiscreteDomain",
      "org.objectweb.asm.MethodTooLargeException",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedDoubleConstant",
      "com.google.common.collect.Cut",
      "com.google.common.base.Absent",
      "com.google.common.base.Functions$ConstantFunction",
      "com.google.common.primitives.Shorts$ShortConverter",
      "com.google.common.collect.FilteredEntryMultimap$Keys",
      "com.google.common.io.Files$FilePredicate",
      "com.google.common.collect.DiscreteDomain$1",
      "org.objectweb.asm.tree.analysis.BasicVerifier",
      "com.google.common.cache.ForwardingCache",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction$InvokeDynamicInstruction",
      "com.facebook.presto.bytecode.expression.NewArrayBytecodeExpression",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "org.objectweb.asm.AnnotationWriter",
      "com.google.common.base.CharMatcher$1",
      "com.facebook.presto.bytecode.ParameterizedType",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.hash.Funnels$StringCharsetFunnel",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Converter$ConverterComposition",
      "com.facebook.presto.bytecode.instruction.Constant",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.collect.ImmutableCollection",
      "com.facebook.presto.bytecode.control.TryCatch",
      "com.google.common.cache.LocalCache$ManualSerializationProxy",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.facebook.presto.bytecode.instruction.FieldInstruction$PutFieldInstruction",
      "org.objectweb.asm.util.CheckFieldAdapter",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "org.objectweb.asm.util.CheckRecordComponentAdapter",
      "com.google.common.hash.Funnels$ByteArrayFunnel",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.collect.DiscreteDomain$LongDomain",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.base.Functions$ToStringFunction",
      "com.google.common.base.Functions$FunctionComposition",
      "com.google.common.collect.MultimapBuilder$TreeSetSupplier",
      "com.google.common.base.CharMatcher$Is",
      "org.objectweb.asm.tree.InvokeDynamicInsnNode",
      "org.objectweb.asm.tree.FrameNode",
      "com.google.common.collect.Lists$2",
      "com.google.common.hash.HashFunction",
      "com.facebook.presto.bytecode.instruction.LabelNode",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.Multiset",
      "com.google.common.base.Supplier",
      "com.google.common.hash.BloomFilter$SerialForm",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.FluentIterable$1",
      "com.google.common.collect.FluentIterable$2",
      "com.google.common.collect.FluentIterable$3",
      "com.google.common.collect.FilteredEntryMultimap$AsMap",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.Funnels$IntegerFunnel",
      "com.facebook.presto.bytecode.expression.NegateBytecodeExpression",
      "com.facebook.presto.bytecode.control.SwitchStatement$1",
      "org.objectweb.asm.util.CheckClassAdapter",
      "com.facebook.presto.bytecode.expression.PopBytecodeExpression",
      "com.google.common.hash.Hashing$ConcatenatedHashFunction",
      "com.google.common.collect.Ordering",
      "com.facebook.presto.bytecode.control.FlowControl",
      "com.google.common.collect.FluentIterable$3$1",
      "com.facebook.presto.bytecode.FieldDefinition",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "org.objectweb.asm.Edge",
      "com.facebook.presto.bytecode.BytecodeVisitor",
      "com.facebook.presto.bytecode.AnnotationDefinition",
      "com.facebook.presto.bytecode.instruction.FieldInstruction$GetFieldInstruction",
      "com.facebook.presto.bytecode.expression.InstanceOfBytecodeExpression",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.facebook.presto.bytecode.instruction.Constant$BooleanConstant",
      "com.google.common.util.concurrent.AbstractIdleService$ThreadNameSupplier",
      "com.google.common.collect.FluentIterable",
      "com.google.common.base.Optional",
      "com.facebook.presto.bytecode.expression.GetElementBytecodeExpression",
      "com.google.common.collect.Iterators$ArrayItr",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$StoreVariableInstruction",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.collect.Range",
      "com.google.common.cache.AbstractCache",
      "com.facebook.presto.bytecode.StaticTypeBytecodeExpression",
      "com.google.common.collect.RegularImmutableSet",
      "org.objectweb.asm.tree.Util",
      "com.google.common.base.CharMatcher$IsEither",
      "org.objectweb.asm.tree.VarInsnNode",
      "org.objectweb.asm.signature.SignatureVisitor",
      "org.objectweb.asm.tree.ClassNode",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedBooleanConstant",
      "com.facebook.presto.bytecode.instruction.VariableInstruction",
      "com.google.common.cache.CacheStats",
      "org.objectweb.asm.tree.AnnotationNode",
      "com.google.common.collect.Sets$2$1",
      "com.google.common.collect.Iterables",
      "com.google.common.hash.Hashing$ChecksumType",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.collect.ImmutableAsList",
      "org.objectweb.asm.tree.IntInsnNode",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.facebook.presto.bytecode.debug.LineNumberNode",
      "com.facebook.presto.bytecode.CompilationException",
      "org.objectweb.asm.tree.JumpInsnNode",
      "com.google.common.hash.PrimitiveSink",
      "com.google.common.base.Functions$IdentityFunction",
      "com.google.common.collect.FluentIterable$FromIterableFunction",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "org.objectweb.asm.ByteVector",
      "com.google.common.collect.ObjectArrays",
      "com.facebook.presto.bytecode.expression.ArithmeticBytecodeExpression",
      "com.google.common.collect.AbstractIterator",
      "com.facebook.presto.bytecode.ByteCodeTooLargeException",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.base.Suppliers$MemoizingSupplier",
      "org.objectweb.asm.Handle",
      "com.google.common.hash.BloomFilter$1",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "org.objectweb.asm.tree.analysis.Value",
      "com.facebook.presto.bytecode.expression.NotBytecodeExpression",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.base.Functions$SupplierFunction",
      "org.objectweb.asm.tree.analysis.BasicInterpreter",
      "com.facebook.presto.bytecode.expression.AndBytecodeExpression",
      "com.google.common.collect.Maps$EntryFunction",
      "com.google.common.base.Functions$PredicateFunction",
      "com.google.common.io.AppendableWriter",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.base.Predicates$ContainsPatternFromStringPredicate",
      "com.facebook.presto.bytecode.debug.LocalVariableNode",
      "org.objectweb.asm.util.CheckAnnotationAdapter",
      "com.google.common.base.SmallCharMatcher",
      "org.objectweb.asm.tree.LocalVariableAnnotationNode",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.collect.SingletonImmutableList",
      "org.objectweb.asm.tree.analysis.Interpreter",
      "com.google.common.base.Converter",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.common.base.Function",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.collect.ImmutableMap",
      "com.facebook.presto.bytecode.expression.ConstantBytecodeExpression",
      "com.google.common.base.Predicates$NotPredicate",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedLongConstant",
      "com.google.common.base.Suppliers$SupplierFunction",
      "com.facebook.presto.bytecode.expression.InvokeBytecodeExpression",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.facebook.presto.bytecode.expression.InlineIfBytecodeExpression",
      "org.objectweb.asm.ConstantDynamic",
      "com.google.common.collect.ImmutableList$Builder",
      "org.objectweb.asm.RecordComponentWriter",
      "org.objectweb.asm.Symbol",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.MultimapBuilder$LinkedHashSetSupplier",
      "com.google.common.collect.Iterators",
      "com.google.common.cache.LocalCache$LocalLoadingCache",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.hash.Funnels$SequentialFunnel",
      "com.facebook.presto.bytecode.expression.InvokeDynamicBytecodeExpression",
      "com.google.common.collect.Cut$BelowAll",
      "org.objectweb.asm.RecordComponentVisitor",
      "org.objectweb.asm.util.CheckModuleAdapter",
      "com.facebook.presto.bytecode.ClassGenerator",
      "com.google.common.primitives.Doubles$DoubleConverter",
      "org.objectweb.asm.tree.LabelNode",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.SetMultimap",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.primitives.Primitives",
      "com.facebook.presto.bytecode.BytecodeNode",
      "com.google.common.base.CaseFormat$StringConverter",
      "org.objectweb.asm.tree.analysis.SimpleVerifier",
      "com.facebook.presto.bytecode.AddFakeLineNumberClassVisitor",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.base.Functions$ForMapWithDefault",
      "org.objectweb.asm.tree.InsnNode",
      "com.google.common.collect.Cut$AboveAll",
      "com.facebook.presto.bytecode.instruction.TypeInstruction",
      "com.facebook.presto.bytecode.control.SwitchStatement$SwitchBuilder",
      "com.google.common.base.Predicates$InPredicate",
      "org.objectweb.asm.tree.analysis.AnalyzerException",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.cache.AbstractLoadingCache",
      "com.google.common.collect.Sets$2",
      "com.google.common.io.CharStreams$NullWriter",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$1",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedIntegerConstant",
      "com.facebook.presto.bytecode.expression.SetArrayElementBytecodeExpression",
      "com.google.common.base.Functions$FunctionForMapNoDefault",
      "com.google.common.base.Converter$IdentityConverter",
      "com.facebook.presto.bytecode.DynamicClassLoader",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.cache.ForwardingLoadingCache",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.base.Predicate",
      "com.google.common.collect.FilteredEntryMultimap$ValuePredicate",
      "com.google.common.collect.Iterators$ConcatenatedIterator",
      "com.google.common.collect.HashBasedTable$Factory",
      "org.objectweb.asm.tree.MethodInsnNode",
      "org.objectweb.asm.tree.LineNumberNode",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.collect.DiscreteDomain$BigIntegerDomain",
      "com.facebook.presto.bytecode.instruction.Constant$NullConstant",
      "com.google.common.collect.Lists",
      "com.google.common.cache.LocalCache",
      "com.google.common.math.MathPreconditions",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.objectweb.asm.Attribute",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.common.collect.ImmutableMultimap",
      "com.facebook.presto.bytecode.instruction.Constant$DoubleConstant",
      "org.objectweb.asm.tree.analysis.Subroutine",
      "com.google.common.collect.Sets$4",
      "org.objectweb.asm.Opcodes",
      "com.facebook.presto.bytecode.Access",
      "com.google.common.hash.Hashing$LinearCongruentialGenerator",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.facebook.presto.bytecode.Variable$SetVariableBytecodeExpression",
      "org.objectweb.asm.tree.InsnList",
      "com.google.common.base.CharMatcher",
      "com.google.common.collect.Multimaps$Keys",
      "com.facebook.presto.bytecode.instruction.Constant$StringConstant",
      "org.objectweb.asm.signature.SignatureReader",
      "org.objectweb.asm.tree.ModuleNode",
      "com.google.common.cache.ForwardingLoadingCache$SimpleForwardingLoadingCache",
      "org.objectweb.asm.util.Printer",
      "com.facebook.presto.bytecode.SmartClassWriter",
      "com.google.common.hash.ImmutableSupplier",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Predicates$OrPredicate",
      "org.objectweb.asm.tree.LookupSwitchInsnNode",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$IncrementVariableInstruction",
      "org.objectweb.asm.MethodVisitor",
      "org.objectweb.asm.tree.IincInsnNode",
      "org.objectweb.asm.tree.MultiANewArrayInsnNode",
      "org.objectweb.asm.tree.TypeAnnotationNode",
      "com.google.common.collect.TransformedListIterator",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableMapEntry",
      "org.objectweb.asm.util.TraceModuleVisitor",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$4",
      "com.google.common.base.Equivalence$EquivalentToPredicate",
      "com.google.common.collect.Iterators$5",
      "com.facebook.presto.bytecode.ClassDefinition",
      "org.objectweb.asm.ClassReader",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.facebook.presto.bytecode.expression.NewInstanceBytecodeExpression",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.base.CharMatcher$SingleWidth",
      "org.objectweb.asm.tree.FieldNode",
      "com.facebook.presto.bytecode.control.DoWhileLoop",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.AbstractCompositeHashFunction",
      "com.google.errorprone.annotations.concurrent.LazyInit",
      "com.google.common.collect.Interners$InternerFunction",
      "com.google.common.collect.MultimapBuilder$LinkedListSupplier",
      "org.objectweb.asm.tree.MethodNode",
      "org.objectweb.asm.Constants",
      "com.google.common.util.concurrent.UncheckedExecutionException",
      "com.google.common.collect.Range$RangeLexOrdering",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "org.objectweb.asm.ModuleVisitor",
      "org.objectweb.asm.tree.UnsupportedClassVersionException",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.collect.Range$LowerBoundFn",
      "com.facebook.presto.bytecode.instruction.Constant$1",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.facebook.presto.bytecode.expression.ComparisonBytecodeExpression",
      "org.objectweb.asm.TypePath",
      "com.facebook.presto.bytecode.expression.GetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.Comment",
      "com.google.common.cache.Cache",
      "com.facebook.presto.bytecode.instruction.FieldInstruction",
      "org.objectweb.asm.tree.FieldInsnNode",
      "com.google.common.cache.LoadingCache",
      "com.facebook.presto.bytecode.ClassInfoLoader",
      "com.google.common.collect.ImmutableList$SubList",
      "org.objectweb.asm.util.TraceSignatureVisitor",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.collect.Range$UpperBoundFn",
      "com.google.common.base.Suppliers$SupplierFunctionImpl",
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.google.common.base.Predicates$ObjectPredicate",
      "org.objectweb.asm.ModuleWriter",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.hash.BloomFilterStrategies$1",
      "com.facebook.presto.bytecode.instruction.Constant$FloatConstant",
      "com.google.common.hash.BloomFilterStrategies$2",
      "com.facebook.presto.bytecode.AddFakeLineNumberClassVisitor$AddFakeLineNumberMethodVisitor",
      "com.google.common.base.Predicates$SubtypeOfPredicate",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.facebook.presto.bytecode.expression.SetFieldBytecodeExpression",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.facebook.presto.bytecode.OpCode",
      "com.facebook.presto.bytecode.control.IfStatement",
      "com.facebook.presto.bytecode.expression.ArrayLengthBytecodeExpression",
      "org.objectweb.asm.util.ASMifier",
      "com.facebook.presto.bytecode.Parameter",
      "org.objectweb.asm.CurrentFrame",
      "com.facebook.presto.bytecode.instruction.FieldInstruction$1",
      "com.google.common.hash.Funnel",
      "com.facebook.presto.bytecode.instruction.InstructionNode",
      "org.objectweb.asm.MethodWriter",
      "com.google.common.collect.FilteredMultimap",
      "com.google.common.base.Present",
      "org.objectweb.asm.util.Textifier",
      "com.facebook.presto.bytecode.expression.ReturnBytecodeExpression",
      "org.objectweb.asm.ClassWriter",
      "org.objectweb.asm.AnnotationVisitor",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.ImmutableSet$Builder",
      "org.objectweb.asm.tree.analysis.Analyzer",
      "com.google.common.base.Suppliers$ThreadSafeSupplier",
      "com.google.common.hash.Funnels$UnencodedCharsFunnel",
      "com.google.common.base.Predicates",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$LoadVariableInstruction",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "org.objectweb.asm.util.TraceFieldVisitor",
      "com.facebook.presto.bytecode.instruction.Constant$IntConstant",
      "org.objectweb.asm.Handler",
      "org.objectweb.asm.util.CheckMethodAdapter$1",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction",
      "org.objectweb.asm.util.CheckMethodAdapter",
      "com.facebook.presto.bytecode.control.SwitchStatement",
      "com.facebook.presto.bytecode.instruction.JumpInstruction",
      "org.objectweb.asm.tree.TableSwitchInsnNode",
      "com.google.common.collect.FilteredEntryMultimap",
      "com.facebook.presto.bytecode.instruction.Constant$BoxedFloatConstant",
      "org.objectweb.asm.FieldWriter",
      "org.objectweb.asm.Type",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.primitives.Floats$FloatConverter",
      "com.google.errorprone.annotations.Immutable",
      "com.google.common.io.CharStreams",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.hash.Funnels$LongFunnel",
      "org.objectweb.asm.util.CheckClassAdapter$1",
      "org.objectweb.asm.ClassVisitor",
      "org.objectweb.asm.util.TraceClassVisitor",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.CollectPreconditions",
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.facebook.presto.bytecode.expression.OrBytecodeExpression",
      "com.google.common.primitives.Ints$IntConverter",
      "com.google.common.collect.Sets",
      "com.google.common.collect.BoundType",
      "org.objectweb.asm.tree.TryCatchBlockNode",
      "com.facebook.presto.bytecode.expression.CastBytecodeExpression",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "org.objectweb.asm.util.TraceRecordComponentVisitor",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.primitives.Booleans",
      "com.facebook.presto.bytecode.control.CaseStatement",
      "com.google.common.collect.Iterables$5",
      "com.google.common.collect.ForwardingObject",
      "org.objectweb.asm.FieldVisitor",
      "com.google.common.cache.LocalCache$LoadingSerializationProxy",
      "org.objectweb.asm.Label",
      "com.google.common.reflect.TypeToken$TypeFilter",
      "com.google.common.collect.Lists$TransformingRandomAccessList$1",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.hash.AbstractHashFunction",
      "com.google.common.base.Suppliers$ExpiringMemoizingSupplier",
      "com.facebook.presto.bytecode.control.WhileLoop",
      "org.objectweb.asm.tree.TypeInsnNode",
      "org.objectweb.asm.tree.analysis.BasicValue",
      "com.google.common.base.Suppliers",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.facebook.presto.bytecode.instruction.Constant$LongConstant",
      "com.google.common.base.Suppliers$SupplierComposition",
      "com.google.common.base.CharMatcher$Or",
      "com.facebook.presto.bytecode.Binding",
      "com.facebook.presto.bytecode.instruction.Constant$ClassConstant",
      "org.objectweb.asm.tree.LdcInsnNode",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "org.objectweb.asm.tree.AbstractInsnNode",
      "org.objectweb.asm.util.TraceAnnotationVisitor",
      "com.google.common.collect.MultimapBuilder$HashSetSupplier"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ClassGenerator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.bytecode.ClassGenerator",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.io.CharStreams$NullWriter",
      "com.facebook.presto.bytecode.DynamicClassLoader",
      "com.google.common.io.CharStreams",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.facebook.presto.bytecode.ClassInfoLoader",
      "com.google.common.collect.Sets",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.Sets$2",
      "com.facebook.presto.bytecode.ParameterizedType",
      "com.google.common.collect.RegularImmutableList",
      "com.facebook.presto.bytecode.ClassDefinition",
      "org.objectweb.asm.Type",
      "com.facebook.presto.bytecode.MethodDefinition",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.Iterators",
      "com.google.common.primitives.Ints",
      "com.facebook.presto.bytecode.BytecodeBlock",
      "com.google.common.collect.Lists",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.FluentIterable",
      "com.google.common.collect.Iterables$5",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.ImmutableList$Builder",
      "com.facebook.presto.bytecode.expression.BytecodeExpression",
      "com.facebook.presto.bytecode.Variable",
      "com.facebook.presto.bytecode.Parameter",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.Iterators$9",
      "com.facebook.presto.bytecode.Scope",
      "com.facebook.presto.bytecode.FieldDefinition",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.SingletonImmutableSet",
      "org.objectweb.asm.ClassVisitor",
      "org.objectweb.asm.tree.ClassNode",
      "org.objectweb.asm.tree.Util",
      "org.objectweb.asm.FieldVisitor",
      "org.objectweb.asm.tree.FieldNode",
      "com.google.common.base.Joiner",
      "com.google.common.collect.TransformedListIterator",
      "com.google.common.collect.Lists$TransformingRandomAccessList$1",
      "org.objectweb.asm.MethodVisitor",
      "org.objectweb.asm.tree.MethodNode",
      "org.objectweb.asm.tree.InsnList",
      "com.facebook.presto.bytecode.MethodGenerationContext",
      "com.facebook.presto.bytecode.MethodGenerationContext$ScopeContext",
      "com.facebook.presto.bytecode.instruction.LabelNode",
      "org.objectweb.asm.Label",
      "org.objectweb.asm.tree.AbstractInsnNode",
      "org.objectweb.asm.tree.LabelNode",
      "org.objectweb.asm.tree.InsnNode",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "org.objectweb.asm.ClassWriter",
      "org.objectweb.asm.SymbolTable",
      "org.objectweb.asm.ByteVector",
      "org.objectweb.asm.Symbol",
      "org.objectweb.asm.SymbolTable$Entry",
      "org.objectweb.asm.FieldWriter",
      "org.objectweb.asm.MethodWriter",
      "org.objectweb.asm.Attribute",
      "org.objectweb.asm.AnnotationVisitor",
      "org.objectweb.asm.AnnotationWriter",
      "org.objectweb.asm.Handler",
      "com.facebook.presto.bytecode.SmartClassWriter",
      "org.objectweb.asm.Frame",
      "com.google.common.base.Strings",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.primitives.Primitives",
      "com.google.common.collect.RegularImmutableSet",
      "com.facebook.presto.bytecode.AnnotationDefinition",
      "com.google.common.collect.Iterators$1",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$AnyOf",
      "org.objectweb.asm.tree.AnnotationNode",
      "org.objectweb.asm.ClassReader",
      "org.objectweb.asm.util.TraceClassVisitor",
      "org.objectweb.asm.util.Printer",
      "org.objectweb.asm.util.Textifier",
      "org.objectweb.asm.Constants",
      "org.objectweb.asm.Context",
      "org.objectweb.asm.signature.SignatureVisitor",
      "org.objectweb.asm.util.TraceSignatureVisitor",
      "org.objectweb.asm.signature.SignatureReader",
      "org.objectweb.asm.util.TraceFieldVisitor",
      "org.objectweb.asm.util.TraceMethodVisitor",
      "com.facebook.presto.bytecode.expression.GetFieldBytecodeExpression",
      "com.facebook.presto.bytecode.AddFakeLineNumberClassVisitor",
      "com.facebook.presto.bytecode.AddFakeLineNumberClassVisitor$AddFakeLineNumberMethodVisitor",
      "com.facebook.presto.bytecode.instruction.VariableInstruction",
      "com.facebook.presto.bytecode.instruction.VariableInstruction$LoadVariableInstruction",
      "com.facebook.presto.bytecode.debug.LocalVariableNode",
      "org.objectweb.asm.tree.LocalVariableNode",
      "org.objectweb.asm.tree.VarInsnNode",
      "org.objectweb.asm.tree.MethodInsnNode",
      "com.google.common.collect.FluentIterable$3",
      "com.google.common.collect.FluentIterable$3$1",
      "com.google.common.collect.Iterators$ConcatenatedIterator",
      "org.objectweb.asm.util.CheckClassAdapter",
      "org.objectweb.asm.util.CheckClassAdapter$1",
      "org.objectweb.asm.util.TraceAnnotationVisitor",
      "com.facebook.presto.bytecode.expression.InvokeBytecodeExpression",
      "com.facebook.presto.bytecode.expression.SetArrayElementBytecodeExpression",
      "org.objectweb.asm.util.CheckMethodAdapter$Method",
      "org.objectweb.asm.util.CheckMethodAdapter",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.objectweb.asm.Edge",
      "com.facebook.presto.bytecode.instruction.InvokeInstruction$InvokeDynamicInstruction",
      "org.objectweb.asm.tree.analysis.Interpreter",
      "org.objectweb.asm.tree.analysis.BasicInterpreter",
      "org.objectweb.asm.tree.analysis.BasicVerifier",
      "org.objectweb.asm.tree.analysis.SimpleVerifier",
      "org.objectweb.asm.tree.analysis.Analyzer",
      "org.objectweb.asm.tree.analysis.Subroutine",
      "org.objectweb.asm.tree.analysis.Frame",
      "org.objectweb.asm.tree.analysis.BasicValue",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.primitives.Booleans"
    );
  }
}
