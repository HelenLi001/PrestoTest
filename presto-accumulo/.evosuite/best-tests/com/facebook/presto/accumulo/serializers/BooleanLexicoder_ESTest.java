/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 01:38:35 GMT 2021
 */

package com.facebook.presto.accumulo.serializers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.accumulo.serializers.BooleanLexicoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanLexicoder_ESTest extends BooleanLexicoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanLexicoder booleanLexicoder0 = new BooleanLexicoder();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-83);
      Boolean boolean0 = booleanLexicoder0.decode(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanLexicoder booleanLexicoder0 = new BooleanLexicoder();
      // Undeclared exception!
      try { 
        booleanLexicoder0.encode((Boolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.BooleanLexicoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanLexicoder booleanLexicoder0 = new BooleanLexicoder();
      // Undeclared exception!
      try { 
        booleanLexicoder0.decode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.BooleanLexicoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanLexicoder booleanLexicoder0 = new BooleanLexicoder();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        booleanLexicoder0.decode(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.facebook.presto.accumulo.serializers.BooleanLexicoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BooleanLexicoder booleanLexicoder0 = new BooleanLexicoder();
      Boolean boolean0 = booleanLexicoder0.decode(booleanLexicoder0.FALSE);
      byte[] byteArray0 = booleanLexicoder0.encode(boolean0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }
}
