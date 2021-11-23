/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 17:38:16 GMT 2021
 */

package com.facebook.presto.resourceGroups;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.resourceGroups.SelectorResourceEstimate;
import com.facebook.presto.spi.session.ResourceEstimates;
import io.airlift.units.DataSize;
import io.airlift.units.Duration;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectorResourceEstimate_ESTest extends SelectorResourceEstimate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optional<SelectorResourceEstimate.Range<Duration>> optional0 = Optional.ofNullable((SelectorResourceEstimate.Range<Duration>) null);
      SelectorResourceEstimate selectorResourceEstimate0 = null;
      try {
        selectorResourceEstimate0 = new SelectorResourceEstimate(optional0, optional0, (Optional<SelectorResourceEstimate.Range<DataSize>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // peakMemory is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataSize dataSize0 = mock(DataSize.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dataSize0).toString();
      Optional<DataSize> optional0 = Optional.ofNullable(dataSize0);
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<DataSize>(optional0, optional0);
      Optional<DataSize> optional1 = selectorResourceEstimate_Range0.getMin();
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range1 = new SelectorResourceEstimate.Range<DataSize>(optional0, optional1);
      Optional<SelectorResourceEstimate.Range<Duration>> optional2 = Optional.empty();
      Optional<SelectorResourceEstimate.Range<DataSize>> optional3 = Optional.ofNullable(selectorResourceEstimate_Range1);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional2, optional2, optional3);
      selectorResourceEstimate0.hashCode();
      ResourceEstimates resourceEstimates0 = mock(ResourceEstimates.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(resourceEstimates0).getPeakMemory();
      // Undeclared exception!
      try { 
        selectorResourceEstimate0.match(resourceEstimates0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.resourceGroups.SelectorResourceEstimate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      doReturn((-1296), 1967, 0, 0).when(duration0).compareTo(any(io.airlift.units.Duration.class));
      Optional<Duration> optional0 = Optional.of(duration0);
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).test(any());
      optional0.filter(predicate0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      selectorResourceEstimate_Range0.equals(optional0);
      Integer integer0 = new Integer((-373));
      Optional<Integer> optional1 = Optional.of(integer0);
      Supplier<Throwable> supplier0 = (Supplier<Throwable>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      optional1.orElseThrow((Supplier<? extends Throwable>) supplier0);
      SelectorResourceEstimate.Range<Integer> selectorResourceEstimate_Range1 = new SelectorResourceEstimate.Range<Integer>(optional1, optional1);
      selectorResourceEstimate_Range1.equals(selectorResourceEstimate_Range0);
      selectorResourceEstimate_Range1.toString();
      selectorResourceEstimate_Range1.toString();
      Optional<String> optional2 = Optional.empty();
      Function<String, String> function0 = (Function<String, String>) mock(Function.class, new ViolatedAssumptionAnswer());
      Optional<String> optional3 = optional2.map((Function<? super String, ? extends String>) function0);
      SelectorResourceEstimate.Range<String> selectorResourceEstimate_Range2 = new SelectorResourceEstimate.Range<String>(optional3, optional2);
      selectorResourceEstimate_Range2.toString();
      selectorResourceEstimate_Range2.toString();
      selectorResourceEstimate_Range2.getMin();
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range3 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      Optional<SelectorResourceEstimate.Range<Duration>> optional4 = Optional.of(selectorResourceEstimate_Range3);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional5 = Optional.ofNullable((SelectorResourceEstimate.Range<DataSize>) null);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional4, optional4, optional5);
      Duration duration1 = mock(Duration.class, new ViolatedAssumptionAnswer());
      Optional<Duration> optional6 = Optional.of(duration1);
      optional6.get();
      ResourceEstimates resourceEstimates0 = mock(ResourceEstimates.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(resourceEstimates0).getCpuTime();
      doReturn(optional6).when(resourceEstimates0).getExecutionTime();
      selectorResourceEstimate0.match(resourceEstimates0);
      ResourceEstimates resourceEstimates1 = mock(ResourceEstimates.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(resourceEstimates1).getExecutionTime();
      // Undeclared exception!
      try { 
        selectorResourceEstimate0.match(resourceEstimates1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.resourceGroups.SelectorResourceEstimate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optional<SelectorResourceEstimate.Range<Duration>> optional0 = Optional.empty();
      DataSize dataSize0 = mock(DataSize.class, new ViolatedAssumptionAnswer());
      Optional<DataSize> optional1 = Optional.ofNullable(dataSize0);
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<DataSize>(optional1, optional1);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.of(selectorResourceEstimate_Range0);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional0, optional0, optional2);
      Optional<SelectorResourceEstimate.Range<Duration>> optional3 = selectorResourceEstimate0.getCpuTime();
      assertSame(optional3, optional0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optional<SelectorResourceEstimate.Range<Duration>> optional0 = Optional.empty();
      DataSize dataSize0 = mock(DataSize.class, new ViolatedAssumptionAnswer());
      doReturn("com.facebook.presto.resourceGroups.SelectorResourceEstimate", "").when(dataSize0).toString();
      Optional<DataSize> optional1 = Optional.ofNullable(dataSize0);
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<DataSize>(optional1, optional1);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.of(selectorResourceEstimate_Range0);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional0, optional0, optional2);
      String string0 = selectorResourceEstimate0.toString();
      assertEquals("SelectorResourceEstimate{executionTime=Optional.empty, cpuTime=Optional.empty, peakMemory=Optional[Range{min=Optional[com.facebook.presto.resourceGroups.SelectorResourceEstimate], max=Optional[]}]}", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optional<String> optional0 = Optional.ofNullable("cpuTime");
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).test(any());
      Optional<String> optional1 = optional0.filter(predicate0);
      SelectorResourceEstimate.Range<String> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<String>(optional1, optional1);
      SelectorResourceEstimate.Range<String> selectorResourceEstimate_Range1 = new SelectorResourceEstimate.Range<String>(optional1, optional0);
      boolean boolean0 = selectorResourceEstimate_Range0.equals(selectorResourceEstimate_Range1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      Optional<Duration> optional0 = Optional.of(duration0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range1 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      boolean boolean0 = selectorResourceEstimate_Range0.equals(selectorResourceEstimate_Range1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-373));
      Optional<Integer> optional0 = Optional.of(integer0);
      SelectorResourceEstimate.Range<Integer> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Integer>(optional0, optional0);
      boolean boolean0 = selectorResourceEstimate_Range0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      Optional<Duration> optional0 = Optional.of(duration0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      boolean boolean0 = selectorResourceEstimate_Range0.equals(selectorResourceEstimate_Range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Optional<String> optional0 = Optional.empty();
      Optional<String> optional1 = Optional.of("");
      SelectorResourceEstimate.Range<String> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<String>(optional0, optional1);
      boolean boolean0 = selectorResourceEstimate_Range0.contains("g&bZq?d5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Optional<Duration> optional0 = Optional.empty();
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = selectorResourceEstimate_Range0.contains(duration0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      Optional<Duration> optional0 = Optional.of(duration0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      Optional<SelectorResourceEstimate.Range<Duration>> optional1 = Optional.ofNullable(selectorResourceEstimate_Range0);
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).test(any());
      Optional<SelectorResourceEstimate.Range<Duration>> optional2 = optional1.filter(predicate0);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional3 = Optional.empty();
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional2, optional1, optional3);
      SelectorResourceEstimate selectorResourceEstimate1 = new SelectorResourceEstimate(optional1, optional2, optional3);
      boolean boolean0 = selectorResourceEstimate0.equals(selectorResourceEstimate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optional<SelectorResourceEstimate.Range<Duration>> optional0 = Optional.empty();
      DataSize dataSize0 = mock(DataSize.class, new ViolatedAssumptionAnswer());
      Optional<DataSize> optional1 = Optional.ofNullable(dataSize0);
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<DataSize>(optional1, optional1);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.of(selectorResourceEstimate_Range0);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional0, optional0, optional2);
      SelectorResourceEstimate selectorResourceEstimate1 = new SelectorResourceEstimate(optional0, optional0, optional2);
      boolean boolean0 = selectorResourceEstimate0.equals(selectorResourceEstimate1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      Optional<Duration> optional0 = Optional.of(duration0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      Optional<SelectorResourceEstimate.Range<Duration>> optional1 = Optional.of(selectorResourceEstimate_Range0);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.ofNullable((SelectorResourceEstimate.Range<DataSize>) null);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional1, optional1, optional2);
      boolean boolean0 = selectorResourceEstimate0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optional<SelectorResourceEstimate.Range<Duration>> optional0 = Optional.empty();
      DataSize dataSize0 = mock(DataSize.class, new ViolatedAssumptionAnswer());
      Optional<DataSize> optional1 = Optional.ofNullable(dataSize0);
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<DataSize>(optional1, optional1);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.of(selectorResourceEstimate_Range0);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional0, optional0, optional2);
      boolean boolean0 = selectorResourceEstimate0.equals(selectorResourceEstimate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      Optional<Duration> optional0 = Optional.of(duration0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      Optional<SelectorResourceEstimate.Range<Duration>> optional1 = Optional.of(selectorResourceEstimate_Range0);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.ofNullable((SelectorResourceEstimate.Range<DataSize>) null);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional1, optional1, optional2);
      boolean boolean0 = selectorResourceEstimate0.equals(optional0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DataSize dataSize0 = mock(DataSize.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(dataSize0).compareTo(any(io.airlift.units.DataSize.class));
      Optional<DataSize> optional0 = Optional.ofNullable(dataSize0);
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<DataSize>(optional0, optional0);
      Optional<SelectorResourceEstimate.Range<Duration>> optional1 = Optional.empty();
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.ofNullable(selectorResourceEstimate_Range0);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional1, optional1, optional2);
      ResourceEstimates resourceEstimates0 = mock(ResourceEstimates.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(resourceEstimates0).getPeakMemory();
      boolean boolean0 = selectorResourceEstimate0.match(resourceEstimates0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Optional<SelectorResourceEstimate.Range<Duration>> optional0 = Optional.empty();
      DataSize dataSize0 = mock(DataSize.class, new ViolatedAssumptionAnswer());
      doReturn(1745).when(dataSize0).compareTo(any(io.airlift.units.DataSize.class));
      Optional<DataSize> optional1 = Optional.of(dataSize0);
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<DataSize>(optional1, optional1);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.ofNullable(selectorResourceEstimate_Range0);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional0, optional0, optional2);
      ResourceEstimates resourceEstimates0 = mock(ResourceEstimates.class, new ViolatedAssumptionAnswer());
      doReturn(optional1).when(resourceEstimates0).getPeakMemory();
      boolean boolean0 = selectorResourceEstimate0.match(resourceEstimates0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      doReturn(700).when(duration0).compareTo(any(io.airlift.units.Duration.class));
      Optional<Duration> optional0 = Optional.of(duration0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      Optional<SelectorResourceEstimate.Range<Duration>> optional1 = Optional.of(selectorResourceEstimate_Range0);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.ofNullable((SelectorResourceEstimate.Range<DataSize>) null);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional1, optional1, optional2);
      ResourceEstimates resourceEstimates0 = mock(ResourceEstimates.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(resourceEstimates0).getExecutionTime();
      boolean boolean0 = selectorResourceEstimate0.match(resourceEstimates0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      doReturn("executionTime", "executionTime").when(duration0).toString();
      Optional<Duration> optional0 = Optional.of(duration0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      Optional<SelectorResourceEstimate.Range<Duration>> optional1 = Optional.of(selectorResourceEstimate_Range0);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.ofNullable((SelectorResourceEstimate.Range<DataSize>) null);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional1, optional1, optional2);
      Optional<SelectorResourceEstimate.Range<Duration>> optional3 = selectorResourceEstimate0.getExecutionTime();
      assertSame(optional3, optional1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = mock(Duration.class, new ViolatedAssumptionAnswer());
      Optional<Duration> optional0 = Optional.of(duration0);
      SelectorResourceEstimate.Range<Duration> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<Duration>(optional0, optional0);
      Optional<SelectorResourceEstimate.Range<Duration>> optional1 = Optional.of(selectorResourceEstimate_Range0);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional2 = Optional.ofNullable((SelectorResourceEstimate.Range<DataSize>) null);
      SelectorResourceEstimate selectorResourceEstimate0 = new SelectorResourceEstimate(optional1, optional1, optional2);
      Optional<SelectorResourceEstimate.Range<DataSize>> optional3 = selectorResourceEstimate0.getPeakMemory();
      assertSame(optional3, optional2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataSize dataSize0 = mock(DataSize.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dataSize0).toString();
      Optional<DataSize> optional0 = Optional.ofNullable(dataSize0);
      SelectorResourceEstimate.Range<DataSize> selectorResourceEstimate_Range0 = new SelectorResourceEstimate.Range<DataSize>(optional0, optional0);
      Optional<DataSize> optional1 = selectorResourceEstimate_Range0.getMax();
      assertSame(optional1, optional0);
  }
}
