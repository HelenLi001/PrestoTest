/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 21:56:51 GMT 2021
 */

package com.facebook.presto.hive.metastore.thrift;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.hive.metastore.thrift.HiveMetastoreApiStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HiveMetastoreApiStats_ESTest extends HiveMetastoreApiStats_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HiveMetastoreApiStats hiveMetastoreApiStats0 = null;
      try {
        hiveMetastoreApiStats0 = new HiveMetastoreApiStats();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.facebook.airlift.stats.QuantileDigest
         //
         verifyException("com.facebook.airlift.stats.TimeDistribution", e);
      }
  }
}
