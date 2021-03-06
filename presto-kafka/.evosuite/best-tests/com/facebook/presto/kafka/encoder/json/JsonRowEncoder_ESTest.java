/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 00:22:10 GMT 2021
 */

package com.facebook.presto.kafka.encoder.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.kafka.encoder.EncoderColumnHandle;
import com.facebook.presto.kafka.encoder.json.JsonRowEncoder;
import com.facebook.presto.spi.ConnectorSession;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonRowEncoder_ESTest extends JsonRowEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConnectorSession connectorSession0 = mock(ConnectorSession.class, new ViolatedAssumptionAnswer());
      ObjectMapper objectMapper0 = mock(ObjectMapper.class, new ViolatedAssumptionAnswer());
      JsonRowEncoder jsonRowEncoder0 = null;
      try {
        jsonRowEncoder0 = new JsonRowEncoder(connectorSession0, (List<EncoderColumnHandle>) null, objectMapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // columnHandles is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
