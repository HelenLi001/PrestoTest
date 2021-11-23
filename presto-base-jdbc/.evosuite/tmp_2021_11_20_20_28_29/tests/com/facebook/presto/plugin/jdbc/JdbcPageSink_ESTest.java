/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 04:39:19 GMT 2021
 */

package com.facebook.presto.plugin.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.plugin.jdbc.JdbcClient;
import com.facebook.presto.plugin.jdbc.JdbcOutputTableHandle;
import com.facebook.presto.plugin.jdbc.JdbcPageSink;
import com.facebook.presto.spi.ConnectorSession;
import com.facebook.presto.spi.security.ConnectorIdentity;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JdbcPageSink_ESTest extends JdbcPageSink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConnectorIdentity connectorIdentity0 = mock(ConnectorIdentity.class, new ViolatedAssumptionAnswer());
      doReturn("Min=}!fpM@HrN").when(connectorIdentity0).getUser();
      ConnectorIdentity connectorIdentity1 = mock(ConnectorIdentity.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(connectorIdentity1).getExtraCredentials();
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      doReturn(connectorIdentity0, connectorIdentity1).when(connectorSession0).getIdentity();
      JdbcClient jdbcClient0 = mock(JdbcClient.class, new ViolatedAssumptionAnswer());
      JdbcPageSink jdbcPageSink0 = null;
      try {
        jdbcPageSink0 = new JdbcPageSink(connectorSession0, (JdbcOutputTableHandle) null, jdbcClient0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // extraCredentials is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
