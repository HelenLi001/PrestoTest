/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:45:43 GMT 2021
 */

package com.facebook.presto.druid;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.airlift.http.client.HttpClient;
import com.facebook.presto.druid.DruidClient;
import com.facebook.presto.druid.DruidConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DruidClient_ESTest extends DruidClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DruidClient.DruidRequestBody druidClient_DruidRequestBody0 = new DruidClient.DruidRequestBody("", "", false);
      assertEquals("", druidClient_DruidRequestBody0.getResultFormat());
      assertEquals("", druidClient_DruidRequestBody0.getQuery());
      assertFalse(druidClient_DruidRequestBody0.isQueryHeader());
      assertNotNull(druidClient_DruidRequestBody0);
      
      boolean boolean0 = druidClient_DruidRequestBody0.isQueryHeader();
      assertFalse(boolean0);
      assertEquals("", druidClient_DruidRequestBody0.getResultFormat());
      assertEquals("", druidClient_DruidRequestBody0.getQuery());
      assertFalse(druidClient_DruidRequestBody0.isQueryHeader());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DruidClient.DruidRequestBody druidClient_DruidRequestBody0 = new DruidClient.DruidRequestBody("/druid/v2/sql", "/druid/v2/sql", true);
      assertTrue(druidClient_DruidRequestBody0.isQueryHeader());
      assertEquals("/druid/v2/sql", druidClient_DruidRequestBody0.getQuery());
      assertEquals("/druid/v2/sql", druidClient_DruidRequestBody0.getResultFormat());
      assertNotNull(druidClient_DruidRequestBody0);
      
      String string0 = druidClient_DruidRequestBody0.getResultFormat();
      assertEquals("/druid/v2/sql", string0);
      assertTrue(druidClient_DruidRequestBody0.isQueryHeader());
      assertEquals("/druid/v2/sql", druidClient_DruidRequestBody0.getQuery());
      assertEquals("/druid/v2/sql", druidClient_DruidRequestBody0.getResultFormat());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DruidClient.DruidRequestBody druidClient_DruidRequestBody0 = new DruidClient.DruidRequestBody("caseInsensitiveNameMatchingCacheTtl is null", "wO/5T0peUj68<GeMce_", false);
      assertEquals("caseInsensitiveNameMatchingCacheTtl is null", druidClient_DruidRequestBody0.getQuery());
      assertFalse(druidClient_DruidRequestBody0.isQueryHeader());
      assertEquals("wO/5T0peUj68<GeMce_", druidClient_DruidRequestBody0.getResultFormat());
      assertNotNull(druidClient_DruidRequestBody0);
      
      String string0 = druidClient_DruidRequestBody0.getQuery();
      assertEquals("caseInsensitiveNameMatchingCacheTtl is null", string0);
      assertEquals("caseInsensitiveNameMatchingCacheTtl is null", druidClient_DruidRequestBody0.getQuery());
      assertFalse(druidClient_DruidRequestBody0.isQueryHeader());
      assertEquals("wO/5T0peUj68<GeMce_", druidClient_DruidRequestBody0.getResultFormat());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DruidClient.RemoteTableObject druidClient_RemoteTableObject0 = DruidClient.RemoteTableObject.of("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser");
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertNotNull(druidClient_RemoteTableObject0);
      
      DruidClient.RemoteTableObject druidClient_RemoteTableObject1 = druidClient_RemoteTableObject0.registerCollision("UBS5Q?Ok&Q/Mwsm rD");
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertTrue(druidClient_RemoteTableObject1.isAmbiguous());
      assertNotNull(druidClient_RemoteTableObject1);
      assertFalse(druidClient_RemoteTableObject1.equals((Object)druidClient_RemoteTableObject0));
      assertNotSame(druidClient_RemoteTableObject0, druidClient_RemoteTableObject1);
      assertNotSame(druidClient_RemoteTableObject1, druidClient_RemoteTableObject0);
      
      boolean boolean0 = druidClient_RemoteTableObject1.isAmbiguous();
      assertTrue(boolean0);
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertTrue(druidClient_RemoteTableObject1.isAmbiguous());
      assertFalse(druidClient_RemoteTableObject0.equals((Object)druidClient_RemoteTableObject1));
      assertFalse(druidClient_RemoteTableObject1.equals((Object)druidClient_RemoteTableObject0));
      assertNotSame(druidClient_RemoteTableObject0, druidClient_RemoteTableObject1);
      assertNotSame(druidClient_RemoteTableObject1, druidClient_RemoteTableObject0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DruidClient.RemoteTableObject druidClient_RemoteTableObject0 = DruidClient.RemoteTableObject.of("Y,fJBzv~FU#^$");
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertNotNull(druidClient_RemoteTableObject0);
      
      boolean boolean0 = druidClient_RemoteTableObject0.isAmbiguous();
      assertFalse(boolean0);
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DruidClient.RemoteTableObject druidClient_RemoteTableObject0 = DruidClient.RemoteTableObject.of("");
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertNotNull(druidClient_RemoteTableObject0);
      
      String string0 = druidClient_RemoteTableObject0.getAnyRemoteTableName();
      assertEquals("", string0);
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DruidClient.RemoteTableObject druidClient_RemoteTableObject0 = DruidClient.RemoteTableObject.of("{\n  \"query\" : \"Failed to getValue() with method \",\n  \"resultFormat\" : \"Failed to getValue() with method \",\n  \"queryHeader\" : true\n}");
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertNotNull(druidClient_RemoteTableObject0);
      
      String string0 = druidClient_RemoteTableObject0.getOnlyRemoteTableName();
      assertEquals("{\n  \"query\" : \"Failed to getValue() with method \",\n  \"resultFormat\" : \"Failed to getValue() with method \",\n  \"queryHeader\" : true\n}", string0);
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DruidClient.RemoteTableObject druidClient_RemoteTableObject0 = DruidClient.RemoteTableObject.of("{\n  \"query\" : \"Failed to getValue() with method \",\n  \"resultFormat\" : \"Failed to getValue() with method \",\n  \"queryHeader\" : true\n}");
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertNotNull(druidClient_RemoteTableObject0);
      
      DruidClient.RemoteTableObject druidClient_RemoteTableObject1 = druidClient_RemoteTableObject0.registerCollision("Failed to getValue() with method ");
      assertFalse(druidClient_RemoteTableObject0.isAmbiguous());
      assertTrue(druidClient_RemoteTableObject1.isAmbiguous());
      assertNotNull(druidClient_RemoteTableObject1);
      assertFalse(druidClient_RemoteTableObject1.equals((Object)druidClient_RemoteTableObject0));
      assertNotSame(druidClient_RemoteTableObject0, druidClient_RemoteTableObject1);
      assertNotSame(druidClient_RemoteTableObject1, druidClient_RemoteTableObject0);
      
      // Undeclared exception!
      try { 
        druidClient_RemoteTableObject1.getOnlyRemoteTableName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Found ambiguous names in Druid when looking up 'failed to getvalue() with method ': [{
         //   \"query\" : \"Failed to getValue() with method \",
         //   \"resultFormat\" : \"Failed to getValue() with method \",
         //   \"queryHeader\" : true
         // }, Failed to getValue() with method ]
         //
         verifyException("com.facebook.presto.druid.DruidClient$RemoteTableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DruidClient.DruidRequestBody druidClient_DruidRequestBody0 = new DruidClient.DruidRequestBody("", "", false);
      assertEquals("", druidClient_DruidRequestBody0.getResultFormat());
      assertEquals("", druidClient_DruidRequestBody0.getQuery());
      assertFalse(druidClient_DruidRequestBody0.isQueryHeader());
      assertNotNull(druidClient_DruidRequestBody0);
      
      String string0 = druidClient_DruidRequestBody0.toJson();
      assertEquals("{\n  \"query\" : \"\",\n  \"resultFormat\" : \"\",\n  \"queryHeader\" : false\n}", string0);
      assertEquals("", druidClient_DruidRequestBody0.getResultFormat());
      assertEquals("", druidClient_DruidRequestBody0.getQuery());
      assertFalse(druidClient_DruidRequestBody0.isQueryHeader());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DruidClient druidClient0 = null;
      try {
        druidClient0 = new DruidClient((DruidConfig) null, (HttpClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // config is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
