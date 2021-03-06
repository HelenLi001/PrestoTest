/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 10:03:21 GMT 2021
 */

package com.facebook.presto.functionNamespace.execution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.functionNamespace.execution.SqlFunctionExecutors;
import com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor;
import com.facebook.presto.spi.function.FunctionImplementationType;
import com.facebook.presto.spi.function.RoutineCharacteristics;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlFunctionExecutors_ESTest extends SqlFunctionExecutors_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThriftSqlFunctionExecutor thriftSqlFunctionExecutor0 = mock(ThriftSqlFunctionExecutor.class, new ViolatedAssumptionAnswer());
      SqlFunctionExecutors sqlFunctionExecutors0 = null;
      try {
        sqlFunctionExecutors0 = new SqlFunctionExecutors((Map<RoutineCharacteristics.Language, FunctionImplementationType>) null, thriftSqlFunctionExecutor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // supportedLanguages is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
