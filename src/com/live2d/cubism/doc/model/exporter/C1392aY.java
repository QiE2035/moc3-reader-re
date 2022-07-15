package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aY */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aY.class */
final class C1392aY extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1392aY f3566a = new C1392aY();


    C1392aY() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(13);
        return receiver.getEmModelSource().mEmKeyformBindingSources().m23822a();
    }
}
