/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 18:57:38 GMT 2021
 */

package com.facebook.presto.orc.metadata.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.orc.metadata.statistics.IntegerStatistics;
import com.facebook.presto.orc.metadata.statistics.StatisticsHasher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntegerStatistics_ESTest extends IntegerStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = new Long(0L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      StatisticsHasher statisticsHasher0 = mock(StatisticsHasher.class, new ViolatedAssumptionAnswer());
      doReturn((StatisticsHasher) null).when(statisticsHasher0).putOptionalLong(anyBoolean() , anyLong());
      StatisticsHasher statisticsHasher1 = mock(StatisticsHasher.class, new ViolatedAssumptionAnswer());
      doReturn(statisticsHasher0).when(statisticsHasher1).putOptionalLong(anyBoolean() , anyLong());
      StatisticsHasher statisticsHasher2 = mock(StatisticsHasher.class, new ViolatedAssumptionAnswer());
      doReturn(statisticsHasher1).when(statisticsHasher2).putOptionalLong(anyBoolean() , anyLong());
      integerStatistics0.addHash(statisticsHasher2);
      assertEquals(0L, (long)integerStatistics0.getMax());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Long long0 = new Long((-488L));
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      StatisticsHasher statisticsHasher0 = mock(StatisticsHasher.class, new ViolatedAssumptionAnswer());
      doReturn((StatisticsHasher) null).when(statisticsHasher0).putOptionalLong(anyBoolean() , anyLong());
      StatisticsHasher statisticsHasher1 = mock(StatisticsHasher.class, new ViolatedAssumptionAnswer());
      doReturn(statisticsHasher0).when(statisticsHasher1).putOptionalLong(anyBoolean() , anyLong());
      // Undeclared exception!
      try { 
        integerStatistics0.addHash(statisticsHasher1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.orc.metadata.statistics.IntegerStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Long long0 = new Long(4610L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, (Long) null, long0);
      Long long1 = integerStatistics0.getSum();
      assertNotNull(long1);
      assertEquals(4610L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Long long0 = new Long((-1858L));
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      Long long1 = integerStatistics0.getSum();
      assertEquals((-1858L), (long)long1);
      assertNotNull(long1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long long0 = new Long(0L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      Long long1 = integerStatistics0.getMin();
      assertEquals(0L, (long)long1);
      assertNotNull(long1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Long long0 = new Long(4610L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, (Long) null, long0);
      Long long1 = integerStatistics0.getMin();
      assertEquals(4610L, (long)long1);
      assertNotNull(long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long((-1858L));
      Long long1 = new Long(2017L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long1, long0);
      Long long2 = integerStatistics0.getMax();
      assertNotNull(long2);
      assertEquals(2017L, (long)long2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = new Long((-2465L));
      IntegerStatistics integerStatistics0 = new IntegerStatistics((Long) null, long0, long0);
      Long long1 = integerStatistics0.getMax();
      assertEquals((-2465L), (long)long1);
      assertNotNull(long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Long long0 = new Long(0L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, (Long) null, (Long) null);
      Long long1 = integerStatistics0.getSum();
      assertNull(long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Long long0 = new Long(0L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      Long long1 = integerStatistics0.getSum();
      assertEquals(0L, (long)long1);
      assertNotNull(long1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Long long0 = new Long(0L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      Long long1 = integerStatistics0.getMax();
      assertNotNull(long1);
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Long long0 = new Long(4610L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, (Long) null, long0);
      Long long1 = integerStatistics0.getMax();
      assertNull(long1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Long long0 = new Long((-2465L));
      IntegerStatistics integerStatistics0 = new IntegerStatistics((Long) null, long0, long0);
      Long long1 = integerStatistics0.getMin();
      assertNull(long1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Long long0 = new Long((-3L));
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      Long long1 = integerStatistics0.getMin();
      assertEquals((-3L), (long)long1);
      assertNotNull(long1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Long long0 = new Long((-1832L));
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      IntegerStatistics integerStatistics1 = new IntegerStatistics(long0, long0, long0);
      boolean boolean0 = integerStatistics0.equals(integerStatistics1);
      assertEquals((-1832L), (long)integerStatistics1.getSum());
      assertTrue(boolean0);
      assertEquals((-1832L), (long)integerStatistics1.getMin());
      assertEquals((-1832L), (long)integerStatistics1.getMax());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntegerStatistics integerStatistics0 = new IntegerStatistics((Long) null, (Long) null, (Long) null);
      IntegerStatistics integerStatistics1 = new IntegerStatistics((Long) null, (Long) 9L, (Long) 9L);
      boolean boolean0 = integerStatistics0.equals(integerStatistics1);
      assertFalse(boolean0);
      assertEquals(9L, (long)integerStatistics1.getMax());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Long long0 = new Long(2675L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      IntegerStatistics integerStatistics1 = new IntegerStatistics((Long) 9L, long0, (Long) 9L);
      boolean boolean0 = integerStatistics0.equals(integerStatistics1);
      assertEquals(2675L, (long)integerStatistics1.getMax());
      assertFalse(boolean0);
      assertEquals(2675L, (long)integerStatistics0.getMin());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Long long0 = new Long(0L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      boolean boolean0 = integerStatistics0.equals(long0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Long long0 = new Long((-488L));
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      boolean boolean0 = integerStatistics0.equals(integerStatistics0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Long long0 = new Long(1586L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      IntegerStatistics integerStatistics1 = new IntegerStatistics(long0, long0, (Long) 9L);
      boolean boolean0 = integerStatistics0.equals(integerStatistics1);
      assertEquals(1586L, (long)integerStatistics1.getMax());
      assertEquals(1586L, (long)integerStatistics1.getMin());
      assertEquals(9L, (long)integerStatistics1.getSum());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Long long0 = new Long((-527L));
      Long long1 = new Long((-893L));
      IntegerStatistics integerStatistics0 = null;
      try {
        integerStatistics0 = new IntegerStatistics(long0, long1, long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimum is not less than maximum
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Long long0 = new Long(777L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, (Long) null, long0);
      boolean boolean0 = integerStatistics0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Long long0 = new Long(0L);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(long0, long0, long0);
      integerStatistics0.hashCode();
      assertEquals(0L, (long)integerStatistics0.getMin());
      assertEquals(0L, (long)integerStatistics0.getMax());
      assertEquals(0L, (long)integerStatistics0.getSum());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntegerStatistics integerStatistics0 = new IntegerStatistics((Long) null, (Long) null, (Long) null);
      long long0 = integerStatistics0.getRetainedSizeInBytes();
      assertEquals(48L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntegerStatistics integerStatistics0 = new IntegerStatistics((Long) null, (Long) null, (Long) null);
      String string0 = integerStatistics0.toString();
      assertEquals("IntegerStatistics{min=null, max=null, sum=null}", string0);
  }
}
