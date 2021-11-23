/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 09:50:01 GMT 2021
 */

package com.facebook.presto.functionNamespace.execution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.functionNamespace.execution.ExceptionUtils;
import com.facebook.presto.spi.ErrorCode;
import com.facebook.presto.spi.ErrorType;
import com.facebook.presto.spi.PrestoException;
import com.facebook.presto.thrift.api.udf.ThriftUdfServiceException;
import com.facebook.presto.thrift.api.udf.UdfExecutionFailureInfo;
import java.sql.SQLDataException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExceptionUtils_ESTest extends ExceptionUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExceptionUtils.toPrestoException((ThriftUdfServiceException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.functionNamespace.execution.ExceptionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorType errorType0 = ErrorType.USER_ERROR;
      ErrorCode errorCode0 = new ErrorCode(0, ".ui}R", errorType0);
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException(".ui}R");
      SQLTransientException sQLTransientException0 = new SQLTransientException(".ui}R");
      SQLDataException sQLDataException0 = new SQLDataException();
      sQLTransientException0.initCause(sQLDataException0);
      sQLTimeoutException0.addSuppressed(sQLTransientException0);
      ThriftUdfServiceException thriftUdfServiceException0 = ThriftUdfServiceException.toThriftUdfServiceException(true, errorCode0, sQLTimeoutException0);
      // Undeclared exception!
      try { 
        ExceptionUtils.toPrestoException(thriftUdfServiceException0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ErrorType errorType0 = ErrorType.INTERNAL_ERROR;
      ErrorCode errorCode0 = new ErrorCode(0, "r:", errorType0);
      Stack<UdfExecutionFailureInfo> stack0 = new Stack<UdfExecutionFailureInfo>();
      Stack<String> stack1 = new Stack<String>();
      UdfExecutionFailureInfo udfExecutionFailureInfo0 = new UdfExecutionFailureInfo("r:", "r:", (UdfExecutionFailureInfo) null, stack0, stack1);
      ThriftUdfServiceException thriftUdfServiceException0 = new ThriftUdfServiceException(true, errorCode0, udfExecutionFailureInfo0);
      PrestoException prestoException0 = ExceptionUtils.toPrestoException(thriftUdfServiceException0);
      assertNotNull(prestoException0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ErrorType errorType0 = ErrorType.INSUFFICIENT_RESOURCES;
      ErrorCode errorCode0 = new ErrorCode(2, "3H\"@", errorType0);
      Stack<UdfExecutionFailureInfo> stack0 = new Stack<UdfExecutionFailureInfo>();
      Stack<String> stack1 = new Stack<String>();
      UdfExecutionFailureInfo udfExecutionFailureInfo0 = new UdfExecutionFailureInfo("3H\"@", "3H\"@", (UdfExecutionFailureInfo) null, stack0, stack1);
      ThriftUdfServiceException thriftUdfServiceException0 = new ThriftUdfServiceException(false, errorCode0, udfExecutionFailureInfo0);
      PrestoException prestoException0 = ExceptionUtils.toPrestoException(thriftUdfServiceException0);
      assertNotNull(prestoException0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ErrorType errorType0 = ErrorType.USER_ERROR;
      ErrorCode errorCode0 = new ErrorCode(36, "\"3", errorType0, true);
      ArrayList<UdfExecutionFailureInfo> arrayList0 = new ArrayList<UdfExecutionFailureInfo>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      UdfExecutionFailureInfo udfExecutionFailureInfo0 = new UdfExecutionFailureInfo("\"3", "\"3", (UdfExecutionFailureInfo) null, arrayList0, linkedList0);
      ThriftUdfServiceException thriftUdfServiceException0 = new ThriftUdfServiceException(true, errorCode0, udfExecutionFailureInfo0);
      PrestoException prestoException0 = ExceptionUtils.toPrestoException(thriftUdfServiceException0);
      ThriftUdfServiceException thriftUdfServiceException1 = ThriftUdfServiceException.toThriftUdfServiceException(true, errorCode0, prestoException0);
      // Undeclared exception!
      try { 
        ExceptionUtils.toPrestoException(thriftUdfServiceException1);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ErrorType errorType0 = ErrorType.EXTERNAL;
      ErrorCode errorCode0 = new ErrorCode(0, "", errorType0, false);
      Stack<UdfExecutionFailureInfo> stack0 = new Stack<UdfExecutionFailureInfo>();
      Vector<String> vector0 = new Vector<String>();
      UdfExecutionFailureInfo udfExecutionFailureInfo0 = new UdfExecutionFailureInfo("ov=ka", "", (UdfExecutionFailureInfo) null, stack0, vector0);
      ThriftUdfServiceException thriftUdfServiceException0 = new ThriftUdfServiceException(false, errorCode0, udfExecutionFailureInfo0);
      PrestoException prestoException0 = ExceptionUtils.toPrestoException(thriftUdfServiceException0);
      assertNotNull(prestoException0);
  }
}
