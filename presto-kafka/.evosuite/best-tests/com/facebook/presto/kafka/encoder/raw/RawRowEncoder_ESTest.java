/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 00:11:21 GMT 2021
 */

package com.facebook.presto.kafka.encoder.raw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.kafka.encoder.EncoderColumnHandle;
import com.facebook.presto.kafka.encoder.raw.RawRowEncoder;
import com.facebook.presto.spi.ConnectorSession;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RawRowEncoder_ESTest extends RawRowEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<EncoderColumnHandle> arrayList0 = new ArrayList<EncoderColumnHandle>();
      RawRowEncoder rawRowEncoder0 = null;
      try {
        rawRowEncoder0 = new RawRowEncoder((ConnectorSession) null, arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // session is null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
