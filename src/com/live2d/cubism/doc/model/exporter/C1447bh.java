package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bh */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bh.class */
final class C1447bh extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1447bh f3754a = new C1447bh();


    C1447bh() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {
        //Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(18);
        return receiver.getEmModelSource().getEmDrawOrderGroupSources().getDrawOrderGroupObjectSourcesTotalCount();
    }
}
