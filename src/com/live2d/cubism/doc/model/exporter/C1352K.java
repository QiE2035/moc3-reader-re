package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.K */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/K.class */
final class C1352K extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1352K INSTANCE = new C1352K();


    C1352K() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(1);
        return receiver.getEmModelSource().getEmDeformerSources().getParentPartIndex();
    }
}
