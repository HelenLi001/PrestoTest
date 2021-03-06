/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:43:37 GMT 2021
 */

package com.facebook.presto.druid.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.druid.DataInputSource;
import com.facebook.presto.druid.zip.EndOfCentralDirectoryRecord;
import com.facebook.presto.druid.zip.ZipFileData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EndOfCentralDirectoryRecord_ESTest extends EndOfCentralDirectoryRecord_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        EndOfCentralDirectoryRecord.read((ZipFileData) null, (DataInputSource) null, 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.zip.EndOfCentralDirectoryRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataInputSource dataInputSource0 = mock(DataInputSource.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EndOfCentralDirectoryRecord.read((ZipFileData) null, dataInputSource0, 1301L);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Malformed End of Central Directory Record; does not start with 06054b50
         //
         verifyException("com.facebook.presto.druid.zip.EndOfCentralDirectoryRecord", e);
      }
  }
}
