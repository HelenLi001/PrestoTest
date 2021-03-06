/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 07:24:26 GMT 2021
 */

package com.facebook.presto.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.VarcharEnumType;
import com.facebook.presto.redis.RedisConnectorFactory;
import com.facebook.presto.redis.RedisTableDescription;
import com.facebook.presto.spi.SchemaTableName;
import com.facebook.presto.testing.TestingConnectorContext;
import java.util.Hashtable;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import javax.management.ObjectName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RedisConnectorFactory_ESTest extends RedisConnectorFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RedisConnectorFactory redisConnectorFactory0 = null;
      try {
        redisConnectorFactory0 = new RedisConnectorFactory((Optional<Supplier<Map<SchemaTableName, RedisTableDescription>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tableDescriptionSupplier is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RedisConnectorFactory redisConnectorFactory0 = null;
      try {
        redisConnectorFactory0 = new RedisConnectorFactory((Optional<Supplier<Map<SchemaTableName, RedisTableDescription>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tableDescriptionSupplier is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
