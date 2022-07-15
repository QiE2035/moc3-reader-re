package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aV */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aV.class */
final class C1389aV extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1389aV f3563a = new C1389aV();


    C1389aV() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(11);
        return receiver.getEmModelSource().getEmKeyformBindingIndexSources().getKeyformBindingSourcesIndex();
    }
}
