/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 20:59:03 GMT 2021
 */

package com.facebook.presto.hive.metastore;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.hive.HdfsConfiguration;
import com.facebook.presto.hive.HdfsEnvironment;
import com.facebook.presto.hive.MetastoreClientConfig;
import com.facebook.presto.hive.authentication.HdfsAuthentication;
import com.facebook.presto.hive.metastore.ExtendedHiveMetastore;
import com.facebook.presto.hive.metastore.SemiTransactionalHiveMetastore;
import com.google.common.util.concurrent.ListeningExecutorService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SemiTransactionalHiveMetastore_ESTest extends SemiTransactionalHiveMetastore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HdfsConfiguration hdfsConfiguration0 = mock(HdfsConfiguration.class, new ViolatedAssumptionAnswer());
      MetastoreClientConfig metastoreClientConfig0 = new MetastoreClientConfig();
      MetastoreClientConfig metastoreClientConfig1 = metastoreClientConfig0.setRequireHadoopNative(false);
      HdfsAuthentication hdfsAuthentication0 = mock(HdfsAuthentication.class, new ViolatedAssumptionAnswer());
      HdfsEnvironment hdfsEnvironment0 = new HdfsEnvironment(hdfsConfiguration0, metastoreClientConfig1, hdfsAuthentication0);
      ListeningExecutorService listeningExecutorService0 = mock(ListeningExecutorService.class, new ViolatedAssumptionAnswer());
      SemiTransactionalHiveMetastore semiTransactionalHiveMetastore0 = null;
      try {
        semiTransactionalHiveMetastore0 = new SemiTransactionalHiveMetastore(hdfsEnvironment0, (ExtendedHiveMetastore) null, listeningExecutorService0, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // delegate is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
