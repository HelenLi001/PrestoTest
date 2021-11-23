/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 20 09:50:02 GMT 2021
 */

package com.facebook.presto.functionNamespace;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.CatalogSchemaName;
import com.facebook.presto.common.QualifiedObjectName;
import com.facebook.presto.common.block.BlockEncodingManager;
import com.facebook.presto.common.function.OperatorType;
import com.facebook.presto.common.type.TypeSignature;
import com.facebook.presto.common.type.TypeSignatureParameter;
import com.facebook.presto.common.type.UserDefinedType;
import com.facebook.presto.common.type.VarcharType;
import com.facebook.presto.functionNamespace.SqlInvokedFunctionNamespaceManagerConfig;
import com.facebook.presto.functionNamespace.UuidFunctionNamespaceTransactionHandle;
import com.facebook.presto.functionNamespace.execution.SqlFunctionExecutors;
import com.facebook.presto.functionNamespace.execution.thrift.ThriftSqlFunctionExecutor;
import com.facebook.presto.functionNamespace.testing.InMemoryFunctionNamespaceManager;
import com.facebook.presto.spi.function.FunctionHandle;
import com.facebook.presto.spi.function.FunctionImplementationType;
import com.facebook.presto.spi.function.FunctionKind;
import com.facebook.presto.spi.function.FunctionNamespaceTransactionHandle;
import com.facebook.presto.spi.function.Parameter;
import com.facebook.presto.spi.function.RoutineCharacteristics;
import com.facebook.presto.spi.function.Signature;
import com.facebook.presto.spi.function.SqlFunctionHandle;
import com.facebook.presto.spi.function.SqlFunctionId;
import com.facebook.presto.spi.function.SqlInvokedFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractSqlInvokedFunctionNamespaceManager_ESTest extends AbstractSqlInvokedFunctionNamespaceManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      BlockEncodingManager blockEncodingManager0 = new BlockEncodingManager();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      inMemoryFunctionNamespaceManager0.setBlockEncodingSerde(blockEncodingManager0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      OperatorType operatorType0 = OperatorType.NOT_EQUAL;
      QualifiedObjectName qualifiedObjectName0 = operatorType0.getFunctionName();
      Vector<TypeSignatureParameter> vector0 = new Vector<TypeSignatureParameter>();
      TypeSignature typeSignature0 = new TypeSignature("agVe/%", vector0);
      UserDefinedType userDefinedType0 = new UserDefinedType(qualifiedObjectName0, typeSignature0);
      inMemoryFunctionNamespaceManager0.addUserDefinedType(userDefinedType0);
      Optional<UserDefinedType> optional0 = inMemoryFunctionNamespaceManager0.getUserDefinedType(qualifiedObjectName0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      OperatorType operatorType0 = OperatorType.NOT_EQUAL;
      QualifiedObjectName qualifiedObjectName0 = operatorType0.getFunctionName();
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.getUserDefinedType(qualifiedObjectName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // CacheLoader returned null for key presto.default.$operator$not_equal.
         //
         verifyException("com.google.common.cache.LocalCache$Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.getUserDefinedType((QualifiedObjectName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.getScalarFunctionImplementation((FunctionHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.functionNamespace.AbstractSqlInvokedFunctionNamespaceManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      UuidFunctionNamespaceTransactionHandle uuidFunctionNamespaceTransactionHandle0 = UuidFunctionNamespaceTransactionHandle.valueOf("catalogName is null");
      Optional<UuidFunctionNamespaceTransactionHandle> optional0 = Optional.ofNullable(uuidFunctionNamespaceTransactionHandle0);
      QualifiedObjectName qualifiedObjectName0 = QualifiedObjectName.valueOf("", "", "");
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.getFunctions(optional0, qualifiedObjectName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.functionNamespace.AbstractSqlInvokedFunctionNamespaceManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.getFunctionMetadata((FunctionHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.functionNamespace.AbstractSqlInvokedFunctionNamespaceManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      CatalogSchemaName catalogSchemaName0 = new CatalogSchemaName("catalogName is null", ">");
      QualifiedObjectName qualifiedObjectName0 = QualifiedObjectName.valueOf(catalogSchemaName0, "E;F)?KH5jc)f]!x*k%");
      FunctionKind functionKind0 = FunctionKind.SCALAR;
      TypeSignature typeSignature0 = new TypeSignature(qualifiedObjectName0);
      List<TypeSignature> list0 = typeSignature0.getTypeParametersAsTypeSignatures();
      Signature signature0 = new Signature(qualifiedObjectName0, functionKind0, typeSignature0, list0);
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.getFunctionHandle((Optional<? extends FunctionNamespaceTransactionHandle>) null, signature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.functionNamespace.AbstractSqlInvokedFunctionNamespaceManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.commit((FunctionNamespaceTransactionHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catazlogPme is Vull", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.abort((FunctionNamespaceTransactionHandle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      QualifiedObjectName qualifiedObjectName0 = QualifiedObjectName.valueOf("", "", "");
      LinkedList<Parameter> linkedList0 = new LinkedList<Parameter>();
      RoutineCharacteristics.Language routineCharacteristics_Language0 = new RoutineCharacteristics.Language("catalogName is null");
      Optional<RoutineCharacteristics.Language> optional0 = Optional.ofNullable(routineCharacteristics_Language0);
      RoutineCharacteristics.Determinism routineCharacteristics_Determinism0 = RoutineCharacteristics.Determinism.DETERMINISTIC;
      Optional<RoutineCharacteristics.Determinism> optional1 = Optional.of(routineCharacteristics_Determinism0);
      Optional<RoutineCharacteristics.NullCallClause> optional2 = Optional.empty();
      RoutineCharacteristics routineCharacteristics0 = new RoutineCharacteristics(optional0, optional1, optional2);
      FunctionKind functionKind0 = FunctionKind.WINDOW;
      ArrayList<TypeSignatureParameter> arrayList0 = new ArrayList<TypeSignatureParameter>();
      TypeSignature typeSignature0 = new TypeSignature("catalogName is null", arrayList0);
      ArrayList<TypeSignature> arrayList1 = new ArrayList<TypeSignature>();
      Signature signature0 = new Signature(qualifiedObjectName0, functionKind0, typeSignature0, arrayList1);
      SqlInvokedFunction sqlInvokedFunction0 = new SqlInvokedFunction(linkedList0, "catalogName is null", routineCharacteristics0, "catalogName is null", signature0, (SqlFunctionId) null);
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.createFunction(sqlInvokedFunction0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Catalog catalogName is null does not support functions implemented in language CATALOGNAME IS NULL
         //
         verifyException("com.facebook.presto.functionNamespace.AbstractSqlInvokedFunctionNamespaceManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      FunctionNamespaceTransactionHandle functionNamespaceTransactionHandle0 = inMemoryFunctionNamespaceManager0.beginTransaction();
      OperatorType operatorType0 = OperatorType.EQUAL;
      QualifiedObjectName qualifiedObjectName0 = operatorType0.getFunctionName();
      FunctionKind functionKind0 = FunctionKind.WINDOW;
      TypeSignature typeSignature0 = VarcharType.getParametrizedVarcharSignature("catalogName is null");
      TypeSignature[] typeSignatureArray0 = new TypeSignature[0];
      Signature signature0 = new Signature(qualifiedObjectName0, functionKind0, typeSignature0, typeSignatureArray0);
      Optional<UuidFunctionNamespaceTransactionHandle> optional0 = Optional.ofNullable((UuidFunctionNamespaceTransactionHandle) functionNamespaceTransactionHandle0);
      FunctionHandle functionHandle0 = inMemoryFunctionNamespaceManager0.getFunctionHandle(optional0, signature0);
      assertNull(functionHandle0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      FunctionNamespaceTransactionHandle functionNamespaceTransactionHandle0 = inMemoryFunctionNamespaceManager0.beginTransaction();
      OperatorType operatorType0 = OperatorType.EQUAL;
      QualifiedObjectName qualifiedObjectName0 = operatorType0.getFunctionName();
      Optional<UuidFunctionNamespaceTransactionHandle> optional0 = Optional.ofNullable((UuidFunctionNamespaceTransactionHandle) functionNamespaceTransactionHandle0);
      Collection<SqlInvokedFunction> collection0 = inMemoryFunctionNamespaceManager0.getFunctions(optional0, qualifiedObjectName0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("cat[logNameis null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      Optional<UuidFunctionNamespaceTransactionHandle> optional0 = Optional.empty();
      QualifiedObjectName qualifiedObjectName0 = QualifiedObjectName.valueOf("", "", "");
      Collection<SqlInvokedFunction> collection0 = inMemoryFunctionNamespaceManager0.getFunctions(optional0, qualifiedObjectName0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      OperatorType operatorType0 = OperatorType.EQUAL;
      Optional<UuidFunctionNamespaceTransactionHandle> optional0 = Optional.empty();
      QualifiedObjectName qualifiedObjectName0 = operatorType0.getFunctionName();
      FunctionKind functionKind0 = FunctionKind.WINDOW;
      TypeSignature typeSignature0 = VarcharType.getParametrizedVarcharSignature("catalogName is null");
      TypeSignature[] typeSignatureArray0 = new TypeSignature[0];
      Signature signature0 = new Signature(qualifiedObjectName0, functionKind0, typeSignature0, typeSignatureArray0);
      FunctionHandle functionHandle0 = inMemoryFunctionNamespaceManager0.getFunctionHandle(optional0, signature0);
      assertNull(functionHandle0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogKame is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      UuidFunctionNamespaceTransactionHandle uuidFunctionNamespaceTransactionHandle0 = (UuidFunctionNamespaceTransactionHandle)inMemoryFunctionNamespaceManager0.beginTransaction();
      inMemoryFunctionNamespaceManager0.commit(uuidFunctionNamespaceTransactionHandle0);
      assertEquals("00000000-0100-4000-8200-000003000000", uuidFunctionNamespaceTransactionHandle0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogKame is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      OperatorType operatorType0 = OperatorType.NOT_EQUAL;
      QualifiedObjectName qualifiedObjectName0 = operatorType0.getFunctionName();
      Vector<TypeSignature> vector0 = new Vector<TypeSignature>();
      SqlFunctionId sqlFunctionId0 = new SqlFunctionId(qualifiedObjectName0, vector0);
      SqlFunctionHandle sqlFunctionHandle0 = new SqlFunctionHandle(sqlFunctionId0, "catalogKame is null");
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.getScalarFunctionImplementation(sqlFunctionHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.util.NoSuchElementException
         //
         verifyException("com.google.common.cache.LocalCache$Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogKame is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      UuidFunctionNamespaceTransactionHandle uuidFunctionNamespaceTransactionHandle0 = (UuidFunctionNamespaceTransactionHandle)inMemoryFunctionNamespaceManager0.beginTransaction();
      inMemoryFunctionNamespaceManager0.abort(uuidFunctionNamespaceTransactionHandle0);
      assertEquals("00000000-0100-4000-8200-000003000000", uuidFunctionNamespaceTransactionHandle0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("catalogName is null", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      OperatorType operatorType0 = OperatorType.NOT_EQUAL;
      QualifiedObjectName qualifiedObjectName0 = operatorType0.getFunctionName();
      Vector<TypeSignature> vector0 = new Vector<TypeSignature>();
      SqlFunctionId sqlFunctionId0 = new SqlFunctionId(qualifiedObjectName0, vector0);
      SqlFunctionHandle sqlFunctionHandle0 = new SqlFunctionHandle(sqlFunctionId0, "catalogName is null");
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.getFunctionMetadata(sqlFunctionHandle0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.util.NoSuchElementException
         //
         verifyException("com.google.common.cache.LocalCache$Segment", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<RoutineCharacteristics.Language, FunctionImplementationType> hashMap0 = new HashMap<RoutineCharacteristics.Language, FunctionImplementationType>();
      SqlFunctionExecutors sqlFunctionExecutors0 = new SqlFunctionExecutors(hashMap0, (ThriftSqlFunctionExecutor) null);
      SqlInvokedFunctionNamespaceManagerConfig sqlInvokedFunctionNamespaceManagerConfig0 = new SqlInvokedFunctionNamespaceManagerConfig();
      InMemoryFunctionNamespaceManager inMemoryFunctionNamespaceManager0 = new InMemoryFunctionNamespaceManager("]", sqlFunctionExecutors0, sqlInvokedFunctionNamespaceManagerConfig0);
      QualifiedObjectName qualifiedObjectName0 = QualifiedObjectName.valueOf("]", "]", "]");
      LinkedList<Parameter> linkedList0 = new LinkedList<Parameter>();
      RoutineCharacteristics.Language routineCharacteristics_Language0 = RoutineCharacteristics.Language.SQL;
      Optional<RoutineCharacteristics.Language> optional0 = Optional.ofNullable(routineCharacteristics_Language0);
      RoutineCharacteristics.Determinism routineCharacteristics_Determinism0 = RoutineCharacteristics.Determinism.DETERMINISTIC;
      Optional<RoutineCharacteristics.Determinism> optional1 = Optional.of(routineCharacteristics_Determinism0);
      Optional<RoutineCharacteristics.NullCallClause> optional2 = Optional.empty();
      RoutineCharacteristics routineCharacteristics0 = new RoutineCharacteristics(optional0, optional1, optional2);
      FunctionKind functionKind0 = FunctionKind.WINDOW;
      TypeSignature typeSignature0 = TypeSignature.parseTypeSignature("]");
      ArrayList<TypeSignature> arrayList0 = new ArrayList<TypeSignature>();
      Signature signature0 = new Signature(qualifiedObjectName0, functionKind0, typeSignature0, arrayList0);
      FunctionImplementationType functionImplementationType0 = FunctionImplementationType.SQL;
      hashMap0.put(routineCharacteristics_Language0, functionImplementationType0);
      SqlInvokedFunction sqlInvokedFunction0 = new SqlInvokedFunction(linkedList0, "]", routineCharacteristics0, "]", signature0, (SqlFunctionId) null);
      // Undeclared exception!
      try { 
        inMemoryFunctionNamespaceManager0.createFunction(sqlInvokedFunction0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
