/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 20:30:55 GMT 2021
 */

package com.facebook.presto.rcfile.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.block.Block;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.rcfile.ColumnData;
import com.facebook.presto.rcfile.EncodeOutput;
import com.facebook.presto.rcfile.text.ListEncoding;
import com.facebook.presto.rcfile.text.MapEncoding;
import com.facebook.presto.rcfile.text.StructEncoding;
import com.facebook.presto.rcfile.text.TextColumnEncoding;
import io.airlift.slice.Slice;
import io.airlift.slice.SliceOutput;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BlockEncoding_ESTest extends BlockEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      Byte byte0 = new Byte((byte)62);
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, byteArray0, byte0, true, (List<TextColumnEncoding>) null);
      ListEncoding listEncoding0 = new ListEncoding((Type) null, (Slice) null, byteArray0, byte0, structEncoding0);
      boolean boolean0 = listEncoding0.isEscapeByte((byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, byteArray0, (Byte) null, false, (List<TextColumnEncoding>) null);
      byte byte0 = structEncoding0.getSeparator(0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)1;
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, byteArray0, (Byte) null, false, (List<TextColumnEncoding>) null);
      byte byte0 = structEncoding0.getSeparator((byte)1);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-15);
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, (byte[]) null, (Byte) byteArray0[2], false, (List<TextColumnEncoding>) null);
      ListEncoding listEncoding0 = new ListEncoding((Type) null, (Slice) null, byteArray0, (Byte) byteArray0[2], structEncoding0);
      MapEncoding mapEncoding0 = new MapEncoding((Type) null, (Slice) null, byteArray0, (Byte) byteArray0[3], listEncoding0, structEncoding0);
      byte byte0 = mapEncoding0.getSeparator(1);
      assertEquals((byte) (-15), byte0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      MapEncoding mapEncoding0 = new MapEncoding((Type) null, (Slice) null, byteArray0, (Byte) (byte)0, (TextColumnEncoding) null, (TextColumnEncoding) null);
      // Undeclared exception!
      try { 
        mapEncoding0.getSeparator(427);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 427
         //
         verifyException("com.facebook.presto.rcfile.text.BlockEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, (byte[]) null, (Byte) null, false, (List<TextColumnEncoding>) null);
      Byte byte0 = new Byte((byte)0);
      MapEncoding mapEncoding0 = new MapEncoding((Type) null, (Slice) null, (byte[]) null, byte0, structEncoding0, structEncoding0);
      // Undeclared exception!
      try { 
        mapEncoding0.encodeColumn((Block) null, (SliceOutput) null, (EncodeOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.BlockEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, (byte[]) null, (Byte) null, false, (List<TextColumnEncoding>) null);
      ListEncoding listEncoding0 = new ListEncoding((Type) null, (Slice) null, byteArray0, (Byte) null, structEncoding0);
      // Undeclared exception!
      try { 
        listEncoding0.decodeColumn((ColumnData) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.BlockEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      Byte byte0 = new Byte((byte)0);
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, byteArray0, byte0, false, (List<TextColumnEncoding>) null);
      boolean boolean0 = structEncoding0.isEscapeByte((byte)72);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Byte byte0 = new Byte((byte)3);
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, byteArray0, byte0, false, (List<TextColumnEncoding>) null);
      boolean boolean0 = structEncoding0.isEscapeByte((byte)3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, (byte[]) null, (Byte) null, false, (List<TextColumnEncoding>) null);
      boolean boolean0 = structEncoding0.isEscapeByte((byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, (byte[]) null, (Byte) null, false, (List<TextColumnEncoding>) null);
      // Undeclared exception!
      try { 
        structEncoding0.getSeparator(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.BlockEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Byte byte0 = new Byte((byte)3);
      StructEncoding structEncoding0 = new StructEncoding((Type) null, (Slice) null, byteArray0, byte0, false, (List<TextColumnEncoding>) null);
      // Undeclared exception!
      try { 
        structEncoding0.isNullSequence((Slice) null, (byte)3, (byte)3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.BlockEncoding", e);
      }
  }
}
