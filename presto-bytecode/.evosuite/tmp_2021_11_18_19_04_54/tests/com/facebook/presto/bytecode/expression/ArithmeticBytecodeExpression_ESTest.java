/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 19 03:16:38 GMT 2021
 */

package com.facebook.presto.bytecode.expression;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.bytecode.BytecodeBlock;
import com.facebook.presto.bytecode.BytecodeNode;
import com.facebook.presto.bytecode.MethodGenerationContext;
import com.facebook.presto.bytecode.OpCode;
import com.facebook.presto.bytecode.Parameter;
import com.facebook.presto.bytecode.ParameterizedType;
import com.facebook.presto.bytecode.StaticTypeBytecodeExpression;
import com.facebook.presto.bytecode.Variable;
import com.facebook.presto.bytecode.expression.ArithmeticBytecodeExpression;
import com.facebook.presto.bytecode.expression.BytecodeExpression;
import com.facebook.presto.bytecode.expression.ConstantBytecodeExpression;
import com.facebook.presto.bytecode.instruction.Constant;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArithmeticBytecodeExpression_ESTest extends ArithmeticBytecodeExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OpCode opCode0 = OpCode.ISHR;
      Class<Throwable> class0 = Class.class;
      Parameter parameter0 = Parameter.arg("qYkg", class0);
      Class<Variable> class1 = Class.class;
      BytecodeExpression bytecodeExpression0 = parameter0.instanceOf(class1);
      BytecodeExpression bytecodeExpression1 = bytecodeExpression0.length();
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, bytecodeExpression0, bytecodeExpression1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Shift right left argument be int or long, but is boolean
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpCode opCode0 = OpCode.IDIV;
      Class<Integer> class0 = Integer.TYPE;
      ConstantBytecodeExpression constantBytecodeExpression0 = new ConstantBytecodeExpression(class0, (Constant) null);
      BytecodeExpression bytecodeExpression0 = ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, constantBytecodeExpression0, constantBytecodeExpression0);
      BytecodeExpression bytecodeExpression1 = ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, bytecodeExpression0, constantBytecodeExpression0);
      assertNotSame(bytecodeExpression0, bytecodeExpression1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<StaticTypeBytecodeExpression> class0 = Class.class;
      Parameter parameter0 = Parameter.arg("com.facebook.prsto.bytecode.expression.ArithmeticBytecodeExpression$1", class0);
      // Undeclared exception!
      try { 
        parameter0.increment();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // left is not a primitive
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      ArithmeticBytecodeExpression.getNumericOpCode((String) null, (OpCode) null, class0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpCode opCode0 = OpCode.IUSHR;
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName("[je'cPf)?w\"G");
      Parameter parameter0 = Parameter.arg("[je'cPf)?w\"G", parameterizedType0);
      BytecodeExpression bytecodeExpression0 = parameter0.cast(parameterizedType0);
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, bytecodeExpression0, bytecodeExpression0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // left is not a primitive
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpCode opCode0 = OpCode.DUP;
      Class<Integer> class0 = Integer.TYPE;
      OpCode opCode1 = ArithmeticBytecodeExpression.getNumericOpCode("iLeOvFn1wGg=>[%G-", opCode0, class0);
      Class<ParameterizedType> class1 = Class.class;
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.getNumericOpCode("iLeOvFn1wGg=>[%G-", opCode1, class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // iLeOvFn1wGg=>[%G- does not support class java.lang.Class
         //
         verifyException("com.facebook.presto.bytecode.expression.ArithmeticBytecodeExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpCode opCode0 = OpCode.IRETURN;
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, (BytecodeExpression) null, (BytecodeExpression) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported OpCode IRETURN
         //
         verifyException("com.facebook.presto.bytecode.expression.ArithmeticBytecodeExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpCode opCode0 = OpCode.IUSHR;
      Class<Throwable> class0 = Class.class;
      Parameter parameter0 = Parameter.arg("qYkg", class0);
      Class<Variable> class1 = Class.class;
      BytecodeExpression bytecodeExpression0 = parameter0.instanceOf(class1);
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, bytecodeExpression0, bytecodeExpression0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Shift right unsigned left argument be int or long, but is boolean
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpCode opCode0 = OpCode.ISHL;
      Class<Throwable> class0 = Class.class;
      Parameter parameter0 = Parameter.arg("@L5Z", class0);
      Class<Variable> class1 = Class.class;
      BytecodeExpression bytecodeExpression0 = parameter0.instanceOf(class1);
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, bytecodeExpression0, bytecodeExpression0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Shift left left argument be int or long, but is boolean
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpCode opCode0 = OpCode.IREM;
      ParameterizedType parameterizedType0 = new ParameterizedType("/");
      Parameter parameter0 = Parameter.arg("/", parameterizedType0);
      BytecodeExpression bytecodeExpression0 = parameter0.pop();
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, bytecodeExpression0, bytecodeExpression0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // left is void
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpCode opCode0 = OpCode.IMUL;
      Class<Throwable> class0 = Class.class;
      Parameter parameter0 = Parameter.arg("@L5Z", class0);
      Class<Variable> class1 = Class.class;
      BytecodeExpression bytecodeExpression0 = parameter0.instanceOf(class1);
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, bytecodeExpression0, bytecodeExpression0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Multiply argument must be int, long, float, or double, but is boolean
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OpCode opCode0 = OpCode.ISUB;
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, (BytecodeExpression) null, (BytecodeExpression) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // left is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpCode opCode0 = OpCode.IXOR;
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, (BytecodeExpression) null, (BytecodeExpression) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // left is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpCode opCode0 = OpCode.IOR;
      // Undeclared exception!
      try { 
        ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, (BytecodeExpression) null, (BytecodeExpression) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // left is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OpCode opCode0 = OpCode.IDIV;
      Class<Integer> class0 = Integer.TYPE;
      ConstantBytecodeExpression constantBytecodeExpression0 = new ConstantBytecodeExpression(class0, (Constant) null);
      ArithmeticBytecodeExpression arithmeticBytecodeExpression0 = (ArithmeticBytecodeExpression)ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, constantBytecodeExpression0, constantBytecodeExpression0);
      // Undeclared exception!
      try { 
        arithmeticBytecodeExpression0.formatOneLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.bytecode.expression.ConstantBytecodeExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OpCode opCode0 = OpCode.IDIV;
      Class<Integer> class0 = Integer.TYPE;
      ConstantBytecodeExpression constantBytecodeExpression0 = new ConstantBytecodeExpression(class0, (Constant) null);
      BytecodeExpression bytecodeExpression0 = ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, constantBytecodeExpression0, constantBytecodeExpression0);
      BytecodeBlock bytecodeBlock0 = (BytecodeBlock)bytecodeExpression0.getBytecode((MethodGenerationContext) null);
      assertFalse(bytecodeBlock0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpCode opCode0 = OpCode.IDIV;
      Class<Integer> class0 = Integer.TYPE;
      ConstantBytecodeExpression constantBytecodeExpression0 = new ConstantBytecodeExpression(class0, (Constant) null);
      BytecodeExpression bytecodeExpression0 = ArithmeticBytecodeExpression.createArithmeticBytecodeExpression(opCode0, constantBytecodeExpression0, constantBytecodeExpression0);
      List<BytecodeNode> list0 = ((ArithmeticBytecodeExpression) bytecodeExpression0).getChildNodes();
      assertFalse(list0.isEmpty());
  }
}
