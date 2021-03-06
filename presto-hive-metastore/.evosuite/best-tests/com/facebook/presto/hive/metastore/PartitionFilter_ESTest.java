/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 21:40:46 GMT 2021
 */

package com.facebook.presto.hive.metastore;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.predicate.Domain;
import com.facebook.presto.hive.metastore.Column;
import com.facebook.presto.hive.metastore.HiveTableName;
import com.facebook.presto.hive.metastore.PartitionFilter;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PartitionFilter_ESTest extends PartitionFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        PartitionFilter.partitionFilter("", "A;n", (Map<Column, Domain>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // effectivePredicate is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HiveTableName hiveTableName0 = mock(HiveTableName.class, new ViolatedAssumptionAnswer());
      PartitionFilter partitionFilter0 = null;
      try {
        partitionFilter0 = new PartitionFilter(hiveTableName0, (Map<Column, Domain>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // effectivePredicate is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
