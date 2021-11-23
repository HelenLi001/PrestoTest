/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:31:20 GMT 2021
 */

package com.facebook.presto.plugin.bigquery;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.TimestampWithTimeZoneType;
import com.facebook.presto.plugin.bigquery.BigQueryColumnHandle;
import com.facebook.presto.plugin.bigquery.BigQueryResultPageSource;
import com.facebook.presto.plugin.bigquery.BigQuerySplit;
import com.facebook.presto.plugin.bigquery.BigQueryStorageClientFactory;
import com.facebook.presto.plugin.bigquery.BigQueryTableHandle;
import com.facebook.presto.plugin.bigquery.BigQueryType;
import com.google.cloud.bigquery.Field;
import com.google.common.collect.ImmutableList;
import java.util.Stack;
import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BigQueryResultPageSource_ESTest extends BigQueryResultPageSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Schema schema0 = Protocol.SYSTEM_ERROR;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)90;
      BigQueryResultPageSource.AvroBinaryIterator bigQueryResultPageSource_AvroBinaryIterator0 = new BigQueryResultPageSource.AvroBinaryIterator(schema0, byteArray0);
      // Undeclared exception!
      try { 
        bigQueryResultPageSource_AvroBinaryIterator0.next();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error reading next Avro Record
         //
         verifyException("com.facebook.presto.plugin.bigquery.BigQueryResultPageSource$AvroBinaryIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      BigQueryResultPageSource.AvroBinaryIterator bigQueryResultPageSource_AvroBinaryIterator0 = new BigQueryResultPageSource.AvroBinaryIterator((Schema) null, byteArray0);
      boolean boolean0 = bigQueryResultPageSource_AvroBinaryIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Schema schema0 = Protocol.SYSTEM_ERROR;
      byte[] byteArray0 = new byte[0];
      BigQueryResultPageSource.AvroBinaryIterator bigQueryResultPageSource_AvroBinaryIterator0 = new BigQueryResultPageSource.AvroBinaryIterator(schema0, byteArray0);
      boolean boolean0 = bigQueryResultPageSource_AvroBinaryIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BigQueryResultPageSource.AvroDecimalConverter bigQueryResultPageSource_AvroDecimalConverter0 = new BigQueryResultPageSource.AvroDecimalConverter();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BigQueryResultPageSource.AvroDecimalConverter bigQueryResultPageSource_AvroDecimalConverter0 = BigQueryResultPageSource.DECIMAL_CONVERTER;
      TimestampWithTimeZoneType timestampWithTimeZoneType0 = TimestampWithTimeZoneType.TIMESTAMP_WITH_TIME_ZONE;
      // Undeclared exception!
      try { 
        bigQueryResultPageSource_AvroDecimalConverter0.convert(timestampWithTimeZoneType0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.facebook.presto.common.type.TimestampWithTimeZoneType cannot be cast to java.nio.ByteBuffer
         //
         verifyException("com.facebook.presto.plugin.bigquery.BigQueryResultPageSource$AvroDecimalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BigQueryType bigQueryType0 = BigQueryType.DATETIME;
      Field.Mode field_Mode0 = Field.Mode.REQUIRED;
      Stack<BigQueryColumnHandle> stack0 = new Stack<BigQueryColumnHandle>();
      BigQueryColumnHandle bigQueryColumnHandle0 = new BigQueryColumnHandle("fieldName doesn't match with type size : %s", bigQueryType0, field_Mode0, stack0, "com.fasterxml.jackson.databind.node.ShortNode");
      ImmutableList<BigQueryColumnHandle> immutableList0 = ImmutableList.of(bigQueryColumnHandle0, bigQueryColumnHandle0, bigQueryColumnHandle0, bigQueryColumnHandle0);
      BigQueryResultPageSource bigQueryResultPageSource0 = null;
      try {
        bigQueryResultPageSource0 = new BigQueryResultPageSource((BigQueryStorageClientFactory) null, 0, (BigQuerySplit) null, (BigQueryTableHandle) null, immutableList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.bigquery.BigQueryResultPageSource", e);
      }
  }
}
