/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 18:33:57 GMT 2021
 */

package com.facebook.presto.orc.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.orc.stream.LongBitPacker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LongBitPacker_ESTest extends LongBitPacker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LongBitPacker longBitPacker0 = null;
      try {
        longBitPacker0 = new LongBitPacker();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.airlift.slice.Slices
         //
         verifyException("com.facebook.presto.orc.stream.LongBitPacker", e);
      }
  }
}
