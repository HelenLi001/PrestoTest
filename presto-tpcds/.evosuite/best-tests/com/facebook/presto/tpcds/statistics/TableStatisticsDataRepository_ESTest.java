/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 09:22:43 GMT 2021
 */

package com.facebook.presto.tpcds.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.tpcds.statistics.TableStatisticsData;
import com.facebook.presto.tpcds.statistics.TableStatisticsDataRepository;
import com.teradata.tpcds.Table;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TableStatisticsDataRepository_ESTest extends TableStatisticsDataRepository_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          TableStatisticsDataRepository tableStatisticsDataRepository0 = new TableStatisticsDataRepository();
          Table table0 = Table.S_ITEM;
          // Undeclared exception!
          try { 
            tableStatisticsDataRepository0.save("", table0, (TableStatisticsData) null);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"presto-tpcds/src/main/resources/tpcds/statistics\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.mkdir(File.java:1350)
             // java.io.File.mkdirs(File.java:1382)
             // com.facebook.presto.tpcds.statistics.TableStatisticsDataRepository.writeStatistics(TableStatisticsDataRepository.java:56)
             // com.facebook.presto.tpcds.statistics.TableStatisticsDataRepository.save(TableStatisticsDataRepository.java:44)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TableStatisticsDataRepository tableStatisticsDataRepository0 = new TableStatisticsDataRepository();
      Table table0 = Table.S_ITEM;
      Optional<TableStatisticsData> optional0 = tableStatisticsDataRepository0.load("", table0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TableStatisticsDataRepository tableStatisticsDataRepository0 = new TableStatisticsDataRepository();
      Table table0 = Table.WEB_SALES;
      // Undeclared exception!
      try { 
        tableStatisticsDataRepository0.load((String) null, table0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tpcds.statistics.TableStatisticsDataRepository", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TableStatisticsDataRepository tableStatisticsDataRepository0 = new TableStatisticsDataRepository();
      Table table0 = Table.CATALOG_SALES;
      // Undeclared exception!
      try { 
        tableStatisticsDataRepository0.save((String) null, table0, (TableStatisticsData) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tpcds.statistics.TableStatisticsDataRepository", e);
      }
  }
}
