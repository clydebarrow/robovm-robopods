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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLFillExtrusionStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLVectorStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLFillExtrusionStyleLayerPtr extends Ptr<MGLFillExtrusionStyleLayer, MGLFillExtrusionStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLFillExtrusionStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLFillExtrusionStyleLayer() {}
    protected MGLFillExtrusionStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLFillExtrusionStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLFillExtrusionStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fillExtrusionBase")
    public native MGLStyleValue<NSNumber> getFillExtrusionBase();
    @Property(selector = "setFillExtrusionBase:")
    public native void setFillExtrusionBase(MGLStyleValue<NSNumber> v);
    @Property(selector = "fillExtrusionBaseTransition")
    public native @ByVal MGLTransition getFillExtrusionBaseTransition();
    @Property(selector = "setFillExtrusionBaseTransition:")
    public native void setFillExtrusionBaseTransition(@ByVal MGLTransition v);
    @Property(selector = "fillExtrusionColor")
    public native MGLStyleValue<UIColor> getFillExtrusionColor();
    @Property(selector = "setFillExtrusionColor:")
    public native void setFillExtrusionColor(MGLStyleValue<UIColor> v);
    @Property(selector = "fillExtrusionColorTransition")
    public native @ByVal MGLTransition getFillExtrusionColorTransition();
    @Property(selector = "setFillExtrusionColorTransition:")
    public native void setFillExtrusionColorTransition(@ByVal MGLTransition v);
    @Property(selector = "fillExtrusionHeight")
    public native MGLStyleValue<NSNumber> getFillExtrusionHeight();
    @Property(selector = "setFillExtrusionHeight:")
    public native void setFillExtrusionHeight(MGLStyleValue<NSNumber> v);
    @Property(selector = "fillExtrusionHeightTransition")
    public native @ByVal MGLTransition getFillExtrusionHeightTransition();
    @Property(selector = "setFillExtrusionHeightTransition:")
    public native void setFillExtrusionHeightTransition(@ByVal MGLTransition v);
    @Property(selector = "fillExtrusionOpacity")
    public native MGLStyleValue<NSNumber> getFillExtrusionOpacity();
    @Property(selector = "setFillExtrusionOpacity:")
    public native void setFillExtrusionOpacity(MGLStyleValue<NSNumber> v);
    @Property(selector = "fillExtrusionOpacityTransition")
    public native @ByVal MGLTransition getFillExtrusionOpacityTransition();
    @Property(selector = "setFillExtrusionOpacityTransition:")
    public native void setFillExtrusionOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "fillExtrusionPattern")
    public native MGLStyleValue<NSString> getFillExtrusionPattern();
    @Property(selector = "setFillExtrusionPattern:")
    public native void setFillExtrusionPattern(MGLStyleValue<NSString> v);
    @Property(selector = "fillExtrusionPatternTransition")
    public native @ByVal MGLTransition getFillExtrusionPatternTransition();
    @Property(selector = "setFillExtrusionPatternTransition:")
    public native void setFillExtrusionPatternTransition(@ByVal MGLTransition v);
    @Property(selector = "fillExtrusionTranslation")
    public native MGLStyleValue<NSValue> getFillExtrusionTranslation();
    @Property(selector = "setFillExtrusionTranslation:")
    public native void setFillExtrusionTranslation(MGLStyleValue<NSValue> v);
    @Property(selector = "fillExtrusionTranslationTransition")
    public native @ByVal MGLTransition getFillExtrusionTranslationTransition();
    @Property(selector = "setFillExtrusionTranslationTransition:")
    public native void setFillExtrusionTranslationTransition(@ByVal MGLTransition v);
    @Property(selector = "fillExtrusionTranslationAnchor")
    public native MGLStyleValue<NSValue> getFillExtrusionTranslationAnchor();
    @Property(selector = "setFillExtrusionTranslationAnchor:")
    public native void setFillExtrusionTranslationAnchor(MGLStyleValue<NSValue> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
