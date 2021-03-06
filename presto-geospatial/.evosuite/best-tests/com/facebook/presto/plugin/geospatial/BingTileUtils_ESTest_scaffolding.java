/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 22 09:39:55 GMT 2021
 */

package com.facebook.presto.plugin.geospatial;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BingTileUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.facebook.presto.plugin.geospatial.BingTileUtils"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BingTileUtils_ESTest_scaffolding.class.getClassLoader() ,
      "com.esri.core.geometry.OperatorSymmetricDifferenceLocal",
      "com.esri.core.geometry.OperatorContainsLocal",
      "com.esri.core.geometry.OperatorIntersectionCursor",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.esri.core.geometry.GeometryCursor",
      "com.esri.core.geometry.OperatorOverlaps",
      "com.google.common.collect.PeekingIterator",
      "com.esri.core.geometry.AttributeStreamOfInt64",
      "com.esri.core.geometry.Point3D",
      "com.facebook.presto.plugin.geospatial.BingTile",
      "com.esri.core.geometry.MultiVertexGeometryImpl",
      "com.esri.core.geometry.ogc.OGCMultiLineString",
      "org.locationtech.jts.geom.MultiLineString",
      "com.esri.core.geometry.OperatorDisjointLocal",
      "com.esri.core.geometry.ogc.OGCLineString",
      "com.esri.core.geometry.OperatorCrosses",
      "com.esri.core.geometry.OperatorGeodesicBuffer",
      "com.esri.core.geometry.Line",
      "com.esri.core.geometry.ogc.OGCMultiCurve",
      "com.google.common.collect.Iterators$10",
      "com.esri.core.geometry.OperatorIntersectsLocal",
      "com.esri.core.geometry.JsonWriter",
      "com.esri.core.geometry.ogc.OGCLinearRing",
      "org.locationtech.jts.io.ParseException",
      "com.esri.core.geometry.OperatorImportFromWktLocal",
      "com.esri.core.geometry.OperatorExportToGeoJsonLocal",
      "com.facebook.presto.spi.ErrorCode",
      "com.esri.core.geometry.AttributeStreamBase",
      "com.esri.core.geometry.Geometry$GeometryAccelerationDegree",
      "com.esri.core.geometry.AttributeStreamOfDbl",
      "com.google.common.base.Strings",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.esri.core.geometry.OperatorCut",
      "com.esri.core.geometry.MultiPoint",
      "com.esri.core.geometry.Point",
      "com.esri.core.geometry.NumberUtils",
      "com.esri.core.geometry.OperatorConvexHull",
      "com.esri.core.geometry.OperatorExportToJsonCursor",
      "com.esri.core.geometry.OperatorSimplifyLocalOGC",
      "com.esri.core.geometry.OperatorOverlapsLocal",
      "com.esri.core.geometry.OperatorRelateLocal",
      "com.esri.core.geometry.OperatorGeodesicBufferLocal",
      "org.locationtech.jts.geom.Lineal",
      "com.esri.core.geometry.OperatorProject",
      "com.esri.core.geometry.OperatorUnionCursor",
      "com.google.common.base.Preconditions",
      "org.locationtech.jts.geom.MultiPoint",
      "com.esri.core.geometry.OperatorProximity2D",
      "com.google.common.collect.ImmutableCollection",
      "com.esri.core.geometry.Polyline",
      "com.esri.core.geometry.OperatorExportToWkb",
      "com.esri.core.geometry.OperatorImportFromESRIShape",
      "com.esri.core.geometry.OperatorImportFromESRIShapeLocal",
      "com.esri.core.geometry.OperatorGeodeticDensifyLocal",
      "com.esri.core.geometry.OperatorOffsetLocal",
      "com.esri.core.geometry.OperatorIntersectionLocal",
      "com.esri.core.geometry.AttributeStreamOfFloat",
      "com.google.common.base.Objects",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.esri.core.geometry.OperatorSymmetricDifferenceCursor",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.esri.core.geometry.OperatorExportToWkt",
      "com.esri.core.geometry.OperatorGeodeticLengthLocal",
      "com.google.common.collect.Iterators$1",
      "com.esri.core.geometry.OperatorImportFromWkb",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "org.locationtech.jts.geom.util.GeometryEditor$GeometryEditorOperation",
      "com.esri.core.geometry.OperatorDistance",
      "com.esri.core.geometry.OperatorDifference",
      "com.esri.core.geometry.OperatorExportToJson",
      "com.esri.core.geometry.OperatorGeodeticLength",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "org.locationtech.jts.geom.Polygon",
      "com.esri.core.geometry.OperatorIntersection",
      "org.locationtech.jts.geom.Geometry",
      "com.facebook.presto.spi.ErrorCodeSupplier",
      "org.locationtech.jts.geom.PrecisionModel",
      "com.esri.core.geometry.OperatorExportToESRIShape",
      "com.google.common.collect.Lists$1",
      "org.locationtech.jts.geom.MultiPolygon",
      "com.esri.core.geometry.OperatorSymmetricDifference",
      "com.esri.core.geometry.SegmentIteratorImpl",
      "com.esri.core.geometry.OperatorBuffer",
      "com.google.common.collect.ImmutableList",
      "com.esri.core.geometry.ogc.OGCMultiPolygon",
      "com.esri.core.geometry.MultiVertexGeometry",
      "com.esri.core.geometry.AttributeStreamOfInt8",
      "com.esri.core.geometry.ogc.OGCMultiPoint",
      "com.esri.core.geometry.OperatorImportFromWkt",
      "com.esri.core.geometry.OperatorProjectLocal",
      "com.esri.core.geometry.OperatorDifferenceLocal",
      "com.esri.core.geometry.VertexDescriptionDesignerImpl",
      "com.esri.core.geometry.ogc.OGCPolygon",
      "com.esri.core.geometry.OperatorCrossesLocal",
      "com.esri.core.geometry.OperatorShapePreservingDensifyLocal",
      "com.esri.core.geometry.OperatorDisjoint",
      "com.esri.core.geometry.OperatorDensifyByLengthCursor",
      "com.esri.core.geometry.OperatorImportFromJsonLocal",
      "com.esri.core.geometry.Envelope",
      "com.esri.core.geometry.Point2D",
      "com.esri.core.geometry.OperatorImportFromGeoJsonLocal",
      "com.esri.core.geometry.SpatialReference",
      "com.esri.core.geometry.OperatorWithinLocal",
      "com.google.common.collect.ImmutableList$SubList",
      "com.esri.core.geometry.OperatorBufferLocal",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequenceFactory",
      "com.esri.core.geometry.OperatorExportToESRIShapeCursor",
      "com.facebook.presto.spi.ErrorType",
      "com.google.common.collect.RegularImmutableList",
      "com.esri.core.geometry.OperatorRelate",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.esri.core.geometry.MapGeometryCursor",
      "com.esri.core.geometry.OperatorExportToGeoJson",
      "com.esri.core.geometry.OperatorImportFromJsonCursor",
      "com.esri.core.geometry.ByteBufferCursor",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.esri.core.geometry.OperatorEquals",
      "com.esri.core.geometry.OperatorIntersects",
      "com.esri.core.geometry.OperatorShapePreservingDensify",
      "com.esri.core.geometry.OperatorDifferenceCursor",
      "com.esri.core.geometry.OperatorFactory",
      "com.esri.core.geometry.Operator$Type",
      "com.esri.core.geometry.SimpleByteBufferCursor",
      "com.esri.core.geometry.OperatorSimplifyOGC",
      "com.esri.core.geometry.OperatorGeodeticArea",
      "org.locationtech.jts.geom.PrecisionModel$Type",
      "com.esri.core.geometry.ogc.OGCSurface",
      "com.esri.core.geometry.Transformation3D",
      "com.esri.core.geometry.OGCStructure",
      "com.esri.core.geometry.JsonStringWriter",
      "com.esri.core.geometry.CombineOperator",
      "com.facebook.presto.plugin.geospatial.BingTileUtils",
      "io.airlift.slice.Slice",
      "com.esri.core.geometry.OperatorEqualsLocal",
      "com.google.common.collect.ImmutableAsList",
      "com.esri.core.geometry.ogc.OGCGeometry",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.esri.core.geometry.OperatorExportToJsonLocal",
      "com.esri.core.geometry.OperatorImportFromESRIShapeCursor",
      "com.google.common.collect.RegularImmutableAsList",
      "com.esri.core.geometry.OperatorBoundaryLocal",
      "com.esri.core.geometry.OperatorSimplifyCursor",
      "com.esri.core.geometry.GeometryCursorAppend",
      "com.esri.core.geometry.OperatorImportFromWkbLocal",
      "com.esri.core.geometry.OperatorImportFromJson",
      "com.esri.core.geometry.OperatorConvexHullLocal",
      "com.esri.core.geometry.OperatorSimplifyCursorOGC",
      "com.esri.core.geometry.OperatorBoundary",
      "com.esri.core.geometry.OperatorUnionLocal",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.esri.core.geometry.OperatorExportToGeoJsonCursor",
      "com.esri.core.geometry.OperatorProximity2DLocal",
      "com.esri.core.geometry.OperatorFactoryLocal",
      "com.esri.core.geometry.OperatorSimpleRelation",
      "com.esri.core.geometry.ogc.OGCCurve",
      "com.esri.core.geometry.OperatorSimplifyLocal",
      "com.esri.core.geometry.OperatorTouches",
      "com.google.common.collect.ObjectArrays",
      "com.esri.core.geometry.OperatorSimplify",
      "com.esri.core.geometry.ogc.OGCGeometryCollection",
      "com.esri.core.geometry.Polygon",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.esri.core.geometry.OperatorImportFromGeoJson",
      "com.google.common.collect.ImmutableList$1",
      "org.locationtech.jts.geom.GeometryCollection",
      "com.esri.core.geometry.OperatorExportToESRIShapeLocal",
      "com.esri.core.geometry.OperatorGeneralizeLocal",
      "com.esri.core.geometry.OperatorGeneralizeCursor",
      "com.esri.core.geometry.OperatorCutLocal",
      "com.esri.core.geometry.AttributeStreamOfInt16",
      "com.esri.core.geometry.VertexDescriptionHash",
      "com.google.common.collect.UnmodifiableIterator",
      "com.esri.core.geometry.MultiPathImpl",
      "com.esri.core.geometry.OperatorOffset",
      "com.facebook.presto.plugin.geospatial.BingTileUtils$TilingEntry",
      "org.locationtech.jts.geom.CoordinateSequence",
      "com.esri.core.geometry.OperatorContains",
      "com.esri.core.geometry.Envelope2D",
      "com.esri.core.geometry.Geometry$GeometryType",
      "com.esri.core.geometry.OperatorDensifyByLengthLocal",
      "com.esri.core.geometry.OperatorDistanceLocal",
      "com.esri.core.geometry.OperatorClipLocal",
      "com.esri.core.geometry.OperatorGeodeticDensifyByLength",
      "com.esri.core.geometry.VertexDescription",
      "com.esri.core.geometry.OperatorOffsetCursor",
      "com.esri.core.geometry.GeometryException",
      "com.esri.core.geometry.OperatorBoundaryLocalCursor",
      "com.esri.core.geometry.OperatorDensifyByLength",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "org.locationtech.jts.geom.Puntal",
      "com.esri.core.geometry.OperatorGeodeticAreaLocal",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.esri.core.geometry.OperatorClipCursor",
      "com.esri.core.geometry.OperatorCutCursor",
      "com.facebook.presto.geospatial.GeometryUtils",
      "com.google.common.collect.SingletonImmutableList",
      "com.esri.core.geometry.MathUtils$KahanSummator",
      "com.esri.core.geometry.ogc.OGCMultiSurface",
      "com.esri.core.geometry.Envelope1D",
      "com.esri.core.geometry.JsonCursor",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.esri.core.geometry.StringUtils",
      "org.locationtech.jts.geom.Point",
      "com.google.common.collect.CollectPreconditions",
      "com.esri.core.geometry.Geometry",
      "com.esri.core.geometry.OperatorConvexHullCursor",
      "com.esri.core.geometry.OperatorCentroid2DLocal",
      "com.esri.core.geometry.OperatorBufferCursor",
      "com.facebook.presto.spi.StandardErrorCode",
      "com.esri.core.geometry.AttributeStreamOfInt32",
      "com.esri.core.geometry.Geometry$Type",
      "com.esri.core.geometry.OperatorUnion",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.base.MoreObjects$1",
      "com.esri.core.geometry.MultiPath",
      "com.facebook.presto.spi.PrestoException",
      "com.google.common.collect.Iterators",
      "com.esri.core.geometry.OperatorWithin",
      "com.esri.core.geometry.OperatorGeneralize",
      "com.esri.core.geometry.ogc.OGCPoint",
      "com.esri.core.geometry.OperatorClip",
      "com.esri.core.geometry.OperatorCentroid2D",
      "com.esri.core.geometry.Segment",
      "com.esri.core.geometry.Transformation2D",
      "com.esri.core.geometry.Operator",
      "com.esri.core.geometry.ogc.OGCConcreteGeometryCollection",
      "org.locationtech.jts.geom.GeometryFactory",
      "com.esri.core.geometry.OperatorExportToWktLocal",
      "org.locationtech.jts.geom.Polygonal",
      "com.esri.core.geometry.SimpleGeometryCursor",
      "org.locationtech.jts.geom.CoordinateSequenceFactory",
      "org.locationtech.jts.geom.LineString",
      "com.esri.core.geometry.OperatorExportToWkbLocal",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.esri.core.geometry.OperatorTouchesLocal"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.esri.core.geometry.GeometryCursor", false, BingTileUtils_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.esri.core.geometry.ogc.OGCGeometry", false, BingTileUtils_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BingTileUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.facebook.presto.plugin.geospatial.BingTileUtils",
      "com.facebook.presto.plugin.geospatial.BingTileUtils$TilingEntry",
      "com.facebook.presto.spi.ErrorType",
      "com.facebook.presto.spi.ErrorCode",
      "com.facebook.presto.spi.StandardErrorCode",
      "org.locationtech.jts.geom.impl.PackedCoordinateSequenceFactory",
      "org.locationtech.jts.geom.GeometryFactory",
      "org.locationtech.jts.geom.PrecisionModel$Type",
      "org.locationtech.jts.geom.PrecisionModel",
      "com.facebook.presto.geospatial.GeometryUtils",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.esri.core.geometry.OperatorFactory",
      "com.esri.core.geometry.Operator$Type",
      "com.esri.core.geometry.Operator",
      "com.esri.core.geometry.OperatorProject",
      "com.esri.core.geometry.OperatorProjectLocal",
      "com.esri.core.geometry.OperatorExportToJson",
      "com.esri.core.geometry.OperatorExportToJsonLocal",
      "com.esri.core.geometry.OperatorImportFromJson",
      "com.esri.core.geometry.OperatorImportFromJsonLocal",
      "com.esri.core.geometry.OperatorExportToESRIShape",
      "com.esri.core.geometry.OperatorExportToESRIShapeLocal",
      "com.esri.core.geometry.OperatorImportFromESRIShape",
      "com.esri.core.geometry.OperatorImportFromESRIShapeLocal",
      "com.esri.core.geometry.OperatorProximity2D",
      "com.esri.core.geometry.OperatorProximity2DLocal",
      "com.esri.core.geometry.OperatorCentroid2D",
      "com.esri.core.geometry.OperatorCentroid2DLocal",
      "com.esri.core.geometry.OperatorDensifyByLength",
      "com.esri.core.geometry.OperatorDensifyByLengthLocal",
      "com.esri.core.geometry.OperatorRelate",
      "com.esri.core.geometry.OperatorRelateLocal",
      "com.esri.core.geometry.OperatorSimpleRelation",
      "com.esri.core.geometry.OperatorEquals",
      "com.esri.core.geometry.OperatorEqualsLocal",
      "com.esri.core.geometry.OperatorDisjoint",
      "com.esri.core.geometry.OperatorDisjointLocal",
      "com.esri.core.geometry.OperatorIntersects",
      "com.esri.core.geometry.OperatorIntersectsLocal",
      "com.esri.core.geometry.OperatorWithin",
      "com.esri.core.geometry.OperatorWithinLocal",
      "com.esri.core.geometry.OperatorContains",
      "com.esri.core.geometry.OperatorContainsLocal",
      "com.esri.core.geometry.OperatorCrosses",
      "com.esri.core.geometry.OperatorCrossesLocal",
      "com.esri.core.geometry.OperatorTouches",
      "com.esri.core.geometry.OperatorTouchesLocal",
      "com.esri.core.geometry.OperatorOverlaps",
      "com.esri.core.geometry.OperatorOverlapsLocal",
      "com.esri.core.geometry.OperatorSimplifyOGC",
      "com.esri.core.geometry.OperatorSimplifyLocalOGC",
      "com.esri.core.geometry.OperatorSimplify",
      "com.esri.core.geometry.OperatorSimplifyLocal",
      "com.esri.core.geometry.OperatorOffset",
      "com.esri.core.geometry.OperatorOffsetLocal",
      "com.esri.core.geometry.OperatorGeodeticDensifyByLength",
      "com.esri.core.geometry.OperatorGeodeticDensifyLocal",
      "com.esri.core.geometry.OperatorShapePreservingDensify",
      "com.esri.core.geometry.OperatorShapePreservingDensifyLocal",
      "com.esri.core.geometry.OperatorGeodesicBuffer",
      "com.esri.core.geometry.OperatorGeodesicBufferLocal",
      "com.esri.core.geometry.OperatorGeodeticLength",
      "com.esri.core.geometry.OperatorGeodeticLengthLocal",
      "com.esri.core.geometry.OperatorGeodeticArea",
      "com.esri.core.geometry.OperatorGeodeticAreaLocal",
      "com.esri.core.geometry.OperatorBuffer",
      "com.esri.core.geometry.OperatorBufferLocal",
      "com.esri.core.geometry.OperatorDistance",
      "com.esri.core.geometry.OperatorDistanceLocal",
      "com.esri.core.geometry.OperatorIntersection",
      "com.esri.core.geometry.OperatorIntersectionLocal",
      "com.esri.core.geometry.OperatorDifference",
      "com.esri.core.geometry.OperatorDifferenceLocal",
      "com.esri.core.geometry.OperatorSymmetricDifference",
      "com.esri.core.geometry.OperatorSymmetricDifferenceLocal",
      "com.esri.core.geometry.OperatorClip",
      "com.esri.core.geometry.OperatorClipLocal",
      "com.esri.core.geometry.OperatorCut",
      "com.esri.core.geometry.OperatorCutLocal",
      "com.esri.core.geometry.OperatorExportToWkb",
      "com.esri.core.geometry.OperatorExportToWkbLocal",
      "com.esri.core.geometry.OperatorImportFromWkb",
      "com.esri.core.geometry.OperatorImportFromWkbLocal",
      "com.esri.core.geometry.OperatorExportToWkt",
      "com.esri.core.geometry.OperatorExportToWktLocal",
      "com.esri.core.geometry.OperatorImportFromWkt",
      "com.esri.core.geometry.OperatorImportFromWktLocal",
      "com.esri.core.geometry.OperatorImportFromGeoJson",
      "com.esri.core.geometry.OperatorImportFromGeoJsonLocal",
      "com.esri.core.geometry.OperatorExportToGeoJson",
      "com.esri.core.geometry.OperatorExportToGeoJsonLocal",
      "com.esri.core.geometry.OperatorUnion",
      "com.esri.core.geometry.OperatorUnionLocal",
      "com.esri.core.geometry.OperatorGeneralize",
      "com.esri.core.geometry.OperatorGeneralizeLocal",
      "com.esri.core.geometry.OperatorConvexHull",
      "com.esri.core.geometry.OperatorConvexHullLocal",
      "com.esri.core.geometry.OperatorBoundary",
      "com.esri.core.geometry.OperatorBoundaryLocal",
      "com.esri.core.geometry.OperatorFactoryLocal",
      "com.esri.core.geometry.Geometry$GeometryAccelerationDegree",
      "com.facebook.presto.spi.PrestoException",
      "com.facebook.presto.plugin.geospatial.BingTile",
      "com.google.common.base.Preconditions",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.esri.core.geometry.Geometry",
      "com.esri.core.geometry.Envelope",
      "com.esri.core.geometry.Envelope2D",
      "com.esri.core.geometry.VertexDescriptionDesignerImpl",
      "com.esri.core.geometry.NumberUtils",
      "com.esri.core.geometry.VertexDescription",
      "com.esri.core.geometry.VertexDescriptionHash",
      "com.esri.core.geometry.Geometry$Type",
      "com.google.common.collect.SingletonImmutableList",
      "com.esri.core.geometry.Point",
      "com.esri.core.geometry.GeometryCursor",
      "com.esri.core.geometry.SimpleGeometryCursor",
      "com.esri.core.geometry.JsonCursor",
      "com.esri.core.geometry.OperatorExportToJsonCursor",
      "com.esri.core.geometry.JsonWriter",
      "com.esri.core.geometry.JsonStringWriter",
      "com.esri.core.geometry.AttributeStreamBase",
      "com.esri.core.geometry.AttributeStreamOfInt32",
      "com.esri.core.geometry.StringUtils",
      "com.esri.core.geometry.ogc.OGCGeometry",
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
      "io.airlift.slice.Slice",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.google.common.collect.ObjectArrays",
      "com.esri.core.geometry.MultiVertexGeometry",
      "com.esri.core.geometry.MultiPath",
      "com.esri.core.geometry.Polygon",
      "com.esri.core.geometry.MultiVertexGeometryImpl",
      "com.esri.core.geometry.MultiPathImpl",
      "com.esri.core.geometry.AttributeStreamOfInt8",
      "com.esri.core.geometry.AttributeStreamOfDbl",
      "com.esri.core.geometry.MathUtils$KahanSummator",
      "com.esri.core.geometry.Point2D",
      "com.esri.core.geometry.SegmentIteratorImpl",
      "com.esri.core.geometry.Segment",
      "com.esri.core.geometry.Line",
      "com.esri.core.geometry.ogc.OGCSurface",
      "com.esri.core.geometry.ogc.OGCPolygon",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Lists",
      "com.esri.core.geometry.ogc.OGCGeometryCollection",
      "com.esri.core.geometry.ogc.OGCMultiSurface",
      "com.esri.core.geometry.ogc.OGCMultiPolygon",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.Objects",
      "com.google.common.base.Strings"
    );
  }
}
