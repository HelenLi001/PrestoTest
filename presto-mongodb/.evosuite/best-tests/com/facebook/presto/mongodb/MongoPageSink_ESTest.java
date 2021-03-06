/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 05:47:49 GMT 2021
 */

package com.facebook.presto.mongodb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.mongodb.MongoClientConfig;
import com.facebook.presto.mongodb.MongoColumnHandle;
import com.facebook.presto.mongodb.MongoPageSink;
import com.facebook.presto.mongodb.MongoSession;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.SchemaTableName;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MongoPageSink_ESTest extends MongoPageSink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MongoPageSink mongoPageSink0 = null;
      try {
        mongoPageSink0 = new MongoPageSink((MongoClientConfig) null, (MongoSession) null, (ConnectorSession) null, (SchemaTableName) null, (List<MongoColumnHandle>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.mongodb.MongoPageSink", e);
      }
  }
}
