/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 18 23:57:09 GMT 2021
 */

package com.facebook.presto.common.block;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.common.block.DictionaryId;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DictionaryId_ESTest extends DictionaryId_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      DictionaryId dictionaryId1 = DictionaryId.randomDictionaryId();
      boolean boolean0 = dictionaryId0.equals(dictionaryId1);
      assertEquals(218L, dictionaryId1.getSequenceId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId(0L, 3521L, 0L);
      DictionaryId dictionaryId1 = new DictionaryId(0L, (-2870L), 0L);
      boolean boolean0 = dictionaryId0.equals(dictionaryId1);
      assertEquals((-2870L), dictionaryId1.getLeastSignificantBits());
      assertEquals(0L, dictionaryId1.getSequenceId());
      assertFalse(boolean0);
      assertEquals(0L, dictionaryId1.getMostSignificantBits());
      assertFalse(dictionaryId1.equals((Object)dictionaryId0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId((-1428L), (-1428L), (-2507L));
      DictionaryId dictionaryId1 = DictionaryId.randomDictionaryId();
      boolean boolean0 = dictionaryId0.equals(dictionaryId1);
      assertEquals(199L, dictionaryId1.getSequenceId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId(0L, 0L, 0L);
      long long0 = dictionaryId0.getSequenceId();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId((-2167L), (-1L), (-1L));
      long long0 = dictionaryId0.getSequenceId();
      assertEquals((-2167L), dictionaryId0.getMostSignificantBits());
      assertEquals((-1L), long0);
      assertEquals((-1L), dictionaryId0.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId(0L, 0L, 0L);
      long long0 = dictionaryId0.getMostSignificantBits();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId((-1428L), (-1428L), (-2507L));
      long long0 = dictionaryId0.getMostSignificantBits();
      assertEquals((-1428L), long0);
      assertEquals((-2507L), dictionaryId0.getSequenceId());
      assertEquals((-1428L), dictionaryId0.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId(0L, 0L, 1L);
      long long0 = dictionaryId0.getLeastSignificantBits();
      assertEquals(1L, dictionaryId0.getSequenceId());
      assertEquals(0L, long0);
      assertEquals(0L, dictionaryId0.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId(1L, 1L, 1L);
      long long0 = dictionaryId0.getLeastSignificantBits();
      assertEquals(1L, long0);
      assertEquals(1L, dictionaryId0.getSequenceId());
      assertEquals(1L, dictionaryId0.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DictionaryId dictionaryId0 = new DictionaryId((-296L), (-296L), (-296L));
      DictionaryId dictionaryId1 = new DictionaryId((-296L), (-296L), (-296L));
      boolean boolean0 = dictionaryId0.equals(dictionaryId1);
      assertEquals((-296L), dictionaryId1.getMostSignificantBits());
      assertEquals((-296L), dictionaryId1.getLeastSignificantBits());
      assertTrue(boolean0);
      assertEquals((-296L), dictionaryId1.getSequenceId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      DictionaryId dictionaryId1 = DictionaryId.randomDictionaryId();
      boolean boolean0 = dictionaryId1.equals(dictionaryId0);
      assertEquals(140L, dictionaryId1.getSequenceId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      DictionaryId dictionaryId1 = new DictionaryId((-9079256848728588288L), (-9079256848728588288L), (-9079256848728588288L));
      boolean boolean0 = dictionaryId0.equals(dictionaryId1);
      assertEquals(121L, dictionaryId0.getSequenceId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      boolean boolean0 = dictionaryId0.equals("$.Mv");
      assertEquals(108L, dictionaryId0.getSequenceId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      boolean boolean0 = dictionaryId0.equals((Object) null);
      assertEquals(95L, dictionaryId0.getSequenceId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      boolean boolean0 = dictionaryId0.equals(dictionaryId0);
      assertEquals(83L, dictionaryId0.getSequenceId());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      DictionaryId dictionaryId1 = new DictionaryId(16793600L, 16793600L, 16793600L);
      boolean boolean0 = dictionaryId0.equals(dictionaryId1);
      assertEquals(57L, dictionaryId0.getSequenceId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      long long0 = dictionaryId0.getLeastSignificantBits();
      assertEquals(46L, dictionaryId0.getSequenceId());
      assertEquals((-9079256848728588288L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      dictionaryId0.hashCode();
      assertEquals(22L, dictionaryId0.getSequenceId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      long long0 = dictionaryId0.getMostSignificantBits();
      assertEquals(11L, dictionaryId0.getSequenceId());
      assertEquals(16793600L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DictionaryId dictionaryId0 = DictionaryId.randomDictionaryId();
      long long0 = dictionaryId0.getSequenceId();
      assertEquals(0L, long0);
  }
}
