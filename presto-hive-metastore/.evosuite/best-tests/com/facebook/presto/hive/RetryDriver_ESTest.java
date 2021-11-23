/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 21:34:08 GMT 2021
 */

package com.facebook.presto.hive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.hive.RetryDriver;
import io.airlift.units.Duration;
import java.lang.reflect.Array;
import java.util.concurrent.Callable;
import java.util.function.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RetryDriver_ESTest extends RetryDriver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      Duration duration0 = Duration.succinctNanos(2179L);
      RetryDriver retryDriver1 = retryDriver0.exponentialBackoff(duration0, duration0, (Duration) null, 2426.1);
      assertNotSame(retryDriver0, retryDriver1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      Duration duration1 = mock(Duration.class, new ViolatedAssumptionAnswer());
      RetryDriver retryDriver1 = retryDriver0.exponentialBackoff(duration0, duration1, duration0, 1138);
      assertFalse(retryDriver1.equals((Object)retryDriver0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      Class<NullPointerException>[] classArray0 = (Class<NullPointerException>[]) Array.newInstance(Class.class, 4);
      Class<NullPointerException> class0 = NullPointerException.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = classArray0[0];
      classArray0[3] = classArray0[2];
      RetryDriver retryDriver1 = retryDriver0.stopOn(classArray0);
      assertFalse(retryDriver1.equals((Object)retryDriver0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      Callable<Throwable> callable0 = (Callable<Throwable>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      Throwable throwable0 = retryDriver0.run("callable is null", callable0);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      // Undeclared exception!
      try { 
        retryDriver0.stopOn((Class<? extends Exception>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // classes is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      Callable<NullPointerException> callable0 = (Callable<NullPointerException>) mock(Callable.class, new ViolatedAssumptionAnswer());
      try { 
        retryDriver0.run((String) null, callable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // callableName is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      Class<IllegalArgumentException>[] classArray0 = (Class<IllegalArgumentException>[]) Array.newInstance(Class.class, 1);
      // Undeclared exception!
      try { 
        retryDriver0.stopOn(classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      Callable<RetryDriver> callable0 = (Callable<RetryDriver>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn(retryDriver0).when(callable0).call();
      RetryDriver retryDriver1 = retryDriver0.run("", callable0);
      assertSame(retryDriver1, retryDriver0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      MockThread mockThread0 = new MockThread();
      RetryDriver retryDriver1 = retryDriver0.onRetry(mockThread0);
      assertNotSame(retryDriver0, retryDriver1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      RetryDriver retryDriver1 = retryDriver0.maxAttempts((-1037));
      assertFalse(retryDriver1.equals((Object)retryDriver0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      RetryDriver retryDriver1 = retryDriver0.stopOnIllegalExceptions();
      assertNotSame(retryDriver0, retryDriver1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RetryDriver retryDriver0 = RetryDriver.retry();
      Function<Exception, Exception> function0 = (Function<Exception, Exception>) mock(Function.class, new ViolatedAssumptionAnswer());
      RetryDriver retryDriver1 = retryDriver0.exceptionMapper(function0);
      assertNotSame(retryDriver0, retryDriver1);
  }
}
