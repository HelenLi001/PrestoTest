/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 20:14:15 GMT 2021
 */

package com.facebook.presto.rcfile.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.block.Block;
import com.facebook.presto.common.block.BlockBuilder;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.rcfile.ColumnData;
import com.facebook.presto.rcfile.EncodeOutput;
import com.facebook.presto.rcfile.binary.TimestampEncoding;
import io.airlift.slice.Slice;
import io.airlift.slice.SliceOutput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimestampEncoding_ESTest extends TimestampEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimestampEncoding timestampEncoding0 = new TimestampEncoding((Type) null);
      assertNotNull(timestampEncoding0);
      
      // Undeclared exception!
      try { 
        timestampEncoding0.decodeValueInto((BlockBuilder) null, (Slice) null, (-1), (-1510));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.binary.TimestampEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(type0).createBlockBuilder(any(com.facebook.presto.common.block.BlockBuilderStatus.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      assertNotNull(timestampEncoding0);
      
      ColumnData columnData0 = mock(ColumnData.class, new ViolatedAssumptionAnswer());
      doReturn(9).when(columnData0).getLength(anyInt());
      doReturn(1026).when(columnData0).getOffset(anyInt());
      doReturn((Slice) null).when(columnData0).getSlice();
      doReturn(10).when(columnData0).rowCount();
      // Undeclared exception!
      try { 
        timestampEncoding0.decodeColumn(columnData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.binary.TimestampEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(type0).createBlockBuilder(any(com.facebook.presto.common.block.BlockBuilderStatus.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      assertNotNull(timestampEncoding0);
      
      ColumnData columnData0 = mock(ColumnData.class, new ViolatedAssumptionAnswer());
      doReturn((-8)).when(columnData0).getLength(anyInt());
      doReturn(0).when(columnData0).getOffset(anyInt());
      doReturn((Slice) null).when(columnData0).getSlice();
      doReturn(27).when(columnData0).rowCount();
      // Undeclared exception!
      try { 
        timestampEncoding0.decodeColumn(columnData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.binary.TimestampEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(blockBuilder0).getPositionCount();
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      assertNotNull(timestampEncoding0);
      
      EncodeOutput encodeOutput0 = mock(EncodeOutput.class, new ViolatedAssumptionAnswer());
      timestampEncoding0.encodeColumn(blockBuilder0, (SliceOutput) null, encodeOutput0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((BlockBuilder) null).when(blockBuilder0).build();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(type0).createBlockBuilder(any(com.facebook.presto.common.block.BlockBuilderStatus.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      assertNotNull(timestampEncoding0);
      
      ColumnData columnData0 = mock(ColumnData.class, new ViolatedAssumptionAnswer());
      doReturn((Slice) null).when(columnData0).getSlice();
      doReturn((-2054)).when(columnData0).rowCount();
      Block block0 = timestampEncoding0.decodeColumn(columnData0);
      assertNull(block0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      assertNotNull(timestampEncoding0);
      
      // Undeclared exception!
      try { 
        timestampEncoding0.getValueLength((Slice) null, 97);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.binary.TimestampEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(type0).getLong(any(com.facebook.presto.common.block.Block.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      assertNotNull(timestampEncoding0);
      
      // Undeclared exception!
      try { 
        timestampEncoding0.encodeValueInto((Block) null, 95, (SliceOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.binary.TimestampEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(1000L, 1000L, 1000L, (-1175L), (-770L)).when(type0).getLong(any(com.facebook.presto.common.block.Block.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      assertNotNull(timestampEncoding0);
      
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      doReturn(2147, 2147, 2147, Integer.MAX_VALUE, Integer.MAX_VALUE).when(block0).getPositionCount();
      doReturn(false, false, false, false, false).when(block0).isNull(anyInt());
      doReturn("").when(block0).toString();
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(block0).when(blockBuilder0).build();
      Type type1 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(type1).createBlockBuilder(any(com.facebook.presto.common.block.BlockBuilderStatus.class) , anyInt());
      TimestampEncoding timestampEncoding1 = new TimestampEncoding(type1);
      assertNotNull(timestampEncoding1);
      assertFalse(timestampEncoding1.equals((Object)timestampEncoding0));
      
      ColumnData columnData0 = mock(ColumnData.class, new ViolatedAssumptionAnswer());
      doReturn((Slice) null).when(columnData0).getSlice();
      doReturn((-739)).when(columnData0).rowCount();
      Block block1 = timestampEncoding1.decodeColumn(columnData0);
      assertNotNull(block1);
      assertFalse(timestampEncoding1.equals((Object)timestampEncoding0));
      assertNotSame(timestampEncoding1, timestampEncoding0);
      assertSame(block1, block0);
      
      SliceOutput sliceOutput0 = mock(SliceOutput.class, new ViolatedAssumptionAnswer());
      EncodeOutput encodeOutput0 = mock(EncodeOutput.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      timestampEncoding0.encodeColumn(block1, sliceOutput0, encodeOutput0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(1664).when(blockBuilder0).getPositionCount();
      doReturn(false).when(blockBuilder0).isNull(anyInt());
      doReturn("").when(blockBuilder0).toString();
      BlockBuilder blockBuilder1 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(blockBuilder1).build();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder1).when(type0).createBlockBuilder(any(com.facebook.presto.common.block.BlockBuilderStatus.class) , anyInt());
      doReturn(0L).when(type0).getLong(any(com.facebook.presto.common.block.Block.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      ColumnData columnData0 = mock(ColumnData.class, new ViolatedAssumptionAnswer());
      doReturn((Slice) null).when(columnData0).getSlice();
      doReturn((-1558)).when(columnData0).rowCount();
      Block block0 = timestampEncoding0.decodeColumn(columnData0);
      EncodeOutput encodeOutput0 = mock(EncodeOutput.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        timestampEncoding0.encodeColumn(block0, (SliceOutput) null, encodeOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.rcfile.binary.TimestampEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((BlockBuilder) null, (BlockBuilder) null, (BlockBuilder) null, (BlockBuilder) null, (BlockBuilder) null).when(blockBuilder0).appendNull();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(type0).createBlockBuilder(any(com.facebook.presto.common.block.BlockBuilderStatus.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      ColumnData columnData0 = mock(ColumnData.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(columnData0).getLength(anyInt());
      doReturn((Slice) null).when(columnData0).getSlice();
      doReturn(Integer.MAX_VALUE).when(columnData0).rowCount();
      // Undeclared exception!
      timestampEncoding0.decodeColumn(columnData0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(type0).getLong(any(com.facebook.presto.common.block.Block.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      SliceOutput sliceOutput0 = mock(SliceOutput.class, new ViolatedAssumptionAnswer());
      timestampEncoding0.encodeValueInto((Block) null, 5, sliceOutput0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(3617L).when(type0).getLong(any(com.facebook.presto.common.block.Block.class) , anyInt());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      doReturn(48, 399, (-1)).when(block0).getPositionCount();
      doReturn(true, false).when(block0).isNull(anyInt());
      doReturn("hP[").when(block0).toString();
      BlockBuilder blockBuilder0 = mock(BlockBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((BlockBuilder) null, (BlockBuilder) null, (BlockBuilder) null, (BlockBuilder) null, (BlockBuilder) null).when(blockBuilder0).appendNull();
      doReturn(block0).when(blockBuilder0).build();
      Type type1 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(blockBuilder0).when(type1).createBlockBuilder(any(com.facebook.presto.common.block.BlockBuilderStatus.class) , anyInt());
      TimestampEncoding timestampEncoding1 = new TimestampEncoding(type1);
      ColumnData columnData0 = mock(ColumnData.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(columnData0).getLength(anyInt());
      doReturn((Slice) null).when(columnData0).getSlice();
      doReturn(399).when(columnData0).rowCount();
      Block block1 = timestampEncoding1.decodeColumn(columnData0);
      SliceOutput sliceOutput0 = mock(SliceOutput.class, new ViolatedAssumptionAnswer());
      EncodeOutput encodeOutput0 = mock(EncodeOutput.class, new ViolatedAssumptionAnswer());
      timestampEncoding0.encodeColumn(block1, sliceOutput0, encodeOutput0);
      assertFalse(timestampEncoding1.equals((Object)timestampEncoding0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      TimestampEncoding timestampEncoding0 = new TimestampEncoding(type0);
      int int0 = timestampEncoding0.getValueOffset((Slice) null, 1116);
      assertEquals(0, int0);
  }
}
