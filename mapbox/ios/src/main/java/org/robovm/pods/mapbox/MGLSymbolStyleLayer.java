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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLSymbolStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLVectorStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLSymbolStyleLayerPtr extends Ptr<MGLSymbolStyleLayer, MGLSymbolStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLSymbolStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLSymbolStyleLayer() {}
    protected MGLSymbolStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLSymbolStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLSymbolStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "iconAllowsOverlap")
    public native MGLStyleValue<NSNumber> getIconAllowsOverlap();
    @Property(selector = "setIconAllowsOverlap:")
    public native void setIconAllowsOverlap(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconAnchor")
    public native MGLStyleValue<NSValue> getIconAnchor();
    @Property(selector = "setIconAnchor:")
    public native void setIconAnchor(MGLStyleValue<NSValue> v);
    @Property(selector = "iconIgnoresPlacement")
    public native MGLStyleValue<NSNumber> getIconIgnoresPlacement();
    @Property(selector = "setIconIgnoresPlacement:")
    public native void setIconIgnoresPlacement(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconImageName")
    public native MGLStyleValue<NSString> getIconImageName();
    @Property(selector = "setIconImageName:")
    public native void setIconImageName(MGLStyleValue<NSString> v);
    @Property(selector = "iconOffset")
    public native MGLStyleValue<NSValue> getIconOffset();
    @Property(selector = "setIconOffset:")
    public native void setIconOffset(MGLStyleValue<NSValue> v);
    @Property(selector = "isIconOptional")
    public native MGLStyleValue<NSNumber> getIconOptional();
    @Property(selector = "setIconOptional:")
    public native void setIconOptional(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconPadding")
    public native MGLStyleValue<NSNumber> getIconPadding();
    @Property(selector = "setIconPadding:")
    public native void setIconPadding(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconPitchAlignment")
    public native MGLStyleValue<NSValue> getIconPitchAlignment();
    @Property(selector = "setIconPitchAlignment:")
    public native void setIconPitchAlignment(MGLStyleValue<NSValue> v);
    @Property(selector = "iconRotation")
    public native MGLStyleValue<NSNumber> getIconRotation();
    @Property(selector = "setIconRotation:")
    public native void setIconRotation(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconRotationAlignment")
    public native MGLStyleValue<NSValue> getIconRotationAlignment();
    @Property(selector = "setIconRotationAlignment:")
    public native void setIconRotationAlignment(MGLStyleValue<NSValue> v);
    @Property(selector = "iconScale")
    public native MGLStyleValue<NSNumber> getIconScale();
    @Property(selector = "setIconScale:")
    public native void setIconScale(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconTextFit")
    public native MGLStyleValue<NSValue> getIconTextFit();
    @Property(selector = "setIconTextFit:")
    public native void setIconTextFit(MGLStyleValue<NSValue> v);
    @Property(selector = "iconTextFitPadding")
    public native MGLStyleValue<NSValue> getIconTextFitPadding();
    @Property(selector = "setIconTextFitPadding:")
    public native void setIconTextFitPadding(MGLStyleValue<NSValue> v);
    @Property(selector = "keepsIconUpright")
    public native MGLStyleValue<NSNumber> getKeepsIconUpright();
    @Property(selector = "setKeepsIconUpright:")
    public native void setKeepsIconUpright(MGLStyleValue<NSNumber> v);
    @Property(selector = "keepsTextUpright")
    public native MGLStyleValue<NSNumber> getKeepsTextUpright();
    @Property(selector = "setKeepsTextUpright:")
    public native void setKeepsTextUpright(MGLStyleValue<NSNumber> v);
    @Property(selector = "maximumTextAngle")
    public native MGLStyleValue<NSNumber> getMaximumTextAngle();
    @Property(selector = "setMaximumTextAngle:")
    public native void setMaximumTextAngle(MGLStyleValue<NSNumber> v);
    @Property(selector = "maximumTextWidth")
    public native MGLStyleValue<NSNumber> getMaximumTextWidth();
    @Property(selector = "setMaximumTextWidth:")
    public native void setMaximumTextWidth(MGLStyleValue<NSNumber> v);
    @Property(selector = "symbolAvoidsEdges")
    public native MGLStyleValue<NSNumber> getSymbolAvoidsEdges();
    @Property(selector = "setSymbolAvoidsEdges:")
    public native void setSymbolAvoidsEdges(MGLStyleValue<NSNumber> v);
    @Property(selector = "symbolPlacement")
    public native MGLStyleValue<NSValue> getSymbolPlacement();
    @Property(selector = "setSymbolPlacement:")
    public native void setSymbolPlacement(MGLStyleValue<NSValue> v);
    @Property(selector = "symbolSpacing")
    public native MGLStyleValue<NSNumber> getSymbolSpacing();
    @Property(selector = "setSymbolSpacing:")
    public native void setSymbolSpacing(MGLStyleValue<NSNumber> v);
    @Property(selector = "text")
    public native MGLStyleValue<NSString> getText();
    @Property(selector = "setText:")
    public native void setText(MGLStyleValue<NSString> v);
    @Property(selector = "textAllowsOverlap")
    public native MGLStyleValue<NSNumber> getTextAllowsOverlap();
    @Property(selector = "setTextAllowsOverlap:")
    public native void setTextAllowsOverlap(MGLStyleValue<NSNumber> v);
    @Property(selector = "textAnchor")
    public native MGLStyleValue<NSValue> getTextAnchor();
    @Property(selector = "setTextAnchor:")
    public native void setTextAnchor(MGLStyleValue<NSValue> v);
    @Property(selector = "textFontNames")
    public native MGLStyleValue getTextFontNames();
    @Property(selector = "setTextFontNames:")
    public native void setTextFontNames(MGLStyleValue v);
    @Property(selector = "textFontSize")
    public native MGLStyleValue<NSNumber> getTextFontSize();
    @Property(selector = "setTextFontSize:")
    public native void setTextFontSize(MGLStyleValue<NSNumber> v);
    @Property(selector = "textIgnoresPlacement")
    public native MGLStyleValue<NSNumber> getTextIgnoresPlacement();
    @Property(selector = "setTextIgnoresPlacement:")
    public native void setTextIgnoresPlacement(MGLStyleValue<NSNumber> v);
    @Property(selector = "textJustification")
    public native MGLStyleValue<NSValue> getTextJustification();
    @Property(selector = "setTextJustification:")
    public native void setTextJustification(MGLStyleValue<NSValue> v);
    @Property(selector = "textLetterSpacing")
    public native MGLStyleValue<NSNumber> getTextLetterSpacing();
    @Property(selector = "setTextLetterSpacing:")
    public native void setTextLetterSpacing(MGLStyleValue<NSNumber> v);
    @Property(selector = "textLineHeight")
    public native MGLStyleValue<NSNumber> getTextLineHeight();
    @Property(selector = "setTextLineHeight:")
    public native void setTextLineHeight(MGLStyleValue<NSNumber> v);
    @Property(selector = "textOffset")
    public native MGLStyleValue<NSValue> getTextOffset();
    @Property(selector = "setTextOffset:")
    public native void setTextOffset(MGLStyleValue<NSValue> v);
    @Property(selector = "isTextOptional")
    public native MGLStyleValue<NSNumber> getTextOptional();
    @Property(selector = "setTextOptional:")
    public native void setTextOptional(MGLStyleValue<NSNumber> v);
    @Property(selector = "textPadding")
    public native MGLStyleValue<NSNumber> getTextPadding();
    @Property(selector = "setTextPadding:")
    public native void setTextPadding(MGLStyleValue<NSNumber> v);
    @Property(selector = "textPitchAlignment")
    public native MGLStyleValue<NSValue> getTextPitchAlignment();
    @Property(selector = "setTextPitchAlignment:")
    public native void setTextPitchAlignment(MGLStyleValue<NSValue> v);
    @Property(selector = "textRotation")
    public native MGLStyleValue<NSNumber> getTextRotation();
    @Property(selector = "setTextRotation:")
    public native void setTextRotation(MGLStyleValue<NSNumber> v);
    @Property(selector = "textRotationAlignment")
    public native MGLStyleValue<NSValue> getTextRotationAlignment();
    @Property(selector = "setTextRotationAlignment:")
    public native void setTextRotationAlignment(MGLStyleValue<NSValue> v);
    @Property(selector = "textTransform")
    public native MGLStyleValue<NSValue> getTextTransform();
    @Property(selector = "setTextTransform:")
    public native void setTextTransform(MGLStyleValue<NSValue> v);
    @Property(selector = "iconColor")
    public native MGLStyleValue<UIColor> getIconColor();
    @Property(selector = "setIconColor:")
    public native void setIconColor(MGLStyleValue<UIColor> v);
    @Property(selector = "iconColorTransition")
    public native @ByVal MGLTransition getIconColorTransition();
    @Property(selector = "setIconColorTransition:")
    public native void setIconColorTransition(@ByVal MGLTransition v);
    @Property(selector = "iconHaloBlur")
    public native MGLStyleValue<NSNumber> getIconHaloBlur();
    @Property(selector = "setIconHaloBlur:")
    public native void setIconHaloBlur(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconHaloBlurTransition")
    public native @ByVal MGLTransition getIconHaloBlurTransition();
    @Property(selector = "setIconHaloBlurTransition:")
    public native void setIconHaloBlurTransition(@ByVal MGLTransition v);
    @Property(selector = "iconHaloColor")
    public native MGLStyleValue<UIColor> getIconHaloColor();
    @Property(selector = "setIconHaloColor:")
    public native void setIconHaloColor(MGLStyleValue<UIColor> v);
    @Property(selector = "iconHaloColorTransition")
    public native @ByVal MGLTransition getIconHaloColorTransition();
    @Property(selector = "setIconHaloColorTransition:")
    public native void setIconHaloColorTransition(@ByVal MGLTransition v);
    @Property(selector = "iconHaloWidth")
    public native MGLStyleValue<NSNumber> getIconHaloWidth();
    @Property(selector = "setIconHaloWidth:")
    public native void setIconHaloWidth(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconHaloWidthTransition")
    public native @ByVal MGLTransition getIconHaloWidthTransition();
    @Property(selector = "setIconHaloWidthTransition:")
    public native void setIconHaloWidthTransition(@ByVal MGLTransition v);
    @Property(selector = "iconOpacity")
    public native MGLStyleValue<NSNumber> getIconOpacity();
    @Property(selector = "setIconOpacity:")
    public native void setIconOpacity(MGLStyleValue<NSNumber> v);
    @Property(selector = "iconOpacityTransition")
    public native @ByVal MGLTransition getIconOpacityTransition();
    @Property(selector = "setIconOpacityTransition:")
    public native void setIconOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "iconTranslation")
    public native MGLStyleValue<NSValue> getIconTranslation();
    @Property(selector = "setIconTranslation:")
    public native void setIconTranslation(MGLStyleValue<NSValue> v);
    @Property(selector = "iconTranslationTransition")
    public native @ByVal MGLTransition getIconTranslationTransition();
    @Property(selector = "setIconTranslationTransition:")
    public native void setIconTranslationTransition(@ByVal MGLTransition v);
    @Property(selector = "iconTranslationAnchor")
    public native MGLStyleValue<NSValue> getIconTranslationAnchor();
    @Property(selector = "setIconTranslationAnchor:")
    public native void setIconTranslationAnchor(MGLStyleValue<NSValue> v);
    @Property(selector = "textColor")
    public native MGLStyleValue<UIColor> getTextColor();
    @Property(selector = "setTextColor:")
    public native void setTextColor(MGLStyleValue<UIColor> v);
    @Property(selector = "textColorTransition")
    public native @ByVal MGLTransition getTextColorTransition();
    @Property(selector = "setTextColorTransition:")
    public native void setTextColorTransition(@ByVal MGLTransition v);
    @Property(selector = "textHaloBlur")
    public native MGLStyleValue<NSNumber> getTextHaloBlur();
    @Property(selector = "setTextHaloBlur:")
    public native void setTextHaloBlur(MGLStyleValue<NSNumber> v);
    @Property(selector = "textHaloBlurTransition")
    public native @ByVal MGLTransition getTextHaloBlurTransition();
    @Property(selector = "setTextHaloBlurTransition:")
    public native void setTextHaloBlurTransition(@ByVal MGLTransition v);
    @Property(selector = "textHaloColor")
    public native MGLStyleValue<UIColor> getTextHaloColor();
    @Property(selector = "setTextHaloColor:")
    public native void setTextHaloColor(MGLStyleValue<UIColor> v);
    @Property(selector = "textHaloColorTransition")
    public native @ByVal MGLTransition getTextHaloColorTransition();
    @Property(selector = "setTextHaloColorTransition:")
    public native void setTextHaloColorTransition(@ByVal MGLTransition v);
    @Property(selector = "textHaloWidth")
    public native MGLStyleValue<NSNumber> getTextHaloWidth();
    @Property(selector = "setTextHaloWidth:")
    public native void setTextHaloWidth(MGLStyleValue<NSNumber> v);
    @Property(selector = "textHaloWidthTransition")
    public native @ByVal MGLTransition getTextHaloWidthTransition();
    @Property(selector = "setTextHaloWidthTransition:")
    public native void setTextHaloWidthTransition(@ByVal MGLTransition v);
    @Property(selector = "textOpacity")
    public native MGLStyleValue<NSNumber> getTextOpacity();
    @Property(selector = "setTextOpacity:")
    public native void setTextOpacity(MGLStyleValue<NSNumber> v);
    @Property(selector = "textOpacityTransition")
    public native @ByVal MGLTransition getTextOpacityTransition();
    @Property(selector = "setTextOpacityTransition:")
    public native void setTextOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "textTranslation")
    public native MGLStyleValue<NSValue> getTextTranslation();
    @Property(selector = "setTextTranslation:")
    public native void setTextTranslation(MGLStyleValue<NSValue> v);
    @Property(selector = "textTranslationTransition")
    public native @ByVal MGLTransition getTextTranslationTransition();
    @Property(selector = "setTextTranslationTransition:")
    public native void setTextTranslationTransition(@ByVal MGLTransition v);
    @Property(selector = "textTranslationAnchor")
    public native MGLStyleValue<NSValue> getTextTranslationAnchor();
    @Property(selector = "setTextTranslationAnchor:")
    public native void setTextTranslationAnchor(MGLStyleValue<NSValue> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
