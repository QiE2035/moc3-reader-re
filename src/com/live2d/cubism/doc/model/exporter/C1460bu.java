package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bu */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bu.class */
final class C1460bu extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1460bu f3767a = new C1460bu();


    C1460bu() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(20);
        return receiver.getEmModelSource().getEmGlueSources().getArtMeshIndexB();
    }
}
