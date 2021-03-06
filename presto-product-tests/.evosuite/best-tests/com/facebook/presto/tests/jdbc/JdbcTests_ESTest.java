/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 19:38:09 GMT 2021
 */

package com.facebook.presto.tests.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.tests.jdbc.JdbcTests;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JdbcTests_ESTest extends JdbcTests_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "C!~4,mS^gwT.");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.testSqlEscapeFunctions();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "/G$!XFN0Hsi|");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "<7");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      try { 
        jdbcTests0.testDeallocate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) ":da{yo`Y<z0OPK195K");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldSetLocale();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "SNYS4uj:KD^igTs)Z73");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "select {fn ifnull('abc', '2')}");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "ABC DEF 123");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldInsertSelectQuery();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "K&");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldGetColumns();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldExecuteQueryWithSelectedCatalogAndSchema();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "Qc$]5EHf$2<4V/T");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "com/facebook/presto/tests/jdbc/get_nation_columns_simba.result");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "Qc$]5EHf$2<4V/T");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldExecuteQuery();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "$[{rHVKvU,Gxi|Po");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "F$f},/A");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.testSessionProperties();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "K7@t");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "g)*381p9&H%le,");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "2");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldGetTables();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "H\"smg>dWjc");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "H\"smg>dWjc");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "H\"smg>dWjc");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldGetSchemas();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) "");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) "com.facebook.presto.tests.jdbc.JdbcTests$ImmutableAndMutableNationTable");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) "");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldGetTableTypes();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JdbcTests jdbcTests0 = new JdbcTests();
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcPassword", (Object) " ");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcURL", (Object) " ");
      Injector.inject(jdbcTests0, (Class<?>) JdbcTests.class, "prestoJdbcUser", (Object) " ");
      Injector.validateBean(jdbcTests0, (Class<?>) JdbcTests.class);
      // Undeclared exception!
      try { 
        jdbcTests0.shouldSetTimezone();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // test context not set for current thread
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
