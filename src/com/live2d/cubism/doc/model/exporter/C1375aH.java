package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aH */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aH.class */
final class C1375aH extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1375aH f3549a = new C1375aH();


    C1375aH() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(7);
        return receiver.getEmModelSource().getEmWarpDeformerKeyformSources().getKeyformPositionSourcesBeginIndex();
    }
}
