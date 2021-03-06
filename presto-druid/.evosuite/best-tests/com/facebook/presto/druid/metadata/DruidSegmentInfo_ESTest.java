/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:38:14 GMT 2021
 */

package com.facebook.presto.druid.metadata;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.druid.metadata.DruidSegmentInfo;
import java.util.Map;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DruidSegmentInfo_ESTest extends DruidSegmentInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DruidSegmentInfo.DeepStorageType druidSegmentInfo_DeepStorageType0 = DruidSegmentInfo.DeepStorageType.fromType("s3_zip");
      assertEquals(DruidSegmentInfo.DeepStorageType.S3, druidSegmentInfo_DeepStorageType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DruidSegmentInfo.DeepStorageType druidSegmentInfo_DeepStorageType0 = DruidSegmentInfo.DeepStorageType.fromType("hdfs");
      assertEquals(DruidSegmentInfo.DeepStorageType.HDFS, druidSegmentInfo_DeepStorageType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        DruidSegmentInfo.DeepStorageType.fromType("hDCs");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown deep storage type: hDCs
         //
         verifyException("com.facebook.presto.druid.metadata.DruidSegmentInfo$DeepStorageType", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(1988);
      DruidSegmentInfo druidSegmentInfo0 = null;
      try {
        druidSegmentInfo0 = new DruidSegmentInfo("vtmYGdb", "vtmYGdb", (Optional<Map<String, String>>) null, (Optional<Map<String, Object>>) null, integer0, 1988);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // loadSpecification is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
