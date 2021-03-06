/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 08:45:55 GMT 2021
 */

package com.facebook.presto.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.airlift.json.JsonCodec;
import com.facebook.presto.common.type.HyperLogLogType;
import com.facebook.presto.common.type.TimestampWithTimeZoneType;
import com.facebook.presto.redis.RedisColumnHandle;
import com.facebook.presto.redis.RedisConnectorConfig;
import com.facebook.presto.redis.RedisConnectorId;
import com.facebook.presto.redis.RedisMetadata;
import com.facebook.presto.redis.RedisTableDescription;
import com.facebook.presto.redis.RedisTableDescriptionSupplier;
import com.facebook.presto.redis.RedisTableFieldDescription;
import com.facebook.presto.redis.RedisTableFieldGroup;
import com.facebook.presto.redis.RedisTableHandle;
import com.facebook.presto.redis.RedisTableLayoutHandle;
import com.facebook.presto.spi.ColumnHandle;
import com.facebook.presto.spi.ColumnMetadata;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.ConnectorTableLayout;
import com.facebook.presto.spi.ConnectorTableLayoutResult;
import com.facebook.presto.spi.Constraint;
import com.facebook.presto.spi.SchemaTableName;
import com.facebook.presto.spi.SchemaTablePrefix;
import com.facebook.presto.testing.TestingHandle;
import com.facebook.presto.testing.TestingMetadata;
import com.facebook.presto.tpch.TpchColumnHandle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.apache.bval.util.Lazy;
import org.apache.bval.util.ObjectWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RedisMetadata_ESTest extends RedisMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "Procedures already registered for connector: %s", "v", "v", "", "");
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      Constraint<ColumnHandle> constraint0 = Constraint.alwaysTrue();
      RedisTableLayoutHandle redisTableLayoutHandle0 = new RedisTableLayoutHandle(redisTableHandle0);
      ConnectorTableLayout connectorTableLayout0 = redisMetadata0.getTableLayout((ConnectorSession) null, redisTableLayoutHandle0);
      Optional<Set<ColumnHandle>> optional0 = (Optional<Set<ColumnHandle>>)connectorTableLayout0.getStreamPartitioningColumns();
      List<ConnectorTableLayoutResult> list0 = redisMetadata0.getTableLayouts((ConnectorSession) null, redisTableHandle0, constraint0, optional0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("q|");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>();
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      Map<SchemaTableName, RedisTableDescription> map0 = redisMetadata0.getDefinedTables();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      Map<SchemaTableName, RedisTableDescription> map0 = redisMetadata0.getDefinedTables();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTableName schemaTableName0 = new SchemaTableName("redisConfig is null", "Procedures already registered for connector: %s");
      Vector<RedisTableFieldDescription> vector0 = new Vector<RedisTableFieldDescription>();
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("Procedures already registered for connector: %s", "default", vector0);
      RedisTableDescription redisTableDescription0 = new RedisTableDescription("default", "Procedures already registered for connector: %s", redisTableFieldGroup0, redisTableFieldGroup0);
      BiFunction<Object, Object, RedisTableDescription> biFunction0 = (BiFunction<Object, Object, RedisTableDescription>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge(schemaTableName0, redisTableDescription0, biFunction0);
      Map<SchemaTableName, RedisTableDescription> map0 = redisMetadata0.getDefinedTables();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "v", "v", "", "");
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      HyperLogLogType hyperLogLogType0 = HyperLogLogType.HYPER_LOG_LOG;
      RedisColumnHandle redisColumnHandle0 = new RedisColumnHandle("v", 4, "'O4p79AAK4H<-G", hyperLogLogType0, "", "com.facebook.presto.redis.RedisMetadata", "(", true, true, false);
      ColumnMetadata columnMetadata0 = redisMetadata0.getColumnMetadata((ConnectorSession) null, redisTableHandle0, redisColumnHandle0);
      assertTrue(columnMetadata0.isHidden());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("", "", "v", "v", "", "");
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      HyperLogLogType hyperLogLogType0 = HyperLogLogType.HYPER_LOG_LOG;
      RedisColumnHandle redisColumnHandle0 = new RedisColumnHandle("v", 4, "'O4p79AAK4H<-G", hyperLogLogType0, "", "com.facebook.presto.redis.RedisMetadata", "(", false, false, false);
      ColumnMetadata columnMetadata0 = redisMetadata0.getColumnMetadata((ConnectorSession) null, redisTableHandle0, redisColumnHandle0);
      assertEquals("'o4p79aak4h<-g", columnMetadata0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("(i}+EA$");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>();
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      // Undeclared exception!
      try { 
        redisMetadata0.listTables((ConnectorSession) null, "kH2h0@x1\"IL");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.redis.RedisMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      Lazy<Map<SchemaTableName, RedisTableDescription>> lazy0 = new Lazy<Map<SchemaTableName, RedisTableDescription>>(objectWrapper0);
      Lazy<Map<SchemaTableName, RedisTableDescription>> lazy1 = lazy0.reset((Supplier<Map<SchemaTableName, RedisTableDescription>>) lazy0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, lazy1);
      SchemaTablePrefix schemaTablePrefix0 = new SchemaTablePrefix("redisConfig is null");
      // Undeclared exception!
      redisMetadata0.listTableColumns((ConnectorSession) null, schemaTablePrefix0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("^owa");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>();
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTablePrefix schemaTablePrefix0 = new SchemaTablePrefix("!cqoJDe0:", "!cqoJDe0:");
      // Undeclared exception!
      try { 
        redisMetadata0.listTableColumns((ConnectorSession) null, schemaTablePrefix0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.redis.RedisMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("default");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>();
      Lazy<Map<SchemaTableName, RedisTableDescription>> lazy0 = new Lazy<Map<SchemaTableName, RedisTableDescription>>(objectWrapper0);
      Lazy<Map<SchemaTableName, RedisTableDescription>> lazy1 = lazy0.reset((Supplier<Map<SchemaTableName, RedisTableDescription>>) lazy0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, lazy1);
      // Undeclared exception!
      redisMetadata0.listSchemaNames((ConnectorSession) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("B({7");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>();
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      // Undeclared exception!
      try { 
        redisMetadata0.listSchemaNames((ConnectorSession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.redis.RedisMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("^owa");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>();
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTablePrefix schemaTablePrefix0 = new SchemaTablePrefix("!cqoJDe0:", "!cqoJDe0:");
      SchemaTableName schemaTableName0 = schemaTablePrefix0.toSchemaTableName();
      TestingMetadata.TestingTableHandle testingMetadata_TestingTableHandle0 = new TestingMetadata.TestingTableHandle(schemaTableName0);
      // Undeclared exception!
      try { 
        redisMetadata0.getTableMetadata((ConnectorSession) null, testingMetadata_TestingTableHandle0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // tableHandle is not an instance of RedisTableHandle
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("k");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("\"vY{M%rcdh<sAAB:", "Procedures already registered for connector: %s", "v", "v", "k", "\"vY{M%rcdh<sAAB:");
      // Undeclared exception!
      try { 
        redisMetadata0.getTableMetadata((ConnectorSession) null, redisTableHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Table 'procedures already registered for connector: %s.v' not found
         //
         verifyException("com.facebook.presto.redis.RedisMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("k");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("\"vY{M%rcdh<sAAB:", "Procedures already registered for connector: %s", "v", "v", "", "\"vY{M%rcdh<sAAB:");
      // Undeclared exception!
      try { 
        redisMetadata0.getTableLayouts((ConnectorSession) null, redisTableHandle0, (Constraint<ColumnHandle>) null, (Optional<Set<ColumnHandle>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.redis.RedisMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("59~");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>((Map<SchemaTableName, RedisTableDescription>) null);
      Lazy<Map<SchemaTableName, RedisTableDescription>> lazy0 = new Lazy<Map<SchemaTableName, RedisTableDescription>>(objectWrapper0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, lazy0);
      TestingHandle testingHandle0 = TestingHandle.INSTANCE;
      // Undeclared exception!
      try { 
        redisMetadata0.getTableLayout((ConnectorSession) null, testingHandle0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // layout is not an instance of RedisTableLayoutHandle
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("B({7");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>();
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTableName schemaTableName0 = new SchemaTableName("#", "connectorId is null");
      // Undeclared exception!
      try { 
        redisMetadata0.getTableHandle((ConnectorSession) null, schemaTableName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.redis.RedisMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("+'j\"?!%b4i0Xj");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      Class<RedisTableDescription> class0 = RedisTableDescription.class;
      JsonCodec<RedisTableDescription> jsonCodec0 = JsonCodec.jsonCodec(class0);
      RedisTableDescriptionSupplier redisTableDescriptionSupplier0 = new RedisTableDescriptionSupplier(redisConnectorConfig0, jsonCodec0);
      Lazy<Map<SchemaTableName, RedisTableDescription>> lazy0 = new Lazy<Map<SchemaTableName, RedisTableDescription>>(redisTableDescriptionSupplier0);
      lazy0.reset((Supplier<Map<SchemaTableName, RedisTableDescription>>) lazy0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, lazy0);
      // Undeclared exception!
      redisMetadata0.getDefinedTables();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("k");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("\"vY{M%rcdh<sAAB:", "lz+&*2HM!i{9 [< '", "v", "v", "", "\"vY{M%rcdh<sAAB:");
      TimestampWithTimeZoneType timestampWithTimeZoneType0 = TimestampWithTimeZoneType.TIMESTAMP_WITH_TIME_ZONE;
      TpchColumnHandle tpchColumnHandle0 = new TpchColumnHandle("v", timestampWithTimeZoneType0);
      // Undeclared exception!
      try { 
        redisMetadata0.getColumnMetadata((ConnectorSession) null, redisTableHandle0, tpchColumnHandle0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // columnHandle is not an instance of RedisColumnHandle
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("k");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("\"vY{M%rcdh<sAAB:", "Procedures already registered for connector: %s", "", "", "", "\"vY{M%rcdh<sAAB:");
      // Undeclared exception!
      try { 
        redisMetadata0.getColumnHandles((ConnectorSession) null, redisTableHandle0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // tableName is empty
         //
         verifyException("com.facebook.presto.spi.SchemaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = null;
      try {
        redisMetadata0 = new RedisMetadata((RedisConnectorId) null, (RedisConnectorConfig) null, objectWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // connectorId is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTablePrefix schemaTablePrefix0 = new SchemaTablePrefix("(", "(");
      // Undeclared exception!
      try { 
        redisMetadata0.listTableColumns((ConnectorSession) null, schemaTablePrefix0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Table '(.(' not found
         //
         verifyException("com.facebook.presto.redis.RedisMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("'");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("'", "Procedures already registered for connector: %s", "'", "v", "'", "Procedures already registered for connector: %s");
      // Undeclared exception!
      try { 
        redisMetadata0.getColumnHandles((ConnectorSession) null, redisTableHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Table 'procedures already registered for connector: %s.'' not found
         //
         verifyException("com.facebook.presto.redis.RedisMetadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTableName schemaTableName0 = new SchemaTableName("(", "Procedures already registered for connector: %s");
      Vector<RedisTableFieldDescription> vector0 = new Vector<RedisTableFieldDescription>();
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("Procedures already registered for connector: %s", "default", vector0);
      RedisTableDescription redisTableDescription0 = new RedisTableDescription("default", "Procedures already registered for connector: %s", redisTableFieldGroup0, redisTableFieldGroup0);
      BiFunction<Object, Object, RedisTableDescription> biFunction0 = (BiFunction<Object, Object, RedisTableDescription>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge(schemaTableName0, redisTableDescription0, biFunction0);
      RedisTableHandle redisTableHandle0 = redisMetadata0.getTableHandle((ConnectorSession) null, schemaTableName0);
      redisMetadata0.getColumnHandles((ConnectorSession) null, redisTableHandle0);
      assertEquals("Procedures already registered for connector: %s", redisTableHandle0.getValueDataFormat());
      assertEquals("Procedures already registered for connector: %s", redisTableHandle0.getKeyDataFormat());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTableName schemaTableName0 = new SchemaTableName("(", "Procedures already registered for connector: %s");
      Vector<RedisTableFieldDescription> vector0 = new Vector<RedisTableFieldDescription>();
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("Procedures already registered for connector: %s", "default", vector0);
      RedisTableDescription redisTableDescription0 = new RedisTableDescription("default", "Procedures already registered for connector: %s", redisTableFieldGroup0, redisTableFieldGroup0);
      BiFunction<Object, Object, RedisTableDescription> biFunction0 = (BiFunction<Object, Object, RedisTableDescription>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge(schemaTableName0, redisTableDescription0, biFunction0);
      List<SchemaTableName> list0 = redisMetadata0.listTables((ConnectorSession) null, "(");
      assertTrue(list0.contains(schemaTableName0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      SchemaTableName schemaTableName0 = new SchemaTableName("(>aPd,pwD!j3gF", "1Gyo");
      RedisTableDescription redisTableDescription0 = new RedisTableDescription("(>aPd,pwD!j3gF", "redisconfig is null", (RedisTableFieldGroup) null, (RedisTableFieldGroup) null);
      hashMap0.put(schemaTableName0, redisTableDescription0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTablePrefix schemaTablePrefix0 = new SchemaTablePrefix();
      Map<SchemaTableName, List<ColumnMetadata>> map0 = (Map<SchemaTableName, List<ColumnMetadata>>)redisMetadata0.listTableColumns((ConnectorSession) null, schemaTablePrefix0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTableName schemaTableName0 = new SchemaTableName("(", "Procedures already registered for connector: %s");
      Vector<RedisTableFieldDescription> vector0 = new Vector<RedisTableFieldDescription>();
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("Procedures already registered for connector: %s", "default", vector0);
      RedisTableDescription redisTableDescription0 = new RedisTableDescription("default", "Procedures already registered for connector: %s", redisTableFieldGroup0, redisTableFieldGroup0);
      BiFunction<Object, Object, RedisTableDescription> biFunction0 = (BiFunction<Object, Object, RedisTableDescription>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge(schemaTableName0, redisTableDescription0, biFunction0);
      List<SchemaTableName> list0 = redisMetadata0.listTables((ConnectorSession) null, "[9Cmy");
      assertFalse(list0.contains(schemaTableName0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTableName schemaTableName0 = new SchemaTableName("redisConfig is null", "Procedures already registered for connector: %s");
      Vector<RedisTableFieldDescription> vector0 = new Vector<RedisTableFieldDescription>();
      RedisTableFieldGroup redisTableFieldGroup0 = new RedisTableFieldGroup("Procedures already registered for connector: %s", "default", vector0);
      RedisTableDescription redisTableDescription0 = new RedisTableDescription("default", "Procedures already registered for connector: %s", redisTableFieldGroup0, redisTableFieldGroup0);
      BiFunction<Object, Object, RedisTableDescription> biFunction0 = (BiFunction<Object, Object, RedisTableDescription>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge(schemaTableName0, redisTableDescription0, biFunction0);
      RedisTableHandle redisTableHandle0 = redisMetadata0.getTableHandle((ConnectorSession) null, schemaTableName0);
      assertNotNull(redisTableHandle0);
      
      redisMetadata0.getTableMetadata((ConnectorSession) null, redisTableHandle0);
      assertEquals("Procedures already registered for connector: %s", redisTableHandle0.getKeyDataFormat());
      assertEquals("Procedures already registered for connector: %s", redisTableHandle0.getValueDataFormat());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTableName schemaTableName0 = new SchemaTableName("redisConfig is null", "Procedures already registered for connector: %s");
      RedisTableHandle redisTableHandle0 = redisMetadata0.getTableHandle((ConnectorSession) null, schemaTableName0);
      // Undeclared exception!
      try { 
        redisMetadata0.getTableMetadata((ConnectorSession) null, redisTableHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tableHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      SchemaTableName schemaTableName0 = new SchemaTableName("redisConfig is null", "Procedures already registered for connector: %s");
      RedisTableHandle redisTableHandle0 = redisMetadata0.getTableHandle((ConnectorSession) null, schemaTableName0);
      RedisTableLayoutHandle redisTableLayoutHandle0 = new RedisTableLayoutHandle(redisTableHandle0);
      // Undeclared exception!
      try { 
        redisMetadata0.getTableLayout((ConnectorSession) null, redisTableLayoutHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tableHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisTableHandle redisTableHandle0 = new RedisTableHandle("\"vY{M%rcdh<sAAB:", "\"vY{M%rcdh<sAAB:", "v", "v", "", "\"vY{M%rcdh<sAAB:");
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      // Undeclared exception!
      try { 
        redisMetadata0.getColumnMetadata((ConnectorSession) null, redisTableHandle0, (ColumnHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // columnHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RedisConnectorId redisConnectorId0 = new RedisConnectorId("");
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      HashMap<SchemaTableName, RedisTableDescription> hashMap0 = new HashMap<SchemaTableName, RedisTableDescription>();
      ObjectWrapper<Map<SchemaTableName, RedisTableDescription>> objectWrapper0 = new ObjectWrapper<Map<SchemaTableName, RedisTableDescription>>(hashMap0);
      RedisMetadata redisMetadata0 = new RedisMetadata(redisConnectorId0, redisConnectorConfig0, objectWrapper0);
      List<String> list0 = redisMetadata0.listSchemaNames((ConnectorSession) null);
      assertEquals(0, list0.size());
  }
}
