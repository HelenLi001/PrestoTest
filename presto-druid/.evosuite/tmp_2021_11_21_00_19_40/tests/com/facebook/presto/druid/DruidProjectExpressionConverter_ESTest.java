/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:41:26 GMT 2021
 */

package com.facebook.presto.druid;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.common.type.TypeManager;
import com.facebook.presto.common.type.TypeSignature;
import com.facebook.presto.druid.DruidProjectExpressionConverter;
import com.facebook.presto.druid.DruidQueryGeneratorContext;
import com.facebook.presto.spi.function.FunctionHandle;
import com.facebook.presto.spi.function.StandardFunctionResolution;
import com.facebook.presto.spi.relation.CallExpression;
import com.facebook.presto.spi.relation.ConstantExpression;
import com.facebook.presto.spi.relation.InputReferenceExpression;
import com.facebook.presto.spi.relation.LambdaDefinitionExpression;
import com.facebook.presto.spi.relation.SpecialFormExpression;
import com.facebook.presto.spi.relation.VariableReferenceExpression;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DruidProjectExpressionConverter_ESTest extends DruidProjectExpressionConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(standardFunctionResolution0).isBetweenFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      doReturn(false).when(standardFunctionResolution0).isCastFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      doReturn(false).when(standardFunctionResolution0).isNotFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      CallExpression callExpression0 = mock(CallExpression.class, new ViolatedAssumptionAnswer());
      doReturn((FunctionHandle) null).when(callExpression0).getFunctionHandle();
      doReturn((String) null).when(callExpression0).toString();
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitCall(callExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Call not supported: null
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeManager0).canCoerce(any(com.facebook.presto.common.type.Type.class) , any(com.facebook.presto.common.type.Type.class));
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      Type type1 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((TypeSignature) null).when(type1).getTypeSignature();
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.isImplicitCast(type0, type1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.basicCallHandling((CallExpression) null, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = null;
      try {
        druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, (StandardFunctionResolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // standardFunctionResolution is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(standardFunctionResolution0).isBetweenFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      doReturn(false).when(standardFunctionResolution0).isCastFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      doReturn(false, false).when(standardFunctionResolution0).isNotFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      FunctionHandle functionHandle0 = mock(FunctionHandle.class, new ViolatedAssumptionAnswer());
      CallExpression callExpression0 = mock(CallExpression.class, new ViolatedAssumptionAnswer());
      doReturn(functionHandle0).when(callExpression0).getFunctionHandle();
      druidProjectExpressionConverter0.basicCallHandling(callExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
      FunctionHandle functionHandle1 = mock(FunctionHandle.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(functionHandle1).toString();
      CallExpression callExpression1 = mock(CallExpression.class, new ViolatedAssumptionAnswer());
      doReturn(functionHandle1).when(callExpression1).getFunctionHandle();
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitCall(callExpression1, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported function in Druid aggregation: null
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(standardFunctionResolution0).isNotFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      FunctionHandle functionHandle0 = mock(FunctionHandle.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(functionHandle0).toString();
      CallExpression callExpression0 = mock(CallExpression.class, new ViolatedAssumptionAnswer());
      doReturn(functionHandle0).when(callExpression0).getFunctionHandle();
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitCall(callExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported function in Druid aggregation: null
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(standardFunctionResolution0).isBetweenFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      doReturn(true).when(standardFunctionResolution0).isCastFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      doReturn(false).when(standardFunctionResolution0).isNotFunction(any(com.facebook.presto.spi.function.FunctionHandle.class));
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection> map0 = null;
      FunctionHandle functionHandle0 = mock(FunctionHandle.class, new ViolatedAssumptionAnswer());
      CallExpression callExpression0 = mock(CallExpression.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(callExpression0).getArguments();
      doReturn(functionHandle0).when(callExpression0).getFunctionHandle();
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.basicCallHandling(callExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(typeManager0).canCoerce(any(com.facebook.presto.common.type.Type.class) , any(com.facebook.presto.common.type.Type.class));
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      TypeSignature typeSignature0 = mock(TypeSignature.class, new ViolatedAssumptionAnswer());
      doReturn("p").when(typeSignature0).getBase();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(typeSignature0).when(type0).getTypeSignature();
      boolean boolean0 = druidProjectExpressionConverter0.isImplicitCast(type0, type0);
      assertFalse(boolean0);
      
      Type type1 = mock(Type.class, new ViolatedAssumptionAnswer());
      boolean boolean1 = druidProjectExpressionConverter0.isImplicitCast(type1, type1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      VariableReferenceExpression variableReferenceExpression0 = mock(VariableReferenceExpression.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitVariableReference(variableReferenceExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      ConstantExpression constantExpression0 = mock(ConstantExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(constantExpression0).toString();
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitConstant(constantExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Constant not supported: null
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      SpecialFormExpression specialFormExpression0 = mock(SpecialFormExpression.class, new ViolatedAssumptionAnswer());
      doReturn("6Jg( |0<s[sF").when(specialFormExpression0).toString();
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitSpecialForm(specialFormExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Special form not supported: 6Jg( |0<s[sF
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitCall((CallExpression) null, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      InputReferenceExpression inputReferenceExpression0 = mock(InputReferenceExpression.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(inputReferenceExpression0).toString();
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitInputReference(inputReferenceExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Input reference not supported: null
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardFunctionResolution standardFunctionResolution0 = mock(StandardFunctionResolution.class, new ViolatedAssumptionAnswer());
      LambdaDefinitionExpression lambdaDefinitionExpression0 = mock(LambdaDefinitionExpression.class, new ViolatedAssumptionAnswer());
      doReturn("ARRAY comparison not supported for arrays with null elements").when(lambdaDefinitionExpression0).toString();
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      DruidProjectExpressionConverter druidProjectExpressionConverter0 = new DruidProjectExpressionConverter(typeManager0, standardFunctionResolution0);
      // Undeclared exception!
      try { 
        druidProjectExpressionConverter0.visitLambda(lambdaDefinitionExpression0, (Map<VariableReferenceExpression, DruidQueryGeneratorContext.Selection>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Druid does not support lambda: ARRAY comparison not supported for arrays with null elements
         //
         verifyException("com.facebook.presto.druid.DruidProjectExpressionConverter", e);
      }
  }
}
