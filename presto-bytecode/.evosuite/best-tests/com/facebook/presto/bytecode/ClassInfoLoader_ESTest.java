/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 19 03:31:25 GMT 2021
 */

package com.facebook.presto.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.bytecode.ClassDefinition;
import com.facebook.presto.bytecode.ClassInfoLoader;
import com.facebook.presto.bytecode.ParameterizedType;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.asm.tree.ClassNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassInfoLoader_ESTest extends ClassInfoLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassInfoLoader.createClassInfoLoader((Iterable<ClassDefinition>) null, (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.bytecode.ClassInfoLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassInfoLoader classInfoLoader0 = null;
      try {
        classInfoLoader0 = new ClassInfoLoader((Map<ParameterizedType, ClassNode>) null, (Map<ParameterizedType, byte[]>) null, (ClassLoader) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableMap", e);
      }
  }
}
