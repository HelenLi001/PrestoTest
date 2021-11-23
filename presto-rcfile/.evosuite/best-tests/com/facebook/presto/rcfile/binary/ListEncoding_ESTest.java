/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 20:24:37 GMT 2021
 */

package com.facebook.presto.rcfile.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.rcfile.binary.BinaryColumnEncoding;
import com.facebook.presto.rcfile.binary.ListEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListEncoding_ESTest extends ListEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BinaryColumnEncoding binaryColumnEncoding0 = mock(BinaryColumnEncoding.class, new ViolatedAssumptionAnswer());
      ListEncoding listEncoding0 = null;
      try {
        listEncoding0 = new ListEncoding(type0, binaryColumnEncoding0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.airlift.slice.Slices
         //
         verifyException("io.airlift.slice.DynamicSliceOutput", e);
      }
  }
}
