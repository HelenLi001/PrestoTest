/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 17:41:54 GMT 2021
 */

package com.facebook.presto.resourceGroups.db;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.resourceGroups.db.DbSourceExactMatchSelector;
import com.facebook.presto.resourceGroups.db.ResourceGroupsDao;
import com.facebook.presto.spi.resourceGroups.SelectionCriteria;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DbSourceExactMatchSelector_ESTest extends DbSourceExactMatchSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ResourceGroupsDao resourceGroupsDao0 = mock(ResourceGroupsDao.class, new ViolatedAssumptionAnswer());
      DbSourceExactMatchSelector dbSourceExactMatchSelector0 = null;
      try {
        dbSourceExactMatchSelector0 = new DbSourceExactMatchSelector((String) null, resourceGroupsDao0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // environment is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResourceGroupsDao resourceGroupsDao0 = mock(ResourceGroupsDao.class, new ViolatedAssumptionAnswer());
      DbSourceExactMatchSelector dbSourceExactMatchSelector0 = new DbSourceExactMatchSelector("", resourceGroupsDao0);
      SelectionCriteria selectionCriteria0 = mock(SelectionCriteria.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(selectionCriteria0).getSource();
      // Undeclared exception!
      try { 
        dbSourceExactMatchSelector0.match(selectionCriteria0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.resourceGroups.db.DbSourceExactMatchSelector", e);
      }
  }
}
