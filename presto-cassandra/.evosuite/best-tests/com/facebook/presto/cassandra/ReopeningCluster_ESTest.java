/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:11:11 GMT 2021
 */

package com.facebook.presto.cassandra;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.datastax.driver.core.Cluster;
import com.facebook.presto.cassandra.ReopeningCluster;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReopeningCluster_ESTest extends ReopeningCluster_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Supplier<Cluster> supplier0 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      ReopeningCluster reopeningCluster0 = new ReopeningCluster(supplier0);
      reopeningCluster0.close();
      boolean boolean0 = reopeningCluster0.isClosed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Supplier<Cluster> supplier0 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      ReopeningCluster reopeningCluster0 = new ReopeningCluster(supplier0);
      // Undeclared exception!
      try { 
        reopeningCluster0.delegate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.cassandra.ReopeningCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Supplier<Cluster> supplier0 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      ReopeningCluster reopeningCluster0 = new ReopeningCluster(supplier0);
      reopeningCluster0.close();
      // Undeclared exception!
      try { 
        reopeningCluster0.delegate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cluster has been closed
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReopeningCluster reopeningCluster0 = null;
      try {
        reopeningCluster0 = new ReopeningCluster((Supplier<Cluster>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // supplier is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Supplier<Cluster> supplier0 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      ReopeningCluster reopeningCluster0 = new ReopeningCluster(supplier0);
      boolean boolean0 = reopeningCluster0.isClosed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Supplier<Cluster> supplier0 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      ReopeningCluster reopeningCluster0 = new ReopeningCluster(supplier0);
      Supplier<Cluster> supplier1 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(reopeningCluster0).when(supplier1).get();
      ReopeningCluster reopeningCluster1 = new ReopeningCluster(supplier1);
      reopeningCluster1.delegate();
      reopeningCluster1.close();
      assertTrue(reopeningCluster1.isClosed());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Supplier<Cluster> supplier0 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      ReopeningCluster reopeningCluster0 = new ReopeningCluster(supplier0);
      Supplier<Cluster> supplier1 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier1).get();
      reopeningCluster0.close();
      ReopeningCluster reopeningCluster1 = new ReopeningCluster(supplier1);
      // Undeclared exception!
      try { 
        reopeningCluster1.delegate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.cassandra.ReopeningCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Supplier<Cluster> supplier0 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      ReopeningCluster reopeningCluster0 = new ReopeningCluster(supplier0);
      Supplier<Cluster> supplier1 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(reopeningCluster0).when(supplier1).get();
      ReopeningCluster reopeningCluster1 = new ReopeningCluster(supplier1);
      reopeningCluster1.delegate();
      Cluster cluster0 = reopeningCluster1.delegate();
      assertNotSame(reopeningCluster1, cluster0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Supplier<Cluster> supplier0 = (Supplier<Cluster>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      ReopeningCluster reopeningCluster0 = new ReopeningCluster(supplier0);
      // Undeclared exception!
      try { 
        reopeningCluster0.closeAsync();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.cassandra.ReopeningCluster", e);
      }
  }
}
