/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 07:03:01 GMT 2021
 */

package com.facebook.presto.kudu.properties;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.kudu.properties.HashPartitionDefinition;
import com.facebook.presto.kudu.properties.PartitionDesign;
import com.facebook.presto.kudu.properties.RangePartitionDefinition;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PartitionDesign_ESTest extends PartitionDesign_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PartitionDesign partitionDesign0 = new PartitionDesign();
      boolean boolean0 = partitionDesign0.hasPartitions();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PartitionDesign partitionDesign0 = new PartitionDesign();
      partitionDesign0.setRange((RangePartitionDefinition) null);
      assertFalse(partitionDesign0.hasPartitions());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PartitionDesign partitionDesign0 = new PartitionDesign();
      RangePartitionDefinition rangePartitionDefinition0 = partitionDesign0.getRange();
      assertNull(rangePartitionDefinition0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PartitionDesign partitionDesign0 = new PartitionDesign();
      List<HashPartitionDefinition> list0 = partitionDesign0.getHash();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PartitionDesign partitionDesign0 = new PartitionDesign();
      partitionDesign0.setHash((List<HashPartitionDefinition>) null);
      assertFalse(partitionDesign0.hasPartitions());
  }
}
