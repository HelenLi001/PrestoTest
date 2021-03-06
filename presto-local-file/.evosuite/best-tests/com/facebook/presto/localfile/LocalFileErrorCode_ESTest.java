/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 04:06:51 GMT 2021
 */

package com.facebook.presto.localfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.localfile.LocalFileErrorCode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocalFileErrorCode_ESTest extends LocalFileErrorCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalFileErrorCode localFileErrorCode0 = LocalFileErrorCode.LOCAL_FILE_READ_ERROR;
      localFileErrorCode0.toErrorCode();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalFileErrorCode.valueOf("LOCAL_FILE_FILESYSTEM_ERROR");
      // Undeclared exception!
      try { 
        LocalFileErrorCode.valueOf("2S)^_P+eKj(@72Gw<H");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.facebook.presto.localfile.LocalFileErrorCode.2S)^_P+eKj(@72Gw<H
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalFileErrorCode.values();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalFileErrorCode localFileErrorCode0 = LocalFileErrorCode.LOCAL_FILE_NO_FILES;
  }
}
