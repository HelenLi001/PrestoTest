/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 10:29:23 GMT 2021
 */

package com.facebook.presto.benchmark.driver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.benchmark.driver.BenchmarkQuery;
import com.facebook.presto.benchmark.driver.BenchmarkSchema;
import com.facebook.presto.benchmark.driver.RegexTemplate;
import com.facebook.presto.benchmark.driver.Suite;
import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Suite_ESTest extends Suite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Locale.LanguageRange> arrayList0 = new ArrayList<Locale.LanguageRange>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) arrayList0, (Collection<String>) linkedHashSet0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) arrayList0, (Collection<String>) list0, locale_FilteringMode0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(list1, hashMap0, list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(linkedList0, hashMap0, linkedList0);
      Suite suite0 = suite_OptionsJson0.toSuite("file is null");
      String string0 = suite0.getName();
      assertEquals("file is null", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("/y2W'W");
      BenchmarkSchema benchmarkSchema0 = new BenchmarkSchema("2oM*8(19");
      Map<String, String> map0 = benchmarkSchema0.getTags();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(linkedList0, map0, linkedList0);
      Suite suite0 = suite_OptionsJson0.toSuite("com.facebook.presto.benchmark.driver.Suite");
      // Undeclared exception!
      try { 
        suite0.selectSchemas((Iterable<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.benchmark.driver.Suite", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(arrayList0, hashMap0, arrayList0);
      arrayList0.add("b#o.7P102");
      Suite suite0 = suite_OptionsJson0.toSuite("");
      // Undeclared exception!
      try { 
        suite0.selectQueries((Iterable<BenchmarkQuery>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Streams", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(arrayList0, hashMap0, arrayList0);
      Suite suite0 = suite_OptionsJson0.toSuite("");
      // Undeclared exception!
      try { 
        suite0.selectQueries((Iterable<BenchmarkQuery>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("z@H@", "com.fasterxml.jackson.core.type.ResolvedType");
      MockFile.createTempFile("z@H@", "3H i1>Ph", (File) mockFile0);
      try { 
        Suite.readSuites(mockFile0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Suite.readSuites((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // file is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("sZW@DoeaK`oS]~15y");
      // Undeclared exception!
      try { 
        Suite.readSuites(mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot read file: sZW@DoeaK`oS]~15y
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      try { 
        Suite.readSuites(mockFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Stack<RegexTemplate> stack0 = new Stack<RegexTemplate>();
      hashMap0.put((String) null, "8f|eEe7Wpa");
      Vector<Pattern> vector0 = new Vector<Pattern>();
      Suite suite0 = null;
      try {
        suite0 = new Suite("8f|eEe7Wpa", hashMap0, stack0, vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null key in entry: null=8f|eEe7Wpa
         //
         verifyException("com.google.common.collect.CollectPreconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BenchmarkSchema benchmarkSchema0 = new BenchmarkSchema("");
      Map<String, String> map0 = benchmarkSchema0.getTags();
      HashSet<RegexTemplate> hashSet0 = new HashSet<RegexTemplate>(16);
      LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
      LinkedHashSet<Pattern> linkedHashSet0 = new LinkedHashSet<Pattern>(linkedList0);
      Suite suite0 = new Suite("f+r", map0, hashSet0, linkedHashSet0);
      assertEquals("f+r", suite0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(vector0, hashMap0, vector0);
      Suite suite0 = suite_OptionsJson0.toSuite("");
      List<Pattern> list0 = suite0.getQueryNamePatterns();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      BenchmarkSchema benchmarkSchema0 = new BenchmarkSchema("");
      Map<String, String> map0 = benchmarkSchema0.getTags();
      vector0.add("");
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(vector0, map0, vector0);
      Suite suite0 = suite_OptionsJson0.toSuite("");
      HashSet<BenchmarkQuery> hashSet0 = new HashSet<BenchmarkQuery>(1149);
      List<BenchmarkQuery> list0 = suite0.selectQueries(hashSet0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      BenchmarkSchema benchmarkSchema0 = new BenchmarkSchema("");
      Map<String, String> map0 = benchmarkSchema0.getTags();
      vector0.add("");
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(vector0, map0, vector0);
      Suite suite0 = suite_OptionsJson0.toSuite("");
      vector0.add("dK'a8cZpz?B o(z}t");
      List<BenchmarkSchema> list0 = suite0.selectSchemas(vector0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(vector0, hashMap0, vector0);
      Suite suite0 = suite_OptionsJson0.toSuite("");
      List<BenchmarkSchema> list0 = suite0.selectSchemas(vector0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
      Suite suite0 = null;
      try {
        suite0 = new Suite("jrRtw", (Map<String, String>) null, (Iterable<RegexTemplate>) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // schemaNameTemplates is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      BenchmarkSchema benchmarkSchema0 = new BenchmarkSchema("");
      Map<String, String> map0 = benchmarkSchema0.getTags();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(vector0, map0, vector0);
      Suite suite0 = suite_OptionsJson0.toSuite("");
      Map<String, String> map1 = suite0.getSessionProperties();
      assertSame(map1, map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      BenchmarkSchema benchmarkSchema0 = new BenchmarkSchema("");
      Map<String, String> map0 = benchmarkSchema0.getTags();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(vector0, map0, vector0);
      Suite suite0 = suite_OptionsJson0.toSuite("");
      String string0 = suite0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      BenchmarkSchema benchmarkSchema0 = new BenchmarkSchema("");
      Map<String, String> map0 = benchmarkSchema0.getTags();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(vector0, map0, vector0);
      Suite suite0 = suite_OptionsJson0.toSuite("");
      List<RegexTemplate> list0 = suite0.getSchemaNameTemplates();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      BenchmarkSchema benchmarkSchema0 = new BenchmarkSchema("Funnels.sequentialFunnel(");
      Map<String, String> map0 = benchmarkSchema0.getTags();
      Suite.OptionsJson suite_OptionsJson0 = new Suite.OptionsJson(stack0, map0, stack0);
      Suite suite0 = suite_OptionsJson0.toSuite("Funnels.sequentialFunnel(");
      String string0 = suite0.toString();
      assertEquals("Suite{name=Funnels.sequentialFunnel(, sessionProperties={}, queryNamePatterns=[]}", string0);
  }
}
