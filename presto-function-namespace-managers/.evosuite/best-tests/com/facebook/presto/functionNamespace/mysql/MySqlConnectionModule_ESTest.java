/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 10:01:27 GMT 2021
 */

package com.facebook.presto.functionNamespace.mysql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule;
import com.facebook.presto.functionNamespace.mysql.MySqlFunctionNamespaceManagerConfig;
import com.google.inject.Binder;
import com.google.inject.Injector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdbi.v3.core.ConnectionFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MySqlConnectionModule_ESTest extends MySqlConnectionModule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MySqlConnectionModule.FunctionNamespaceDaoProvider mySqlConnectionModule_FunctionNamespaceDaoProvider0 = new MySqlConnectionModule.FunctionNamespaceDaoProvider();
      mySqlConnectionModule_FunctionNamespaceDaoProvider0.setInjector((Injector) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MySqlConnectionModule.FunctionNamespaceDaoProvider mySqlConnectionModule_FunctionNamespaceDaoProvider0 = new MySqlConnectionModule.FunctionNamespaceDaoProvider();
      // Undeclared exception!
      try { 
        mySqlConnectionModule_FunctionNamespaceDaoProvider0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule$FunctionNamespaceDaoProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MySqlConnectionModule mySqlConnectionModule0 = new MySqlConnectionModule();
      // Undeclared exception!
      try { 
        mySqlConnectionModule0.setup((Binder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // binder is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        MySqlConnectionModule.createJdbi("!Ui{$&OY?DJh!", (MySqlFunctionNamespaceManagerConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.functionNamespace.mysql.MySqlConnectionModule", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        MySqlConnectionModule.createJdbi((ConnectionFactory) null, (MySqlFunctionNamespaceManagerConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null connectionFactory
         //
         verifyException("java.util.Objects", e);
      }
  }
}
