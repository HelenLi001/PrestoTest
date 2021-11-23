/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 19 06:33:16 GMT 2021
 */

package com.facebook.presto.spi.security;

import org.junit.Test;
import static org.junit.Assert.*;
import com.facebook.presto.spi.security.Privilege;
import com.facebook.presto.spi.security.PrivilegeInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrivilegeInfo_ESTest extends PrivilegeInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Privilege privilege0 = Privilege.DELETE;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, false);
      privilegeInfo0.isGrantOption();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo((Privilege) null, false);
      privilegeInfo0.getPrivilege();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Privilege privilege0 = Privilege.UPDATE;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, true);
      Privilege privilege1 = privilegeInfo0.getPrivilege();
      PrivilegeInfo privilegeInfo1 = new PrivilegeInfo(privilege1, false);
      privilegeInfo0.equals(privilegeInfo1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Privilege privilege0 = Privilege.UPDATE;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, true);
      Privilege privilege1 = Privilege.INSERT;
      PrivilegeInfo privilegeInfo1 = new PrivilegeInfo(privilege1, false);
      privilegeInfo0.equals(privilegeInfo1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Privilege privilege0 = Privilege.UPDATE;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, true);
      PrivilegeInfo privilegeInfo1 = new PrivilegeInfo(privilege0, true);
      privilegeInfo0.equals(privilegeInfo1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Privilege privilege0 = Privilege.UPDATE;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, true);
      privilegeInfo0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Privilege privilege0 = Privilege.SELECT;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, true);
      privilegeInfo0.equals(privilegeInfo0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Privilege privilege0 = Privilege.SELECT;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, true);
      privilegeInfo0.equals(privilege0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Privilege privilege0 = Privilege.SELECT;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, true);
      privilegeInfo0.isGrantOption();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Privilege privilege0 = Privilege.SELECT;
      PrivilegeInfo privilegeInfo0 = new PrivilegeInfo(privilege0, true);
      assertEquals(Privilege.SELECT, privilegeInfo0.getPrivilege());
      assertTrue(privilegeInfo0.isGrantOption());
      assertNotNull(privilegeInfo0);
      
      privilegeInfo0.hashCode();
      assertEquals(Privilege.SELECT, privilegeInfo0.getPrivilege());
      assertTrue(privilegeInfo0.isGrantOption());
  }
}
