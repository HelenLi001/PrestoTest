/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 09:00:49 GMT 2021
 */

package com.facebook.presto.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.redis.RedisDecoderModule;
import com.google.inject.Binder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RedisDecoderModule_ESTest extends RedisDecoderModule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RedisDecoderModule redisDecoderModule0 = new RedisDecoderModule();
      Binder binder0 = mock(Binder.class, new ViolatedAssumptionAnswer());
      doReturn((Binder) null).when(binder0).skipSources(any(java.lang.Class[].class));
      // Undeclared exception!
      try { 
        redisDecoderModule0.configure(binder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.internal.RealMapBinder", e);
      }
  }
}
