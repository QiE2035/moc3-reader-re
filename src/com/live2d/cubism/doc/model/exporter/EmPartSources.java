package com.live2d.cubism.doc.model.exporter;


import java.util.ArrayList;
import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ch  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ch.class */
public final class EmPartSources {


    /* renamed from: a */
    private final List<String> mID = new ArrayList<>();


    /* renamed from: b */
    private final List<Integer> mKeyformBindingBandSourcesIndex = new ArrayList<>();


    /* renamed from: c */
    private final List<Integer> mKeyformSourcesBeginIndex = new ArrayList<>();


    /* renamed from: d */
    private final List<Integer> mKeyformSourcesCount = new ArrayList<>();


    /* renamed from: e */
    private final List<Boolean> mVisible = new ArrayList<>();


    /* renamed from: f */
    private final List<Boolean> mEnable = new ArrayList<>();


    /* renamed from: g */
    private final List<Integer> mParentPartIndex = new ArrayList<>();


    /* renamed from: a */
    public List<String> getID() {
        return this.mID;
    }


    /* renamed from: b */
    public List<Integer> getKeyformBindingBandSourcesIndex() {
        return this.mKeyformBindingBandSourcesIndex;
    }


    /* renamed from: c */
    public List<Integer> getKeyformSourcesCount() {
        return this.mKeyformSourcesBeginIndex;
    }


    /* renamed from: d */
    public List<Integer> getKeyformSourcesBeginIndex() {
        return this.mKeyformSourcesCount;
    }


    /* renamed from: e */
    public List<Boolean> getVisible() {
        return this.mVisible;
    }


    /* renamed from: f */
    public List<Boolean> getEnable() {
        return this.mEnable;
    }


    /* renamed from: g */
    public List<Integer> getParentPartIndex() {
        return this.mParentPartIndex;
    }

    /* renamed from: h */
    public int getSize() {
        return this.mID.size();
    }


}
