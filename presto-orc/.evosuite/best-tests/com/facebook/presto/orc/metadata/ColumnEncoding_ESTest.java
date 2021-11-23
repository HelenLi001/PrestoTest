/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 19:33:56 GMT 2021
 */

package com.facebook.presto.orc.metadata;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.orc.metadata.ColumnEncoding;
import com.facebook.presto.orc.metadata.DwrfSequenceEncoding;
import java.util.Optional;
import java.util.SortedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ColumnEncoding_ESTest extends ColumnEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DIRECT;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, 404);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DIRECT, columnEncoding0.getColumnEncodingKind());
      assertEquals(404, columnEncoding0.getDictionarySize());
      assertNotNull(columnEncoding0);
      
      int int0 = columnEncoding0.getDictionarySize();
      assertEquals(404, int0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DIRECT, columnEncoding0.getColumnEncodingKind());
      assertEquals(404, columnEncoding0.getDictionarySize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DIRECT;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, (-1858));
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DIRECT, columnEncoding0.getColumnEncodingKind());
      assertEquals((-1858), columnEncoding0.getDictionarySize());
      assertNotNull(columnEncoding0);
      
      int int0 = columnEncoding0.getDictionarySize();
      assertEquals((-1858), int0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DIRECT, columnEncoding0.getColumnEncodingKind());
      assertEquals((-1858), columnEncoding0.getDictionarySize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, 1);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT, columnEncoding0.getColumnEncodingKind());
      assertEquals(1, columnEncoding0.getDictionarySize());
      assertNotNull(columnEncoding0);
      
      ColumnEncoding columnEncoding1 = columnEncoding0.getColumnEncoding(0);
      assertSame(columnEncoding0, columnEncoding1);
      assertSame(columnEncoding1, columnEncoding0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT, columnEncoding0.getColumnEncodingKind());
      assertEquals(1, columnEncoding0.getDictionarySize());
      assertEquals(1, columnEncoding1.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT, columnEncoding1.getColumnEncodingKind());
      assertNotNull(columnEncoding1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, (-1113));
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT, columnEncoding0.getColumnEncodingKind());
      assertEquals((-1113), columnEncoding0.getDictionarySize());
      assertNotNull(columnEncoding0);
      
      ColumnEncoding columnEncoding1 = columnEncoding0.getColumnEncoding(0);
      assertSame(columnEncoding0, columnEncoding1);
      assertSame(columnEncoding1, columnEncoding0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT, columnEncoding0.getColumnEncodingKind());
      assertEquals((-1113), columnEncoding0.getDictionarySize());
      assertEquals((-1113), columnEncoding1.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT, columnEncoding1.getColumnEncodingKind());
      assertNotNull(columnEncoding1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DIRECT;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, (-446), (Optional<SortedMap<Integer, DwrfSequenceEncoding>>) null);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals((-446), columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DIRECT, columnEncoding0.getColumnEncodingKind());
      assertNotNull(columnEncoding0);
      
      Optional<SortedMap<Integer, DwrfSequenceEncoding>> optional0 = columnEncoding0.getAdditionalSequenceEncodings();
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals((-446), columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DIRECT, columnEncoding0.getColumnEncodingKind());
      assertNull(optional0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DIRECT;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, (-446), (Optional<SortedMap<Integer, DwrfSequenceEncoding>>) null);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals((-446), columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DIRECT, columnEncoding0.getColumnEncodingKind());
      assertNotNull(columnEncoding0);
      
      // Undeclared exception!
      try { 
        columnEncoding0.getColumnEncoding(1688);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.metadata.ColumnEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ColumnEncoding columnEncoding0 = null;
      try {
        columnEncoding0 = new ColumnEncoding((ColumnEncoding.ColumnEncodingKind) null, 0, (Optional<SortedMap<Integer, DwrfSequenceEncoding>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // columnEncodingKind is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ColumnEncoding columnEncoding0 = null;
      try {
        columnEncoding0 = new ColumnEncoding((ColumnEncoding.ColumnEncodingKind) null, 1980);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // columnEncodingKind is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, 1);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(1, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT, columnEncoding0.getColumnEncodingKind());
      assertNotNull(columnEncoding0);
      
      String string0 = columnEncoding0.toString();
      assertEquals("ColumnEncoding{columnEncodingKind=DWRF_MAP_FLAT, dictionarySize=1, additionalSequenceEncodings=Optional.empty}", string0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(1, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DWRF_MAP_FLAT, columnEncoding0.getColumnEncodingKind());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, 0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertNotNull(columnEncoding0);
      
      ColumnEncoding columnEncoding1 = columnEncoding0.getColumnEncoding(0);
      assertSame(columnEncoding0, columnEncoding1);
      assertSame(columnEncoding1, columnEncoding0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding1.getColumnEncodingKind());
      assertEquals(0, columnEncoding1.getDictionarySize());
      assertNotNull(columnEncoding1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, 0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
      assertNotNull(columnEncoding0);
      
      Optional<SortedMap<Integer, DwrfSequenceEncoding>> optional0 = columnEncoding0.getAdditionalSequenceEncodings();
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, 0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
      assertNotNull(columnEncoding0);
      
      // Undeclared exception!
      try { 
        columnEncoding0.getColumnEncoding((-1917));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Got non-zero sequence: %d, but there are no additional sequence encodings: -1917 [ColumnEncoding{columnEncodingKind=DICTIONARY, dictionarySize=0, additionalSequenceEncodings=Optional.empty}]
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, 0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
      assertNotNull(columnEncoding0);
      
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind1 = columnEncoding0.getColumnEncodingKind();
      assertSame(columnEncoding_ColumnEncodingKind0, columnEncoding_ColumnEncodingKind1);
      assertSame(columnEncoding_ColumnEncodingKind1, columnEncoding_ColumnEncodingKind0);
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding_ColumnEncodingKind1);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY;
      ColumnEncoding columnEncoding0 = new ColumnEncoding(columnEncoding_ColumnEncodingKind0, 0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
      assertNotNull(columnEncoding0);
      
      int int0 = columnEncoding0.getDictionarySize();
      assertEquals(0, int0);
      assertEquals(0, ColumnEncoding.DEFAULT_SEQUENCE_ID);
      assertEquals(0, columnEncoding0.getDictionarySize());
      assertEquals(ColumnEncoding.ColumnEncodingKind.DICTIONARY, columnEncoding0.getColumnEncodingKind());
  }
}
