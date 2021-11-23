/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 08:24:38 GMT 2021
 */

package com.facebook.presto.druid;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.BooleanType;
import com.facebook.presto.druid.DruidPushdownUtils;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.plan.AggregationNode;
import com.facebook.presto.spi.relation.ConstantExpression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DruidPushdownUtils_ESTest extends DruidPushdownUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        DruidPushdownUtils.getLiteralAsString(connectorSession0, (ConstantExpression) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.DruidPushdownUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        DruidPushdownUtils.computeAggregationNodes((AggregationNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.druid.DruidPushdownUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanType booleanType0 = BooleanType.BOOLEAN;
      ConstantExpression constantExpression0 = new ConstantExpression((Object) null, booleanType0);
      // Undeclared exception!
      try { 
        DruidPushdownUtils.getLiteralAsString((ConnectorSession) null, constantExpression0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null constant expression: null with value of type: boolean
         //
         verifyException("com.facebook.presto.druid.DruidPushdownUtils", e);
      }
  }
}
