package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.N */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/N.class */
final class C1355N extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1355N f3526a = new C1355N();


    C1355N() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(1);
        return receiver.getEmModelSource().getEmDeformerSources().getDeformerSpecificSourcesIndex();
    }
}
