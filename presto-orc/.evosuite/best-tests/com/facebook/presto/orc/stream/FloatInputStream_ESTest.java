/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 19:36:06 GMT 2021
 */

package com.facebook.presto.orc.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.block.BlockBuilder;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.orc.checkpoint.FloatStreamCheckpoint;
import com.facebook.presto.orc.stream.FloatInputStream;
import com.facebook.presto.orc.stream.OrcInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FloatInputStream_ESTest extends FloatInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      floatInputStream0.nextVector(type0, (-427), blockBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      floatInputStream0.nextVector(type0, 0, blockBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      floatInputStream0.getCheckpointType();
      FloatStreamCheckpoint floatStreamCheckpoint0 = mock(FloatStreamCheckpoint.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      int int0 = (-2810);
      // Undeclared exception!
      try { 
        floatInputStream0.skip((-2810));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      FloatStreamCheckpoint floatStreamCheckpoint0 = mock(FloatStreamCheckpoint.class, new ViolatedAssumptionAnswer());
      FloatStreamCheckpoint floatStreamCheckpoint1 = mock(FloatStreamCheckpoint.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(floatStreamCheckpoint1).getInputStreamCheckpoint();
      // Undeclared exception!
      try { 
        floatInputStream0.seekToCheckpoint(floatStreamCheckpoint1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      // Undeclared exception!
      try { 
        floatInputStream0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        floatInputStream0.nextVector(type0, 16843009, blockBuilder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      FloatStreamCheckpoint floatStreamCheckpoint0 = mock(FloatStreamCheckpoint.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(floatStreamCheckpoint0).getInputStreamCheckpoint();
      // Undeclared exception!
      try { 
        floatInputStream0.seekToCheckpoint(floatStreamCheckpoint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      // Undeclared exception!
      try { 
        floatInputStream0.skip((-3571L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      // Undeclared exception!
      try { 
        floatInputStream0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      // Undeclared exception!
      try { 
        floatInputStream0.seekToCheckpoint((FloatStreamCheckpoint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      floatInputStream0.nextVector(type0, (-2017), blockBuilder0);
      // Undeclared exception!
      try { 
        floatInputStream0.skip((-2017));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OrcInputStream orcInputStream0 = mock(OrcInputStream.class, new ViolatedAssumptionAnswer());
      FloatInputStream floatInputStream0 = new FloatInputStream((OrcInputStream) null);
      floatInputStream0.getCheckpointType();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        floatInputStream0.nextVector(type0, 8, blockBuilder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.stream.FloatInputStream", e);
      }
  }
}
