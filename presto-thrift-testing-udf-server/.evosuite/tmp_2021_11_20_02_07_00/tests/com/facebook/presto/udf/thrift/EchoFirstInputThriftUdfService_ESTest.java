/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 10:09:07 GMT 2021
 */

package com.facebook.presto.udf.thrift;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.block.BlockEncodingManager;
import com.facebook.presto.spi.ErrorCode;
import com.facebook.presto.thrift.api.datatypes.PrestoThriftBlock;
import com.facebook.presto.thrift.api.udf.PrestoThriftPage;
import com.facebook.presto.thrift.api.udf.ThriftFunctionHandle;
import com.facebook.presto.thrift.api.udf.ThriftSerializedPage;
import com.facebook.presto.thrift.api.udf.ThriftUdfPage;
import com.facebook.presto.thrift.api.udf.ThriftUdfPageFormat;
import com.facebook.presto.thrift.api.udf.ThriftUdfRequest;
import com.facebook.presto.thrift.api.udf.ThriftUdfResult;
import com.facebook.presto.udf.thrift.EchoFirstInputThriftUdfService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EchoFirstInputThriftUdfService_ESTest extends EchoFirstInputThriftUdfService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockEncodingManager blockEncodingManager0 = new BlockEncodingManager();
      EchoFirstInputThriftUdfService echoFirstInputThriftUdfService0 = new EchoFirstInputThriftUdfService(blockEncodingManager0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      ThriftFunctionHandle thriftFunctionHandle0 = new ThriftFunctionHandle("sX,r", list0, "", "");
      ArrayList<PrestoThriftBlock> arrayList0 = new ArrayList<PrestoThriftBlock>();
      PrestoThriftBlock prestoThriftBlock0 = mock(PrestoThriftBlock.class, new ViolatedAssumptionAnswer());
      arrayList0.add(prestoThriftBlock0);
      PrestoThriftPage prestoThriftPage0 = new PrestoThriftPage(arrayList0, (-1805));
      ThriftUdfPage thriftUdfPage0 = ThriftUdfPage.thriftPage(prestoThriftPage0);
      ThriftUdfRequest thriftUdfRequest0 = new ThriftUdfRequest("", thriftFunctionHandle0, thriftUdfPage0);
      ListenableFuture<ThriftUdfResult> listenableFuture0 = echoFirstInputThriftUdfService0.invokeUdf(thriftUdfRequest0);
      assertNotNull(listenableFuture0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EchoFirstInputThriftUdfService.EchoFirstInputErrorCode echoFirstInputThriftUdfService_EchoFirstInputErrorCode0 = EchoFirstInputThriftUdfService.EchoFirstInputErrorCode.GENERIC_INTERNAL_ERROR;
      ErrorCode errorCode0 = echoFirstInputThriftUdfService_EchoFirstInputErrorCode0.toErrorCode();
      assertEquals(0, errorCode0.getCode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BlockEncodingManager blockEncodingManager0 = new BlockEncodingManager();
      EchoFirstInputThriftUdfService echoFirstInputThriftUdfService0 = new EchoFirstInputThriftUdfService(blockEncodingManager0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      ThriftFunctionHandle thriftFunctionHandle0 = new ThriftFunctionHandle("<sX,r", list0, "", "");
      ArrayList<PrestoThriftBlock> arrayList0 = new ArrayList<PrestoThriftBlock>();
      arrayList0.add((PrestoThriftBlock) null);
      PrestoThriftPage prestoThriftPage0 = new PrestoThriftPage(arrayList0, (-1));
      ThriftUdfPage thriftUdfPage0 = ThriftUdfPage.thriftPage(prestoThriftPage0);
      ThriftUdfRequest thriftUdfRequest0 = new ThriftUdfRequest("", thriftFunctionHandle0, thriftUdfPage0);
      // Undeclared exception!
      try { 
        echoFirstInputThriftUdfService0.invokeUdf(thriftUdfRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BlockEncodingManager blockEncodingManager0 = new BlockEncodingManager();
      EchoFirstInputThriftUdfService echoFirstInputThriftUdfService0 = new EchoFirstInputThriftUdfService(blockEncodingManager0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ThriftFunctionHandle thriftFunctionHandle0 = new ThriftFunctionHandle("g#V%B~]", arrayList0, "g#V%B~]", "g#V%B~]");
      ThriftUdfPageFormat thriftUdfPageFormat0 = ThriftUdfPageFormat.PRESTO_SERIALIZED;
      ThriftUdfPage thriftUdfPage0 = new ThriftUdfPage(thriftUdfPageFormat0, (PrestoThriftPage) null, (ThriftSerializedPage) null);
      ThriftUdfRequest thriftUdfRequest0 = new ThriftUdfRequest("g#V%B~]", thriftFunctionHandle0, thriftUdfPage0);
      // Undeclared exception!
      try { 
        echoFirstInputThriftUdfService0.invokeUdf(thriftUdfRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.udf.thrift.EchoFirstInputThriftUdfService", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BlockEncodingManager blockEncodingManager0 = new BlockEncodingManager();
      EchoFirstInputThriftUdfService echoFirstInputThriftUdfService0 = new EchoFirstInputThriftUdfService(blockEncodingManager0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      ThriftFunctionHandle thriftFunctionHandle0 = new ThriftFunctionHandle("sX,r", list0, "", "");
      ArrayList<PrestoThriftBlock> arrayList0 = new ArrayList<PrestoThriftBlock>();
      PrestoThriftPage prestoThriftPage0 = new PrestoThriftPage(arrayList0, (-1805));
      ThriftUdfPage thriftUdfPage0 = ThriftUdfPage.thriftPage(prestoThriftPage0);
      ThriftUdfRequest thriftUdfRequest0 = new ThriftUdfRequest("", thriftFunctionHandle0, thriftUdfPage0);
      try { 
        echoFirstInputThriftUdfService0.invokeUdf(thriftUdfRequest0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ThriftUdfServiceException(GENERIC_INTERNAL_ERROR:0, NON-RETRYABLE): No input to echo
         //
         verifyException("com.facebook.presto.thrift.api.udf.ThriftUdfServiceException", e);
      }
  }
}
