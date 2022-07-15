package com.live2d.cubism.doc.model.exporter;


import java.util.ArrayList;
import java.util.List;
//import kotlin.Metadata;


/* renamed from: com.live2d.cubism.doc.model.exporter.ck  reason: from Kotlin metadata */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ck.class */
public final class EmRotationDeformerSpecificSources {


    /* renamed from: a */
    private final List<Integer> mKeyformBindingBandSourcesIndex = new ArrayList<>();


    /* renamed from: b */
    private final List<Integer> mKeyformSourcesBeginIndex = new ArrayList<>();


    /* renamed from: c */
    private final List<Integer> mKeyformSourcesCount = new ArrayList<>();


    /* renamed from: d */
    private final List<Float> mBaseAngle = new ArrayList<>();


    /* renamed from: a */
    public List<Integer> getKeyformBindingBandSourcesIndex() {
        return this.mKeyformBindingBandSourcesIndex;
    }


    /* renamed from: b */
    public List<Integer> getKeyformSourcesCount() {
        return this.mKeyformSourcesBeginIndex;
    }


    /* renamed from: c */
    public List<Integer> getKeyformSourcesBeginIndex() {
        return this.mKeyformSourcesCount;
    }


    /* renamed from: d */
    public List<Float> getBaseAngle() {
        return this.mBaseAngle;
    }


}
