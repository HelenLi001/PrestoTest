/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 19:41:34 GMT 2021
 */

package com.facebook.presto.tests.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.tests.cli.PrestoCliTests;
import io.prestodb.tempto.Requirement;
import io.prestodb.tempto.configuration.Configuration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrestoCliTests_ESTest extends PrestoCliTests_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      prestoCliTests0.serverHost = "";
      prestoCliTests0.serverAddress = "";
      try { 
        prestoCliTests0.shouldRunBatchQuery();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlSuite xmlSuite0 = new XmlSuite();
      List<String> list0 = xmlSuite0.getIncludedGroups();
      List<String> list1 = PrestoCliTests.squeezeLines(list0);
      assertTrue(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      List<String> list0 = prestoCliTests0.nationTableBatchLines;
      List<String> list1 = PrestoCliTests.squeezeLines(list0);
      assertEquals(25, list1.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      try { 
        prestoCliTests0.shouldRunQueryFromFile();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/tmp0.tmp");
      FileSystemHandling.createFolder(evoSuiteFile0);
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      try { 
        prestoCliTests0.shouldRunQueryFromFile();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      try { 
        prestoCliTests0.shouldNotExitOnErrorFromFile();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/tmp0.tmp");
      FileSystemHandling.createFolder(evoSuiteFile0);
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      try { 
        prestoCliTests0.shouldNotExitOnErrorFromFile();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      try { 
        prestoCliTests0.shouldExitOnErrorFromFile();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/tmp0.tmp");
      FileSystemHandling.createFolder(evoSuiteFile0);
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      try { 
        prestoCliTests0.shouldExitOnErrorFromFile();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      PrestoCliTests prestoCliTests1 = new PrestoCliTests();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      // Undeclared exception!
      try { 
        prestoCliTests0.shouldNotExitOnErrorFromFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      // Undeclared exception!
      try { 
        prestoCliTests0.shouldExitOnErrorFromFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      try { 
        prestoCliTests0.shouldRunQueryFromFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PrestoCliTests prestoCliTests0 = new PrestoCliTests();
          // Undeclared exception!
          try { 
            prestoCliTests0.shouldDisplayVersion();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:796)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // com.facebook.presto.tests.cli.PrestoCliLauncher.launchPrestoCli(PrestoCliLauncher.java:76)
             // com.facebook.presto.tests.cli.PrestoCliLauncher.launchPrestoCli(PrestoCliLauncher.java:70)
             // com.facebook.presto.tests.cli.PrestoCliTests.shouldDisplayVersion(PrestoCliTests.java:105)
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
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      // Undeclared exception!
      try { 
        prestoCliTests0.shouldRunQuery();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      Requirement requirement0 = prestoCliTests0.getRequirements((Configuration) null);
      assertNotNull(requirement0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      prestoCliTests0.stopPresto();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrestoCliTests.squeezeLines((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.cli.PrestoCliTests", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      // Undeclared exception!
      try { 
        prestoCliTests0.shouldHandleTransaction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      // Undeclared exception!
      try { 
        prestoCliTests0.testSetRole();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      // Undeclared exception!
      try { 
        prestoCliTests0.shouldExitOnErrorFromExecute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      try { 
        prestoCliTests0.shouldUseCatalogAndSchemaOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      // Undeclared exception!
      try { 
        prestoCliTests0.shouldNotExitOnErrorFromExecute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrestoCliTests prestoCliTests0 = new PrestoCliTests();
      // Undeclared exception!
      try { 
        prestoCliTests0.shouldHandleSession();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // at index 1
         //
         verifyException("com.google.common.collect.ObjectArrays", e);
      }
  }
}
