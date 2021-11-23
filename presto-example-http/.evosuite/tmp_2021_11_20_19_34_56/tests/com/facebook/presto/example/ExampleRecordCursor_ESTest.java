/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 03:38:40 GMT 2021
 */

package com.facebook.presto.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.TinyintType;
import com.facebook.presto.common.type.VarcharType;
import com.facebook.presto.example.ExampleColumnHandle;
import com.facebook.presto.example.ExampleRecordCursor;
import com.google.common.io.ByteSource;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ServiceLoader;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExampleRecordCursor_ESTest extends ExampleRecordCursor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<ExampleColumnHandle> arrayList0 = new ArrayList<ExampleColumnHandle>();
      byte[] byteArray0 = new byte[1];
      ByteSource byteSource0 = ByteSource.wrap(byteArray0);
      VarcharType varcharType0 = VarcharType.createUnboundedVarcharType();
      ExampleColumnHandle exampleColumnHandle0 = new ExampleColumnHandle("6X-Q", "6X-Q", varcharType0, 0);
      arrayList0.add(exampleColumnHandle0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(arrayList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.isNull((byte)1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid field index
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<ExampleColumnHandle> vector0 = new Vector<ExampleColumnHandle>();
      byte[] byteArray0 = new byte[3];
      ByteSource byteSource0 = ByteSource.wrap(byteArray0);
      TinyintType tinyintType0 = TinyintType.TINYINT;
      ExampleColumnHandle exampleColumnHandle0 = new ExampleColumnHandle("Expected application/json response from server but got ", "TYPE", tinyintType0, (byte)0);
      vector0.add(exampleColumnHandle0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(vector0, byteSource0);
      TinyintType tinyintType1 = (TinyintType)exampleRecordCursor0.getType((byte)0);
      assertEquals(1, tinyintType1.getFixedSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getType((-2238));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -2238, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      Class<ByteSource> class0 = Class.class;
      ServiceLoader<ByteSource> serviceLoader0 = ServiceLoader.loadInstalled(class0);
      ByteSource byteSource0 = ByteSource.concat((Iterable<? extends ByteSource>) serviceLoader0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getSlice((byte) (-18));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -18, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<ExampleColumnHandle> vector0 = new Vector<ExampleColumnHandle>();
      LinkedList<ByteSource> linkedList0 = new LinkedList<ByteSource>();
      Iterator<ByteSource> iterator0 = linkedList0.iterator();
      ByteSource byteSource0 = ByteSource.concat(iterator0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(vector0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getSlice(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid field index
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getLong((-2769));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -2769, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getDouble((-401));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -401, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stack<ExampleColumnHandle> stack0 = new Stack<ExampleColumnHandle>();
      ArrayList<ByteSource> arrayList0 = new ArrayList<ByteSource>();
      ByteSource byteSource0 = ByteSource.concat((Iterable<? extends ByteSource>) arrayList0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(stack0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getDouble(769);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid field index
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getBoolean(1179);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid field index
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Stack<ExampleColumnHandle> stack0 = new Stack<ExampleColumnHandle>();
      ArrayDeque<ByteSource> arrayDeque0 = new ArrayDeque<ByteSource>();
      ByteSource byteSource0 = ByteSource.concat((Iterable<? extends ByteSource>) arrayDeque0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(stack0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getBoolean((-217));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -217
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<ExampleColumnHandle> arrayList0 = new ArrayList<ExampleColumnHandle>();
      PriorityQueue<ByteSource> priorityQueue0 = new PriorityQueue<ByteSource>();
      ByteSource byteSource0 = ByteSource.concat((Iterable<? extends ByteSource>) priorityQueue0);
      priorityQueue0.add(byteSource0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(arrayList0, byteSource0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExampleRecordCursor exampleRecordCursor0 = null;
      try {
        exampleRecordCursor0 = new ExampleRecordCursor((List<ExampleColumnHandle>) null, (ByteSource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.example.ExampleRecordCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<ExampleColumnHandle> vector0 = new Vector<ExampleColumnHandle>();
      ByteSource byteSource0 = mock(ByteSource.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(byteSource0).openStream();
      ExampleRecordCursor exampleRecordCursor0 = null;
      try {
        exampleRecordCursor0 = new ExampleRecordCursor(vector0, byteSource0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<ExampleColumnHandle> arrayList0 = new ArrayList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(arrayList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getType((-14));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Stack<ExampleColumnHandle> stack0 = new Stack<ExampleColumnHandle>();
      LinkedList<ByteSource> linkedList0 = new LinkedList<ByteSource>();
      Iterator<ByteSource> iterator0 = linkedList0.iterator();
      ByteSource byteSource0 = ByteSource.concat(iterator0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(stack0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getType(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid field index
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<ExampleColumnHandle> arrayList0 = new ArrayList<ExampleColumnHandle>();
      byte[] byteArray0 = new byte[1];
      ByteSource byteSource0 = ByteSource.wrap(byteArray0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(arrayList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.isNull((byte)1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid field index
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector<ExampleColumnHandle> vector0 = new Vector<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(vector0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.isNull((-1162));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cursor has not been advanced yet
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      boolean boolean0 = exampleRecordCursor0.advanceNextPosition();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<ExampleColumnHandle> vector0 = new Vector<ExampleColumnHandle>();
      byte[] byteArray0 = new byte[3];
      ByteSource byteSource0 = ByteSource.wrap(byteArray0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(vector0, byteSource0);
      exampleRecordCursor0.advanceNextPosition();
      // Undeclared exception!
      try { 
        exampleRecordCursor0.isNull((-1430));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1430
         //
         verifyException("com.facebook.presto.example.ExampleRecordCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getLong(1441);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid field index
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector<ExampleColumnHandle> vector0 = new Vector<ExampleColumnHandle>();
      HashSet<ByteSource> hashSet0 = new HashSet<ByteSource>();
      ByteSource byteSource0 = ByteSource.empty();
      hashSet0.add(byteSource0);
      ByteSource byteSource1 = ByteSource.concat((Iterable<? extends ByteSource>) hashSet0);
      hashSet0.add(byteSource1);
      ExampleRecordCursor exampleRecordCursor0 = null;
      try {
        exampleRecordCursor0 = new ExampleRecordCursor(vector0, byteSource1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector<ExampleColumnHandle> vector0 = new Vector<ExampleColumnHandle>();
      byte[] byteArray0 = new byte[3];
      ByteSource byteSource0 = ByteSource.wrap(byteArray0);
      TinyintType tinyintType0 = TinyintType.TINYINT;
      ExampleColumnHandle exampleColumnHandle0 = new ExampleColumnHandle("Expected application/json response from server but got ", "FZZW_h3", tinyintType0, 2099);
      vector0.add(exampleColumnHandle0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(vector0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getSlice((byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected field 0 to be type varchar but is tinyint
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Stack<ExampleColumnHandle> stack0 = new Stack<ExampleColumnHandle>();
      ArrayDeque<ByteSource> arrayDeque0 = new ArrayDeque<ByteSource>();
      ByteSource byteSource0 = ByteSource.concat((Iterable<? extends ByteSource>) arrayDeque0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(stack0, byteSource0);
      exampleRecordCursor0.close();
      assertEquals(0L, exampleRecordCursor0.getReadTimeNanos());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayList<ExampleColumnHandle> arrayList0 = new ArrayList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(arrayList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getObject(891);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.example.ExampleRecordCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getBoolean((-3991));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -3991, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector<ExampleColumnHandle> vector0 = new Vector<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(vector0, byteSource0);
      long long0 = exampleRecordCursor0.getReadTimeNanos();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<ExampleColumnHandle> linkedList0 = new LinkedList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(linkedList0, byteSource0);
      long long0 = exampleRecordCursor0.getCompletedBytes();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArrayList<ExampleColumnHandle> arrayList0 = new ArrayList<ExampleColumnHandle>();
      LinkedList<ByteSource> linkedList0 = new LinkedList<ByteSource>();
      Iterator<ByteSource> iterator0 = linkedList0.iterator();
      ByteSource byteSource0 = ByteSource.concat(iterator0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(arrayList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getSlice((-8));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArrayList<ExampleColumnHandle> arrayList0 = new ArrayList<ExampleColumnHandle>();
      byte[] byteArray0 = new byte[7];
      ByteSource byteSource0 = ByteSource.wrap(byteArray0);
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(arrayList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getDouble((byte) (-15));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArrayList<ExampleColumnHandle> arrayList0 = new ArrayList<ExampleColumnHandle>();
      ByteSource byteSource0 = ByteSource.empty();
      ExampleRecordCursor exampleRecordCursor0 = new ExampleRecordCursor(arrayList0, byteSource0);
      // Undeclared exception!
      try { 
        exampleRecordCursor0.getLong((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
