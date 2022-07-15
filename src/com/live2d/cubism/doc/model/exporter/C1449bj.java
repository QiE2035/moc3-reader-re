package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bj */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bj.class */
final class C1449bj extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1449bj f3756a = new C1449bj();


    C1449bj() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(18);
        return receiver.getEmModelSource().getEmDrawOrderGroupSources().getMaxDrawOrder();
    }
}
