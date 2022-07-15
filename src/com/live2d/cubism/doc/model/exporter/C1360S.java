package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.S */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/S.class */
final class C1360S extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1360S f3531a = new C1360S();


    C1360S() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(2);
        return receiver.getEmModelSource().getEmWarpDeformerSpecificSources().getVertexCount();
    }
}
