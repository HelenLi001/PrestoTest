/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 21:20:34 GMT 2021
 */

package com.facebook.presto.hive.metastore;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.hive.metastore.BooleanStatistics;
import com.facebook.presto.hive.metastore.DateStatistics;
import com.facebook.presto.hive.metastore.DecimalStatistics;
import com.facebook.presto.hive.metastore.DoubleStatistics;
import com.facebook.presto.hive.metastore.HiveColumnStatistics;
import com.facebook.presto.hive.metastore.IntegerStatistics;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HiveColumnStatistics_ESTest extends HiveColumnStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of(4084L);
      OptionalLong optionalLong1 = OptionalLong.of(4084L);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createStringColumnStatistics(optionalLong0, optionalLong0, optionalLong1, optionalLong0);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.empty();
      OptionalLong optionalLong1 = OptionalLong.of((-763L));
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createStringColumnStatistics(optionalLong0, optionalLong0, optionalLong0, optionalLong1);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of(1301L);
      OptionalLong optionalLong1 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createBooleanColumnStatistics(optionalLong0, optionalLong1, optionalLong0);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of(4084L);
      OptionalLong optionalLong1 = OptionalLong.of(4084L);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createBooleanColumnStatistics(optionalLong1, optionalLong1, optionalLong0);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of((-1311L));
      OptionalLong optionalLong1 = OptionalLong.of((-1311L));
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      Optional<LocalDate> optional0 = Optional.of(localDate0);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDateColumnStatistics(optional0, optional0, optionalLong0, optionalLong1);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Predicate<Object> predicate0 = Predicate.isEqual((Object) bigDecimal0);
      OptionalLong optionalLong0 = OptionalLong.of(0L);
      LocalDate localDate0 = MockLocalDate.ofYearDay(6, 6);
      Optional<LocalDate> optional0 = Optional.of(localDate0);
      Optional<LocalDate> optional1 = optional0.filter(predicate0);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDateColumnStatistics(optional0, optional1, optionalLong0, optionalLong0);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Optional<BigDecimal> optional0 = Optional.empty();
      OptionalLong optionalLong0 = OptionalLong.of(1275L);
      // Undeclared exception!
      try { 
        HiveColumnStatistics.createDecimalColumnStatistics(optional0, optional0, (OptionalLong) null, optionalLong0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // nullsCount is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.empty();
      BigDecimal bigDecimal0 = new BigDecimal(5733L);
      Optional<BigDecimal> optional0 = Optional.ofNullable(bigDecimal0);
      // Undeclared exception!
      try { 
        HiveColumnStatistics.createDecimalColumnStatistics(optional0, (Optional<BigDecimal>) null, optionalLong0, optionalLong0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // max is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionalDouble optionalDouble0 = OptionalDouble.of(1927.2014281786);
      OptionalDouble optionalDouble1 = OptionalDouble.empty();
      OptionalLong optionalLong0 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDoubleColumnStatistics(optionalDouble0, optionalDouble1, optionalLong0, optionalLong0);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of(341L);
      OptionalLong optionalLong1 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createIntegerColumnStatistics(optionalLong0, optionalLong0, optionalLong1, optionalLong0);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of(0L);
      OptionalLong optionalLong1 = OptionalLong.of(0L);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createIntegerColumnStatistics(optionalLong0, optionalLong0, optionalLong0, optionalLong1);
      assertNotNull(hiveColumnStatistics0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of(0L);
      // Undeclared exception!
      try { 
        HiveColumnStatistics.createStringColumnStatistics(optionalLong0, (OptionalLong) null, optionalLong0, optionalLong0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // totalSizeInBytes is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.empty();
      // Undeclared exception!
      try { 
        HiveColumnStatistics.createIntegerColumnStatistics(optionalLong0, (OptionalLong) null, optionalLong0, optionalLong0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // max is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionalDouble optionalDouble0 = OptionalDouble.empty();
      OptionalLong optionalLong0 = OptionalLong.empty();
      // Undeclared exception!
      try { 
        HiveColumnStatistics.createDoubleColumnStatistics(optionalDouble0, optionalDouble0, (OptionalLong) null, optionalLong0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // nullsCount is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of((-1L));
      // Undeclared exception!
      try { 
        HiveColumnStatistics.createDateColumnStatistics((Optional<LocalDate>) null, (Optional<LocalDate>) null, optionalLong0, optionalLong0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // min is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        HiveColumnStatistics.createBooleanColumnStatistics((OptionalLong) null, (OptionalLong) null, (OptionalLong) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // trueCount is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        HiveColumnStatistics.createBinaryColumnStatistics((OptionalLong) null, (OptionalLong) null, (OptionalLong) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // maxValueSizeInBytes is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        HiveColumnStatistics.builder((HiveColumnStatistics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.hive.metastore.HiveColumnStatistics$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.empty();
      IntegerStatistics integerStatistics0 = new IntegerStatistics(optionalLong0, optionalLong0);
      Optional<IntegerStatistics> optional0 = Optional.ofNullable(integerStatistics0);
      OptionalDouble optionalDouble0 = OptionalDouble.of(0.0);
      DoubleStatistics doubleStatistics0 = new DoubleStatistics(optionalDouble0, optionalDouble0);
      Optional<DoubleStatistics> optional1 = Optional.of(doubleStatistics0);
      Optional<DecimalStatistics> optional2 = Optional.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createStringColumnStatistics(optionalLong0, optionalLong0, optionalLong0, optionalLong0);
      Optional<BooleanStatistics> optional3 = hiveColumnStatistics0.getBooleanStatistics();
      HiveColumnStatistics hiveColumnStatistics1 = null;
      try {
        hiveColumnStatistics1 = new HiveColumnStatistics(optional0, optional1, optional2, (Optional<DateStatistics>) null, optional3, optionalLong0, optionalLong0, optionalLong0, optionalLong0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // dateStatistics is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      OptionalLong optionalLong0 = OptionalLong.of(1301L);
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setNullsCount(optionalLong0);
      assertSame(hiveColumnStatistics_Builder1, hiveColumnStatistics_Builder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      Optional<DoubleStatistics> optional0 = hiveColumnStatistics0.getDoubleStatistics();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Optional<BigDecimal> optional0 = Optional.ofNullable(bigDecimal0);
      OptionalLong optionalLong0 = OptionalLong.of(0L);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDecimalColumnStatistics(optional0, optional0, optionalLong0, optionalLong0);
      OptionalLong optionalLong1 = hiveColumnStatistics0.getMaxValueSizeInBytes();
      assertNotSame(optionalLong1, optionalLong0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      BigDecimal bigDecimal0 = new BigDecimal(1.0);
      Optional<BigDecimal> optional0 = Optional.ofNullable(bigDecimal0);
      DecimalStatistics decimalStatistics0 = new DecimalStatistics(optional0, optional0);
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setDecimalStatistics(decimalStatistics0);
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Optional<BigDecimal> optional0 = Optional.ofNullable(bigDecimal0);
      OptionalLong optionalLong0 = OptionalLong.of(0L);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDecimalColumnStatistics(optional0, optional0, optionalLong0, optionalLong0);
      Optional<DecimalStatistics> optional1 = hiveColumnStatistics0.getDecimalStatistics();
      assertNotNull(optional1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Optional<BigDecimal> optional0 = Optional.of(bigDecimal0);
      OptionalLong optionalLong0 = OptionalLong.of((-2048L));
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDecimalColumnStatistics(optional0, optional0, optionalLong0, optionalLong0);
      Optional<IntegerStatistics> optional1 = hiveColumnStatistics0.getIntegerStatistics();
      assertNotNull(optional1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      OptionalLong optionalLong0 = hiveColumnStatistics0.getTotalSizeInBytes();
      assertNotNull(optionalLong0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      OptionalLong optionalLong0 = hiveColumnStatistics0.getDistinctValuesCount();
      assertNotNull(optionalLong0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      OptionalDouble optionalDouble0 = OptionalDouble.of(2123.0);
      DoubleStatistics doubleStatistics0 = new DoubleStatistics(optionalDouble0, optionalDouble0);
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setDoubleStatistics(doubleStatistics0);
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      OptionalLong optionalLong0 = OptionalLong.of((-4039787218696275595L));
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setDistinctValuesCount(optionalLong0);
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Optional<LocalDate> optional0 = Optional.of(localDate0);
      OptionalLong optionalLong0 = OptionalLong.of((-3425L));
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDateColumnStatistics(optional0, optional0, optionalLong0, optionalLong0);
      OptionalLong optionalLong1 = hiveColumnStatistics0.getNullsCount();
      assertSame(optionalLong1, optionalLong0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createBinaryColumnStatistics(optionalLong0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics1.equals(hiveColumnStatistics0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of((-3425L));
      OptionalLong optionalLong1 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createStringColumnStatistics(optionalLong0, optionalLong0, optionalLong0, optionalLong0);
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createBinaryColumnStatistics(optionalLong0, optionalLong0, optionalLong1);
      boolean boolean0 = hiveColumnStatistics1.equals(hiveColumnStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of((-3425L));
      OptionalLong optionalLong1 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createBinaryColumnStatistics(optionalLong1, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics1.equals(hiveColumnStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of((-3425L));
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createBinaryColumnStatistics(optionalLong0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics1.equals(hiveColumnStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of((-3425L));
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createBooleanColumnStatistics(optionalLong0, optionalLong0, optionalLong0);
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createBinaryColumnStatistics(optionalLong0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics1.equals(hiveColumnStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      OptionalLong optionalLong0 = OptionalLong.of(0L);
      HiveColumnStatistics hiveColumnStatistics0 = hiveColumnStatistics_Builder0.build();
      OptionalDouble optionalDouble0 = OptionalDouble.empty();
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createDoubleColumnStatistics(optionalDouble0, optionalDouble0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics0.equals(hiveColumnStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      OptionalLong optionalLong0 = OptionalLong.of(0L);
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createIntegerColumnStatistics(optionalLong0, optionalLong0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics0.equals(hiveColumnStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of(18L);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createBinaryColumnStatistics(optionalLong0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics0.equals(optionalLong0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      boolean boolean0 = hiveColumnStatistics0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Optional<LocalDate> optional0 = Optional.of(localDate0);
      OptionalLong optionalLong0 = OptionalLong.of((-3425L));
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDateColumnStatistics(optional0, optional0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics0.equals(hiveColumnStatistics0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OptionalDouble optionalDouble0 = OptionalDouble.of(0.0);
      OptionalLong optionalLong0 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDoubleColumnStatistics(optionalDouble0, optionalDouble0, optionalLong0, optionalLong0);
      hiveColumnStatistics0.hashCode();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of((-3425L));
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createStringColumnStatistics(optionalLong0, optionalLong0, optionalLong0, optionalLong0);
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createBinaryColumnStatistics(optionalLong0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics1.equals(hiveColumnStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      HiveColumnStatistics hiveColumnStatistics0 = hiveColumnStatistics_Builder0.build();
      String string0 = hiveColumnStatistics0.toString();
      assertEquals("HiveColumnStatistics{integerStatistics=Optional.empty, doubleStatistics=Optional.empty, decimalStatistics=Optional.empty, dateStatistics=Optional.empty, booleanStatistics=Optional.empty, maxValueSizeInBytes=OptionalLong.empty, totalSizeInBytes=OptionalLong.empty, nullsCount=OptionalLong.empty, distinctValuesCount=OptionalLong.empty}", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setMaxValueSizeInBytes(2934L);
      assertSame(hiveColumnStatistics_Builder1, hiveColumnStatistics_Builder0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      OptionalLong optionalLong0 = OptionalLong.empty();
      BooleanStatistics booleanStatistics0 = new BooleanStatistics(optionalLong0, optionalLong0);
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setBooleanStatistics(booleanStatistics0);
      Optional<LocalDate> optional0 = Optional.empty();
      DateStatistics dateStatistics0 = new DateStatistics(optional0, optional0);
      hiveColumnStatistics_Builder1.setDateStatistics(dateStatistics0);
      // Undeclared exception!
      try { 
        hiveColumnStatistics_Builder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multiple type specific statistic objects are present: [dateStatistics, booleanStatistics]
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createIntegerColumnStatistics(optionalLong0, optionalLong0, optionalLong0, optionalLong0);
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder(hiveColumnStatistics0);
      IntegerStatistics integerStatistics0 = new IntegerStatistics(optionalLong0, optionalLong0);
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setIntegerStatistics(integerStatistics0);
      assertSame(hiveColumnStatistics_Builder1, hiveColumnStatistics_Builder0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      OptionalLong optionalLong0 = OptionalLong.empty();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setMaxValueSizeInBytes(optionalLong0);
      assertSame(hiveColumnStatistics_Builder1, hiveColumnStatistics_Builder0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      Optional<DoubleStatistics> optional0 = Optional.empty();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setDoubleStatistics(optional0);
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      OptionalLong optionalLong0 = OptionalLong.empty();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setTotalSizeInBytes(optionalLong0);
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder(hiveColumnStatistics0);
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setNullsCount((-1820L));
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      Optional<DecimalStatistics> optional0 = Optional.empty();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setDecimalStatistics(optional0);
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      OptionalLong optionalLong0 = OptionalLong.of((-1820L));
      BooleanStatistics booleanStatistics0 = new BooleanStatistics(optionalLong0, optionalLong0);
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.empty();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder(hiveColumnStatistics0);
      Optional<BooleanStatistics> optional0 = Optional.of(booleanStatistics0);
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setBooleanStatistics(optional0);
      assertSame(hiveColumnStatistics_Builder1, hiveColumnStatistics_Builder0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setDistinctValuesCount(2934L);
      assertSame(hiveColumnStatistics_Builder1, hiveColumnStatistics_Builder0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      OptionalDouble optionalDouble0 = OptionalDouble.of(0.0);
      OptionalLong optionalLong0 = OptionalLong.empty();
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDoubleColumnStatistics(optionalDouble0, optionalDouble0, optionalLong0, optionalLong0);
      Optional<DateStatistics> optional0 = hiveColumnStatistics0.getDateStatistics();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setDateStatistics(optional0);
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      Optional<LocalDate> optional0 = Optional.of(localDate0);
      OptionalLong optionalLong0 = OptionalLong.of((-3425L));
      HiveColumnStatistics hiveColumnStatistics0 = HiveColumnStatistics.createDateColumnStatistics(optional0, optional0, optionalLong0, optionalLong0);
      HiveColumnStatistics hiveColumnStatistics1 = HiveColumnStatistics.createStringColumnStatistics(optionalLong0, optionalLong0, optionalLong0, optionalLong0);
      boolean boolean0 = hiveColumnStatistics0.equals(hiveColumnStatistics1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      Optional<IntegerStatistics> optional0 = Optional.empty();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setIntegerStatistics(optional0);
      assertSame(hiveColumnStatistics_Builder1, hiveColumnStatistics_Builder0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder0 = HiveColumnStatistics.builder();
      HiveColumnStatistics.Builder hiveColumnStatistics_Builder1 = hiveColumnStatistics_Builder0.setTotalSizeInBytes((-1L));
      assertSame(hiveColumnStatistics_Builder0, hiveColumnStatistics_Builder1);
  }
}
