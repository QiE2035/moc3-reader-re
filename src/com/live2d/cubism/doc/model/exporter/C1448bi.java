package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bi */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bi.class */
final class C1448bi extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1448bi f3755a = new C1448bi();


    C1448bi() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(18);
        return receiver.getEmModelSource().getEmDrawOrderGroupSources().getMinDrawOrder();
    }
}
