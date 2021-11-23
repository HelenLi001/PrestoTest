/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 18 23:46:02 GMT 2021
 */

package com.facebook.presto.common.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.block.ArrayAllocator;
import com.facebook.presto.common.block.Block;
import com.facebook.presto.common.block.BlockFlattener;
import com.facebook.presto.common.block.BlockLease;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlockFlattener_ESTest extends BlockFlattener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayAllocator arrayAllocator0 = mock(ArrayAllocator.class, new ViolatedAssumptionAnswer());
      BlockFlattener blockFlattener0 = new BlockFlattener(arrayAllocator0);
      // Undeclared exception!
      try { 
        blockFlattener0.flatten((Block) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // block is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BlockFlattener blockFlattener0 = null;
      try {
        blockFlattener0 = new BlockFlattener((ArrayAllocator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // allocator is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayAllocator arrayAllocator0 = mock(ArrayAllocator.class, new ViolatedAssumptionAnswer());
      BlockFlattener blockFlattener0 = new BlockFlattener(arrayAllocator0);
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      BlockLease blockLease0 = blockFlattener0.flatten(block0);
      assertNotNull(blockLease0);
  }
}
