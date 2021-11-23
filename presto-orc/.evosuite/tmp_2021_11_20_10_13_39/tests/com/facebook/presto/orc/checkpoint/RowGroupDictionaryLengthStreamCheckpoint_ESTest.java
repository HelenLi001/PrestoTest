/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 19:47:51 GMT 2021
 */

package com.facebook.presto.orc.checkpoint;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.orc.checkpoint.Checkpoints;
import com.facebook.presto.orc.checkpoint.RowGroupDictionaryLengthStreamCheckpoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RowGroupDictionaryLengthStreamCheckpoint_ESTest extends RowGroupDictionaryLengthStreamCheckpoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint(0, 0, (-599L));
      rowGroupDictionaryLengthStreamCheckpoint0.getRowGroupDictionarySize();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint((-3920), (-1326), 0L);
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.getRowGroupDictionarySize();
      rowGroupDictionaryLengthStreamCheckpoint0.getRowGroupDictionarySize();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.getRowGroupDictionarySize();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.getRowGroupDictionarySize();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint(2321, 2321, 2321);
      rowGroupDictionaryLengthStreamCheckpoint0.toPositionList(true);
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
      rowGroupDictionaryLengthStreamCheckpoint0.getRowGroupDictionarySize();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = null;
      try {
        rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint(true, (Checkpoints.ColumnPositionsList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.checkpoint.InputStreamCheckpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint(0, 0, 0);
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint((-5), (-5), (-1324L));
      rowGroupDictionaryLengthStreamCheckpoint0.getRowGroupDictionarySize();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint(1037, 374, 1037);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = null;
      try {
        rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint(false, (Checkpoints.ColumnPositionsList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.checkpoint.InputStreamCheckpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RowGroupDictionaryLengthStreamCheckpoint rowGroupDictionaryLengthStreamCheckpoint0 = new RowGroupDictionaryLengthStreamCheckpoint((-3094), (-3094), (-3094));
      rowGroupDictionaryLengthStreamCheckpoint0.getRowGroupDictionarySize();
      rowGroupDictionaryLengthStreamCheckpoint0.toString();
  }
}
