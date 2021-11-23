/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 22 09:36:53 GMT 2021
 */

package com.facebook.presto.plugin.geospatial;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class GeoFunctions_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.plugin.geospatial.GeoFunctions"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/mnt/c/Users/Helen/Documents/DataScience18668/GroupProject/project/presto/presto-geospatial"); 
    java.lang.System.setProperty("user.home", "/home/helen"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "helen"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GeoFunctions_ESTest_scaffolding.class.getClassLoader() ,
      "org.locationtech.jts.geom.CoordinateSequence",
      "com.google.common.base.Joiner$1",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "com.google.common.base.Joiner$2",
      "org.openjdk.jol.datamodel.DataModel",
      "org.openjdk.jol.util.VMSupport$MyLongs4",
      "org.locationtech.jts.geom.GeometryComponentFilter",
      "org.locationtech.jts.geom.Coordinate",
      "com.esri.core.geometry.GeometryCursor",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequenceFactory",
      "io.airlift.slice.SliceInput",
      "com.esri.core.geometry.GeometryException",
      "com.esri.core.geometry.Polyline",
      "org.openjdk.jol.util.VMSupport$MyInts4",
      "com.facebook.presto.geospatial.serde.JtsGeometrySerde",
      "org.locationtech.jts.geom.Puntal",
      "org.openjdk.jol.util.VMSupport",
      "com.facebook.presto.plugin.geospatial.GeoFunctions",
      "org.openjdk.jol.info.ClassData",
      "org.openjdk.jol.info.FieldData",
      "io.airlift.slice.Slices",
      "com.facebook.presto.geospatial.GeometryUtils",
      "org.openjdk.jol.util.VMSupport$MyBytes4",
      "org.locationtech.jts.geom.MultiLineString",
      "org.openjdk.jol.util.VMSupport$HeaderClass",
      "org.openjdk.jol.util.VMSupport$MyChars4",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence$Double",
      "org.locationtech.jts.geom.CoordinateXYZM",
      "org.locationtech.jts.geom.Point",
      "com.esri.core.geometry.Geometry",
      "org.openjdk.jol.util.VMSupport$MyDoubles4",
      "io.airlift.slice.BasicSliceOutput",
      "org.locationtech.jts.geom.util.GeometryEditor$GeometryEditorOperation",
      "io.airlift.slice.FixedLengthSliceInput",
      "org.openjdk.jol.info.ClassLayout",
      "org.locationtech.jts.geom.TopologyException",
      "org.locationtech.jts.io.ParseException",
      "io.airlift.slice.SliceTooLargeException",
      "org.locationtech.jts.geom.Polygon",
      "org.locationtech.jts.geom.PrecisionModel$Type",
      "org.locationtech.jts.geom.Geometry",
      "org.locationtech.jts.geom.CoordinateXY",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.MathUtil",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "org.locationtech.jts.geom.PrecisionModel",
      "org.openjdk.jol.util.VMSupport$1",
      "com.facebook.presto.geospatial.GeometryType",
      "com.google.common.base.Joiner",
      "org.locationtech.jts.geom.MultiPolygon",
      "org.locationtech.jts.geom.CoordinateXYM",
      "org.openjdk.jol.util.VMSupport$MyBooleans4",
      "org.locationtech.jts.geom.Geometry$1",
      "io.airlift.slice.Slice",
      "io.airlift.slice.SliceOutput",
      "org.locationtech.jts.geom.LinearRing",
      "com.esri.core.geometry.MultiPath",
      "com.facebook.presto.spi.PrestoException",
      "org.openjdk.jol.datamodel.CurrentDataModel",
      "io.airlift.slice.DynamicSliceOutput",
      "org.openjdk.jol.util.VMSupport$MyShorts4",
      "com.esri.core.geometry.MultiVertexGeometry",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence",
      "com.esri.core.geometry.Point",
      "org.locationtech.jts.geom.impl.CoordinateArraySequenceFactory",
      "org.locationtech.jts.geom.GeometryFactory",
      "com.esri.core.geometry.ListeningGeometryCursor",
      "org.openjdk.jol.layouters.Layouter",
      "org.openjdk.jol.util.VMSupport$MyFloats4",
      "org.locationtech.jts.geom.Polygonal",
      "org.locationtech.jts.geom.Lineal",
      "io.airlift.slice.BasicSliceInput",
      "org.locationtech.jts.geom.GeometryCollection",
      "org.locationtech.jts.geom.LineString",
      "org.locationtech.jts.geom.CoordinateSequenceFactory",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "com.esri.core.geometry.Envelope",
      "com.google.common.base.Preconditions",
      "org.locationtech.jts.geom.MultiPoint",
      "org.openjdk.jol.info.FieldLayout"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GeoFunctions_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequenceFactory",
      "org.locationtech.jts.geom.GeometryFactory",
      "org.locationtech.jts.geom.PrecisionModel$Type",
      "org.locationtech.jts.geom.PrecisionModel",
      "com.facebook.presto.geospatial.GeometryUtils",
      "org.locationtech.jts.geom.Geometry$1",
      "org.locationtech.jts.geom.Geometry",
      "org.locationtech.jts.geom.Polygon",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequence$Double",
      "org.locationtech.jts.geom.LineString",
      "org.locationtech.jts.geom.LinearRing",
      "org.locationtech.jts.geom.impl.CoordinateArraySequenceFactory",
      "com.facebook.presto.geospatial.serde.JtsGeometrySerde",
      "io.airlift.slice.SliceOutput",
      "org.openjdk.jol.info.ClassLayout",
      "org.openjdk.jol.layouters.CurrentLayouter",
      "org.openjdk.jol.info.ClassData",
      "org.openjdk.jol.info.FieldData",
      "org.openjdk.jol.util.VMSupport$1",
      "org.openjdk.jol.util.VMSupport$2",
      "org.openjdk.jol.util.VMSupport$VMOptions",
      "org.openjdk.jol.util.MathUtil",
      "org.openjdk.jol.util.VMSupport$MyObject1",
      "org.openjdk.jol.util.VMSupport",
      "org.openjdk.jol.datamodel.CurrentDataModel",
      "org.openjdk.jol.info.FieldLayout",
      "io.airlift.slice.DynamicSliceOutput",
      "io.airlift.slice.Slice",
      "io.airlift.slice.Slices",
      "com.facebook.presto.plugin.geospatial.GeoFunctions"
    );
  }
}
