/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 10:32:24 GMT 2021
 */

package com.facebook.presto.benchmark.driver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.benchmark.driver.BenchmarkQuery;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BenchmarkQuery_ESTest extends BenchmarkQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("com.google.common.collect.TreeTraverser$4", "com.google.common.collect.TreeTraverser$4");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/com.google.common.collect.TreeTraverser$40com.google.common.collect.TreeTraverser$4");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "~./%;/~lT ");
      BenchmarkQuery benchmarkQuery0 = new BenchmarkQuery(file0);
      String string0 = benchmarkQuery0.getSql();
      assertEquals("~./%;/~lT", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile(".negate()", "");
      BenchmarkQuery benchmarkQuery0 = new BenchmarkQuery(file0);
      String string0 = benchmarkQuery0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BenchmarkQuery benchmarkQuery0 = null;
      try {
        benchmarkQuery0 = new BenchmarkQuery((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // file is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getAbsolutePath();
      doReturn("").when(file0).getName();
      BenchmarkQuery benchmarkQuery0 = null;
      try {
        benchmarkQuery0 = new BenchmarkQuery(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      File file0 = MockFile.createTempFile(".AHi1vcvzh}e", ".AHi1vcvzh}e");
      FileSystemHandling.shouldAllThrowIOExceptions();
      BenchmarkQuery benchmarkQuery0 = null;
      try {
        benchmarkQuery0 = new BenchmarkQuery(file0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("BdT\"6]U").when(file0).getAbsolutePath();
      doReturn("com.google.common.collect.ImmutableMultimap").when(file0).getName();
      BenchmarkQuery benchmarkQuery0 = null;
      try {
        benchmarkQuery0 = new BenchmarkQuery(file0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      File file0 = MockFile.createTempFile("com.googlR.common.collect.TreTr?verer$3", "com.googlR.common.collect.TreTr?verer$3");
      BenchmarkQuery benchmarkQuery0 = new BenchmarkQuery(file0);
      String string0 = benchmarkQuery0.getName();
      assertEquals("com.googlR.common.collect.TreTr?verer$30com.googlR.common.collect", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      File file0 = MockFile.createTempFile("com.googlR.common.collect.TreTr?verer$3", "com.googlR.common.collect.TreTr?verer$3");
      BenchmarkQuery benchmarkQuery0 = new BenchmarkQuery(file0);
      Map<String, String> map0 = benchmarkQuery0.getTags();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      File file0 = MockFile.createTempFile("X-do\nBskhbs`:", "X-do\nBskhbs`:");
      BenchmarkQuery benchmarkQuery0 = new BenchmarkQuery(file0);
      String string0 = benchmarkQuery0.getSql();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      File file0 = MockFile.createTempFile("X-do\nBskhbs`:", "X-do\nBskhbs`:");
      BenchmarkQuery benchmarkQuery0 = new BenchmarkQuery(file0);
      String string0 = benchmarkQuery0.toString();
      assertEquals("BenchmarkQuery{name=X-do\nBskhbs`:0X-do\nBskhbs`:, tags={}, sql=}", string0);
  }
}
