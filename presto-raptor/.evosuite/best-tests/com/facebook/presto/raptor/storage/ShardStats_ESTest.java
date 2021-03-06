/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 13:47:46 GMT 2021
 */

package com.facebook.presto.raptor.storage;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.common.type.TypeManager;
import com.facebook.presto.orc.OrcReader;
import com.facebook.presto.raptor.storage.ShardStats;
import io.airlift.slice.Slice;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShardStats_ESTest extends ShardStats_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShardStats.truncateIndexValue((Slice) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.raptor.storage.ShardStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShardStats.computeColumnStats((OrcReader) null, (-2867L), (Type) null, (TypeManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // typeManager is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
