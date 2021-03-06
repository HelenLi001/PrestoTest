/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 01:46:50 GMT 2021
 */

package com.facebook.presto.accumulo.conf;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.accumulo.conf.AccumuloConfig;
import io.airlift.units.Duration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AccumuloConfig_ESTest extends AccumuloConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      
      accumuloConfig0.setCardinalityCacheSize(0);
      accumuloConfig0.setZooKeepers("");
      assertEquals("", accumuloConfig0.getZooKeepers());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setCardinalityCacheSize((-12));
      accumuloConfig0.setZooKeepers("accumulo.cardinality.cache.size");
      assertEquals((-12), accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      
      accumuloConfig0.setCardinalityCacheSize(0);
      accumuloConfig0.setUsername("accumulo.cardinality.cache.size");
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setCardinalityCacheSize((-12));
      accumuloConfig0.setUsername("accumulo.instance");
      assertEquals((-12), accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      
      accumuloConfig0.setCardinalityCacheSize(0);
      accumuloConfig0.setPassword("m");
      assertEquals(0, accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setCardinalityCacheSize((-12));
      accumuloConfig0.setPassword("accumulo.cardinality.cache.size");
      assertEquals((-12), accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      
      accumuloConfig0.setCardinalityCacheSize(0);
      accumuloConfig0.setInstance("");
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setCardinalityCacheSize((-1888));
      accumuloConfig0.setInstance("");
      assertEquals((-1888), accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      AccumuloConfig accumuloConfig1 = accumuloConfig0.setZooKeepers("h");
      String string0 = accumuloConfig1.getZooKeepers();
      assertEquals(100000, accumuloConfig1.getCardinalityCacheSize());
      assertEquals("h", string0);
      assertEquals("/presto-accumulo", accumuloConfig1.getZkMetadataRoot());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setZooKeepers("");
      String string0 = accumuloConfig0.getZooKeepers();
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      
      accumuloConfig0.setZkMetadataRoot((String) null);
      accumuloConfig0.getZkMetadataRoot();
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      
      accumuloConfig0.setZkMetadataRoot("");
      String string0 = accumuloConfig0.getZkMetadataRoot();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setUsername("VcY*D_Dz");
      String string0 = accumuloConfig0.getUsername();
      assertEquals("VcY*D_Dz", string0);
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setUsername("");
      String string0 = accumuloConfig0.getUsername();
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setPassword("accumulo.password");
      String string0 = accumuloConfig0.getPassword();
      assertEquals("accumulo.password", string0);
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setPassword("");
      String string0 = accumuloConfig0.getPassword();
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertEquals("", string0);
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      AccumuloConfig accumuloConfig1 = accumuloConfig0.setInstance("");
      String string0 = accumuloConfig1.getInstance();
      assertEquals("", string0);
      assertEquals(100000, accumuloConfig1.getCardinalityCacheSize());
      assertEquals("/presto-accumulo", accumuloConfig1.getZkMetadataRoot());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      
      accumuloConfig0.setCardinalityCacheSize(0);
      int int0 = accumuloConfig0.getCardinalityCacheSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setCardinalityCacheExpiration((Duration) null);
      accumuloConfig0.getCardinalityCacheExpiration();
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      int int0 = accumuloConfig0.getCardinalityCacheSize();
      assertEquals(100000, int0);
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      String string0 = accumuloConfig0.getInstance();
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertNull(string0);
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      Duration duration0 = accumuloConfig0.getCardinalityCacheExpiration();
      accumuloConfig0.setCardinalityCacheExpiration(duration0);
      assertEquals(5.0, duration0.getValue(), 0.01);
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      String string0 = accumuloConfig0.getZooKeepers();
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      AccumuloConfig accumuloConfig1 = accumuloConfig0.setInstance("accumulo.cardinality.cache.expire.duration");
      String string0 = accumuloConfig1.getInstance();
      assertEquals("/presto-accumulo", accumuloConfig1.getZkMetadataRoot());
      assertEquals(100000, accumuloConfig1.getCardinalityCacheSize());
      assertEquals("accumulo.cardinality.cache.expire.duration", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      String string0 = accumuloConfig0.getUsername();
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      accumuloConfig0.setCardinalityCacheSize((-12));
      int int0 = accumuloConfig0.getCardinalityCacheSize();
      assertEquals((-12), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      String string0 = accumuloConfig0.getZkMetadataRoot();
      assertEquals("/presto-accumulo", string0);
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AccumuloConfig accumuloConfig0 = new AccumuloConfig();
      String string0 = accumuloConfig0.getPassword();
      assertEquals("/presto-accumulo", accumuloConfig0.getZkMetadataRoot());
      assertEquals(100000, accumuloConfig0.getCardinalityCacheSize());
      assertNull(string0);
  }
}
