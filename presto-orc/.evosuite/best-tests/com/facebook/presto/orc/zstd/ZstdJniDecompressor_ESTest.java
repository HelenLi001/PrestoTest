/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 19:19:38 GMT 2021
 */

package com.facebook.presto.orc.zstd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.orc.zstd.ZstdJniDecompressor;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZstdJniDecompressor_ESTest extends ZstdJniDecompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZstdJniDecompressor zstdJniDecompressor0 = new ZstdJniDecompressor();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      ByteBuffer byteBuffer1 = byteBuffer0.compact();
      byte[] byteArray0 = new byte[9];
      ByteBuffer byteBuffer2 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        zstdJniDecompressor0.decompress(byteBuffer1, byteBuffer2);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.github.luben.zstd.Zstd
         //
         verifyException("com.facebook.presto.orc.zstd.ZstdJniDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZstdJniDecompressor zstdJniDecompressor0 = new ZstdJniDecompressor();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      ByteBuffer byteBuffer1 = byteBuffer0.compact();
      // Undeclared exception!
      try { 
        zstdJniDecompressor0.decompress(byteBuffer1, byteBuffer1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.github.luben.zstd.Zstd
         //
         verifyException("com.facebook.presto.orc.zstd.ZstdJniDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZstdJniDecompressor zstdJniDecompressor0 = new ZstdJniDecompressor();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        zstdJniDecompressor0.decompress(byteArray0, (int) (byte)26, 1797, byteArray0, 0, (int) (byte) (-38));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.github.luben.zstd.Zstd
         //
         verifyException("com.facebook.presto.orc.zstd.ZstdJniDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZstdJniDecompressor zstdJniDecompressor0 = new ZstdJniDecompressor();
      // Undeclared exception!
      try { 
        zstdJniDecompressor0.decompress((ByteBuffer) null, (ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.zstd.ZstdJniDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ZstdJniDecompressor zstdJniDecompressor0 = new ZstdJniDecompressor();
      byte[] byteArray0 = new byte[13];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        zstdJniDecompressor0.decompress(byteBuffer0, byteBuffer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Non-direct byte buffer backed by byte array required
         //
         verifyException("com.facebook.presto.orc.zstd.ZstdJniDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ZstdJniDecompressor zstdJniDecompressor0 = new ZstdJniDecompressor();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(byteBuffer0).isDirect();
      // Undeclared exception!
      try { 
        zstdJniDecompressor0.decompress(byteBuffer0, byteBuffer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Non-direct byte buffer backed by byte array required
         //
         verifyException("com.facebook.presto.orc.zstd.ZstdJniDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ZstdJniDecompressor zstdJniDecompressor0 = new ZstdJniDecompressor();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(byteBuffer0).isDirect();
      // Undeclared exception!
      try { 
        zstdJniDecompressor0.decompress(byteBuffer0, byteBuffer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Non-direct byte buffer backed by byte array required
         //
         verifyException("com.facebook.presto.orc.zstd.ZstdJniDecompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ZstdJniDecompressor zstdJniDecompressor0 = new ZstdJniDecompressor();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(byteBuffer0).isDirect();
      // Undeclared exception!
      try { 
        zstdJniDecompressor0.decompress(byteBuffer0, byteBuffer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Non-direct byte buffer backed by byte array required
         //
         verifyException("com.facebook.presto.orc.zstd.ZstdJniDecompressor", e);
      }
  }
}
