/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 10:21:02 GMT 2021
 */

package com.facebook.presto.cache;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.cache.CacheConfig;
import com.facebook.presto.cache.CacheType;
import com.facebook.presto.hive.CacheQuotaScope;
import io.airlift.units.DataSize;
import java.net.URI;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheConfig_ESTest extends CacheConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      CacheConfig cacheConfig1 = cacheConfig0.setCachingEnabled(true);
      cacheConfig1.setValidationEnabled(true);
      assertTrue(cacheConfig0.isCachingEnabled());
      assertTrue(cacheConfig0.isValidationEnabled());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      CacheConfig cacheConfig1 = cacheConfig0.setValidationEnabled(true);
      cacheConfig1.setDefaultCacheQuota((DataSize) null);
      assertTrue(cacheConfig0.isValidationEnabled());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.setCachingEnabled(true);
      cacheConfig0.setDefaultCacheQuota((DataSize) null);
      assertTrue(cacheConfig0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.setValidationEnabled(true);
      cacheConfig0.setCachingEnabled(true);
      assertTrue(cacheConfig0.isValidationEnabled());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.setValidationEnabled(true);
      CacheType cacheType0 = CacheType.ALLUXIO;
      cacheConfig0.setCacheType(cacheType0);
      assertTrue(cacheConfig0.isValidationEnabled());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.setCachingEnabled(true);
      CacheType cacheType0 = CacheType.ALLUXIO;
      cacheConfig0.setCacheType(cacheType0);
      assertTrue(cacheConfig0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.setValidationEnabled(true);
      CacheQuotaScope cacheQuotaScope0 = CacheQuotaScope.PARTITION;
      cacheConfig0.setCacheQuotaScope(cacheQuotaScope0);
      assertTrue(cacheConfig0.isValidationEnabled());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      CacheConfig cacheConfig1 = cacheConfig0.setCachingEnabled(true);
      CacheQuotaScope cacheQuotaScope0 = CacheQuotaScope.PARTITION;
      cacheConfig1.setCacheQuotaScope(cacheQuotaScope0);
      assertTrue(cacheConfig0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.setValidationEnabled(true);
      URI uRI0 = MockURI.aHttpURI;
      cacheConfig0.setBaseDirectory(uRI0);
      assertTrue(cacheConfig0.isValidationEnabled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      URI uRI0 = MockURI.URI("TERABYTE", "TERABYTE", "TERABYTE");
      cacheConfig0.setCachingEnabled(true);
      cacheConfig0.setBaseDirectory(uRI0);
      assertTrue(cacheConfig0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      CacheConfig cacheConfig1 = cacheConfig0.setValidationEnabled(true);
      boolean boolean0 = cacheConfig1.isValidationEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.setCachingEnabled(true);
      boolean boolean0 = cacheConfig0.isCachingEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.setCacheQuotaScope((CacheQuotaScope) null);
      cacheConfig0.getCacheQuotaScope();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      URI uRI0 = MockURI.URI("TERABYTE", "TERABYTE", "TERABYTE");
      cacheConfig0.setBaseDirectory(uRI0);
      URI uRI1 = cacheConfig0.getBaseDirectory();
      assertNull(uRI1.getHost());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      URI uRI0 = MockURI.URI("com.facebook.presto.cache.CacheConfig");
      cacheConfig0.setBaseDirectory(uRI0);
      URI uRI1 = cacheConfig0.getBaseDirectory();
      assertNull(uRI1.getRawFragment());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      URI uRI0 = MockURI.URI("com.facebook.presto.cache.CacheConfig", "com.facebook.presto.cache.CacheConfig", "com.facebook.presto.cache.CacheConfig", 0, "", "G-", "com.facebook.presto.cache.CacheConfig");
      cacheConfig0.setBaseDirectory(uRI0);
      URI uRI1 = cacheConfig0.getBaseDirectory();
      assertTrue(uRI1.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      URI uRI0 = MockURI.URI("MEGABYTE", "com.facebook.presto.cache.CacheConfig", "MEGABYTE", 1203, "", "com.facebook.presto.cache.CacheConfig", "com.facebook.presto.cache.CacheConfig");
      cacheConfig0.setBaseDirectory(uRI0);
      URI uRI1 = cacheConfig0.getBaseDirectory();
      assertEquals("com.facebook.presto.cache.CacheConfig@MEGABYTE:1203", uRI1.getRawAuthority());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      DataSize.Unit dataSize_Unit0 = DataSize.Unit.KILOBYTE;
      DataSize dataSize0 = DataSize.succinctDataSize(1623.9006458158, dataSize_Unit0);
      CacheConfig cacheConfig1 = cacheConfig0.setDefaultCacheQuota(dataSize0);
      assertFalse(cacheConfig1.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      cacheConfig0.getCacheType();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      CacheConfig cacheConfig1 = cacheConfig0.setCachingEnabled(false);
      assertFalse(cacheConfig1.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      Optional<DataSize> optional0 = cacheConfig0.getDefaultCacheQuota();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      boolean boolean0 = cacheConfig0.isCachingEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      CacheConfig cacheConfig1 = cacheConfig0.setValidationEnabled(false);
      assertFalse(cacheConfig1.isValidationEnabled());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      URI uRI0 = cacheConfig0.getBaseDirectory();
      assertNull(uRI0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      boolean boolean0 = cacheConfig0.isValidationEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      CacheQuotaScope cacheQuotaScope0 = cacheConfig0.getCacheQuotaScope();
      CacheConfig cacheConfig1 = cacheConfig0.setCacheQuotaScope(cacheQuotaScope0);
      assertSame(cacheConfig1, cacheConfig0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CacheConfig cacheConfig0 = new CacheConfig();
      CacheType cacheType0 = CacheType.ALLUXIO;
      cacheConfig0.setCacheType(cacheType0);
      CacheType cacheType1 = cacheConfig0.getCacheType();
      assertEquals(CacheType.ALLUXIO, cacheType1);
  }
}
