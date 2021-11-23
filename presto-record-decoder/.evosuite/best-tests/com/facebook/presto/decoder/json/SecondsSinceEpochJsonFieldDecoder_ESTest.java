/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 18:04:53 GMT 2021
 */

package com.facebook.presto.decoder.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.decoder.DecoderColumnHandle;
import com.facebook.presto.decoder.json.SecondsSinceEpochJsonFieldDecoder;
import com.fasterxml.jackson.databind.JsonNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SecondsSinceEpochJsonFieldDecoder_ESTest extends SecondsSinceEpochJsonFieldDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SecondsSinceEpochJsonFieldDecoder secondsSinceEpochJsonFieldDecoder0 = null;
      try {
        secondsSinceEpochJsonFieldDecoder0 = new SecondsSinceEpochJsonFieldDecoder((DecoderColumnHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // columnHandle is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SecondsSinceEpochJsonFieldDecoder.SecondsSinceEpochJsonValueProvider secondsSinceEpochJsonFieldDecoder_SecondsSinceEpochJsonValueProvider0 = new SecondsSinceEpochJsonFieldDecoder.SecondsSinceEpochJsonValueProvider((JsonNode) null, (DecoderColumnHandle) null);
      // Undeclared exception!
      try { 
        secondsSinceEpochJsonFieldDecoder_SecondsSinceEpochJsonValueProvider0.getMillis();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.decoder.json.SecondsSinceEpochJsonFieldDecoder$SecondsSinceEpochJsonValueProvider", e);
      }
  }
}
