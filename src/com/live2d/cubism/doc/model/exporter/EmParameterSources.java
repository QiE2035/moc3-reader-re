package com.live2d.cubism.doc.model.exporter;

import java.util.ArrayList;
import java.util.List;
//import kotlin.Metadata;


/* renamed from: com.live2d.cubism.doc.model.exporter.cf  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/cf.class */
public final class EmParameterSources {


    /* renamed from: a */
    private final List<String> mID = new ArrayList<>();


    /* renamed from: b */
    private final List<Float> mMaxValue = new ArrayList<>();


    /* renamed from: c */
    private final List<Float> mMinValue = new ArrayList<>();


    /* renamed from: d */
    private final List<Float> mDefaultValue = new ArrayList<>();


    /* renamed from: e */
    private final List<Boolean> mRepeat = new ArrayList<>();


    /* renamed from: f */
    private final List<Integer> mDecimalPlaces = new ArrayList<>();


    /* renamed from: g */
    private final List<Integer> mKeyformBindingSourcesBeginIndex = new ArrayList<>();


    /* renamed from: h */
    private final List<Integer> mKeyformBindingSourcesCount = new ArrayList<>();


    /* renamed from: a */
    public List<String> getID() {
        return this.mID;
    }


    /* renamed from: b */
    public List<Float> getMaxValue() {
        return this.mMaxValue;
    }


    /* renamed from: c */
    public List<Float> getMinValue() {
        return this.mMinValue;
    }


    /* renamed from: d */
    public List<Float> getDefaultValue() {
        return this.mDefaultValue;
    }


    /* renamed from: e */
    public List<Boolean> getRepeat() {
        return this.mRepeat;
    }


    /* renamed from: f */
    public List<Integer> getDecimalPlaces() {
        return this.mDecimalPlaces;
    }


    /* renamed from: g */
    public List<Integer> getKeyformBindingSourcesBeginIndex() {
        return this.mKeyformBindingSourcesBeginIndex;
    }


    /* renamed from: h */
    public List<Integer> getKeyformBindingSourcesCount() {
        return this.mKeyformBindingSourcesCount;
    }

    /* renamed from: i */
    public int getSize() {
        return this.mID.size();
    }


}
