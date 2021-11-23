/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 13 21:41:43 GMT 2021
 */

package com.facebook.presto.testng.services;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.testng.services.Listeners;
import java.util.DuplicateFormatFlagsException;
import java.util.FormatFlagsConversionMismatchException;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatFlagsException;
import java.util.IllegalFormatWidthException;
import java.util.MissingFormatArgumentException;
import java.util.MissingFormatWidthException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.SuiteRunner;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Listeners_ESTest extends Listeners_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<TestListenerAdapter> class0 = Class.class;
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, "3Qn$8:%zp9Y[csC=", objectArray0);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'z'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<TestListenerAdapter> class0 = Class.class;
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, ">T)|~%#0o2FTF%[{]D", objectArray0);
        fail("Expecting exception: MissingFormatWidthException");
      
      } catch(MissingFormatWidthException e) {
         //
         // %#0o
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<TestListenerAdapter> class0 = Class.class;
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, "FATAL: %s: ", objectArray0);
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%s'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<TestListenerAdapter> class0 = TestListenerAdapter.class;
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, "=X3JGd%7n", objectArray0);
        fail("Expecting exception: IllegalFormatWidthException");
      
      } catch(IllegalFormatWidthException e) {
         //
         // 7
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[25];
      Class<TestListenerAdapter> class0 = Class.class;
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, "FATAL% %s: ", objectArray0);
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = ' '
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<TestNG.ExitCodeListener> class0 = Class.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, "%gJ-mu[CVK^:M!47", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // g != java.lang.Class
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Class<TestListenerAdapter> class0 = Class.class;
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, ":I$#C3q8iN%(sa<vzCv", objectArray0);
        fail("Expecting exception: FormatFlagsConversionMismatchException");
      
      } catch(FormatFlagsConversionMismatchException e) {
         //
         // Conversion = s, Flags = (
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      Class<SuiteRunner> class0 = SuiteRunner.class;
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, ".m|ZIpyE1'O}L6^%((i", objectArray0);
        fail("Expecting exception: DuplicateFormatFlagsException");
      
      } catch(DuplicateFormatFlagsException e) {
         //
         // Flags = '('
         //
         verifyException("java.util.Formatter$Flags", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<TestListenerAdapter> class0 = Class.class;
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        Listeners.reportListenerFailure(class0, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
