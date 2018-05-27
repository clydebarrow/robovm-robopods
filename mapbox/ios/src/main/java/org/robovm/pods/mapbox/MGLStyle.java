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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLStyle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLStylePtr extends Ptr<MGLStyle, MGLStylePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLStyle.class); }/*</bind>*/
    /*<constants>*/
    public static final int defaultVersion = 10;
    /*</constants>*/
    /*<constructors>*/
    public MGLStyle() {}
    protected MGLStyle(Handle h, long handle) { super(h, handle); }
    protected MGLStyle(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "sources")
    public native NSSet<MGLSource> getSources();
    @Property(selector = "setSources:")
    public native void setSources(NSSet<MGLSource> v);
    @Property(selector = "transition")
    public native @ByVal MGLTransition getTransition();
    @Property(selector = "setTransition:")
    public native void setTransition(@ByVal MGLTransition v);
    @Property(selector = "layers")
    public native NSArray<MGLStyleLayer> getLayers();
    @Property(selector = "setLayers:")
    public native void setLayers(NSArray<MGLStyleLayer> v);
    @Property(selector = "styleClasses")
    public native NSArray<NSString> getStyleClasses();
    @Property(selector = "setStyleClasses:")
    public native void setStyleClasses(NSArray<NSString> v);
    @Property(selector = "light")
    public native MGLLight getLight();
    @Property(selector = "setLight:")
    public native void setLight(MGLLight v);
    @Property(selector = "localizesLabels")
    public native boolean isLocalizesLabels();
    @Property(selector = "setLocalizesLabels:")
    public native void setLocalizesLabels(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sourceWithIdentifier:")
    public native MGLSource source(String identifier);
    @Method(selector = "addSource:")
    public native void addSource(MGLSource source);
    @Method(selector = "removeSource:")
    public native void removeSource(MGLSource source);
    @Method(selector = "layerWithIdentifier:")
    public native MGLStyleLayer layer(String identifier);
    @Method(selector = "addLayer:")
    public native void addLayer(MGLStyleLayer layer);
    @Method(selector = "insertLayer:atIndex:")
    public native void insertLayer(MGLStyleLayer layer, @MachineSizedUInt long index);
    @Method(selector = "insertLayer:belowLayer:")
    public native void insertLayerBelow(MGLStyleLayer layer, MGLStyleLayer sibling);
    @Method(selector = "insertLayer:aboveLayer:")
    public native void insertLayerAbove(MGLStyleLayer layer, MGLStyleLayer sibling);
    @Method(selector = "removeLayer:")
    public native void removeLayer(MGLStyleLayer layer);
    @Method(selector = "hasStyleClass:")
    public native boolean hasStyleClass(String styleClass);
    @Method(selector = "addStyleClass:")
    public native void addStyleClass(String styleClass);
    @Method(selector = "removeStyleClass:")
    public native void removeStyleClass(String styleClass);
    @Method(selector = "imageForName:")
    public native UIImage image(String name);
    @Method(selector = "setImage:forName:")
    public native void setImage(UIImage image, String name);
    @Method(selector = "removeImageForName:")
    public native void removeImage(String name);
    @Method(selector = "streetsStyleURL")
    public static native NSURL streetsStyleURL();
    @Method(selector = "streetsStyleURLWithVersion:")
    public static native NSURL streetsStyleURL(@MachineSizedSInt long version);
    @Method(selector = "emeraldStyleURL")
    public static native NSURL emeraldStyleURL();
    @Method(selector = "outdoorsStyleURL")
    public static native NSURL outdoorsStyleURL();
    @Method(selector = "outdoorsStyleURLWithVersion:")
    public static native NSURL outdoorsStyleURL(@MachineSizedSInt long version);
    @Method(selector = "lightStyleURL")
    public static native NSURL lightStyleURL();
    @Method(selector = "lightStyleURLWithVersion:")
    public static native NSURL lightStyleURL(@MachineSizedSInt long version);
    @Method(selector = "darkStyleURL")
    public static native NSURL darkStyleURL();
    @Method(selector = "darkStyleURLWithVersion:")
    public static native NSURL darkStyleURL(@MachineSizedSInt long version);
    @Method(selector = "satelliteStyleURL")
    public static native NSURL satelliteStyleURL();
    @Method(selector = "satelliteStyleURLWithVersion:")
    public static native NSURL satelliteStyleURL(@MachineSizedSInt long version);
    @Method(selector = "hybridStyleURL")
    public static native NSURL hybridStyleURL();
    @Method(selector = "satelliteStreetsStyleURL")
    public static native NSURL satelliteStreetsStyleURL();
    @Method(selector = "satelliteStreetsStyleURLWithVersion:")
    public static native NSURL satelliteStreetsStyleURL(@MachineSizedSInt long version);
    @Method(selector = "trafficDayStyleURL")
    public static native NSURL trafficDayStyleURL();
    @Method(selector = "trafficDayStyleURLWithVersion:")
    public static native NSURL trafficDayStyleURL(@MachineSizedSInt long version);
    @Method(selector = "trafficNightStyleURL")
    public static native NSURL trafficNightStyleURL();
    @Method(selector = "trafficNightStyleURLWithVersion:")
    public static native NSURL trafficNightStyleURL(@MachineSizedSInt long version);
    /*</methods>*/
}
