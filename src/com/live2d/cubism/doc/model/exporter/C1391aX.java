package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aX */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aX.class */
final class C1391aX extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1391aX f3565a = new C1391aX();


    C1391aX() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(12);
        return receiver.getEmModelSource().getEmKeyformBindingBandSources().m23827b();
    }
}
