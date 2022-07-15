package com.live2d.cubism.doc.model.exporter;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.live2d.cubism.doc.model.exporter.bL  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bL.class */
public class EmDeformerSources {


    /* renamed from: a */
    private final List<String> id = new ArrayList<>();


    /* renamed from: b */
    private final List<Integer> mKeyformBindingBandSourcesIndex = new ArrayList<>();


    /* renamed from: c */
    private final List<Boolean> mVisible = new ArrayList<>();


    /* renamed from: d */
    private final List<Boolean> mEnable = new ArrayList<>();


    /* renamed from: e */
    private final List<Integer> mParentPartIndex = new ArrayList<>();


    /* renamed from: f */
    private final List<Integer> mParentDeformerIndex = new ArrayList<>();


    /* renamed from: g */
    private final List<EmDeformerType> mDeformerType = new ArrayList<>();


    /* renamed from: h */
    private final List<Integer> mDeformerSpecificSourcesIndex = new ArrayList<>();


    /* renamed from: a */
    public List<String> getId() {
        return this.id;
    }


    /* renamed from: b */
    public List<Integer> getKeyformBindingBandSourcesIndex() {
        return this.mKeyformBindingBandSourcesIndex;
    }


    /* renamed from: c */
    public List<Boolean> getVisible() {
        return this.mVisible;
    }


    /* renamed from: d */
    public List<Boolean> getEnable() {
        return this.mEnable;
    }


    /* renamed from: e */
    public List<Integer> getParentPartIndex() {
        return this.mParentPartIndex;
    }


    /* renamed from: f */
    public List<Integer> getParentDeformerIndex() {
        return this.mParentDeformerIndex;
    }


    /* renamed from: g */
    public List<EmDeformerType> getDeformerType() {
        return this.mDeformerType;
    }


    /* renamed from: h */
    public List<Integer> getDeformerSpecificSourcesIndex() {
        return this.mDeformerSpecificSourcesIndex;
    }

    /* renamed from: i */
    public int getSize() {
        return this.id.size();
    }
}
