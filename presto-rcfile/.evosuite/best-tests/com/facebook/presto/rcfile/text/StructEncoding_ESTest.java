/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 20:20:53 GMT 2021
 */

package com.facebook.presto.rcfile.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.block.Block;
import com.facebook.presto.common.block.BlockBuilder;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.rcfile.ColumnData;
import com.facebook.presto.rcfile.text.StructEncoding;
import com.facebook.presto.rcfile.text.TextColumnEncoding;
import io.airlift.slice.Slice;
import io.airlift.slice.SliceOutput;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StructEncoding_ESTest extends StructEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[5];
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, (Byte) byteArray0[1], false, (List<TextColumnEncoding>) null);
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((BlockBuilder) null).when(blockBuilder0).beginBlockEntry();
      // Undeclared exception!
      try { 
        structEncoding0.decodeValueInto((byte)1, blockBuilder0, (Slice) null, (byte) (-116), (-3057));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.StructEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[4];
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, (Byte) (byte)83, false, (List<TextColumnEncoding>) null);
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((BlockBuilder) null).when(blockBuilder0).beginBlockEntry();
      // Undeclared exception!
      try { 
        structEncoding0.decodeValueInto((byte)0, blockBuilder0, (Slice) null, (byte) (-27), 3253);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.StructEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[6];
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, (Byte) byteArray0[4], true, (List<TextColumnEncoding>) null);
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((BlockBuilder) null).when(blockBuilder0).beginBlockEntry();
      // Undeclared exception!
      try { 
        structEncoding0.decodeValueInto((byte)0, blockBuilder0, (Slice) null, (-3897), (byte)31);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.StructEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[7];
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, (Byte) byteArray0[6], true, (List<TextColumnEncoding>) null);
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((BlockBuilder) null).when(blockBuilder0).beginBlockEntry();
      // Undeclared exception!
      try { 
        structEncoding0.decodeValueInto((byte)1, blockBuilder0, (Slice) null, (byte)0, 1328);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.StructEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      Byte byte0 = new Byte((byte)90);
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, byte0, true, (List<TextColumnEncoding>) null);
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((Block) null).when(blockBuilder0).getBlock(anyInt());
      SliceOutput sliceOutput0 = mock(SliceOutput.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        structEncoding0.encodeValueInto(0, blockBuilder0, 4299, sliceOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.StructEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      doReturn((Block) null).when(block0).getBlock(anyInt());
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(block0).when(blockBuilder0).build();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(type0).createBlockBuilder(any(com.facebook.presto.common.block.BlockBuilderStatus.class) , anyInt());
      byte[] byteArray0 = new byte[6];
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, (Byte) (byte)1, true, (List<TextColumnEncoding>) null);
      ColumnData columnData0 = mock(ColumnData.class, new ViolatedAssumptionAnswer());
      doReturn((Slice) null).when(columnData0).getSlice();
      doReturn((-2258)).when(columnData0).rowCount();
      Block block1 = structEncoding0.decodeColumn(columnData0);
      SliceOutput sliceOutput0 = mock(SliceOutput.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        structEncoding0.encodeValueInto((byte)1, block1, (byte)0, sliceOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.StructEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[0];
      Byte byte0 = new Byte((byte) (-87));
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, byte0, false, (List<TextColumnEncoding>) null);
      SliceOutput sliceOutput0 = mock(SliceOutput.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        structEncoding0.encodeValueInto(0, (Block) null, (-4001), sliceOutput0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.facebook.presto.rcfile.text.BlockEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[9];
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, (Byte) (byte)106, false, (List<TextColumnEncoding>) null);
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        structEncoding0.decodeValueInto((byte)106, blockBuilder0, (Slice) null, 534, 534);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 106
         //
         verifyException("com.facebook.presto.rcfile.text.BlockEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[4];
      StructEncoding structEncoding0 = new StructEncoding(type0, (Slice) null, byteArray0, (Byte) (byte)0, false, (List<TextColumnEncoding>) null);
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      BlockBuilder blockBuilder1 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(blockBuilder1).beginBlockEntry();
      // Undeclared exception!
      try { 
        structEncoding0.decodeValueInto((byte)0, blockBuilder1, (Slice) null, (byte)96, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.text.StructEncoding", e);
      }
  }
}
