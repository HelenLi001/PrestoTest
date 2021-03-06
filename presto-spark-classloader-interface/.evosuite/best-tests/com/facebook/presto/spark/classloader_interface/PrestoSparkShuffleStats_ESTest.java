/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 18 22:29:32 GMT 2021
 */

package com.facebook.presto.spark.classloader_interface;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.spark.classloader_interface.PrestoSparkShuffleStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrestoSparkShuffleStats_ESTest extends PrestoSparkShuffleStats_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.WRITE;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(1, 0, prestoSparkShuffleStats_Operation0, 0L, 0, 1, 0);
      int int0 = prestoSparkShuffleStats0.getTaskId();
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals(1, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(1L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals(0, int0);
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedRows());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats((-370), (-370), prestoSparkShuffleStats_Operation0, 0L, 1L, 0L, 1L);
      int int0 = prestoSparkShuffleStats0.getTaskId();
      assertEquals(1L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals((-370), prestoSparkShuffleStats0.getFragmentId());
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedRows());
      assertEquals((-370), int0);
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedBytes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats((-370), (-370), prestoSparkShuffleStats_Operation0, 0L, 1L, 0L, 1L);
      long long0 = prestoSparkShuffleStats0.getProcessedRows();
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals((-370), prestoSparkShuffleStats0.getTaskId());
      assertEquals(0L, long0);
      assertEquals(1L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals((-370), prestoSparkShuffleStats0.getFragmentId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.WRITE;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(0, (-1117), prestoSparkShuffleStats_Operation0, 1874L, 0L, 0L, 0);
      long long0 = prestoSparkShuffleStats0.getProcessedRowBatches();
      assertEquals((-1117), prestoSparkShuffleStats0.getTaskId());
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals(0, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(0L, long0);
      assertEquals(1874L, prestoSparkShuffleStats0.getProcessedRows());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.WRITE;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(0, 0, prestoSparkShuffleStats_Operation0, 0L, 0, 0L, 0L);
      prestoSparkShuffleStats0.getProcessedBytes();
      assertEquals(0, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(0, prestoSparkShuffleStats0.getTaskId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(0, 0, prestoSparkShuffleStats_Operation0, 0, 0, 0, 431L);
      int int0 = prestoSparkShuffleStats0.getFragmentId();
      assertEquals(0, prestoSparkShuffleStats0.getTaskId());
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedRows());
      assertEquals(0, int0);
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedRowBatches());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats((-370), (-370), prestoSparkShuffleStats_Operation0, 0L, 1L, 0L, 1L);
      int int0 = prestoSparkShuffleStats0.getFragmentId();
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals((-370), int0);
      assertEquals(1L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals((-370), prestoSparkShuffleStats0.getTaskId());
      assertEquals(0L, prestoSparkShuffleStats0.getProcessedRows());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(0, (-1), prestoSparkShuffleStats_Operation0, 0L, 0L, 0L, 0L);
      prestoSparkShuffleStats0.getElapsedWallTimeMills();
      assertEquals((-1), prestoSparkShuffleStats0.getTaskId());
      assertEquals(0, prestoSparkShuffleStats0.getFragmentId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = null;
      try {
        prestoSparkShuffleStats0 = new PrestoSparkShuffleStats((-2097542166), (-2097542166), (PrestoSparkShuffleStats.Operation) null, 2776L, 2776L, (-1L), (-2097542166));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // operation is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.valueOf("WRITE");
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = null;
      try {
        prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(0, 0, prestoSparkShuffleStats_Operation0, 0, 379L, 0L, (-1481L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elapsedWallTimeMills must be greater than or equal to zero: -1481
         //
         verifyException("com.facebook.presto.spark.classloader_interface.PrestoSparkShuffleStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = null;
      try {
        prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(1151, 1151, prestoSparkShuffleStats_Operation0, 1151, 1151, (-75L), (-75L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // processedBytes must be greater than or equal to zero: -75
         //
         verifyException("com.facebook.presto.spark.classloader_interface.PrestoSparkShuffleStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.WRITE;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = null;
      try {
        prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(4530, 4530, prestoSparkShuffleStats_Operation0, 4530, (-19L), 4530, 4530);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // processedRowBatches must be greater than or equal to zero: -19
         //
         verifyException("com.facebook.presto.spark.classloader_interface.PrestoSparkShuffleStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.WRITE;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = null;
      try {
        prestoSparkShuffleStats0 = new PrestoSparkShuffleStats((-1621), (-1621), prestoSparkShuffleStats_Operation0, (-1621), (-1621), (-1621), (-1621));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // processedRows must be greater than or equal to zero: -1621
         //
         verifyException("com.facebook.presto.spark.classloader_interface.PrestoSparkShuffleStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(2457, 2457, prestoSparkShuffleStats_Operation0, 2457, 2457, 2457, 2457);
      prestoSparkShuffleStats0.getOperation();
      assertEquals(2457, prestoSparkShuffleStats0.getTaskId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals(2457, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRows());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(2457, 2457, prestoSparkShuffleStats_Operation0, 2457, 2457, 2457, 2457);
      int int0 = prestoSparkShuffleStats0.getFragmentId();
      assertEquals(2457, prestoSparkShuffleStats0.getTaskId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRows());
      assertEquals(2457, int0);
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedBytes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(2457, 2457, prestoSparkShuffleStats_Operation0, 2457, 2457, 2457, 2457);
      prestoSparkShuffleStats0.toString();
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals(2457, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals(2457, prestoSparkShuffleStats0.getTaskId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRows());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(2457, 2457, prestoSparkShuffleStats_Operation0, 2457, 2457, 2457, 2457);
      long long0 = prestoSparkShuffleStats0.getElapsedWallTimeMills();
      assertEquals(2457, prestoSparkShuffleStats0.getTaskId());
      assertEquals(2457, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals(2457L, long0);
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRows());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(2457, 2457, prestoSparkShuffleStats_Operation0, 2457, 2457, 2457, 2457);
      long long0 = prestoSparkShuffleStats0.getProcessedRows();
      assertEquals(2457L, long0);
      assertEquals(2457, prestoSparkShuffleStats0.getTaskId());
      assertEquals(2457, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedBytes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(2457, 2457, prestoSparkShuffleStats_Operation0, 2457, 2457, 2457, 2457);
      long long0 = prestoSparkShuffleStats0.getProcessedBytes();
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRows());
      assertEquals(2457L, long0);
      assertEquals(2457, prestoSparkShuffleStats0.getTaskId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals(2457, prestoSparkShuffleStats0.getFragmentId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(2457, 2457, prestoSparkShuffleStats_Operation0, 2457, 2457, 2457, 2457);
      long long0 = prestoSparkShuffleStats0.getProcessedRowBatches();
      assertEquals(2457, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(2457, prestoSparkShuffleStats0.getTaskId());
      assertEquals(2457L, long0);
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRows());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedBytes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrestoSparkShuffleStats.Operation prestoSparkShuffleStats_Operation0 = PrestoSparkShuffleStats.Operation.READ;
      PrestoSparkShuffleStats prestoSparkShuffleStats0 = new PrestoSparkShuffleStats(2457, 2457, prestoSparkShuffleStats_Operation0, 2457, 2457, 2457, 2457);
      int int0 = prestoSparkShuffleStats0.getTaskId();
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedBytes());
      assertEquals(2457, prestoSparkShuffleStats0.getFragmentId());
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRowBatches());
      assertEquals(2457, int0);
      assertEquals(2457L, prestoSparkShuffleStats0.getProcessedRows());
  }
}
