/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 08:52:52 GMT 2021
 */

package com.facebook.presto.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.redis.RedisTableHandle;
import com.facebook.presto.spi.SchemaTableName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RedisTableHandle_ESTest extends RedisTableHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM");
      SchemaTableName schemaTableName0 = redisTableHandle0.toSchemaTableName();
      assertEquals("-z$a-j-sv+im", schemaTableName0.getTableName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("fZ_[", "fZ_[", "fZ_[", "fZ_[", "fZ_[", "keyName");
      redisTableHandle0.getValueDataFormat();
      assertEquals("keyName", redisTableHandle0.getKeyName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM");
      String string0 = redisTableHandle0.getTableName();
      assertEquals("-Z$a-J-Sv+IM", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("\"P1'", "\"P1'", "\"P1'", "\"P1'", "\"P1'", "\"P1'");
      String string0 = redisTableHandle0.getSchemaName();
      assertEquals("\"P1'", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", (String) null);
      String string0 = redisTableHandle0.getKeyName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("\"P1'", "\"P1'", "\"P1'", "\"P1'", "\"P1'", "\"P1'");
      String string0 = redisTableHandle0.getKeyName();
      assertEquals("\"P1'", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("j ", "j ", "j ", "j ", "j ", "j ");
      String string0 = redisTableHandle0.getKeyDataFormat();
      assertEquals("j ", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle(".", ".", ".", ".", ".", ".");
      String string0 = redisTableHandle0.getConnectorId();
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = null;
      try {
        redisTableHandle0 = new RedisTableHandle("", (String) null, "", (String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // schemaName is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k");
      RedisTableHandle redisTableHandle1 = new RedisTableHandle("DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k", "DN#cc|lCtN~0)k", "tableName");
      boolean boolean0 = redisTableHandle1.equals(redisTableHandle0);
      assertEquals("DN#cc|lCtN~0)k", redisTableHandle1.getValueDataFormat());
      assertEquals("DN#cc|lCtN~0)k", redisTableHandle1.getKeyDataFormat());
      assertEquals("DN#cc|lCtN~0)k", redisTableHandle1.getConnectorId());
      assertEquals("DN#cc|lCtN~0)k", redisTableHandle1.getTableName());
      assertFalse(boolean0);
      assertEquals("DN#cc|lCtN~0)k", redisTableHandle1.getSchemaName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "schemaName", "", "", "");
      RedisTableHandle redisTableHandle1 = new RedisTableHandle("", "", "schemaName", "", "schemaName", "schemaName");
      boolean boolean0 = redisTableHandle0.equals(redisTableHandle1);
      assertEquals("", redisTableHandle1.getKeyDataFormat());
      assertFalse(boolean0);
      assertEquals("", redisTableHandle0.getValueDataFormat());
      assertEquals("schemaName", redisTableHandle1.getKeyName());
      assertEquals("schemaName", redisTableHandle0.getTableName());
      assertEquals("", redisTableHandle1.getConnectorId());
      assertEquals("", redisTableHandle1.getSchemaName());
      assertEquals("schemaName", redisTableHandle1.getValueDataFormat());
      assertEquals("", redisTableHandle0.getKeyName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle(".", ".", ".", ".", ".", ".");
      RedisTableHandle redisTableHandle1 = new RedisTableHandle(".", ".", ".", "ScMezaTa{leName should have xtl 2 part", ".", "ScMezaTa{leName should have xtl 2 part");
      boolean boolean0 = redisTableHandle0.equals(redisTableHandle1);
      assertEquals(".", redisTableHandle1.getTableName());
      assertEquals(".", redisTableHandle1.getConnectorId());
      assertEquals(".", redisTableHandle1.getSchemaName());
      assertFalse(boolean0);
      assertEquals(".", redisTableHandle1.getValueDataFormat());
      assertEquals("ScMezaTa{leName should have xtl 2 part", redisTableHandle1.getKeyName());
      assertEquals("ScMezaTa{leName should have xtl 2 part", redisTableHandle1.getKeyDataFormat());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("j ", "j ", "j ", "j ", "j ", "j ");
      RedisTableHandle redisTableHandle1 = new RedisTableHandle("j ", "j ", "fc,jGy'&BD{*]#F8", "j ", "j ", "j ");
      boolean boolean0 = redisTableHandle0.equals(redisTableHandle1);
      assertEquals("j ", redisTableHandle1.getKeyName());
      assertFalse(boolean0);
      assertEquals("j ", redisTableHandle1.getSchemaName());
      assertEquals("j ", redisTableHandle1.getKeyDataFormat());
      assertEquals("j ", redisTableHandle1.getValueDataFormat());
      assertEquals("j ", redisTableHandle1.getConnectorId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("fZ_[", "fZ_[", "fZ_[", "fZ_[", "fZ_[", "keyName");
      RedisTableHandle redisTableHandle1 = new RedisTableHandle("fZ_[", "keyName", "fZ_[", "keyName", "fZ_[", "keyName");
      boolean boolean0 = redisTableHandle0.equals(redisTableHandle1);
      assertEquals("fZ_[", redisTableHandle1.getConnectorId());
      assertEquals("fZ_[", redisTableHandle1.getTableName());
      assertEquals("keyName", redisTableHandle1.getKeyDataFormat());
      assertEquals("keyName", redisTableHandle0.getKeyName());
      assertEquals("keyName", redisTableHandle1.getSchemaName());
      assertFalse(boolean0);
      assertEquals("fZ_[", redisTableHandle1.getValueDataFormat());
      assertEquals("fZ_[", redisTableHandle0.getKeyDataFormat());
      assertEquals("fZ_[", redisTableHandle0.getSchemaName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM", "-Z$a-J-Sv+IM");
      RedisTableHandle redisTableHandle1 = new RedisTableHandle("RedisTableHandle{connectorId=-Z$a-J-Sv+IM, schemaName=-Z$a-J-Sv+IM, tableName=-Z$a-J-Sv+IM, keyDataFormat=-Z$a-J-Sv+IM, valueDataFormat=-Z$a-J-Sv+IM, keyName=-Z$a-J-Sv+IM}", "RedisTableHandle{connectorId=-Z$a-J-Sv+IM, schemaName=-Z$a-J-Sv+IM, tableName=-Z$a-J-Sv+IM, keyDataFormat=-Z$a-J-Sv+IM, valueDataFormat=-Z$a-J-Sv+IM, keyName=-Z$a-J-Sv+IM}", "RedisTableHandle{connectorId=-Z$a-J-Sv+IM, schemaName=-Z$a-J-Sv+IM, tableName=-Z$a-J-Sv+IM, keyDataFormat=-Z$a-J-Sv+IM, valueDataFormat=-Z$a-J-Sv+IM, keyName=-Z$a-J-Sv+IM}", "RedisTableHandle{connectorId=-Z$a-J-Sv+IM, schemaName=-Z$a-J-Sv+IM, tableName=-Z$a-J-Sv+IM, keyDataFormat=-Z$a-J-Sv+IM, valueDataFormat=-Z$a-J-Sv+IM, keyName=-Z$a-J-Sv+IM}", "RedisTableHandle{connectorId=-Z$a-J-Sv+IM, schemaName=-Z$a-J-Sv+IM, tableName=-Z$a-J-Sv+IM, keyDataFormat=-Z$a-J-Sv+IM, valueDataFormat=-Z$a-J-Sv+IM, keyName=-Z$a-J-Sv+IM}", "RedisTableHandle{connectorId=-Z$a-J-Sv+IM, schemaName=-Z$a-J-Sv+IM, tableName=-Z$a-J-Sv+IM, keyDataFormat=-Z$a-J-Sv+IM, valueDataFormat=-Z$a-J-Sv+IM, keyName=-Z$a-J-Sv+IM}");
      boolean boolean0 = redisTableHandle0.equals(redisTableHandle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      RedisTableHandle redisTableHandle1 = new RedisTableHandle("", "", "", "", "", "");
      boolean boolean0 = redisTableHandle1.equals(redisTableHandle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "schemaName", "", "", "");
      boolean boolean0 = redisTableHandle0.equals((Object) null);
      assertEquals("", redisTableHandle0.getKeyName());
      assertEquals("", redisTableHandle0.getKeyDataFormat());
      assertEquals("", redisTableHandle0.getValueDataFormat());
      assertEquals("schemaName", redisTableHandle0.getTableName());
      assertEquals("", redisTableHandle0.getSchemaName());
      assertEquals("", redisTableHandle0.getConnectorId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      boolean boolean0 = redisTableHandle0.equals(redisTableHandle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      boolean boolean0 = redisTableHandle0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      String string0 = redisTableHandle0.getKeyName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      String string0 = redisTableHandle0.getConnectorId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      String string0 = redisTableHandle0.toString();
      assertEquals("RedisTableHandle{connectorId=, schemaName=, tableName=, keyDataFormat=, valueDataFormat=, keyName=}", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      String string0 = redisTableHandle0.getKeyDataFormat();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      String string0 = redisTableHandle0.getSchemaName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      // Undeclared exception!
      try { 
        redisTableHandle0.toSchemaTableName();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // schemaName is empty
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      String string0 = redisTableHandle0.getValueDataFormat();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      String string0 = redisTableHandle0.getTableName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "", "", "", "");
      redisTableHandle0.hashCode();
  }
}
