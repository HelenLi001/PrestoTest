/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 03:58:02 GMT 2021
 */

package com.facebook.presto.localfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.localfile.DataLocation;
import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.regex.PatternSyntaxException;
import org.apache.bval.util.Lazy;
import org.apache.bval.util.ObjectWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataLocation_ESTest extends DataLocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optional<String> optional0 = Optional.empty();
      DataLocation dataLocation0 = new DataLocation("", optional0);
      File file0 = dataLocation0.getLocation();
      assertEquals(0L, file0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optional<String> optional0 = Optional.of("^f]P7gL[yv_");
      DataLocation dataLocation0 = new DataLocation("", optional0);
      // Undeclared exception!
      try { 
        dataLocation0.files();
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optional<String> optional0 = Optional.ofNullable((String) null);
      DataLocation dataLocation0 = null;
      try {
        dataLocation0 = new DataLocation((String) null, optional0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // location is null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectWrapper<String> objectWrapper0 = new ObjectWrapper<String>("");
      Optional<String> optional0 = objectWrapper0.optional();
      DataLocation dataLocation0 = new DataLocation("", optional0);
      // Undeclared exception!
      try { 
        dataLocation0.files();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No matching files found in directory: 
         //
         verifyException("com.facebook.presto.localfile.DataLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optional<String> optional0 = Optional.empty();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(";b");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ";b");
      DataLocation dataLocation0 = new DataLocation(";b", optional0);
      List<File> list0 = dataLocation0.files();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optional<String> optional0 = Optional.empty();
      DataLocation dataLocation0 = new DataLocation("", optional0);
      List<File> list0 = dataLocation0.files();
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("+27@&O3");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ObjectWrapper<String> objectWrapper0 = new ObjectWrapper<String>();
      Lazy<String> lazy0 = new Lazy<String>(objectWrapper0);
      Lazy<String> lazy1 = lazy0.reset("*");
      Optional<String> optional0 = lazy1.optional();
      DataLocation dataLocation0 = null;
      try {
        dataLocation0 = new DataLocation("+27@&O3/", optional0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pattern may be specified only if location is a directory
         //
         verifyException("com.facebook.presto.localfile.DataLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Optional<String> optional0 = Optional.of("");
      DataLocation dataLocation0 = new DataLocation("*", optional0);
      // Undeclared exception!
      try { 
        dataLocation0.files();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error listing files in directory: *
         //
         verifyException("com.facebook.presto.localfile.DataLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectWrapper<String> objectWrapper0 = new ObjectWrapper<String>("/K.Re8JJ#_kq");
      Lazy<String> lazy0 = new Lazy<String>(objectWrapper0);
      Optional<String> optional0 = lazy0.optional();
      DataLocation dataLocation0 = null;
      try {
        dataLocation0 = new DataLocation("/K.Re8JJ#_kq", optional0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // location does not exist
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Optional<String> optional0 = Optional.empty();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(";b");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ";b");
      DataLocation dataLocation0 = new DataLocation(";b", optional0);
      Optional<String> optional1 = dataLocation0.getPattern();
      assertSame(optional1, optional0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Optional<String> optional0 = Optional.empty();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(";b");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ";b");
      DataLocation dataLocation0 = new DataLocation(";b", optional0);
      File file0 = dataLocation0.getLocation();
      assertEquals(0L, file0.getUsableSpace());
  }
}
