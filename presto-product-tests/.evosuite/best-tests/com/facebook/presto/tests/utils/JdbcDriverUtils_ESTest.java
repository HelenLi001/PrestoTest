/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 19:35:45 GMT 2021
 */

package com.facebook.presto.tests.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.tests.utils.JdbcDriverUtils;
import com.mysql.jdbc.JDBC4LoadBalancedMySQLConnection;
import com.mysql.jdbc.JDBC4ReplicationMySQLConnection;
import com.mysql.jdbc.LoadBalancedConnectionProxy;
import com.mysql.jdbc.LoadBalancedMySQLConnection;
import com.mysql.jdbc.ReplicationConnectionProxy;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JdbcDriverUtils_ESTest extends JdbcDriverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LoadBalancedMySQLConnection loadBalancedMySQLConnection0 = new LoadBalancedMySQLConnection((LoadBalancedConnectionProxy) null);
      boolean boolean0 = JdbcDriverUtils.usingTeradataJdbcDriver(loadBalancedMySQLConnection0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDBC4LoadBalancedMySQLConnection jDBC4LoadBalancedMySQLConnection0 = new JDBC4LoadBalancedMySQLConnection((LoadBalancedConnectionProxy) null);
      boolean boolean0 = JdbcDriverUtils.usingTeradataJdbc4Driver(jDBC4LoadBalancedMySQLConnection0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDBC4ReplicationMySQLConnection jDBC4ReplicationMySQLConnection0 = new JDBC4ReplicationMySQLConnection((ReplicationConnectionProxy) null);
      boolean boolean0 = JdbcDriverUtils.usingPrestoJdbcDriver(jDBC4ReplicationMySQLConnection0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        JdbcDriverUtils.setSessionProperty((Connection) null, "", "}2:1U2]0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        JdbcDriverUtils.setRole((Connection) null, "Ae6QH||AbZ5[Ga[YR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        JdbcDriverUtils.resetSessionProperty((Connection) null, "i$duP^8iZ,70");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        JdbcDriverUtils.usingPrestoJdbcDriver((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        JdbcDriverUtils.usingTeradataJdbcDriver((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDBC4LoadBalancedMySQLConnection jDBC4LoadBalancedMySQLConnection0 = new JDBC4LoadBalancedMySQLConnection((LoadBalancedConnectionProxy) null);
      // Undeclared exception!
      try { 
        JdbcDriverUtils.resetSessionProperty(jDBC4LoadBalancedMySQLConnection0, "sMIM|d^w&eDp{o&,");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDBC4LoadBalancedMySQLConnection jDBC4LoadBalancedMySQLConnection0 = new JDBC4LoadBalancedMySQLConnection((LoadBalancedConnectionProxy) null);
      // Undeclared exception!
      try { 
        JdbcDriverUtils.setSessionProperty(jDBC4LoadBalancedMySQLConnection0, "com.teradata.presto.jdbc.jdbc4.", "com.teradata.presto.jdbc.jdbc4.");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        JdbcDriverUtils.getSessionProperty((Connection) null, "^ILi>w:RJ)[%,/e{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        JdbcDriverUtils.usingTeradataJdbc4Driver((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        JdbcDriverUtils.getSessionPropertyDefault((Connection) null, "Value");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.tests.utils.JdbcDriverUtils", e);
      }
  }
}
