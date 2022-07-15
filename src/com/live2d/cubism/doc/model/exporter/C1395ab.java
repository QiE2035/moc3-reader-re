package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ab */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ab.class */
final class C1395ab extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1395ab INSTANCE = new C1395ab();


    C1395ab() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(0);
        return receiver.getEmModelSource().getEmPartSources().getKeyformBindingBandSourcesIndex();
    }
}
