package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aS */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aS.class */
final class C1386aS extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1386aS f3560a = new C1386aS();


    C1386aS() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(9);
        return receiver.getEmModelSource().getEmArtMeshKeyformSources().getKeyformPositionSourcesBeginIndex();
    }
}
