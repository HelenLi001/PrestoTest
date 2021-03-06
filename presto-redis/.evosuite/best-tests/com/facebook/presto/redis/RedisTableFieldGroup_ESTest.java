/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 08:58:18 GMT 2021
 */

package com.facebook.presto.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.redis.RedisTableFieldDescription;
import com.facebook.presto.redis.RedisTableFieldGroup;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RedisTableFieldGroup_ESTest extends RedisTableFieldGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("set", (String) null, (List<RedisTableFieldDescription>) null);
      String string0 = redisTableFieldGroup0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("zset", "", (List<RedisTableFieldDescription>) null);
      String string0 = redisTableFieldGroup0.getName();
      assertEquals("zset", redisTableFieldGroup0.getDataFormat());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RedisTableFieldGroup redisTableFieldGroup0 = null;
      try {
        redisTableFieldGroup0 = new RedisTableFieldGroup("", "3e2/n'//~IoqQNp/", (List<RedisTableFieldDescription>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fields is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("zset", "zset", (List<RedisTableFieldDescription>) null);
      String string0 = redisTableFieldGroup0.getDataFormat();
      assertEquals("zset", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("zset", "zset", (List<RedisTableFieldDescription>) null);
      String string0 = redisTableFieldGroup0.getName();
      assertEquals("zset", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("zset", "zset", (List<RedisTableFieldDescription>) null);
      String string0 = redisTableFieldGroup0.toString();
      assertEquals("RedisTableFieldGroup{dataFormat=zset, name=zset, fields=null}", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("set", "set", (List<RedisTableFieldDescription>) null);
      List<RedisTableFieldDescription> list0 = redisTableFieldGroup0.getFields();
      assertNull(list0);
  }
}
