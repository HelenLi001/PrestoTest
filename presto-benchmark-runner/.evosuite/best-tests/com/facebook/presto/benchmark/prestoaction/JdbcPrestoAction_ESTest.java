/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 22:34:30 GMT 2021
 */

package com.facebook.presto.benchmark.prestoaction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.benchmark.framework.BenchmarkQuery;
import com.facebook.presto.benchmark.prestoaction.JdbcPrestoAction;
import com.facebook.presto.benchmark.prestoaction.PrestoClusterConfig;
import com.facebook.presto.benchmark.prestoaction.SqlExceptionClassifier;
import com.facebook.presto.benchmark.retry.RetryConfig;
import com.facebook.presto.jdbc.QueryStats;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JdbcPrestoAction_ESTest extends JdbcPrestoAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JdbcPrestoAction.ProgressMonitor jdbcPrestoAction_ProgressMonitor0 = new JdbcPrestoAction.ProgressMonitor();
      // Undeclared exception!
      try { 
        jdbcPrestoAction_ProgressMonitor0.accept((QueryStats) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // queryStats is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JdbcPrestoAction.ProgressMonitor jdbcPrestoAction_ProgressMonitor0 = new JdbcPrestoAction.ProgressMonitor();
      Optional<QueryStats> optional0 = jdbcPrestoAction_ProgressMonitor0.getLastQueryStats();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JdbcPrestoAction jdbcPrestoAction0 = null;
      try {
        jdbcPrestoAction0 = new JdbcPrestoAction((SqlExceptionClassifier) null, (BenchmarkQuery) null, (PrestoClusterConfig) null, (RetryConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // exceptionClassifier is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
