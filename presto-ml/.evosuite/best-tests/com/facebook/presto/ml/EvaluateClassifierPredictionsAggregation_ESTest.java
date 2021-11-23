/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 06:11:48 GMT 2021
 */

package com.facebook.presto.ml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.block.BlockBuilder;
import com.facebook.presto.ml.EvaluateClassifierPredictionsAggregation;
import com.facebook.presto.ml.EvaluateClassifierPredictionsState;
import io.airlift.slice.Slice;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EvaluateClassifierPredictionsAggregation_ESTest extends EvaluateClassifierPredictionsAggregation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        EvaluateClassifierPredictionsAggregation.input((EvaluateClassifierPredictionsState) null, 2450L, 1L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.airlift.slice.Slices
         //
         verifyException("com.facebook.presto.ml.EvaluateClassifierPredictionsAggregation", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        EvaluateClassifierPredictionsAggregation.output((EvaluateClassifierPredictionsState) null, (BlockBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.ml.EvaluateClassifierPredictionsAggregation", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        EvaluateClassifierPredictionsAggregation.input((EvaluateClassifierPredictionsState) null, (Slice) null, (Slice) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.ml.EvaluateClassifierPredictionsAggregation", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        EvaluateClassifierPredictionsAggregation.combine((EvaluateClassifierPredictionsState) null, (EvaluateClassifierPredictionsState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.ml.EvaluateClassifierPredictionsAggregation", e);
      }
  }
}
