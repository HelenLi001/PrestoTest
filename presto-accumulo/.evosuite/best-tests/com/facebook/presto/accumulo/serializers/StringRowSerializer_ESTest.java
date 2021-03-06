/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 21 01:16:51 GMT 2021
 */

package com.facebook.presto.accumulo.serializers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.facebook.presto.accumulo.serializers.StringRowSerializer;
import com.facebook.presto.common.block.Block;
import com.facebook.presto.common.type.ArrayType;
import com.facebook.presto.common.type.BooleanType;
import com.facebook.presto.common.type.DateType;
import com.facebook.presto.common.type.DoubleType;
import com.facebook.presto.common.type.HyperLogLogType;
import com.facebook.presto.common.type.JsonType;
import com.facebook.presto.common.type.P4HyperLogLogType;
import com.facebook.presto.common.type.RealType;
import com.facebook.presto.common.type.RowType;
import com.facebook.presto.common.type.SmallintType;
import com.facebook.presto.common.type.TimeType;
import com.facebook.presto.common.type.TinyintType;
import com.facebook.presto.common.type.Type;
import com.facebook.presto.common.type.VarcharEnumType;
import java.sql.Date;
import java.sql.SQLRecoverableException;
import java.sql.SQLTransactionRollbackException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import org.apache.accumulo.core.data.Key;
import org.apache.accumulo.core.data.Value;
import org.apache.accumulo.core.security.ColumnVisibility;
import org.apache.hadoop.io.Text;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringRowSerializer_ESTest extends StringRowSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      stringRowSerializer0.setMapping(")T=!5o+Q\b^De,t#]z^", ")T=!5o+Q\b^De,t#]z^", "StringLexicoder does not support decoding type ");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      stringRowSerializer0.setMapping("failed predicate: {%s}?", "/9V0A", "/9V0A");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      byte[] byteArray0 = new byte[5];
      Text text0 = new Text(byteArray0);
      stringRowSerializer0.setVarchar(text0, "yTQX<W");
      assertEquals(1048576, Text.DEFAULT_MAX_LEN);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text("43=v-@pMVw");
      byte[] byteArray0 = new byte[5];
      stringRowSerializer0.setVarbinary(text0, byteArray0);
      assertEquals(5, text0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text("y@");
      Instant instant0 = MockInstant.ofEpochSecond((long) (byte)85);
      Timestamp timestamp0 = Timestamp.from(instant0);
      stringRowSerializer0.setTimestamp(text0, timestamp0);
      assertEquals("1970-01-01 00:01:25.0", timestamp0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      Short short0 = new Short((short)1012);
      stringRowSerializer0.setShort(text0, short0);
      assertEquals(4, text0.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      Long long0 = new Long(1048576);
      stringRowSerializer0.setLong(text0, long0);
      assertEquals(1048576, Text.DEFAULT_MAX_LEN);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      byte[] byteArray0 = new byte[2];
      Text text0 = new Text(byteArray0);
      Float float0 = new Float(0.0F);
      stringRowSerializer0.setFloat(text0, float0);
      assertEquals(1048576, Text.DEFAULT_MAX_LEN);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text(",ENS7<fBPpu");
      Byte byte0 = new Byte((byte)79);
      stringRowSerializer0.setByte(text0, byte0);
      assertEquals(2, text0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Integer integer0 = new Integer((-1001));
      // Undeclared exception!
      try { 
        stringRowSerializer0.setInt((Text) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      byte[] byteArray0 = new byte[3];
      Text text0 = new Text(byteArray0);
      // Undeclared exception!
      try { 
        stringRowSerializer0.setDouble(text0, (Double) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Date date0 = new Date((-3247L));
      // Undeclared exception!
      try { 
        stringRowSerializer0.setDate((Text) null, date0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      // Undeclared exception!
      try { 
        stringRowSerializer0.setBoolean(text0, (Boolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.encode((Type) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.Types", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      VarcharEnumType.VarcharEnumMap varcharEnumType_VarcharEnumMap0 = new VarcharEnumType.VarcharEnumMap("RLp/|P:", hashMap0);
      VarcharEnumType varcharEnumType0 = new VarcharEnumType(varcharEnumType_VarcharEnumMap0);
      // Undeclared exception!
      try { 
        stringRowSerializer0.decode((Type) varcharEnumType0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      TinyintType tinyintType0 = TinyintType.TINYINT;
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        stringRowSerializer0.decode((Type) tinyintType0, byteArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      RealType realType0 = RealType.REAL;
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        stringRowSerializer0.decode((Type) realType0, byteArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      DoubleType doubleType0 = DoubleType.DOUBLE;
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        stringRowSerializer0.decode((Type) doubleType0, byteArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      DateType dateType0 = DateType.DATE;
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        stringRowSerializer0.decode((Type) dateType0, byteArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      JsonType jsonType0 = JsonType.JSON;
      ArrayType arrayType0 = new ArrayType(jsonType0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        stringRowSerializer0.decode((Type) arrayType0, byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // arrays are not (yet?) supported for StringRowSerializer
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      HyperLogLogType hyperLogLogType0 = new HyperLogLogType();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        stringRowSerializer0.decode((Type) hyperLogLogType0, byteArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // StringLexicoder does not support decoding type HyperLogLog
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      TimeType timeType0 = TimeType.TIME;
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException("");
      SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException(".kzZcG D-V.ApK-", "", sQLTransactionRollbackException0);
      // Undeclared exception!
      try { 
        stringRowSerializer0.encode(timeType0, sQLRecoverableException0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.sql.SQLRecoverableException cannot be cast to java.sql.Time
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      SmallintType smallintType0 = SmallintType.SMALLINT;
      // Undeclared exception!
      try { 
        stringRowSerializer0.encode(smallintType0, smallintType0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.facebook.presto.common.type.SmallintType cannot be cast to java.lang.Short
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      DateType dateType0 = DateType.DATE;
      Timestamp timestamp0 = new Timestamp(1016L);
      // Undeclared exception!
      try { 
        stringRowSerializer0.encode(dateType0, timestamp0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.sql.Timestamp cannot be cast to java.sql.Date
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      P4HyperLogLogType p4HyperLogLogType0 = new P4HyperLogLogType();
      // Undeclared exception!
      try { 
        stringRowSerializer0.encode(p4HyperLogLogType0, p4HyperLogLogType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // StringLexicoder does not support encoding type P4HyperLogLog, object class is class com.facebook.presto.common.type.P4HyperLogLogType
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      boolean boolean0 = stringRowSerializer0.isNull("ur94");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      ColumnVisibility columnVisibility0 = new ColumnVisibility();
      Key key0 = new Key(text0, text0, text0, columnVisibility0, 1048576);
      byte[] byteArray0 = new byte[7];
      Value value0 = new Value(byteArray0);
      AbstractMap.SimpleImmutableEntry<Key, Value> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Key, Value>(key0, value0);
      AbstractMap.SimpleImmutableEntry<Key, Value> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Key, Value>(abstractMap_SimpleImmutableEntry0);
      // Undeclared exception!
      try { 
        stringRowSerializer0.deserialize(abstractMap_SimpleImmutableEntry1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getDouble("v:} X?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getInt("StringLexicoder does not support encoding type %s, object class is %s");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getByte("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      byte[] byteArray0 = new byte[2];
      Text text0 = new Text(byteArray0);
      BooleanType booleanType0 = BooleanType.BOOLEAN;
      ArrayType arrayType0 = new ArrayType(booleanType0);
      List<Type> list0 = arrayType0.getTypeParameters();
      RowType rowType0 = RowType.anonymous(list0);
      // Undeclared exception!
      try { 
        stringRowSerializer0.setMap(text0, rowType0, (Block) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // maps are not (yet?) supported for StringRowSerializer
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      Boolean boolean0 = Boolean.FALSE;
      stringRowSerializer0.setBoolean(text0, boolean0);
      assertEquals(1048576, Text.DEFAULT_MAX_LEN);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getLong("kv^))cZjt84wXx_+");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getVarchar("aP");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getTimestamp("e{rIyJ4");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      // Undeclared exception!
      try { 
        stringRowSerializer0.setShort(text0, (Short) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text("<_7*xW3]W");
      SmallintType smallintType0 = SmallintType.SMALLINT;
      // Undeclared exception!
      try { 
        stringRowSerializer0.setArray(text0, smallintType0, (Block) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // arrays are not (yet?) supported for StringRowSerializer
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      stringRowSerializer0.setRowIdName("");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text("com.facebook.presto.sql.tree.CurrentUser");
      // Undeclared exception!
      try { 
        stringRowSerializer0.setFloat(text0, (Float) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getShort("7xC2k#TViHS");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      stringRowSerializer0.reset();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text("com.google.common.base.Suppliers$MemoizingSupplier");
      Date date0 = new Date(1360L);
      stringRowSerializer0.setDate(text0, date0);
      assertEquals(1, text0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      Time time0 = new Time(2173L);
      stringRowSerializer0.setTime(text0, time0);
      assertEquals(4, text0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Long long0 = Long.valueOf(1550L);
      // Undeclared exception!
      try { 
        stringRowSerializer0.setLong((Text) null, long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getTime("s");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      P4HyperLogLogType p4HyperLogLogType0 = new P4HyperLogLogType();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getArray("empty", p4HyperLogLogType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // arrays are not (yet?) supported for StringRowSerializer
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      byte[] byteArray0 = new byte[6];
      Text text0 = new Text(byteArray0);
      // Undeclared exception!
      try { 
        stringRowSerializer0.setVarchar(text0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      stringRowSerializer0.setRowOnly(false);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      // Undeclared exception!
      try { 
        stringRowSerializer0.setVarbinary(text0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.io.Text", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text();
      Double double0 = new Double((-125.294));
      stringRowSerializer0.setDouble(text0, double0);
      assertEquals(8, text0.getLength());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getVarbinary((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text("%4");
      stringRowSerializer0.setInt(text0, (Integer) text0.DEFAULT_MAX_LEN);
      assertEquals(7, text0.getLength());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Byte byte0 = new Byte((byte) (-1));
      // Undeclared exception!
      try { 
        stringRowSerializer0.setByte((Text) null, byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getDate("7VW'=aj!]NyF}*G");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      Text text0 = new Text("%4");
      // Undeclared exception!
      try { 
        stringRowSerializer0.setTimestamp(text0, (Timestamp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      P4HyperLogLogType p4HyperLogLogType0 = P4HyperLogLogType.P4_HYPER_LOG_LOG;
      // Undeclared exception!
      try { 
        stringRowSerializer0.getMap("", p4HyperLogLogType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // maps are not (yet?) supported for StringRowSerializer
         //
         verifyException("com.facebook.presto.accumulo.serializers.StringRowSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringRowSerializer stringRowSerializer0 = new StringRowSerializer();
      // Undeclared exception!
      try { 
        stringRowSerializer0.getBoolean("\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
