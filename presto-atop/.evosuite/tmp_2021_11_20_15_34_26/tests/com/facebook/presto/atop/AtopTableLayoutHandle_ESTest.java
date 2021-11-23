/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 23:40:42 GMT 2021
 */

package com.facebook.presto.atop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.atop.AtopTable;
import com.facebook.presto.atop.AtopTableHandle;
import com.facebook.presto.atop.AtopTableLayoutHandle;
import com.facebook.presto.common.predicate.Domain;
import com.facebook.presto.common.predicate.ValueSet;
import com.facebook.presto.common.type.TimeType;
import com.facebook.presto.common.type.TimestampWithTimeZoneType;
import com.facebook.presto.common.type.VarbinaryType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AtopTableLayoutHandle_ESTest extends AtopTableLayoutHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("", atopTable0);
      TimestampWithTimeZoneType timestampWithTimeZoneType0 = TimestampWithTimeZoneType.TIMESTAMP_WITH_TIME_ZONE;
      ValueSet valueSet0 = ValueSet.all(timestampWithTimeZoneType0);
      Domain domain0 = Domain.create(valueSet0, true);
      Domain domain1 = domain0.subtract(domain0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain1, domain0);
      Domain domain2 = atopTableLayoutHandle0.getStartTimeConstraint();
      assertFalse(domain2.isNullAllowed());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("B];`8bbtekfc", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.all(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      Domain domain1 = atopTableLayoutHandle0.getStartTimeConstraint();
      assertTrue(domain1.isNullAllowed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.DISKS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("", atopTable0);
      VarbinaryType varbinaryType0 = VarbinaryType.VARBINARY;
      Domain domain0 = Domain.onlyNull(varbinaryType0);
      Domain domain1 = Domain.none(varbinaryType0);
      Domain domain2 = domain0.intersect(domain1);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain2, domain2);
      Domain domain3 = atopTableLayoutHandle0.getEndTimeConstraint();
      assertNotSame(domain1, domain3);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("", atopTable0);
      TimestampWithTimeZoneType timestampWithTimeZoneType0 = TimestampWithTimeZoneType.TIMESTAMP_WITH_TIME_ZONE;
      ValueSet valueSet0 = ValueSet.all(timestampWithTimeZoneType0);
      Domain domain0 = Domain.create(valueSet0, true);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      Domain domain1 = atopTableLayoutHandle0.getEndTimeConstraint();
      assertSame(domain0, domain1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VarbinaryType varbinaryType0 = VarbinaryType.VARBINARY;
      Domain domain0 = Domain.notNull(varbinaryType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = null;
      try {
        atopTableLayoutHandle0 = new AtopTableLayoutHandle((AtopTableHandle) null, domain0, domain0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // tableHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      Domain domain1 = domain0.complement();
      AtopTableLayoutHandle atopTableLayoutHandle1 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain1);
      boolean boolean0 = atopTableLayoutHandle0.equals(atopTableLayoutHandle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      Domain domain1 = domain0.subtract(domain0);
      AtopTableLayoutHandle atopTableLayoutHandle1 = new AtopTableLayoutHandle(atopTableHandle0, domain1, domain0);
      boolean boolean0 = atopTableLayoutHandle0.equals(atopTableLayoutHandle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      AtopTableHandle atopTableHandle1 = new AtopTableHandle("AtopTableLayoutHandle{tableHandle=:REBOOTS, startTimeConstraint=com.facebook.presto.common.predicate.Domain@c51, endTimeConstraint=com.facebook.presto.common.predicate.Domain@c51}", atopTable0);
      AtopTableLayoutHandle atopTableLayoutHandle1 = new AtopTableLayoutHandle(atopTableHandle1, domain0, domain0);
      boolean boolean0 = atopTableLayoutHandle0.equals(atopTableLayoutHandle1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      AtopTableLayoutHandle atopTableLayoutHandle1 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      boolean boolean0 = atopTableLayoutHandle0.equals(atopTableLayoutHandle1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      boolean boolean0 = atopTableLayoutHandle0.equals("AtopTableLayoutHandle{tableHandle=A:REBOOTS, startTimeConstraint=com.facebook.presto.common.predicate.Domain@c51, endTimeConstraint=com.facebook.presto.common.predicate.Domain@c51}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      boolean boolean0 = atopTableLayoutHandle0.equals(atopTableLayoutHandle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      boolean boolean0 = atopTableLayoutHandle0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      atopTableLayoutHandle0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      Domain domain1 = atopTableLayoutHandle0.getEndTimeConstraint();
      assertFalse(domain1.isNone());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      AtopTableHandle atopTableHandle1 = atopTableLayoutHandle0.getTableHandle();
      assertEquals("A", atopTableHandle1.getSchema());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.REBOOTS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("A", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      String string0 = atopTableLayoutHandle0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AtopTable atopTable0 = AtopTable.DISKS;
      AtopTableHandle atopTableHandle0 = new AtopTableHandle("", atopTable0);
      TimeType timeType0 = TimeType.TIME;
      Domain domain0 = Domain.onlyNull(timeType0);
      AtopTableLayoutHandle atopTableLayoutHandle0 = new AtopTableLayoutHandle(atopTableHandle0, domain0, domain0);
      Domain domain1 = atopTableLayoutHandle0.getStartTimeConstraint();
      assertTrue(domain1.isNullAllowed());
  }
}
