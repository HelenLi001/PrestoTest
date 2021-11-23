/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 23:59:21 GMT 2021
 */

package com.facebook.presto.connector.jmx;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.predicate.TupleDomain;
import com.facebook.presto.connector.jmx.JmxTableHandle;
import com.facebook.presto.connector.jmx.JmxTableLayoutHandle;
import com.facebook.presto.spi.ColumnHandle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JmxTableLayoutHandle_ESTest extends JmxTableLayoutHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JmxTableHandle jmxTableHandle0 = mock(JmxTableHandle.class, new ViolatedAssumptionAnswer());
      doReturn("D|)hha^XItk8i 0U%", "D|)hha^XItk8i 0U%", "izc6&Gpm{xoOD", (String) null).when(jmxTableHandle0).toString();
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      JmxTableLayoutHandle jmxTableLayoutHandle0 = new JmxTableLayoutHandle(jmxTableHandle0, tupleDomain0);
      jmxTableLayoutHandle0.toString();
      jmxTableLayoutHandle0.getTable();
      jmxTableLayoutHandle0.toString();
      String string0 = jmxTableLayoutHandle0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JmxTableHandle jmxTableHandle0 = mock(JmxTableHandle.class, new ViolatedAssumptionAnswer());
      doReturn("").when(jmxTableHandle0).toString();
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      JmxTableLayoutHandle jmxTableLayoutHandle0 = new JmxTableLayoutHandle(jmxTableHandle0, tupleDomain0);
      String string0 = jmxTableLayoutHandle0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JmxTableHandle jmxTableHandle0 = mock(JmxTableHandle.class, new ViolatedAssumptionAnswer());
      JmxTableLayoutHandle jmxTableLayoutHandle0 = null;
      try {
        jmxTableLayoutHandle0 = new JmxTableLayoutHandle(jmxTableHandle0, (TupleDomain<ColumnHandle>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // constraint is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JmxTableHandle jmxTableHandle0 = mock(JmxTableHandle.class, new ViolatedAssumptionAnswer());
      TupleDomain<ColumnHandle> tupleDomain0 = (TupleDomain<ColumnHandle>) mock(TupleDomain.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tupleDomain0).toString();
      JmxTableLayoutHandle jmxTableLayoutHandle0 = new JmxTableLayoutHandle(jmxTableHandle0, tupleDomain0);
      TupleDomain<ColumnHandle> tupleDomain1 = jmxTableLayoutHandle0.getConstraint();
      assertSame(tupleDomain1, tupleDomain0);
  }
}
