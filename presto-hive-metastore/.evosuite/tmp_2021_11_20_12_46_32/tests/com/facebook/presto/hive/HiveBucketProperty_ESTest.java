/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 21:18:40 GMT 2021
 */

package com.facebook.presto.hive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.hive.BucketFunctionType;
import com.facebook.presto.hive.HiveBucketProperty;
import com.facebook.presto.hive.metastore.SortingColumn;
import java.util.List;
import java.util.Optional;
import org.apache.hadoop.hive.metastore.api.StorageDescriptor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HiveBucketProperty_ESTest extends HiveBucketProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StorageDescriptor storageDescriptor0 = mock(StorageDescriptor.class, new ViolatedAssumptionAnswer());
      doReturn((-1325)).when(storageDescriptor0).getNumBuckets();
      doReturn(false).when(storageDescriptor0).isSetBucketCols();
      doReturn(true).when(storageDescriptor0).isSetNumBuckets();
      Optional<HiveBucketProperty> optional0 = HiveBucketProperty.fromStorageDescriptor(storageDescriptor0, "");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BucketFunctionType bucketFunctionType0 = BucketFunctionType.PRESTO_NATIVE;
      HiveBucketProperty hiveBucketProperty0 = null;
      try {
        hiveBucketProperty0 = new HiveBucketProperty((List<String>) null, 0, (List<SortingColumn>) null, bucketFunctionType0, (Optional<List<Type>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // bucketedBy is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StorageDescriptor storageDescriptor0 = mock(StorageDescriptor.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(storageDescriptor0).getNumBuckets();
      doReturn(false).when(storageDescriptor0).isSetBucketCols();
      doReturn(true).when(storageDescriptor0).isSetNumBuckets();
      // Undeclared exception!
      try { 
        HiveBucketProperty.fromStorageDescriptor(storageDescriptor0, "eXq=@,T9F/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Table/partition metadata has 'numBuckets' set, but 'bucketCols' is not set: eXq=@,T9F/
         //
         verifyException("com.facebook.presto.hive.HiveBucketProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StorageDescriptor storageDescriptor0 = mock(StorageDescriptor.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(storageDescriptor0).getBucketCols();
      doReturn(0).when(storageDescriptor0).getNumBuckets();
      doReturn(true).when(storageDescriptor0).isSetBucketCols();
      doReturn(true).when(storageDescriptor0).isSetNumBuckets();
      HiveBucketProperty.fromStorageDescriptor(storageDescriptor0, " DESC");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StorageDescriptor storageDescriptor0 = mock(StorageDescriptor.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(storageDescriptor0).isSetBucketCols();
      doReturn(false).when(storageDescriptor0).isSetNumBuckets();
      Optional<HiveBucketProperty> optional0 = HiveBucketProperty.fromStorageDescriptor(storageDescriptor0, "");
      assertNotNull(optional0);
  }
}
