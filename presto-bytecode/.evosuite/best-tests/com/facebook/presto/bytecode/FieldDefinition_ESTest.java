/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 19 03:51:16 GMT 2021
 */

package com.facebook.presto.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.bytecode.Access;
import com.facebook.presto.bytecode.ClassDefinition;
import com.facebook.presto.bytecode.FieldDefinition;
import com.facebook.presto.bytecode.ParameterizedType;
import java.util.EnumSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldDefinition_ESTest extends FieldDefinition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassDefinition classDefinition0 = mock(ClassDefinition.class, new ViolatedAssumptionAnswer());
      ParameterizedType parameterizedType0 = mock(ParameterizedType.class, new ViolatedAssumptionAnswer());
      FieldDefinition fieldDefinition0 = null;
      try {
        fieldDefinition0 = new FieldDefinition(classDefinition0, (EnumSet<Access>) null, "2Vr", parameterizedType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Sets", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Access> class0 = Access.class;
      FieldDefinition fieldDefinition0 = null;
      try {
        fieldDefinition0 = new FieldDefinition((ClassDefinition) null, (EnumSet<Access>) null, "8*K.d?Pv#pOrO", class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Sets", e);
      }
  }
}
