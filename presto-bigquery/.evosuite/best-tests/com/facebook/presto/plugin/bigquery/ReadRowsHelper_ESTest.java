/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 02:37:54 GMT 2021
 */

package com.facebook.presto.plugin.bigquery;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.plugin.bigquery.ReadRowsHelper;
import com.google.api.gax.rpc.ServerStream;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageClient;
import com.google.cloud.bigquery.storage.v1beta1.Storage;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadRowsHelper_ESTest extends ReadRowsHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServerStream<Storage.ReadRowsResponse> serverStream0 = (ServerStream<Storage.ReadRowsResponse>) mock(ServerStream.class, new ViolatedAssumptionAnswer());
      doReturn((Iterator) null).when(serverStream0).iterator();
      ServerStreamingCallable<Storage.ReadRowsRequest, Storage.ReadRowsResponse> serverStreamingCallable0 = (ServerStreamingCallable<Storage.ReadRowsRequest, Storage.ReadRowsResponse>) mock(ServerStreamingCallable.class, new ViolatedAssumptionAnswer());
      doReturn(serverStream0).when(serverStreamingCallable0).call(any(com.google.cloud.bigquery.storage.v1beta1.Storage.ReadRowsRequest.class));
      BigQueryStorageClient bigQueryStorageClient0 = mock(BigQueryStorageClient.class, new ViolatedAssumptionAnswer());
      doReturn(serverStreamingCallable0).when(bigQueryStorageClient0).readRowsCallable();
      Storage.ReadRowsRequest storage_ReadRowsRequest0 = mock(Storage.ReadRowsRequest.class, new ViolatedAssumptionAnswer());
      Storage.ReadRowsRequest.Builder storage_ReadRowsRequest_Builder0 = mock(Storage.ReadRowsRequest.Builder.class, new ViolatedAssumptionAnswer());
      doReturn(storage_ReadRowsRequest0).when(storage_ReadRowsRequest_Builder0).build();
      ReadRowsHelper readRowsHelper0 = new ReadRowsHelper(bigQueryStorageClient0, storage_ReadRowsRequest_Builder0, 533);
      // Undeclared exception!
      try { 
        readRowsHelper0.readRows();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.bigquery.ReadRowsHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServerStream<Storage.ReadRowsResponse> serverStream0 = (ServerStream<Storage.ReadRowsResponse>) mock(ServerStream.class, new ViolatedAssumptionAnswer());
      doReturn((Iterator) null).when(serverStream0).iterator();
      ServerStreamingCallable<Storage.ReadRowsRequest, Storage.ReadRowsResponse> serverStreamingCallable0 = (ServerStreamingCallable<Storage.ReadRowsRequest, Storage.ReadRowsResponse>) mock(ServerStreamingCallable.class, new ViolatedAssumptionAnswer());
      doReturn(serverStream0).when(serverStreamingCallable0).call(any(com.google.cloud.bigquery.storage.v1beta1.Storage.ReadRowsRequest.class));
      BigQueryStorageClient bigQueryStorageClient0 = mock(BigQueryStorageClient.class, new ViolatedAssumptionAnswer());
      doReturn(serverStreamingCallable0).when(bigQueryStorageClient0).readRowsCallable();
      Storage.ReadRowsRequest.Builder storage_ReadRowsRequest_Builder0 = mock(Storage.ReadRowsRequest.Builder.class, new ViolatedAssumptionAnswer());
      ReadRowsHelper readRowsHelper0 = new ReadRowsHelper(bigQueryStorageClient0, storage_ReadRowsRequest_Builder0, (-1827));
      Storage.ReadRowsRequest.Builder storage_ReadRowsRequest_Builder1 = mock(Storage.ReadRowsRequest.Builder.class, new ViolatedAssumptionAnswer());
      doReturn((Storage.ReadRowsRequest) null).when(storage_ReadRowsRequest_Builder1).build();
      Iterator<Storage.ReadRowsResponse> iterator0 = readRowsHelper0.fetchResponses(storage_ReadRowsRequest_Builder1);
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Storage.ReadRowsRequest.Builder storage_ReadRowsRequest_Builder0 = mock(Storage.ReadRowsRequest.Builder.class, new ViolatedAssumptionAnswer());
      ReadRowsHelper readRowsHelper0 = null;
      try {
        readRowsHelper0 = new ReadRowsHelper((BigQueryStorageClient) null, storage_ReadRowsRequest_Builder0, 91);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // client cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BigQueryStorageClient bigQueryStorageClient0 = mock(BigQueryStorageClient.class, new ViolatedAssumptionAnswer());
      doReturn((ServerStreamingCallable) null).when(bigQueryStorageClient0).readRowsCallable();
      Storage.ReadRowsRequest.Builder storage_ReadRowsRequest_Builder0 = mock(Storage.ReadRowsRequest.Builder.class, new ViolatedAssumptionAnswer());
      ReadRowsHelper readRowsHelper0 = new ReadRowsHelper(bigQueryStorageClient0, storage_ReadRowsRequest_Builder0, (-889));
      Storage.ReadRowsRequest.Builder storage_ReadRowsRequest_Builder1 = mock(Storage.ReadRowsRequest.Builder.class, new ViolatedAssumptionAnswer());
      doReturn((Storage.ReadRowsRequest) null).when(storage_ReadRowsRequest_Builder1).build();
      // Undeclared exception!
      try { 
        readRowsHelper0.fetchResponses(storage_ReadRowsRequest_Builder1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.plugin.bigquery.ReadRowsHelper", e);
      }
  }
}
