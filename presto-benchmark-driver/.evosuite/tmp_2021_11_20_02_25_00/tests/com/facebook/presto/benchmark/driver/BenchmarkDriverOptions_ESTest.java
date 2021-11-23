/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 10:30:42 GMT 2021
 */

package com.facebook.presto.benchmark.driver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.benchmark.driver.BenchmarkDriverOptions;
import com.facebook.presto.client.ClientSession;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BenchmarkDriverOptions_ESTest extends BenchmarkDriverOptions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("*U+]==;");
      Optional<String> optional0 = benchmarkDriverOptions_ClientSessionProperty0.getCatalog();
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty1 = null;
      try {
        benchmarkDriverOptions_ClientSessionProperty1 = new BenchmarkDriverOptions.ClientSessionProperty(optional0, "=;", "helen");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Session property name must not contain '=': =;
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BenchmarkDriverOptions benchmarkDriverOptions0 = new BenchmarkDriverOptions();
      benchmarkDriverOptions0.disableCompression = true;
      ClientSession clientSession0 = benchmarkDriverOptions0.getClientSession();
      assertEquals("helen", clientSession0.getUser());
      assertEquals(1, benchmarkDriverOptions0.warm);
      assertTrue(clientSession0.isCompressionDisabled());
      assertEquals("presto-benchmark", clientSession0.getSource());
      assertEquals(3, benchmarkDriverOptions0.runs);
      assertEquals(10, benchmarkDriverOptions0.maxFailures);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("*TY7DU=NS");
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty1 = new BenchmarkDriverOptions.ClientSessionProperty("*TY7DU=NS");
      boolean boolean0 = benchmarkDriverOptions_ClientSessionProperty0.equals(benchmarkDriverOptions_ClientSessionProperty1);
      assertTrue(boolean0);
      assertEquals("NS", benchmarkDriverOptions_ClientSessionProperty1.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("*U+]==;");
      Optional<String> optional0 = benchmarkDriverOptions_ClientSessionProperty0.getCatalog();
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty1 = new BenchmarkDriverOptions.ClientSessionProperty(optional0, "suite.json", "helen");
      boolean boolean0 = benchmarkDriverOptions_ClientSessionProperty0.equals(benchmarkDriverOptions_ClientSessionProperty1);
      assertFalse(boolean0);
      assertEquals("=;", benchmarkDriverOptions_ClientSessionProperty0.getValue());
      assertEquals("suite.json", benchmarkDriverOptions_ClientSessionProperty1.getName());
      assertEquals("helen", benchmarkDriverOptions_ClientSessionProperty1.getValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("P.3,=FyX0");
      boolean boolean0 = benchmarkDriverOptions_ClientSessionProperty0.equals("3,");
      assertEquals("3,", benchmarkDriverOptions_ClientSessionProperty0.getName());
      assertEquals("FyX0", benchmarkDriverOptions_ClientSessionProperty0.getValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("*U+]==;");
      boolean boolean0 = benchmarkDriverOptions_ClientSessionProperty0.equals(benchmarkDriverOptions_ClientSessionProperty0);
      assertEquals("=;", benchmarkDriverOptions_ClientSessionProperty0.getValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("P.3,=FyX0");
      boolean boolean0 = benchmarkDriverOptions_ClientSessionProperty0.equals((Object) null);
      assertEquals("3,", benchmarkDriverOptions_ClientSessionProperty0.getName());
      assertFalse(boolean0);
      assertEquals("FyX0", benchmarkDriverOptions_ClientSessionProperty0.getValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("P.3,=FyX0");
      String string0 = benchmarkDriverOptions_ClientSessionProperty0.toString();
      assertEquals("P.3,=FyX0", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("G.;\"yZax}t=");
      Optional<String> optional0 = benchmarkDriverOptions_ClientSessionProperty0.getCatalog();
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty1 = null;
      try {
        benchmarkDriverOptions_ClientSessionProperty1 = new BenchmarkDriverOptions.ClientSessionProperty(optional0, "G.;\"yZax}t=", "G.;\"yZax}t=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Session property name must not contain '=': G.;\"yZax}t=
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = null;
      try {
        benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Session property name is empty
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = null;
      try {
        benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty(".1IVT=Obt4W}z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid session property: Optional[].1IVT:Obt4W}z
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = null;
      try {
        benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("%si?<xr.p_fI}0.z={I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid session property: %si?<xr.p_fI}0.z={I
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("*U+]==;");
      String string0 = benchmarkDriverOptions_ClientSessionProperty0.toString();
      assertEquals("*U+]==;", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = null;
      try {
        benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("com.facebook.presto.benchmark.driver.BenchmarkDriverOptins$ClientSessionProperty");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Session property: com.facebook.presto.benchmark.driver.BenchmarkDriverOptins$ClientSessionProperty
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BenchmarkDriverOptions benchmarkDriverOptions0 = new BenchmarkDriverOptions();
      ClientSession clientSession0 = benchmarkDriverOptions0.getClientSession();
      assertEquals(10, benchmarkDriverOptions0.maxFailures);
      assertEquals(3, benchmarkDriverOptions0.runs);
      assertEquals("helen", clientSession0.getUser());
      assertEquals(1, benchmarkDriverOptions0.warm);
      assertEquals("presto-benchmark", clientSession0.getSource());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("P.3,=FyX0");
      Optional<String> optional0 = benchmarkDriverOptions_ClientSessionProperty0.getCatalog();
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty1 = new BenchmarkDriverOptions.ClientSessionProperty(optional0, "3,", "helen");
      boolean boolean0 = benchmarkDriverOptions_ClientSessionProperty0.equals(benchmarkDriverOptions_ClientSessionProperty1);
      assertEquals("3,", benchmarkDriverOptions_ClientSessionProperty1.getName());
      assertEquals("FyX0", benchmarkDriverOptions_ClientSessionProperty0.getValue());
      assertEquals("helen", benchmarkDriverOptions_ClientSessionProperty1.getValue());
      assertFalse(boolean0);
      assertEquals("3,", benchmarkDriverOptions_ClientSessionProperty0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("P.3,=FyX0");
      String string0 = benchmarkDriverOptions_ClientSessionProperty0.getValue();
      assertEquals("FyX0", string0);
      assertEquals("3,", benchmarkDriverOptions_ClientSessionProperty0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BenchmarkDriverOptions.ClientSessionProperty benchmarkDriverOptions_ClientSessionProperty0 = new BenchmarkDriverOptions.ClientSessionProperty("P.3,=FyX0");
      String string0 = benchmarkDriverOptions_ClientSessionProperty0.getName();
      assertEquals("3,", string0);
      assertEquals("FyX0", benchmarkDriverOptions_ClientSessionProperty0.getValue());
  }
}
