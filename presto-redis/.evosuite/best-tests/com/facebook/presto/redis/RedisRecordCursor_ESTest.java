/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 08:49:25 GMT 2021
 */

package com.facebook.presto.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.client.NodeVersion;
import com.facebook.presto.common.type.SmallintType;
import com.facebook.presto.decoder.DecoderColumnHandle;
import com.facebook.presto.decoder.RowDecoder;
import com.facebook.presto.decoder.csv.CsvRowDecoder;
import com.facebook.presto.decoder.dummy.DummyRowDecoder;
import com.facebook.presto.decoder.raw.RawRowDecoder;
import com.facebook.presto.metadata.InternalNode;
import com.facebook.presto.redis.RedisColumnHandle;
import com.facebook.presto.redis.RedisConnectorConfig;
import com.facebook.presto.redis.RedisJedisManager;
import com.facebook.presto.redis.RedisRecordCursor;
import com.facebook.presto.redis.RedisSplit;
import com.facebook.presto.spi.HostAddress;
import com.facebook.presto.spi.Node;
import com.facebook.presto.spi.NodeManager;
import com.facebook.presto.testing.TestingNodeManager;
import com.facebook.presto.testing.TestingSplit;
import com.google.common.collect.ImmutableList;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RedisRecordCursor_ESTest extends RedisRecordCursor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeSet<DecoderColumnHandle> treeSet0 = new TreeSet<DecoderColumnHandle>();
      RawRowDecoder rawRowDecoder0 = new RawRowDecoder(treeSet0);
      HostAddress hostAddress0 = HostAddress.fromString("");
      ImmutableList<HostAddress> immutableList0 = ImmutableList.of(hostAddress0, hostAddress0, hostAddress0);
      RedisSplit redisSplit0 = new RedisSplit("raw", "Tw7Vy", "Tw7Vy", "Refreshing system access control from %s", "raw", "Read a total of %d values with %d bytes.", 63072000000L, 923L, immutableList0);
      LinkedList<RedisColumnHandle> linkedList0 = new LinkedList<RedisColumnHandle>();
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      TestingNodeManager testingNodeManager0 = new TestingNodeManager("wB");
      RedisJedisManager redisJedisManager0 = new RedisJedisManager(redisConnectorConfig0, testingNodeManager0);
      RedisRecordCursor redisRecordCursor0 = null;
      try {
        redisRecordCursor0 = new RedisRecordCursor(rawRowDecoder0, rawRowDecoder0, redisSplit0, linkedList0, redisJedisManager0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: no port
         //
         verifyException("com.google.common.cache.LocalCache$Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DummyRowDecoder dummyRowDecoder0 = new DummyRowDecoder();
      ArrayList<RedisColumnHandle> arrayList0 = new ArrayList<RedisColumnHandle>(0);
      RedisRecordCursor redisRecordCursor0 = null;
      try {
        redisRecordCursor0 = new RedisRecordCursor(dummyRowDecoder0, dummyRowDecoder0, (RedisSplit) null, arrayList0, (RedisJedisManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.redis.RedisRecordCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TreeSet<DecoderColumnHandle> treeSet0 = new TreeSet<DecoderColumnHandle>();
      CsvRowDecoder csvRowDecoder0 = new CsvRowDecoder(treeSet0);
      TestingSplit testingSplit0 = TestingSplit.createEmptySplit();
      List<HostAddress> list0 = testingSplit0.getAddresses();
      RedisSplit redisSplit0 = new RedisSplit("csv", "csv", "csv", "csv", "csv", "csv", (-1593L), (-1593L), list0);
      Vector<RedisColumnHandle> vector0 = new Vector<RedisColumnHandle>();
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      URI uRI0 = MockURI.URI("csv", "0", (String) null);
      NodeVersion nodeVersion0 = new NodeVersion("com.facebook.presto.redis.RedisRecordCursor$1");
      InternalNode internalNode0 = new InternalNode("csv", uRI0, nodeVersion0, false);
      Stack<Node> stack0 = new Stack<Node>();
      TestingNodeManager testingNodeManager0 = new TestingNodeManager("csv", internalNode0, stack0);
      RedisJedisManager redisJedisManager0 = new RedisJedisManager(redisConnectorConfig0, testingNodeManager0);
      RedisRecordCursor redisRecordCursor0 = null;
      try {
        redisRecordCursor0 = new RedisRecordCursor(csvRowDecoder0, csvRowDecoder0, redisSplit0, vector0, redisJedisManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.common.collect.RegularImmutableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HostAddress hostAddress0 = new HostAddress("`x]:E|M", 391);
      ImmutableList<HostAddress> immutableList0 = ImmutableList.of(hostAddress0, hostAddress0);
      RedisSplit redisSplit0 = new RedisSplit("`x]:E|M", "`x]:E|M", "`x]:E|M", "`x]:E|M", "`x]:E|M", "`x]:E|M", 2345L, 2345L, immutableList0);
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 391);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      RedisJedisManager redisJedisManager0 = new RedisJedisManager(redisConnectorConfig0, (NodeManager) null);
      LinkedList<RedisColumnHandle> linkedList0 = new LinkedList<RedisColumnHandle>();
      RedisRecordCursor redisRecordCursor0 = null;
      try {
        redisRecordCursor0 = new RedisRecordCursor((RowDecoder) null, (RowDecoder) null, redisSplit0, linkedList0, redisJedisManager0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of stream.
         //
         verifyException("redis.clients.util.RedisInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HostAddress hostAddress0 = new HostAddress("Dfcq['q", 391);
      ImmutableList<HostAddress> immutableList0 = ImmutableList.of(hostAddress0, hostAddress0);
      RedisSplit redisSplit0 = new RedisSplit("'`Cq9:|FM", "'`Cq9:|FM", "Dfcq['q", "org.testng.SuiteRunner", "'`Cq9:|FM", "'`Cq9:|FM", 31557600000L, 3600L, immutableList0);
      SmallintType smallintType0 = SmallintType.SMALLINT;
      RedisColumnHandle redisColumnHandle0 = new RedisColumnHandle("org.codehaus.jackson.map.ext.JodaSerializers$LocalDateSerializer", 0, "Dfcq['q", smallintType0, "org.codehaus.jackson.map.ext.JodaSerializers$LocalDateSerializer", "org.codehaus.jackson.map.ext.JodaSerializers$LocalDateSerializer", "Dfcq['q", true, true, true);
      ImmutableList<RedisColumnHandle> immutableList1 = ImmutableList.of(redisColumnHandle0, redisColumnHandle0, redisColumnHandle0, redisColumnHandle0, redisColumnHandle0, redisColumnHandle0, redisColumnHandle0);
      RedisConnectorConfig redisConnectorConfig0 = new RedisConnectorConfig();
      RedisConnectorConfig redisConnectorConfig1 = redisConnectorConfig0.setKeyPrefixSchemaTable(true);
      RedisJedisManager redisJedisManager0 = new RedisJedisManager(redisConnectorConfig1, (NodeManager) null);
      RedisRecordCursor redisRecordCursor0 = null;
      try {
        redisRecordCursor0 = new RedisRecordCursor((RowDecoder) null, (RowDecoder) null, redisSplit0, immutableList1, redisJedisManager0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not get a resource from the pool
         //
         verifyException("redis.clients.util.Pool", e);
      }
  }
}
