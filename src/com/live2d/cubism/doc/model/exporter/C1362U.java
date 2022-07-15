package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.U */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/U.class */
final class C1362U extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1362U f3533a = new C1362U();


    C1362U() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(2);
        return receiver.getEmModelSource().getEmWarpDeformerSpecificSources().getCol();
    }
}
