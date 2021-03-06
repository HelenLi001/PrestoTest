/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 20:05:33 GMT 2021
 */

package com.facebook.presto.orc.array;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.orc.array.BigArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BigArrays_ESTest extends BigArrays_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigArrays.segment(0L);
      BigArrays.offset(0L);
      BigArrays.offset(315L);
      BigArrays.offset(0L);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BigArrays.segment(1023L);
      BigArrays.segment((-1007L));
      BigArrays.offset(0L);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BigArrays.segment(2150L);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BigArrays.segment(1L);
      BigArrays.segment((-1L));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BigArrays.segment((-1037L));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BigArrays.offset(1L);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BigArrays.segment(950L);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BigArrays.segment(30L);
      BigArrays.offset(30L);
  }
}
