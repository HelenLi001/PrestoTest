/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 18 22:07:17 GMT 2021
 */

package com.facebook.presto.bytecode.control;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.bytecode.BytecodeBlock;
import com.facebook.presto.bytecode.BytecodeNode;
import com.facebook.presto.bytecode.BytecodeVisitor;
import com.facebook.presto.bytecode.MethodGenerationContext;
import com.facebook.presto.bytecode.OpCode;
import com.facebook.presto.bytecode.ParameterizedType;
import com.facebook.presto.bytecode.control.TryCatch;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.objectweb.asm.MethodVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TryCatch_ESTest extends TryCatch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn("ED]2").when(parameterizedType0).getClassName();
      TryCatch tryCatch0 = new TryCatch("IF_ICMPEQ", bytecodeNode0, bytecodeNode0, parameterizedType0);
      String string0 = tryCatch0.getExceptionName();
      assertEquals("ED]2", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn("handler").when(parameterizedType0).getClassName();
      TryCatch tryCatch0 = new TryCatch("handler", bytecodeNode0, bytecodeNode0, parameterizedType0);
      ParameterizedType parameterizedType1 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn("").when(parameterizedType1).getClassName();
      TryCatch tryCatch1 = new TryCatch(tryCatch0, tryCatch0, parameterizedType1);
      String string0 = tryCatch1.getExceptionName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(parameterizedType0).getClassName();
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, parameterizedType0);
      ParameterizedType parameterizedType1 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(parameterizedType1).getClassName();
      TryCatch tryCatch1 = new TryCatch("|!dd<3P_2>", tryCatch0, tryCatch0, parameterizedType1);
      String string0 = tryCatch1.getComment();
      assertEquals("|!dd<3P_2>", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(parameterizedType0).getClassName();
      TryCatch tryCatch0 = new TryCatch("", bytecodeNode0, bytecodeNode0, parameterizedType0);
      BytecodeVisitor<BytecodeBlock> bytecodeVisitor0 = (BytecodeVisitor<BytecodeBlock>) mock(BytecodeVisitor.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(bytecodeVisitor0).visitTryCatch(any(com.facebook.presto.bytecode.BytecodeNode.class) , any(com.facebook.presto.bytecode.control.TryCatch.class));
      BytecodeBlock bytecodeBlock0 = tryCatch0.accept((BytecodeNode) tryCatch0, bytecodeVisitor0);
      assertNull(bytecodeBlock0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(parameterizedType0).getClassName();
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, parameterizedType0);
      // Undeclared exception!
      try { 
        tryCatch0.accept((BytecodeNode) tryCatch0, (BytecodeVisitor<BytecodeBlock>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.bytecode.control.TryCatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      TryCatch tryCatch0 = null;
      try {
        tryCatch0 = new TryCatch("|3  3H", (BytecodeNode) null, (BytecodeNode) null, parameterizedType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tryNode is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      TryCatch tryCatch0 = null;
      try {
        tryCatch0 = new TryCatch((BytecodeNode) null, (BytecodeNode) null, parameterizedType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tryNode is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, (ParameterizedType) null);
      TryCatch tryCatch1 = new TryCatch("", tryCatch0, tryCatch0, (ParameterizedType) null);
      String string0 = tryCatch1.getComment();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(parameterizedType0).getClassName();
      TryCatch tryCatch0 = new TryCatch("", bytecodeNode0, bytecodeNode0, parameterizedType0);
      MethodGenerationContext methodGenerationContext0 = mock(MethodGenerationContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tryCatch0.accept((MethodVisitor) null, methodGenerationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.bytecode.instruction.LabelNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      doReturn("").when(bytecodeNode0).toString();
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, (ParameterizedType) null);
      BytecodeNode bytecodeNode1 = tryCatch0.getTryNode();
      assertSame(bytecodeNode1, bytecodeNode0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, (ParameterizedType) null);
      String string0 = tryCatch0.getExceptionName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      doReturn("").when(bytecodeNode0).toString();
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, (ParameterizedType) null);
      BytecodeNode bytecodeNode1 = tryCatch0.getCatchNode();
      assertSame(bytecodeNode1, bytecodeNode0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, (ParameterizedType) null);
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      MethodGenerationContext methodGenerationContext0 = mock(MethodGenerationContext.class, new ViolatedAssumptionAnswer());
      tryCatch0.accept(methodVisitor0, methodGenerationContext0);
      assertNull(tryCatch0.getExceptionName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, (ParameterizedType) null);
      OpCode opCode0 = OpCode.DLOAD_0;
      BytecodeVisitor<OpCode> bytecodeVisitor0 = (BytecodeVisitor<OpCode>) mock(BytecodeVisitor.class, new ViolatedAssumptionAnswer());
      doReturn(opCode0).when(bytecodeVisitor0).visitTryCatch(any(com.facebook.presto.bytecode.BytecodeNode.class) , any(com.facebook.presto.bytecode.control.TryCatch.class));
      OpCode opCode1 = tryCatch0.accept((BytecodeNode) tryCatch0, bytecodeVisitor0);
      assertSame(opCode0, opCode1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(bytecodeNode0).toString();
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      doReturn("").when(parameterizedType0).getClassName();
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, parameterizedType0);
      List<BytecodeNode> list0 = tryCatch0.getChildNodes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BytecodeNode bytecodeNode0 = mock(BytecodeNode.class, new ViolatedAssumptionAnswer());
      TryCatch tryCatch0 = new TryCatch(bytecodeNode0, bytecodeNode0, (ParameterizedType) null);
      String string0 = tryCatch0.getComment();
      assertNull(string0);
  }
}
