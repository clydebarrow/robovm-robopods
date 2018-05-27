/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.mapbox;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMultiPoint/*</name>*/ 
    extends /*<extends>*/MGLShape/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLMultiPointPtr extends Ptr<MGLMultiPoint, MGLMultiPointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLMultiPoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLMultiPoint() {}
    protected MGLMultiPoint(Handle h, long handle) { super(h, handle); }
    protected MGLMultiPoint(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "coordinates")
    public native CLLocationCoordinate2D getCoordinates();
    @Property(selector = "pointCount")
    public native @MachineSizedUInt long getPointCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getCoordinates:range:")
    public native void getCoordinates(CLLocationCoordinate2D coords, @ByVal NSRange range);
    @Method(selector = "setCoordinates:count:")
    public native void setCoordinates(CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Method(selector = "insertCoordinates:count:atIndex:")
    public native void insertCoordinates(CLLocationCoordinate2D coords, @MachineSizedUInt long count, @MachineSizedUInt long index);
    @Method(selector = "appendCoordinates:count:")
    public native void appendCoordinates(CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Method(selector = "replaceCoordinatesInRange:withCoordinates:")
    public native void replaceCoordinates(@ByVal NSRange range, CLLocationCoordinate2D coords);
    @Method(selector = "replaceCoordinatesInRange:withCoordinates:count:")
    public native void replaceCoordinates(@ByVal NSRange range, CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Method(selector = "removeCoordinatesInRange:")
    public native void removeCoordinatesInRange(@ByVal NSRange range);
    /*</methods>*/
}
