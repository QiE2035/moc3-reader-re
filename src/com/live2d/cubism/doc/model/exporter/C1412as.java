package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.as */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/as.class */
final class C1412as extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1412as f3586a = new C1412as();


    C1412as() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(4);
        return receiver.getEmModelSource().getEmArtMeshSources().getVertexCount();
    }
}
