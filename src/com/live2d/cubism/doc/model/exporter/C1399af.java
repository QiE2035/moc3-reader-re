package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.af */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/af.class */
final class C1399af extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1399af INSTANCE = new C1399af();


    C1399af() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(4);
        return receiver.getEmModelSource().getEmArtMeshSources().getKeyformBindingBandSourcesIndex();
    }
}
