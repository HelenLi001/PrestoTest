/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 22 21:07:43 GMT 2021
 */

package com.facebook.presto.verifier.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.common.type.TypeManager;
import com.facebook.presto.sql.tree.QualifiedName;
import com.facebook.presto.sql.tree.Statement;
import com.facebook.presto.verifier.checksum.ChecksumResult;
import com.facebook.presto.verifier.checksum.ChecksumValidator;
import com.facebook.presto.verifier.framework.DeterminismAnalyzer;
import com.facebook.presto.verifier.framework.DeterminismAnalyzerConfig;
import com.facebook.presto.verifier.framework.QueryObjectBundle;
import com.facebook.presto.verifier.framework.QueryResult;
import com.facebook.presto.verifier.framework.SourceQuery;
import com.facebook.presto.verifier.prestoaction.PrestoAction;
import com.facebook.presto.verifier.rewrite.QueryRewriter;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeterminismAnalyzer_ESTest extends DeterminismAnalyzer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SourceQuery sourceQuery0 = mock(SourceQuery.class, new ViolatedAssumptionAnswer());
      QueryRewriter queryRewriter0 = mock(QueryRewriter.class, new ViolatedAssumptionAnswer());
      ChecksumValidator checksumValidator0 = mock(ChecksumValidator.class, new ViolatedAssumptionAnswer());
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      QualifiedName qualifiedName0 = mock(QualifiedName.class, new ViolatedAssumptionAnswer());
      QueryObjectBundle queryObjectBundle0 = mock(QueryObjectBundle.class, new ViolatedAssumptionAnswer());
      ChecksumResult checksumResult0 = mock(ChecksumResult.class, new ViolatedAssumptionAnswer());
      PrestoAction prestoAction0 = mock(PrestoAction.class, new ViolatedAssumptionAnswer());
      DeterminismAnalyzerConfig determinismAnalyzerConfig0 = mock(DeterminismAnalyzerConfig.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(determinismAnalyzerConfig0).getMaxAnalysisRuns();
      doReturn((Set) null).when(determinismAnalyzerConfig0).getNonDeterministicCatalogs();
      doReturn(false).when(determinismAnalyzerConfig0).isRunTeardown();
      DeterminismAnalyzer determinismAnalyzer0 = null;
      try {
        determinismAnalyzer0 = new DeterminismAnalyzer(sourceQuery0, prestoAction0, queryRewriter0, checksumValidator0, typeManager0, determinismAnalyzerConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SourceQuery sourceQuery0 = mock(SourceQuery.class, new ViolatedAssumptionAnswer());
      QueryRewriter queryRewriter0 = mock(QueryRewriter.class, new ViolatedAssumptionAnswer());
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      QualifiedName qualifiedName0 = mock(QualifiedName.class, new ViolatedAssumptionAnswer());
      QueryObjectBundle queryObjectBundle0 = mock(QueryObjectBundle.class, new ViolatedAssumptionAnswer());
      QueryResult<Object> queryResult0 = (QueryResult<Object>) mock(QueryResult.class, new ViolatedAssumptionAnswer());
      PrestoAction prestoAction0 = mock(PrestoAction.class, new ViolatedAssumptionAnswer());
      ChecksumValidator checksumValidator0 = mock(ChecksumValidator.class, new ViolatedAssumptionAnswer());
      ChecksumResult checksumResult0 = mock(ChecksumResult.class, new ViolatedAssumptionAnswer());
      DeterminismAnalyzerConfig determinismAnalyzerConfig0 = mock(DeterminismAnalyzerConfig.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(determinismAnalyzerConfig0).getMaxAnalysisRuns();
      doReturn((Set) null).when(determinismAnalyzerConfig0).getNonDeterministicCatalogs();
      doReturn(false).when(determinismAnalyzerConfig0).isRunTeardown();
      DeterminismAnalyzer determinismAnalyzer0 = null;
      try {
        determinismAnalyzer0 = new DeterminismAnalyzer(sourceQuery0, prestoAction0, queryRewriter0, checksumValidator0, typeManager0, determinismAnalyzerConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SourceQuery sourceQuery0 = mock(SourceQuery.class, new ViolatedAssumptionAnswer());
      PrestoAction prestoAction0 = mock(PrestoAction.class, new ViolatedAssumptionAnswer());
      QueryRewriter queryRewriter0 = mock(QueryRewriter.class, new ViolatedAssumptionAnswer());
      ChecksumValidator checksumValidator0 = mock(ChecksumValidator.class, new ViolatedAssumptionAnswer());
      TypeManager typeManager0 = mock(TypeManager.class, new ViolatedAssumptionAnswer());
      DeterminismAnalyzerConfig determinismAnalyzerConfig0 = mock(DeterminismAnalyzerConfig.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(determinismAnalyzerConfig0).getMaxAnalysisRuns();
      doReturn((Set) null).when(determinismAnalyzerConfig0).getNonDeterministicCatalogs();
      doReturn(false).when(determinismAnalyzerConfig0).isRunTeardown();
      DeterminismAnalyzer determinismAnalyzer0 = null;
      try {
        determinismAnalyzer0 = new DeterminismAnalyzer(sourceQuery0, prestoAction0, queryRewriter0, checksumValidator0, typeManager0, determinismAnalyzerConfig0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableSet", e);
      }
  }
}
