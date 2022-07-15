package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bm */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bm.class */
final class C1452bm extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1452bm f3759a = new C1452bm();


    C1452bm() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(19);
        return receiver.getEmModelSource().getEmDrawOrderGroupObjectSources().getGroupIndex();
    }
}
