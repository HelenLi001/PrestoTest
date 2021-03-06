/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:56:47 GMT 2021
 */

package com.facebook.presto.plugin.blackhole;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.facebook.airlift.http.client.HttpClientConfig;
import com.facebook.presto.execution.QueryStateTimer;
import com.facebook.presto.plugin.blackhole.BlackHoleTableLayoutHandle;
import com.facebook.presto.server.BasicQueryStats;
import com.google.common.base.Ticker;
import io.airlift.units.Duration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlackHoleTableLayoutHandle_ESTest extends BlackHoleTableLayoutHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(0, 0, 1691, 0, (Duration) null);
      int int0 = blackHoleTableLayoutHandle0.getSplitCount();
      assertEquals(0, int0);
      assertEquals(0, blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(0, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(1691, blackHoleTableLayoutHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicQueryStats basicQueryStats0 = BasicQueryStats.immediateFailureQueryStats();
      Duration duration0 = basicQueryStats0.getTotalCpuTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle((-1543), (-1543), 1528, (-1543), duration0);
      int int0 = blackHoleTableLayoutHandle0.getSplitCount();
      assertEquals((-1543), blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(1528, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals((-1543), int0);
      assertEquals((-1543), blackHoleTableLayoutHandle0.getPagesPerSplit());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(0, 0, 0, 0, (Duration) null);
      int int0 = blackHoleTableLayoutHandle0.getRowsPerPage();
      assertEquals(0, int0);
      assertEquals(0, blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(0, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(0, blackHoleTableLayoutHandle0.getPagesPerSplit());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(3, 0, (-1048), 0, (Duration) null);
      int int0 = blackHoleTableLayoutHandle0.getRowsPerPage();
      assertEquals((-1048), int0);
      assertEquals(3, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(0, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableLayoutHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(0, 0, 0, 0, (Duration) null);
      int int0 = blackHoleTableLayoutHandle0.getPagesPerSplit();
      assertEquals(0, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(0, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(0, int0);
      assertEquals(0, blackHoleTableLayoutHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicQueryStats basicQueryStats0 = BasicQueryStats.immediateFailureQueryStats();
      Duration duration0 = basicQueryStats0.getTotalCpuTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle((-1543), (-1543), 1528, (-1543), duration0);
      int int0 = blackHoleTableLayoutHandle0.getPagesPerSplit();
      assertEquals((-1543), int0);
      assertEquals((-1543), blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals((-1543), blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(1528, blackHoleTableLayoutHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ticker ticker0 = mock(Ticker.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(ticker0).read();
      QueryStateTimer queryStateTimer0 = new QueryStateTimer(ticker0);
      Duration duration0 = queryStateTimer0.getColumnAccessPermissionCheckingTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(2, 2, 2, (-796), duration0);
      blackHoleTableLayoutHandle0.getPageProcessingDelay();
      assertEquals(2, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(2, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals((-796), blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(2, blackHoleTableLayoutHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HttpClientConfig httpClientConfig0 = new HttpClientConfig();
      Duration duration0 = httpClientConfig0.getIdleTimeout();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(672, (-17), 1886, 3723, duration0);
      blackHoleTableLayoutHandle0.getPageProcessingDelay();
      assertEquals(3723, blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(672, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals((-17), blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(1886, blackHoleTableLayoutHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(3, 15, 0, 15, (Duration) null);
      int int0 = blackHoleTableLayoutHandle0.getFieldsLength();
      assertEquals(15, int0);
      assertEquals(3, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(15, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableLayoutHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ticker ticker0 = mock(Ticker.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(ticker0).read();
      QueryStateTimer queryStateTimer0 = new QueryStateTimer(ticker0);
      Duration duration0 = queryStateTimer0.getColumnAccessPermissionCheckingTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(2, 2, 2, (-796), duration0);
      int int0 = blackHoleTableLayoutHandle0.getFieldsLength();
      assertEquals(2, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(2, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(2, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals((-796), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ticker ticker0 = mock(Ticker.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(ticker0).read();
      QueryStateTimer queryStateTimer0 = new QueryStateTimer(ticker0);
      Duration duration0 = queryStateTimer0.getColumnAccessPermissionCheckingTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(2, 2, 2, (-796), duration0);
      int int0 = blackHoleTableLayoutHandle0.getPagesPerSplit();
      assertEquals((-796), blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(2, int0);
      assertEquals(2, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(2, blackHoleTableLayoutHandle0.getSplitCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ticker ticker0 = mock(Ticker.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(ticker0).read();
      QueryStateTimer queryStateTimer0 = new QueryStateTimer(ticker0);
      Duration duration0 = queryStateTimer0.getColumnAccessPermissionCheckingTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(2, 2, 2, (-796), duration0);
      int int0 = blackHoleTableLayoutHandle0.getRowsPerPage();
      assertEquals((-796), blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(2, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(2, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ticker ticker0 = mock(Ticker.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(ticker0).read();
      QueryStateTimer queryStateTimer0 = new QueryStateTimer(ticker0);
      Duration duration0 = queryStateTimer0.getColumnAccessPermissionCheckingTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(2, 2, 2, (-796), duration0);
      int int0 = blackHoleTableLayoutHandle0.getSplitCount();
      assertEquals(2, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(2, int0);
      assertEquals(2, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals((-796), blackHoleTableLayoutHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(0, 0, 1708, 0, (Duration) null);
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle1 = new BlackHoleTableLayoutHandle(0, 0, 0, 0, (Duration) null);
      boolean boolean0 = blackHoleTableLayoutHandle0.equals(blackHoleTableLayoutHandle1);
      assertEquals(0, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertFalse(boolean0);
      assertEquals(0, blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(0, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(1708, blackHoleTableLayoutHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(2, 2, 2, 2, (Duration) null);
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle1 = new BlackHoleTableLayoutHandle(2, 327, 2, 2, (Duration) null);
      boolean boolean0 = blackHoleTableLayoutHandle0.equals(blackHoleTableLayoutHandle1);
      assertFalse(boolean0);
      assertEquals(2, blackHoleTableLayoutHandle1.getRowsPerPage());
      assertEquals(327, blackHoleTableLayoutHandle1.getPagesPerSplit());
      assertEquals(2, blackHoleTableLayoutHandle1.getSplitCount());
      assertEquals(2, blackHoleTableLayoutHandle1.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle((-32), (-32), (-32), (-2379), (Duration) null);
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle1 = new BlackHoleTableLayoutHandle((-2379), (-32), (-2379), (-2379), (Duration) null);
      boolean boolean0 = blackHoleTableLayoutHandle0.equals(blackHoleTableLayoutHandle1);
      assertFalse(boolean0);
      assertEquals((-2379), blackHoleTableLayoutHandle1.getSplitCount());
      assertEquals((-32), blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals((-2379), blackHoleTableLayoutHandle1.getRowsPerPage());
      assertEquals((-2379), blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals((-32), blackHoleTableLayoutHandle1.getPagesPerSplit());
      assertEquals((-32), blackHoleTableLayoutHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ticker ticker0 = mock(Ticker.class, new ViolatedAssumptionAnswer());
      doReturn((long)24).when(ticker0).read();
      QueryStateTimer queryStateTimer0 = new QueryStateTimer(ticker0);
      Duration duration0 = queryStateTimer0.getSemanticAnalyzingTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(24, 24, 24, 24, duration0);
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle1 = new BlackHoleTableLayoutHandle(24, 24, 24, 24, duration0);
      boolean boolean0 = blackHoleTableLayoutHandle0.equals(blackHoleTableLayoutHandle1);
      assertEquals(24, blackHoleTableLayoutHandle1.getPagesPerSplit());
      assertEquals(24, blackHoleTableLayoutHandle1.getRowsPerPage());
      assertEquals(24, blackHoleTableLayoutHandle1.getSplitCount());
      assertTrue(boolean0);
      assertEquals(24, blackHoleTableLayoutHandle1.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ticker ticker0 = mock(Ticker.class, new ViolatedAssumptionAnswer());
      doReturn((long)24).when(ticker0).read();
      QueryStateTimer queryStateTimer0 = new QueryStateTimer(ticker0);
      Duration duration0 = queryStateTimer0.getSemanticAnalyzingTime();
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(24, 24, 24, 24, duration0);
      Integer integer0 = XmlSuite.DEFAULT_VERBOSE;
      boolean boolean0 = blackHoleTableLayoutHandle0.equals(integer0);
      assertFalse(boolean0);
      assertEquals(24, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(24, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(24, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(24, blackHoleTableLayoutHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(3, 15, 0, 15, (Duration) null);
      boolean boolean0 = blackHoleTableLayoutHandle0.equals(blackHoleTableLayoutHandle0);
      assertEquals(15, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(3, blackHoleTableLayoutHandle0.getSplitCount());
      assertTrue(boolean0);
      assertEquals(15, blackHoleTableLayoutHandle0.getFieldsLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(3, 0, 0, 0, (Duration) null);
      boolean boolean0 = blackHoleTableLayoutHandle0.equals((Object) null);
      assertEquals(0, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(3, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(0, blackHoleTableLayoutHandle0.getFieldsLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(3, 0, 0, 0, (Duration) null);
      int int0 = blackHoleTableLayoutHandle0.getFieldsLength();
      assertEquals(0, int0);
      assertEquals(0, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(0, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(3, blackHoleTableLayoutHandle0.getSplitCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(3, 0, 0, 0, (Duration) null);
      blackHoleTableLayoutHandle0.getPageProcessingDelay();
      assertEquals(3, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(0, blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(0, blackHoleTableLayoutHandle0.getPagesPerSplit());
      assertEquals(0, blackHoleTableLayoutHandle0.getRowsPerPage());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlackHoleTableLayoutHandle blackHoleTableLayoutHandle0 = new BlackHoleTableLayoutHandle(0, 0, 1708, 0, (Duration) null);
      blackHoleTableLayoutHandle0.hashCode();
      assertEquals(0, blackHoleTableLayoutHandle0.getFieldsLength());
      assertEquals(0, blackHoleTableLayoutHandle0.getSplitCount());
      assertEquals(1708, blackHoleTableLayoutHandle0.getRowsPerPage());
      assertEquals(0, blackHoleTableLayoutHandle0.getPagesPerSplit());
  }
}
