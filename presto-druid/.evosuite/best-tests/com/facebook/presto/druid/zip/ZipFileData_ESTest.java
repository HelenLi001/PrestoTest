/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:28:35 GMT 2021
 */

package com.facebook.presto.druid.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.druid.zip.ZipFileData;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZipFileData_ESTest extends ZipFileData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZipFileData zipFileData0 = null;
      try {
        zipFileData0 = new ZipFileData((Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zip file charset could not be null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
