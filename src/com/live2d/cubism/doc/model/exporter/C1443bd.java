package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bd */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bd.class */
final class C1443bd extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1443bd f3750a = new C1443bd();


    C1443bd() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(17);
        return receiver.getEmModelSource().getEmDrawableMaskSources().getArtMeshSourcesIndex();
    }
}
