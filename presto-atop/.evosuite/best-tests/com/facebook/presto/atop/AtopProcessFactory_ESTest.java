/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 23:49:20 GMT 2021
 */

package com.facebook.presto.atop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.atop.AtopConnectorConfig;
import com.facebook.presto.atop.AtopConnectorId;
import com.facebook.presto.atop.AtopProcessFactory;
import com.facebook.presto.atop.AtopTable;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesException;
import java.util.IllegalFormatConversionException;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AtopProcessFactory_ESTest extends AtopProcessFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("file");
      AtopProcessFactory atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig0, atopConnectorId0);
      AtopTable atopTable0 = AtopTable.DISKS;
      // Undeclared exception!
      try { 
        atopProcessFactory0.create(atopTable0, (ZonedDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.atop.AtopProcessFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("Unable to close jar file.");
      AtopProcessFactory atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig0, atopConnectorId0);
      AtopTable atopTable0 = AtopTable.DISKS;
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        atopProcessFactory0.create(atopTable0, zonedDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split date (-18:00) is not in the local timezone (GMT)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("%Unz=UslB");
      AtopProcessFactory atopProcessFactory0 = null;
      try {
        atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig0, atopConnectorId0);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'U'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("Cannot start %s");
      AtopProcessFactory atopProcessFactory0 = null;
      try {
        atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig0, atopConnectorId0);
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%s'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("[ QYx,o<fSv VsiW%");
      AtopProcessFactory atopProcessFactory0 = null;
      try {
        atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig0, atopConnectorId0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // e != java.lang.Integer
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorConfig atopConnectorConfig1 = atopConnectorConfig0.setTimeZone("none");
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("EpFSt:P6CoY");
      AtopProcessFactory atopProcessFactory0 = null;
      try {
        atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig1, atopConnectorId0);
        fail("Expecting exception: ZoneRulesException");
      
      } catch(ZoneRulesException e) {
         //
         // Unknown time-zone ID: none
         //
         verifyException("java.time.zone.ZoneRulesProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorConfig atopConnectorConfig1 = atopConnectorConfig0.setTimeZone("com.facebook.presto.atop.AtopProcessFactory$AtopProcess");
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("HIxTge6hHF4<=Jv|Gag");
      AtopProcessFactory atopProcessFactory0 = null;
      try {
        atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig1, atopConnectorId0);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Invalid ID for region-based ZoneId, invalid format: com.facebook.presto.atop.AtopProcessFactory$AtopProcess
         //
         verifyException("java.time.ZoneRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("");
      AtopProcessFactory atopProcessFactory0 = null;
      try {
        atopProcessFactory0 = new AtopProcessFactory((AtopConnectorConfig) null, atopConnectorId0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.atop.AtopProcessFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorConfig atopConnectorConfig1 = atopConnectorConfig0.setConcurrentReadersPerNode((-372));
      AtopProcessFactory atopProcessFactory0 = null;
      try {
        atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig1, (AtopConnectorId) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
          ZoneOffset zoneOffset0 = ZoneOffset.UTC;
          Clock clock0 = MockClock.system(zoneOffset0);
          ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
          AtopTable atopTable0 = AtopTable.REBOOTS;
          AtopConnectorId atopConnectorId0 = new AtopConnectorId("none");
          AtopProcessFactory atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig0, atopConnectorId0);
          // Undeclared exception!
          try { 
            atopProcessFactory0.create(atopTable0, zonedDateTime0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // com.facebook.presto.atop.AtopProcessFactory.create(AtopProcessFactory.java:74)
             // sun.reflect.GeneratedMethodAccessor61.invoke(Unknown Source)
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
  public void test10()  throws Throwable  {
      AtopConnectorConfig atopConnectorConfig0 = new AtopConnectorConfig();
      AtopConnectorId atopConnectorId0 = new AtopConnectorId("none");
      AtopProcessFactory atopProcessFactory0 = new AtopProcessFactory(atopConnectorConfig0, atopConnectorId0);
      atopProcessFactory0.shutdown();
  }
}
