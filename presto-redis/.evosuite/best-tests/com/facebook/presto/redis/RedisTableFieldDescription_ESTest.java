/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 08:51:38 GMT 2021
 */

package com.facebook.presto.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.BigintType;
import com.facebook.presto.common.type.CharType;
import com.facebook.presto.common.type.DecimalType;
import com.facebook.presto.common.type.DoubleType;
import com.facebook.presto.common.type.HyperLogLogType;
import com.facebook.presto.common.type.IntegerType;
import com.facebook.presto.common.type.JsonType;
import com.facebook.presto.common.type.P4HyperLogLogType;
import com.facebook.presto.common.type.SmallintType;
import com.facebook.presto.common.type.TimeWithTimeZoneType;
import com.facebook.presto.common.type.TinyintType;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.redis.RedisColumnHandle;
import com.facebook.presto.redis.RedisTableFieldDescription;
import com.facebook.presto.spi.ColumnMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RedisTableFieldDescription_ESTest extends RedisTableFieldDescription_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DoubleType doubleType0 = DoubleType.DOUBLE;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("$1c", doubleType0, "$1c", "$1c", "Ic]!rV`9[", "$1c", true);
      boolean boolean0 = redisTableFieldDescription0.isHidden();
      assertEquals("$1c", redisTableFieldDescription0.getFormatHint());
      assertTrue(boolean0);
      assertEquals("$1c", redisTableFieldDescription0.getMapping());
      assertEquals("$1c", redisTableFieldDescription0.getComment());
      assertEquals("Ic]!rV`9[", redisTableFieldDescription0.getDataFormat());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("IDBrGaGQb`P3$pl)3", bigintType0, "formatHint", "IDBrGaGQb`P3$pl)3", "IDBrGaGQb`P3$pl)3", "IDBrGaGQb`P3$pl)3", true);
      String string0 = redisTableFieldDescription0.getMapping();
      assertEquals("formatHint", string0);
      assertTrue(redisTableFieldDescription0.isHidden());
      assertEquals("IDBrGaGQb`P3$pl)3", redisTableFieldDescription0.getFormatHint());
      assertEquals("IDBrGaGQb`P3$pl)3", redisTableFieldDescription0.getComment());
      assertEquals("IDBrGaGQb`P3$pl)3", redisTableFieldDescription0.getDataFormat());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HyperLogLogType hyperLogLogType0 = new HyperLogLogType();
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("reference to a non-existent key", hyperLogLogType0, "", "", "", "", false);
      String string0 = redisTableFieldDescription0.getMapping();
      assertFalse(redisTableFieldDescription0.isHidden());
      assertEquals("", redisTableFieldDescription0.getComment());
      assertEquals("", string0);
      assertEquals("", redisTableFieldDescription0.getFormatHint());
      assertEquals("", redisTableFieldDescription0.getDataFormat());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("s", bigintType0, "s", "", "", "_n|D4%}-P)28'v\"703", true);
      String string0 = redisTableFieldDescription0.getFormatHint();
      assertTrue(redisTableFieldDescription0.isHidden());
      assertEquals("", redisTableFieldDescription0.getComment());
      assertEquals("", redisTableFieldDescription0.getDataFormat());
      assertEquals("s", redisTableFieldDescription0.getMapping());
      assertEquals("_n|D4%}-P)28'v\"703", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("mapping", bigintType0, (String) null, (String) null, (String) null, "", false);
      String string0 = redisTableFieldDescription0.getFormatHint();
      assertNotNull(string0);
      assertFalse(redisTableFieldDescription0.isHidden());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntegerType integerType0 = IntegerType.INTEGER;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("Y/<4pgO", integerType0, "8|TzxP:6Ld,d2tH^'Fk", "8|TzxP:6Ld,d2tH^'Fk", (String) null, "PS4QGmTW=", false);
      String string0 = redisTableFieldDescription0.getDataFormat();
      assertEquals("PS4QGmTW=", redisTableFieldDescription0.getFormatHint());
      assertEquals("8|TzxP:6Ld,d2tH^'Fk", redisTableFieldDescription0.getMapping());
      assertEquals("8|TzxP:6Ld,d2tH^'Fk", redisTableFieldDescription0.getComment());
      assertFalse(redisTableFieldDescription0.isHidden());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("~=+g$VEO&hk&,6wX)j", bigintType0, "", "", "", "~=+g$VEO&hk&,6wX)j", false);
      String string0 = redisTableFieldDescription0.getDataFormat();
      assertEquals("", redisTableFieldDescription0.getMapping());
      assertEquals("~=+g$VEO&hk&,6wX)j", redisTableFieldDescription0.getFormatHint());
      assertEquals("", string0);
      assertEquals("", redisTableFieldDescription0.getComment());
      assertFalse(redisTableFieldDescription0.isHidden());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("name is null or is empty", bigintType0, "", (String) null, (String) null, "", false);
      String string0 = redisTableFieldDescription0.getComment();
      assertEquals("", redisTableFieldDescription0.getMapping());
      assertFalse(redisTableFieldDescription0.isHidden());
      assertEquals("", redisTableFieldDescription0.getFormatHint());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeWithTimeZoneType timeWithTimeZoneType0 = TimeWithTimeZoneType.TIME_WITH_TIME_ZONE;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("2qgfl*4~2", timeWithTimeZoneType0, "", "", "com.facebook.presto.redis.RedisTableFieldDescription", "com.facebook.presto.redis.RedisTableFieldDescription", true);
      String string0 = redisTableFieldDescription0.getComment();
      assertEquals("com.facebook.presto.redis.RedisTableFieldDescription", redisTableFieldDescription0.getFormatHint());
      assertEquals("com.facebook.presto.redis.RedisTableFieldDescription", redisTableFieldDescription0.getDataFormat());
      assertEquals("", string0);
      assertTrue(redisTableFieldDescription0.isHidden());
      assertEquals("", redisTableFieldDescription0.getMapping());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription(" numHashFunctions: ", bigintType0, (String) null, " numHashFunctions: ", (String) null, (String) null, true);
      ColumnMetadata columnMetadata0 = redisTableFieldDescription0.getColumnMetadata();
      assertTrue(columnMetadata0.isHidden());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DecimalType decimalType0 = DecimalType.createDecimalType();
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("!GP&m:", decimalType0, "!GP&m:", "!GP&m:", "!GP&m:", "", true);
      RedisColumnHandle redisColumnHandle0 = redisTableFieldDescription0.getColumnHandle("Xc&YZOiQORYnga>nB", false, 0);
      assertFalse(redisColumnHandle0.isKeyDecoder());
      assertEquals("!GP&m:", redisColumnHandle0.getDataFormat());
      assertEquals("!GP&m:", redisTableFieldDescription0.getComment());
      assertEquals("!GP&m:", redisColumnHandle0.getName());
      assertEquals("!GP&m:", redisColumnHandle0.getMapping());
      assertTrue(redisColumnHandle0.isHidden());
      assertFalse(redisColumnHandle0.isInternal());
      assertEquals(0, redisColumnHandle0.getOrdinalPosition());
      assertEquals("", redisColumnHandle0.getFormatHint());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("\"", bigintType0, "\"", "\r", "\"", "\"", false);
      RedisColumnHandle redisColumnHandle0 = redisTableFieldDescription0.getColumnHandle("\"", true, 415);
      assertEquals("\"", redisColumnHandle0.getDataFormat());
      assertEquals("\"", redisColumnHandle0.getFormatHint());
      assertTrue(redisColumnHandle0.isKeyDecoder());
      assertEquals(415, redisColumnHandle0.getOrdinalPosition());
      assertFalse(redisColumnHandle0.isHidden());
      assertEquals("\"", redisColumnHandle0.getMapping());
      assertEquals("\r", redisTableFieldDescription0.getComment());
      assertFalse(redisColumnHandle0.isInternal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TinyintType tinyintType0 = TinyintType.TINYINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("line ", tinyintType0, "line ", ",n_/?sS`tzTA", "line ", "line ", false);
      // Undeclared exception!
      try { 
        redisTableFieldDescription0.getColumnHandle((String) null, false, (-1369));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // connectorId is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RedisTableFieldDescription redisTableFieldDescription0 = null;
      try {
        redisTableFieldDescription0 = new RedisTableFieldDescription("tl0'_1LDe", (Type) null, "tl0'_1LDe", "tl0'_1LDe", "tl0'_1LDe", "tl0'_1LDe", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // type is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("mapping", bigintType0, (String) null, (String) null, (String) null, "", false);
      boolean boolean0 = redisTableFieldDescription0.isHidden();
      assertEquals("", redisTableFieldDescription0.getFormatHint());
      assertEquals("mapping", redisTableFieldDescription0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("mapping", bigintType0, (String) null, (String) null, (String) null, "", false);
      redisTableFieldDescription0.getType();
      assertEquals("", redisTableFieldDescription0.getFormatHint());
      assertEquals("mapping", redisTableFieldDescription0.getName());
      assertFalse(redisTableFieldDescription0.isHidden());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("~=+g$VEO&hk&,6wX)j", bigintType0, "", "", "", "~=+g$VEO&hk&,6wX)j", false);
      redisTableFieldDescription0.getName();
      assertEquals("", redisTableFieldDescription0.getMapping());
      assertEquals("~=+g$VEO&hk&,6wX)j", redisTableFieldDescription0.getFormatHint());
      assertEquals("", redisTableFieldDescription0.getDataFormat());
      assertFalse(redisTableFieldDescription0.isHidden());
      assertEquals("", redisTableFieldDescription0.getComment());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription(" numHashFunctions: ", bigintType0, (String) null, " numHashFunctions: ", (String) null, (String) null, true);
      String string0 = redisTableFieldDescription0.getMapping();
      assertNull(string0);
      assertTrue(redisTableFieldDescription0.isHidden());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharType charType0 = CharType.createCharType(0L);
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("I{\"!>QrG", charType0, "l'$KoQ0", "I{\"!>QrG", "hidden", (String) null, false);
      String string0 = redisTableFieldDescription0.getFormatHint();
      assertEquals("l'$KoQ0", redisTableFieldDescription0.getMapping());
      assertEquals("hidden", redisTableFieldDescription0.getDataFormat());
      assertEquals("I{\"!>QrG", redisTableFieldDescription0.getComment());
      assertFalse(redisTableFieldDescription0.isHidden());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("=+g$VE]&k&XX)j", bigintType0, "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", true);
      RedisTableFieldDescription redisTableFieldDescription1 = new RedisTableFieldDescription("=+g$VE]&k&XX)j", bigintType0, "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", true);
      boolean boolean0 = redisTableFieldDescription0.equals(redisTableFieldDescription1);
      assertTrue(boolean0);
      assertTrue(redisTableFieldDescription1.isHidden());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("D'iAH5{E{n~EJu>``B/", bigintType0, "D'iAH5{E{n~EJu>``B/", "determGinism", "D'iAH5{E{n~EJu>``B/", "D'iAH5{E{n~EJu>``B/", false);
      RedisTableFieldDescription redisTableFieldDescription1 = new RedisTableFieldDescription("D'iAH5{E{n~EJu>``B/", bigintType0, "D'iAH5{E{n~EJu>``B/", "D'iAH5{E{n~EJu>``B/", "determGinism", "D'iAH5{E{n~EJu>``B/", false);
      boolean boolean0 = redisTableFieldDescription1.equals(redisTableFieldDescription0);
      assertEquals("determGinism", redisTableFieldDescription0.getComment());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription0.getDataFormat());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription0.getFormatHint());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription0.getMapping());
      assertFalse(boolean0);
      assertFalse(redisTableFieldDescription1.isHidden());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription1.getFormatHint());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription1.getMapping());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("D'iAH5{E{n~EJu>``B/", bigintType0, "", "D'iAH5{E{n~EJu>``B/", "D'iAH5{E{n~EJu>``B/", "D'iAH5{E{n~EJu>``B/", false);
      RedisTableFieldDescription redisTableFieldDescription1 = new RedisTableFieldDescription("D'iAH5{E{n~EJu>``B/", bigintType0, "D'iAH5{E{n~EJu>``B/", "D'iAH5{E{n~EJu>``B/", "D'iAH5{E{n~EJu>``B/", "", false);
      boolean boolean0 = redisTableFieldDescription0.equals(redisTableFieldDescription1);
      assertEquals("", redisTableFieldDescription1.getFormatHint());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription1.getName());
      assertEquals("", redisTableFieldDescription0.getMapping());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription0.getDataFormat());
      assertFalse(redisTableFieldDescription1.isHidden());
      assertFalse(boolean0);
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription1.getComment());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription0.getComment());
      assertEquals("D'iAH5{E{n~EJu>``B/", redisTableFieldDescription1.getDataFormat());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("~=+g$VEO&hk&,6wX)j", bigintType0, "", "", "", "~=+g$VEO&hk&,6wX)j", false);
      RedisTableFieldDescription redisTableFieldDescription1 = new RedisTableFieldDescription("~=+g$VEO&hk&,6wX)j", bigintType0, "", "", "", "", false);
      boolean boolean0 = redisTableFieldDescription0.equals(redisTableFieldDescription1);
      assertEquals("~=+g$VEO&hk&,6wX)j", redisTableFieldDescription1.getName());
      assertFalse(redisTableFieldDescription1.isHidden());
      assertEquals("", redisTableFieldDescription0.getComment());
      assertFalse(boolean0);
      assertEquals("", redisTableFieldDescription0.getDataFormat());
      assertEquals("", redisTableFieldDescription0.getMapping());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("D'Au5{Ekn~Eu>``B/", bigintType0, "D'Au5{Ekn~Eu>``B/", "etemG#inm", "etemG#inm", "D'Au5{Ekn~Eu>``B/", false);
      RedisTableFieldDescription redisTableFieldDescription1 = new RedisTableFieldDescription("etemG#inm", bigintType0, "etemG#inm", "etemG#inm", "etemG#inm", "D'Au5{Ekn~Eu>``B/", false);
      boolean boolean0 = redisTableFieldDescription1.equals(redisTableFieldDescription0);
      assertFalse(boolean0);
      assertEquals("etemG#inm", redisTableFieldDescription0.getComment());
      assertFalse(redisTableFieldDescription1.isHidden());
      assertEquals("etemG#inm", redisTableFieldDescription1.getMapping());
      assertEquals("etemG#inm", redisTableFieldDescription1.getName());
      assertEquals("D'Au5{Ekn~Eu>``B/", redisTableFieldDescription0.getMapping());
      assertEquals("etemG#inm", redisTableFieldDescription0.getDataFormat());
      assertEquals("D'Au5{Ekn~Eu>``B/", redisTableFieldDescription1.getFormatHint());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonType jsonType0 = JsonType.JSON;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("RIGHT", jsonType0, "RIGHT", "RIGHT", "RIGHT", "RIGHT", true);
      SmallintType smallintType0 = SmallintType.SMALLINT;
      RedisTableFieldDescription redisTableFieldDescription1 = new RedisTableFieldDescription("RIGHT", smallintType0, "RIGHT", "RIGHT", "RIGHT", "RIGHT", true);
      boolean boolean0 = redisTableFieldDescription0.equals(redisTableFieldDescription1);
      assertTrue(redisTableFieldDescription1.isHidden());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("D' iAH5{E{n~EJ>``B/", bigintType0, "D' iAH5{E{n~EJ>``B/", "D' iAH5{E{n~EJ>``B/", "D' iAH5{E{n~EJ>``B/", "D' iAH5{E{n~EJ>``B/", false);
      boolean boolean0 = redisTableFieldDescription0.equals((Object) null);
      assertFalse(redisTableFieldDescription0.isHidden());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("=+g$VE]&k&XX)j", bigintType0, "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", true);
      boolean boolean0 = redisTableFieldDescription0.equals(redisTableFieldDescription0);
      assertTrue(boolean0);
      assertTrue(redisTableFieldDescription0.isHidden());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonType jsonType0 = JsonType.JSON;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("RIGHT", jsonType0, "RIGHT", "RIGHT", "RIGHT", "RIGHT", true);
      boolean boolean0 = redisTableFieldDescription0.equals(jsonType0);
      assertFalse(boolean0);
      assertTrue(redisTableFieldDescription0.isHidden());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      P4HyperLogLogType p4HyperLogLogType0 = new P4HyperLogLogType();
      RedisTableFieldDescription redisTableFieldDescription0 = null;
      try {
        redisTableFieldDescription0 = new RedisTableFieldDescription("", p4HyperLogLogType0, "", "", "", "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name is null or is empty
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("D'i5{E{~EJ>``/", bigintType0, "D'i5{E{~EJ>``/", "D'i5{E{~EJ>``/", "D'i5{E{~EJ>``/", "D'i5{E{~EJ>``/", false);
      String string0 = redisTableFieldDescription0.toString();
      assertEquals("RedisTableFieldDescription{name=D'i5{E{~EJ>``/, type=bigint, mapping=D'i5{E{~EJ>``/, dataFormat=D'i5{E{~EJ>``/, formatHint=D'i5{E{~EJ>``/, hidden=false}", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonType jsonType0 = JsonType.JSON;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("RIGHT", jsonType0, "RIGHT", "RIGHT", "RIGHT", "RIGHT", true);
      redisTableFieldDescription0.hashCode();
      assertTrue(redisTableFieldDescription0.isHidden());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("~=+g$VEO&hk&,6wX)j", bigintType0, "", "", "", "~=+g$VEO&hk&,6wX)j", false);
      assertEquals("~=+g$VEO&hk&,6wX)j", redisTableFieldDescription0.getName());
      
      ColumnMetadata columnMetadata0 = redisTableFieldDescription0.getColumnMetadata();
      assertEquals("", columnMetadata0.getComment());
      assertEquals("", redisTableFieldDescription0.getDataFormat());
      assertEquals("", redisTableFieldDescription0.getMapping());
      assertEquals("~=+g$VEO&hk&,6wX)j", redisTableFieldDescription0.getFormatHint());
      assertFalse(columnMetadata0.isHidden());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonType jsonType0 = JsonType.JSON;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("RIGHT", jsonType0, "RIGHT", "RIGHT", "RIGHT", "RIGHT", true);
      redisTableFieldDescription0.getComment();
      assertTrue(redisTableFieldDescription0.isHidden());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonType jsonType0 = JsonType.JSON;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("RIGHT", jsonType0, "RIGHT", "RIGHT", "RIGHT", "RIGHT", true);
      RedisColumnHandle redisColumnHandle0 = redisTableFieldDescription0.getColumnHandle("RIGHT", true, (-2026));
      assertEquals((-2026), redisColumnHandle0.getOrdinalPosition());
      assertFalse(redisColumnHandle0.isInternal());
      assertTrue(redisColumnHandle0.isHidden());
      assertTrue(redisColumnHandle0.isKeyDecoder());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BigintType bigintType0 = BigintType.BIGINT;
      RedisTableFieldDescription redisTableFieldDescription0 = new RedisTableFieldDescription("=+g$VE]&k&XX)j", bigintType0, "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", "=+g$VE]&k&XX)j", true);
      redisTableFieldDescription0.getDataFormat();
      assertTrue(redisTableFieldDescription0.isHidden());
  }
}
