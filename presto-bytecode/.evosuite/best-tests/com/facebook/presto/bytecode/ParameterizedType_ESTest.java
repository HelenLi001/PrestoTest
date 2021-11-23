/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 19 03:19:32 GMT 2021
 */

package com.facebook.presto.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.bytecode.ParameterizedType;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParameterizedType_ESTest extends ParameterizedType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName("");
      parameterizedType0.getSimpleName();
      assertEquals("L;", parameterizedType0.getType());
      assertFalse(parameterizedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName("");
      parameterizedType0.getJavaClassName();
      assertEquals("L;", parameterizedType0.getType());
      assertFalse(parameterizedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName("");
      parameterizedType0.getClassName();
      assertEquals("L;", parameterizedType0.getType());
      assertFalse(parameterizedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParameterizedType.typeFromPathName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParameterizedType.typeFromJavaClassName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.getType("L");
      // Undeclared exception!
      try { 
        ParameterizedType.type(type0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParameterizedType.type((Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName("Z");
      Type type0 = parameterizedType0.getAsmType();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.getMethodType(type0, typeArray0);
      // Undeclared exception!
      try { 
        ParameterizedType.type(type1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class name (LZ;LZ;)LZ;
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Class.class;
      // Undeclared exception!
      try { 
        ParameterizedType.type(class0, (ParameterizedType[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.bytecode.ParameterizedType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class[] classArray0 = (Class[]) Array.newInstance(Class.class, 8);
      // Undeclared exception!
      try { 
        ParameterizedType.type(classArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParameterizedType.getPathName((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.bytecode.ParameterizedType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromPathName("");
      // Undeclared exception!
      try { 
        parameterizedType0.getAsmType();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParameterizedType parameterizedType0 = null;
      try {
        parameterizedType0 = new ParameterizedType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Class.class;
      Class[] classArray0 = (Class[]) Array.newInstance(Class.class, 2);
      Class<Integer> class1 = Class.class;
      classArray0[0] = class1;
      Class<Integer> class2 = Class.class;
      classArray0[1] = class2;
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0, classArray0);
      String string0 = parameterizedType0.getGenericSignature();
      assertEquals("Ljava/lang/Class<Ljava/lang/Class;Ljava/lang/Class;>;", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Integer> class0 = Class.class;
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0);
      String string0 = parameterizedType0.getGenericSignature();
      assertFalse(parameterizedType0.isPrimitive());
      assertEquals("Ljava/lang/Class;", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ParameterizedType parameterizedType0 = null;
      try {
        parameterizedType0 = new ParameterizedType("vodq;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class name vodq;
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ParameterizedType parameterizedType0 = null;
      try {
        parameterizedType0 = new ParameterizedType("com.google.common.collect.ImmutableList");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class name com.google.common.collect.ImmutableList
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Integer> class0 = Class.class;
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0);
      String string0 = parameterizedType0.toString();
      assertEquals("Ljava/lang/Class;", string0);
      assertFalse(parameterizedType0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Class.class;
      String string0 = ParameterizedType.getPathName(class0);
      assertEquals("java/lang/Class", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromPathName("U");
      ParameterizedType parameterizedType1 = ParameterizedType.typeFromPathName("V");
      boolean boolean0 = parameterizedType0.equals(parameterizedType1);
      assertEquals("LV;", parameterizedType1.getType());
      assertFalse(parameterizedType1.isInterface());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ParameterizedType parameterizedType0 = new ParameterizedType("'~C)");
      Type type0 = parameterizedType0.getAsmType();
      ParameterizedType parameterizedType1 = ParameterizedType.type(type0);
      boolean boolean0 = parameterizedType1.equals(parameterizedType0);
      assertTrue(boolean0);
      assertFalse(parameterizedType1.isInterface());
      assertEquals("L'~C);", parameterizedType1.getType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType[] parameterizedTypeArray0 = new ParameterizedType[0];
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0, parameterizedTypeArray0);
      boolean boolean0 = parameterizedType0.equals((Object) null);
      assertFalse(parameterizedType0.isPrimitive());
      assertEquals("java/lang/Object", parameterizedType0.getClassName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ParameterizedType parameterizedType0 = new ParameterizedType("ZbxQV)0JS");
      boolean boolean0 = parameterizedType0.equals(parameterizedType0);
      assertEquals("LZbxQV)0JS;", parameterizedType0.getType());
      assertFalse(parameterizedType0.isInterface());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromPathName("");
      boolean boolean0 = parameterizedType0.equals("");
      assertFalse(parameterizedType0.isInterface());
      assertEquals("L;", parameterizedType0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = class0;
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0, classArray0);
      boolean boolean0 = parameterizedType0.isPrimitive();
      assertFalse(boolean0);
      assertEquals("java/lang/Object", parameterizedType0.getClassName());
      assertTrue(parameterizedType0.isGeneric());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ParameterizedType parameterizedType0 = new ParameterizedType("ZbxQV)0JS");
      boolean boolean0 = parameterizedType0.isGeneric();
      assertFalse(parameterizedType0.isInterface());
      assertEquals("LZbxQV)0JS;", parameterizedType0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = class0;
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0, classArray0);
      boolean boolean0 = parameterizedType0.isGeneric();
      assertEquals("Ljava/lang/Object;", parameterizedType0.getType());
      assertFalse(parameterizedType0.isPrimitive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType[] parameterizedTypeArray0 = new ParameterizedType[1];
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = class0;
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0, classArray0);
      assertTrue(parameterizedType0.isGeneric());
      assertFalse(parameterizedType0.isPrimitive());
      
      parameterizedTypeArray0[0] = parameterizedType0;
      ParameterizedType parameterizedType1 = ParameterizedType.type(class0, parameterizedTypeArray0);
      assertTrue(parameterizedType1.isGeneric());
      assertFalse(parameterizedType1.isPrimitive());
      assertEquals("java/lang/Object", parameterizedType1.getClassName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        ParameterizedType.type(class0, classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.bytecode.ParameterizedType", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParameterizedType.typeFromJavaClassName("L K}f2kMa45P-2kvVEUD;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class name L K}f2kMa45P-2kvVEUD;
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParameterizedType.typeFromPathName("U<Z.'5fF`-S>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid class name U<Z.'5fF`-S>
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName("U<Z.'5fF`-S>");
      parameterizedType0.getPrimitiveType();
      assertEquals("LU<Z/'5fF`-S>;", parameterizedType0.getType());
      assertFalse(parameterizedType0.isInterface());
      assertEquals("'5fF`-S>", parameterizedType0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType[] parameterizedTypeArray0 = new ParameterizedType[0];
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0, parameterizedTypeArray0);
      parameterizedType0.getArrayComponentType();
      assertFalse(parameterizedType0.isPrimitive());
      assertEquals("java/lang/Object", parameterizedType0.getClassName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ParameterizedType parameterizedType0 = new ParameterizedType("'~C)");
      boolean boolean0 = parameterizedType0.isInterface();
      assertEquals("L'~C);", parameterizedType0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ParameterizedType parameterizedType0 = new ParameterizedType("'~C)");
      parameterizedType0.hashCode();
      assertFalse(parameterizedType0.isInterface());
      assertEquals("L'~C);", parameterizedType0.getType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName(" K}f2kMa45P-2kvVEUD");
      parameterizedType0.getClassName();
      assertFalse(parameterizedType0.isInterface());
      assertEquals("L K}f2kMa45P-2kvVEUD;", parameterizedType0.getType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Integer> class0 = Class.class;
      Class[] classArray0 = (Class[]) Array.newInstance(Class.class, 0);
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0, classArray0);
      assertFalse(parameterizedType0.isPrimitive());
      assertEquals("java/lang/Class", parameterizedType0.getClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName(" K}f2kMa45P-2kvVEUD");
      String string0 = parameterizedType0.getType();
      assertEquals("L K}f2kMa45P-2kvVEUD;", string0);
      assertFalse(parameterizedType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ParameterizedType parameterizedType0 = ParameterizedType.typeFromJavaClassName("U<Z.'5fF`-S>");
      String string0 = parameterizedType0.getSimpleName();
      assertFalse(parameterizedType0.isInterface());
      assertEquals("'5fF`-S>", string0);
      assertEquals("LU<Z/'5fF`-S>;", parameterizedType0.getType());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedType[] parameterizedTypeArray0 = new ParameterizedType[0];
      ParameterizedType parameterizedType0 = ParameterizedType.type(class0, parameterizedTypeArray0);
      String string0 = parameterizedType0.getJavaClassName();
      assertFalse(parameterizedType0.isPrimitive());
      assertEquals("java/lang/Object", parameterizedType0.getClassName());
      assertEquals("java.lang.Object", string0);
  }
}
