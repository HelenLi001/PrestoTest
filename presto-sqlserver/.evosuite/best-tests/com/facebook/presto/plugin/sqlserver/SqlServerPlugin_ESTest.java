/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 09:34:49 GMT 2021
 */

package com.facebook.presto.plugin.sqlserver;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.plugin.sqlserver.SqlServerPlugin;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlServerPlugin_ESTest extends SqlServerPlugin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SqlServerPlugin sqlServerPlugin0 = new SqlServerPlugin();
  }
}
