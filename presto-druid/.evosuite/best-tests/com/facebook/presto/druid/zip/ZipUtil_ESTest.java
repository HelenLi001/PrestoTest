/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:43:21 GMT 2021
 */

package com.facebook.presto.druid.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.druid.zip.ZipUtil;
import java.util.zip.ZipException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZipUtil_ESTest extends ZipUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)22;
      boolean boolean0 = ZipUtil.arrayStartsWith(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.intToLittleEndian(0);
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = ZipUtil.arrayStartsWith(byteArray0, byteArray1);
      assertTrue(boolean0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = ZipUtil.dosToUnixTime((-451));
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)4;
      long long0 = ZipUtil.get64(byteArray0, (byte)0);
      assertEquals(4398046511104L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[6] = (byte)33;
      long long0 = ZipUtil.getUnsignedLong(byteArray0, 0);
      assertEquals(9288674231451648L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-12);
      try { 
        ZipUtil.getUnsignedLong(byteArray0, 0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // The requested unsigned long value is too large for Java's signedvalues. This Zip file is unsupported
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-46);
      long long0 = ZipUtil.getUnsignedLong(byteArray0, 0);
      assertEquals(3523215360L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-105);
      long long0 = ZipUtil.getUnsignedLong(byteArray0, 0);
      assertEquals(9895936L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-60);
      int int0 = ZipUtil.get32(byteArray0, 1);
      assertEquals(12845056, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)1;
      int int0 = ZipUtil.get32(byteArray0, 0);
      assertEquals(256, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.longToLittleEndian(0L);
      int int0 = ZipUtil.getUnsignedShort(byteArray0, (short)0);
      assertEquals(0, int0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)33;
      int int0 = ZipUtil.getUnsignedShort(byteArray0, 0);
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)41;
      long long0 = ZipUtil.getUnsignedLong(byteArray0, (byte)0);
      assertEquals(41L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.intToLittleEndian(0);
      long long0 = ZipUtil.getUnsignedInt(byteArray0, 0);
      assertEquals(4, byteArray0.length);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.longToLittleEndian(0L);
      long long0 = ZipUtil.get64(byteArray0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.longToLittleEndian(1L);
      long long0 = ZipUtil.get64(byteArray0, 0);
      assertEquals(1L, long0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.longToLittleEndian((long) (short) (-1910));
      long long0 = ZipUtil.get64(byteArray0, 0);
      assertEquals((-1910L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.intToLittleEndian(0);
      int int0 = ZipUtil.get32(byteArray0, 0);
      assertEquals(0, int0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)33;
      int int0 = ZipUtil.get32(byteArray0, 0);
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte) (-23);
      int int0 = ZipUtil.get32(byteArray0, 1);
      assertEquals((-385875968), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      short short0 = ZipUtil.get16(byteArray0, 0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.longToLittleEndian(3L);
      ZipUtil.shortToLittleEndian(byteArray0, 0, (short) (-109));
      short short0 = ZipUtil.get16(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte) (-109), (byte) (-1), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((short) (-109), short0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      System.setCurrentTimeMillis((short)0);
      long long0 = ZipUtil.dosToUnixTime((short)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      System.setCurrentTimeMillis((-2556L));
      long long0 = ZipUtil.dosToUnixTime(55);
      assertEquals((-2556L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.shortToLittleEndian((byte[]) null, 1546, (short)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.longToLittleEndian((byte[]) null, 0, 570L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.intToLittleEndian(0);
      // Undeclared exception!
      try { 
        ZipUtil.longToLittleEndian(byteArray0, (-1324), 1602L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.intToLittleEndian((byte[]) null, 2921, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        ZipUtil.intToLittleEndian(byteArray0, (int) (byte)0, (int) (byte)98);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.getUnsignedShort((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.getUnsignedLong((byte[]) null, (-795));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ZipUtil.getUnsignedLong(byteArray0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.getUnsignedInt((byte[]) null, (-3924));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        ZipUtil.getUnsignedInt(byteArray0, (short) (-4171));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4171
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.get64((byte[]) null, (short) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.get32((byte[]) null, 21);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.get16((byte[]) null, 1714);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ZipUtil.get16(byteArray0, (-2047));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2047
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        ZipUtil.get32(byteArray0, (byte)45);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 45
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.shortToLittleEndian((short) (-1601));
      byte[] byteArray1 = ZipUtil.shortToLittleEndian((short) (-2968));
      boolean boolean0 = ZipUtil.arrayStartsWith(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-65), (byte) (-7)}, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.shortToLittleEndian((short)48);
      byte[] byteArray1 = new byte[4];
      boolean boolean0 = ZipUtil.arrayStartsWith(byteArray0, byteArray1);
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {(byte)48, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = ZipUtil.arrayStartsWith((byte[]) null, (byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = ZipUtil.arrayStartsWith(byteArray0, (byte[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = ZipUtil.isValidInDos((byte)98);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = ZipUtil.isValidInDos((byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = ZipUtil.isValidInDos((-2489L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long long0 = ZipUtil.getUnsignedLong(byteArray0, (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ZipUtil.get64(byteArray0, (-1499));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1499
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.longToLittleEndian(9L);
      long long0 = ZipUtil.getUnsignedInt(byteArray0, (short)0);
      assertEquals(9L, long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.longToLittleEndian(9L);
      ZipUtil.longToLittleEndian(byteArray0, 0, 9L);
      assertArrayEquals(new byte[] {(byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = ZipUtil.intToLittleEndian(byteArray0, (int) (byte)0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.longToLittleEndian(837L);
      // Undeclared exception!
      try { 
        ZipUtil.shortToLittleEndian(byteArray0, 23, (short)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        ZipUtil.getUnsignedShort(byteArray0, (byte)59);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 59
         //
         verifyException("com.facebook.presto.druid.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      short short0 = ZipUtil.get16(byteArray0, 0);
      assertEquals((short)0, short0);
  }
}
