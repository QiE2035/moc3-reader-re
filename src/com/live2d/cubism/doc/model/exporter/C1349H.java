package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.H */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/H.class */
final class C1349H extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1349H f3520a = new C1349H();


    C1349H() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(1);
        return receiver.getEmModelSource().getEmDeformerSources().getKeyformBindingBandSourcesIndex();
    }
}
