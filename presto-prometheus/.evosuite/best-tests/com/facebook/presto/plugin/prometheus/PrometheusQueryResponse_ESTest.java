/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 05:16:44 GMT 2021
 */

package com.facebook.presto.plugin.prometheus;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.plugin.prometheus.PrometheusMetricResult;
import com.facebook.presto.plugin.prometheus.PrometheusQueryResponse;
import java.io.InputStream;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrometheusQueryResponse_ESTest extends PrometheusQueryResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrometheusQueryResponse prometheusQueryResponse0 = new PrometheusQueryResponse((InputStream) null);
      String string0 = prometheusQueryResponse0.getErrorType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrometheusQueryResponse prometheusQueryResponse0 = new PrometheusQueryResponse((InputStream) null);
      boolean boolean0 = prometheusQueryResponse0.getStatus();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrometheusQueryResponse prometheusQueryResponse0 = new PrometheusQueryResponse((InputStream) null);
      List<PrometheusMetricResult> list0 = prometheusQueryResponse0.getResults();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PrometheusQueryResponse prometheusQueryResponse0 = new PrometheusQueryResponse((InputStream) null);
      prometheusQueryResponse0.getError();
  }
}
