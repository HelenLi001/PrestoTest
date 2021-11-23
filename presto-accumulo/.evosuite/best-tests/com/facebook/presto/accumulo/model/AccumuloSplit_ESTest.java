/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 01:39:45 GMT 2021
 */

package com.facebook.presto.accumulo.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.accumulo.model.AccumuloColumnConstraint;
import com.facebook.presto.accumulo.model.AccumuloSplit;
import com.facebook.presto.accumulo.model.WrappedRange;
import java.util.List;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AccumuloSplit_ESTest extends AccumuloSplit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccumuloSplit accumuloSplit0 = null;
      try {
        accumuloSplit0 = new AccumuloSplit("", "", "", "", "", (List<WrappedRange>) null, (List<AccumuloColumnConstraint>) null, (Optional<String>) null, (Optional<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // constraints is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
