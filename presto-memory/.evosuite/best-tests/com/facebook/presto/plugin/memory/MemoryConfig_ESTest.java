/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 03:19:10 GMT 2021
 */

package com.facebook.presto.plugin.memory;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.plugin.memory.MemoryConfig;
import io.airlift.units.DataSize;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MemoryConfig_ESTest extends MemoryConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MemoryConfig memoryConfig0 = new MemoryConfig();
      MemoryConfig memoryConfig1 = memoryConfig0.setSplitsPerNode(0);
      memoryConfig1.setMaxDataPerNode((DataSize) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MemoryConfig memoryConfig0 = new MemoryConfig();
      MemoryConfig memoryConfig1 = memoryConfig0.setSplitsPerNode((-192));
      memoryConfig1.setMaxDataPerNode((DataSize) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MemoryConfig memoryConfig0 = new MemoryConfig();
      memoryConfig0.setSplitsPerNode(0);
      memoryConfig0.getSplitsPerNode();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MemoryConfig memoryConfig0 = new MemoryConfig();
      MemoryConfig memoryConfig1 = memoryConfig0.setSplitsPerNode((-192));
      memoryConfig1.getSplitsPerNode();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MemoryConfig memoryConfig0 = new MemoryConfig();
      MemoryConfig memoryConfig1 = memoryConfig0.setMaxDataPerNode((DataSize) null);
      memoryConfig1.getMaxDataPerNode();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MemoryConfig memoryConfig0 = new MemoryConfig();
      memoryConfig0.getSplitsPerNode();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MemoryConfig memoryConfig0 = new MemoryConfig();
      DataSize dataSize0 = memoryConfig0.getMaxDataPerNode();
      memoryConfig0.setMaxDataPerNode(dataSize0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MemoryConfig memoryConfig0 = new MemoryConfig();
      memoryConfig0.setSplitsPerNode(1);
  }
}
