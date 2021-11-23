/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 18:19:09 GMT 2021
 */

package com.facebook.presto.orc.checkpoint;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.orc.StreamId;
import com.facebook.presto.orc.checkpoint.BooleanStreamCheckpoint;
import com.facebook.presto.orc.checkpoint.ByteArrayStreamCheckpoint;
import com.facebook.presto.orc.checkpoint.Checkpoints;
import com.facebook.presto.orc.checkpoint.LongStreamDwrfCheckpoint;
import com.facebook.presto.orc.checkpoint.LongStreamV1Checkpoint;
import com.facebook.presto.orc.checkpoint.LongStreamV2Checkpoint;
import com.facebook.presto.orc.checkpoint.StreamCheckpoint;
import com.facebook.presto.orc.metadata.ColumnEncoding;
import com.facebook.presto.orc.metadata.OrcType;
import com.facebook.presto.orc.metadata.RowGroupIndex;
import com.facebook.presto.orc.metadata.Stream;
import com.google.common.collect.LinkedHashMultimap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Checkpoints_ESTest extends Checkpoints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.FLOAT;
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DWRF_DIRECT;
      // Undeclared exception!
      try { 
        Checkpoints.getDictionaryStreamCheckpoint((StreamId) null, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.checkpoint.Checkpoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.LENGTH;
      StreamId streamId0 = new StreamId(172, 664, stream_StreamKind0);
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.SHORT;
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY;
      LongStreamV1Checkpoint longStreamV1Checkpoint0 = (LongStreamV1Checkpoint)Checkpoints.getDictionaryStreamCheckpoint(streamId0, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
      assertEquals(0, longStreamV1Checkpoint0.getOffset());
      assertEquals(0L, longStreamV1Checkpoint0.getInputStreamCheckpoint());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.LENGTH;
      Optional<Long> optional0 = Optional.empty();
      Stream stream0 = new Stream(883, stream_StreamKind0, 0, true, 1027, optional0);
      StreamId streamId0 = new StreamId(stream0);
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.CHAR;
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DIRECT_V2;
      // Undeclared exception!
      try { 
        Checkpoints.getDictionaryStreamCheckpoint(streamId0, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported column type CHAR for dictionary stream StreamId{column=883, sequence=1027, streamKind=LENGTH}
         //
         verifyException("com.facebook.presto.orc.checkpoint.Checkpoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.DICTIONARY_DATA;
      Stream stream0 = new Stream(479, stream_StreamKind0, 84, false);
      StreamId streamId0 = new StreamId(stream0);
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.BYTE;
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DIRECT;
      // Undeclared exception!
      try { 
        Checkpoints.getDictionaryStreamCheckpoint(streamId0, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported column type BYTE for dictionary stream StreamId{column=479, sequence=0, streamKind=DICTIONARY_DATA}
         //
         verifyException("com.facebook.presto.orc.checkpoint.Checkpoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.DICTIONARY_DATA;
      Stream stream0 = new Stream(479, stream_StreamKind0, 84, false);
      StreamId streamId0 = new StreamId(stream0);
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DIRECT;
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.STRING;
      ByteArrayStreamCheckpoint byteArrayStreamCheckpoint0 = (ByteArrayStreamCheckpoint)Checkpoints.getDictionaryStreamCheckpoint(streamId0, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
      assertEquals(0L, byteArrayStreamCheckpoint0.getInputStreamCheckpoint());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.DICTIONARY_DATA;
      StreamId streamId0 = new StreamId((-1349), 0, stream_StreamKind0);
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.FLOAT;
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY_V2;
      // Undeclared exception!
      try { 
        Checkpoints.getDictionaryStreamCheckpoint(streamId0, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported column type FLOAT for dictionary stream StreamId{column=-1349, sequence=0, streamKind=DICTIONARY_DATA}
         //
         verifyException("com.facebook.presto.orc.checkpoint.Checkpoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.DICTIONARY_DATA;
      Stream stream0 = new Stream(479, stream_StreamKind0, 84, false);
      StreamId streamId0 = new StreamId(stream0);
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DIRECT;
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.INT;
      LongStreamDwrfCheckpoint longStreamDwrfCheckpoint0 = (LongStreamDwrfCheckpoint)Checkpoints.getDictionaryStreamCheckpoint(streamId0, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
      assertEquals(0L, longStreamDwrfCheckpoint0.getInputStreamCheckpoint());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.DICTIONARY_DATA;
      Long long0 = new Long(9);
      Optional<Long> optional0 = Optional.of(long0);
      Stream stream0 = new Stream(9, stream_StreamKind0, (-251), false, 10, optional0);
      StreamId streamId0 = new StreamId(stream0);
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.DATE;
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY_V2;
      // Undeclared exception!
      try { 
        Checkpoints.getDictionaryStreamCheckpoint(streamId0, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported column type DATE for dictionary stream StreamId{column=9, sequence=10, streamKind=DICTIONARY_DATA}
         //
         verifyException("com.facebook.presto.orc.checkpoint.Checkpoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.DATA;
      Stream stream0 = new Stream(959, stream_StreamKind0, 959, false);
      StreamId streamId0 = new StreamId(stream0);
      OrcType.OrcTypeKind orcType_OrcTypeKind0 = OrcType.OrcTypeKind.UNION;
      ColumnEncoding.ColumnEncodingKind columnEncoding_ColumnEncodingKind0 = ColumnEncoding.ColumnEncodingKind.DICTIONARY_V2;
      LongStreamV2Checkpoint longStreamV2Checkpoint0 = (LongStreamV2Checkpoint)Checkpoints.getDictionaryStreamCheckpoint(streamId0, orcType_OrcTypeKind0, columnEncoding_ColumnEncodingKind0);
      assertEquals(0, longStreamV2Checkpoint0.getOffset());
      assertEquals(0L, longStreamV2Checkpoint0.getInputStreamCheckpoint());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IdentityHashMap<Integer, ColumnEncoding> identityHashMap0 = new IdentityHashMap<Integer, ColumnEncoding>();
      IdentityHashMap<StreamId, Stream> identityHashMap1 = new IdentityHashMap<StreamId, Stream>();
      IdentityHashMap<StreamId, List<RowGroupIndex>> identityHashMap2 = new IdentityHashMap<StreamId, List<RowGroupIndex>>();
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.LENGTH;
      Stream stream0 = new Stream(1517, stream_StreamKind0, 0, true);
      StreamId streamId0 = new StreamId(stream0);
      identityHashMap2.put(streamId0, (List<RowGroupIndex>) null);
      // Undeclared exception!
      try { 
        Checkpoints.getStreamCheckpoints((Set<Integer>) null, (List<OrcType>) null, true, 1517, identityHashMap0, identityHashMap1, identityHashMap2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashMultimap<Integer, BooleanStreamCheckpoint> linkedHashMultimap0 = LinkedHashMultimap.create(271, 0);
      Set<Integer> set0 = linkedHashMultimap0.keySet();
      LinkedList<OrcType> linkedList0 = new LinkedList<OrcType>();
      HashMap<Integer, ColumnEncoding> hashMap0 = new HashMap<Integer, ColumnEncoding>();
      IdentityHashMap<StreamId, Stream> identityHashMap0 = new IdentityHashMap<StreamId, Stream>(12);
      HashMap<StreamId, List<RowGroupIndex>> hashMap1 = new HashMap<StreamId, List<RowGroupIndex>>();
      Stream.StreamKind stream_StreamKind0 = Stream.StreamKind.LENGTH;
      Long long0 = new Long(271);
      Optional<Long> optional0 = Optional.of(long0);
      Stream stream0 = new Stream(271, stream_StreamKind0, (-1903750183), false, 12, optional0);
      StreamId streamId0 = new StreamId(12, (-1903750183), stream_StreamKind0);
      identityHashMap0.put(streamId0, stream0);
      Map<StreamId, StreamCheckpoint> map0 = Checkpoints.getStreamCheckpoints(set0, linkedList0, true, 0, hashMap0, identityHashMap0, hashMap1);
      assertTrue(map0.isEmpty());
  }
}
