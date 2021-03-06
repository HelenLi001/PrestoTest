/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 09:18:17 GMT 2021
 */

package com.facebook.presto.druid;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.druid.DataInputSourceId;
import com.facebook.presto.druid.segment.HdfsDataInputSource;
import org.apache.hadoop.fs.FSDataInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataInputSource_ESTest extends DataInputSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, 0L);
      hdfsDataInputSource0.getSize();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, (-3914L));
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)5;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-102);
      byteArray0[5] = (byte)0;
      hdfsDataInputSource0.readFully((-3914L), byteArray0, (int) (byte)0, (int) (byte) (-1));
      hdfsDataInputSource0.getSize();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, 0L);
      hdfsDataInputSource0.close();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      hdfsDataInputSource0.readFully(0L, byteArray0, (int) (byte)1, (int) (byte)1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, (-1L));
      hdfsDataInputSource0.getReadTimeNanos();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, 1L);
      hdfsDataInputSource0.getId();
      byte[] byteArray0 = new byte[1];
      hdfsDataInputSource0.close();
      byteArray0[0] = (byte)2;
      hdfsDataInputSource0.readFully(1L, byteArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, 2886L);
      hdfsDataInputSource0.getId();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, 213L);
      hdfsDataInputSource0.getSize();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, (-838L));
      hdfsDataInputSource0.close();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DataInputSourceId dataInputSourceId0 = mock(DataInputSourceId.class, new ViolatedAssumptionAnswer());
      FSDataInputStream fSDataInputStream0 = mock(FSDataInputStream.class, new ViolatedAssumptionAnswer());
      HdfsDataInputSource hdfsDataInputSource0 = new HdfsDataInputSource(dataInputSourceId0, fSDataInputStream0, (-608L));
      hdfsDataInputSource0.close();
      byte[] byteArray0 = null;
      hdfsDataInputSource0.close();
      hdfsDataInputSource0.readFully(1327L, (byte[]) null, 0, (-869));
      hdfsDataInputSource0.getSize();
      hdfsDataInputSource0.getId();
      hdfsDataInputSource0.getReadTimeNanos();
      // Undeclared exception!
      try { 
        hdfsDataInputSource0.readFully((-3029L), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.segment.HdfsDataInputSource", e);
      }
  }
}
