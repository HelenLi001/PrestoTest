/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 21:52:12 GMT 2021
 */

package com.facebook.presto.hive.metastore;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.hive.metastore.Partition;
import com.facebook.presto.hive.metastore.PartitionStatistics;
import com.facebook.presto.hive.metastore.PartitionWithStatistics;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PartitionWithStatistics_ESTest extends PartitionWithStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Partition partition0 = mock(Partition.class, new ViolatedAssumptionAnswer());
      doReturn((List) null, (List) null).when(partition0).getValues();
      PartitionStatistics partitionStatistics0 = mock(PartitionStatistics.class, new ViolatedAssumptionAnswer());
      PartitionWithStatistics partitionWithStatistics0 = null;
      try {
        partitionWithStatistics0 = new PartitionWithStatistics(partition0, "", partitionStatistics0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unexpected partition name:  != null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PartitionStatistics partitionStatistics0 = mock(PartitionStatistics.class, new ViolatedAssumptionAnswer());
      PartitionWithStatistics partitionWithStatistics0 = null;
      try {
        partitionWithStatistics0 = new PartitionWithStatistics((Partition) null, "", partitionStatistics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // partition is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
