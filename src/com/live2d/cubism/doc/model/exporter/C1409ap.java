package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ap */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ap.class */
final class C1409ap extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1409ap f3583a = new C1409ap();


    C1409ap() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(4);
        return receiver.getEmModelSource().getEmArtMeshSources().getPositionIndexSourcesCount();
    }
}
