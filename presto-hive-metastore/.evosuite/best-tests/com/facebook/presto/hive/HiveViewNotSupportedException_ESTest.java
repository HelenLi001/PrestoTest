/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 21:59:58 GMT 2021
 */

package com.facebook.presto.hive;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.hive.HiveViewNotSupportedException;
import com.facebook.presto.spi.SchemaTableName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HiveViewNotSupportedException_ESTest extends HiveViewNotSupportedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HiveViewNotSupportedException hiveViewNotSupportedException0 = new HiveViewNotSupportedException((SchemaTableName) null, "Hive views are not supported: '%s'");
      SchemaTableName schemaTableName0 = hiveViewNotSupportedException0.getTableName();
      assertNull(schemaTableName0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SchemaTableName schemaTableName0 = new SchemaTableName("P`D6", "P`D6");
      HiveViewNotSupportedException hiveViewNotSupportedException0 = new HiveViewNotSupportedException(schemaTableName0);
      SchemaTableName schemaTableName1 = hiveViewNotSupportedException0.getTableName();
      assertEquals("p`d6", schemaTableName1.getTableName());
  }
}
